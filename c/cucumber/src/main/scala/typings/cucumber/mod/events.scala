package typings.cucumber.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object events {
  
  @js.native
  trait Event extends StObject {
    
    var data: js.Any = js.native
    
    var name: String = js.native
  }
  object Event {
    
    @scala.inline
    def apply(data: js.Any, name: String): Event = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line no-empty-interface
  @js.native
  trait EventPayload extends StObject
  
  @js.native
  trait FeaturePayload extends EventPayload {
    
    var description: String = js.native
    
    var keyword: String = js.native
    
    var line: Double = js.native
    
    var name: String = js.native
    
    var scenarios: js.Array[Scenario] = js.native
    
    var tags: js.Array[Tag] = js.native
    
    var uri: String = js.native
  }
  object FeaturePayload {
    
    @scala.inline
    def apply(
      description: String,
      keyword: String,
      line: Double,
      name: String,
      scenarios: js.Array[Scenario],
      tags: js.Array[Tag],
      uri: String
    ): FeaturePayload = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scenarios = scenarios.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeaturePayload]
    }
    
    @scala.inline
    implicit class FeaturePayloadMutableBuilder[Self <: FeaturePayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScenarios(value: js.Array[Scenario]): Self = StObject.set(x, "scenarios", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScenariosVarargs(value: Scenario*): Self = StObject.set(x, "scenarios", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FeaturesPayload extends EventPayload {
    
    def getFeatures(): js.Array[_] = js.native
  }
  object FeaturesPayload {
    
    @scala.inline
    def apply(getFeatures: () => js.Array[_]): FeaturesPayload = {
      val __obj = js.Dynamic.literal(getFeatures = js.Any.fromFunction0(getFeatures))
      __obj.asInstanceOf[FeaturesPayload]
    }
    
    @scala.inline
    implicit class FeaturesPayloadMutableBuilder[Self <: FeaturesPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetFeatures(value: () => js.Array[_]): Self = StObject.set(x, "getFeatures", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait FeaturesResultPayload extends EventPayload {
    
    var duration: Double = js.native
    
    var scenarioResults: js.Array[_] = js.native
    
    var stepsResults: js.Array[_] = js.native
    
    var strict: Boolean = js.native
    
    var success: Boolean = js.native
  }
  object FeaturesResultPayload {
    
    @scala.inline
    def apply(
      duration: Double,
      scenarioResults: js.Array[_],
      stepsResults: js.Array[_],
      strict: Boolean,
      success: Boolean
    ): FeaturesResultPayload = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], scenarioResults = scenarioResults.asInstanceOf[js.Any], stepsResults = stepsResults.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeaturesResultPayload]
    }
    
    @scala.inline
    implicit class FeaturesResultPayloadMutableBuilder[Self <: FeaturesResultPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScenarioResults(value: js.Array[_]): Self = StObject.set(x, "scenarioResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScenarioResultsVarargs(value: js.Any*): Self = StObject.set(x, "scenarioResults", js.Array(value :_*))
      
      @scala.inline
      def setStepsResults(value: js.Array[_]): Self = StObject.set(x, "stepsResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsResultsVarargs(value: js.Any*): Self = StObject.set(x, "stepsResults", js.Array(value :_*))
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ScenarioPayload extends EventPayload {
    
    var description: String = js.native
    
    var exception: Error = js.native
    
    var feature: Feature = js.native
    
    var keyword: String = js.native
    
    var line: Double = js.native
    
    var lines: js.Array[Double] = js.native
    
    var name: String = js.native
    
    var steps: js.Array[Step] = js.native
    
    var tags: js.Array[Tag] = js.native
    
    var uri: String = js.native
  }
  object ScenarioPayload {
    
    @scala.inline
    def apply(
      description: String,
      exception: Error,
      feature: Feature,
      keyword: String,
      line: Double,
      lines: js.Array[Double],
      name: String,
      steps: js.Array[Step],
      tags: js.Array[Tag],
      uri: String
    ): ScenarioPayload = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], exception = exception.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScenarioPayload]
    }
    
    @scala.inline
    implicit class ScenarioPayloadMutableBuilder[Self <: ScenarioPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setException(value: Error): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeature(value: Feature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLines(value: js.Array[Double]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinesVarargs(value: Double*): Self = StObject.set(x, "lines", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSteps(value: js.Array[Step]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsVarargs(value: Step*): Self = StObject.set(x, "steps", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ScenarioResultPayload extends EventPayload {
    
    var duration: js.Any = js.native
    
    var failureException: Error = js.native
    
    var scenario: Scenario = js.native
    
    var status: Status = js.native
    
    var stepResults: js.Array[_] = js.native
  }
  object ScenarioResultPayload {
    
    @scala.inline
    def apply(
      duration: js.Any,
      failureException: Error,
      scenario: Scenario,
      status: Status,
      stepResults: js.Array[_]
    ): ScenarioResultPayload = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], failureException = failureException.asInstanceOf[js.Any], scenario = scenario.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], stepResults = stepResults.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScenarioResultPayload]
    }
    
    @scala.inline
    implicit class ScenarioResultPayloadMutableBuilder[Self <: ScenarioResultPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: js.Any): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailureException(value: Error): Self = StObject.set(x, "failureException", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScenario(value: Scenario): Self = StObject.set(x, "scenario", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepResults(value: js.Array[_]): Self = StObject.set(x, "stepResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepResultsVarargs(value: js.Any*): Self = StObject.set(x, "stepResults", js.Array(value :_*))
    }
  }
  
  @js.native
  trait StepPayload extends EventPayload {
    
    var arguments: js.Any = js.native
    
    var isBackground: Boolean = js.native
    
    var keyword: String = js.native
    
    var keywordType: String = js.native
    
    var line: Double = js.native
    
    var name: String = js.native
    
    var scenario: Scenario = js.native
    
    var uri: String = js.native
  }
  object StepPayload {
    
    @scala.inline
    def apply(
      arguments: js.Any,
      isBackground: Boolean,
      keyword: String,
      keywordType: String,
      line: Double,
      name: String,
      scenario: Scenario,
      uri: String
    ): StepPayload = {
      val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], isBackground = isBackground.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], keywordType = keywordType.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scenario = scenario.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepPayload]
    }
    
    @scala.inline
    implicit class StepPayloadMutableBuilder[Self <: StepPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArguments(value: js.Any): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBackground(value: Boolean): Self = StObject.set(x, "isBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeywordType(value: String): Self = StObject.set(x, "keywordType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScenario(value: Scenario): Self = StObject.set(x, "scenario", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StepResultPayload extends EventPayload {
    
    var ambiguousStepDefinitions: js.Any = js.native
    
    var attachments: js.Array[_] = js.native
    
    var duration: js.Any = js.native
    
    var failureException: Error = js.native
    
    var status: Status = js.native
    
    var step: Step = js.native
    
    var stepDefinition: StepDefinition = js.native
  }
  object StepResultPayload {
    
    @scala.inline
    def apply(
      ambiguousStepDefinitions: js.Any,
      attachments: js.Array[_],
      duration: js.Any,
      failureException: Error,
      status: Status,
      step: Step,
      stepDefinition: StepDefinition
    ): StepResultPayload = {
      val __obj = js.Dynamic.literal(ambiguousStepDefinitions = ambiguousStepDefinitions.asInstanceOf[js.Any], attachments = attachments.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], failureException = failureException.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], stepDefinition = stepDefinition.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepResultPayload]
    }
    
    @scala.inline
    implicit class StepResultPayloadMutableBuilder[Self <: StepResultPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmbiguousStepDefinitions(value: js.Any): Self = StObject.set(x, "ambiguousStepDefinitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachments(value: js.Array[_]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachmentsVarargs(value: js.Any*): Self = StObject.set(x, "attachments", js.Array(value :_*))
      
      @scala.inline
      def setDuration(value: js.Any): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailureException(value: Error): Self = StObject.set(x, "failureException", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStep(value: Step): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepDefinition(value: StepDefinition): Self = StObject.set(x, "stepDefinition", value.asInstanceOf[js.Any])
    }
  }
}
