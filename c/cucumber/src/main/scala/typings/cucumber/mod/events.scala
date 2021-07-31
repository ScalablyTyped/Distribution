package typings.cucumber.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object events {
  
  trait Event extends StObject {
    
    var data: js.Any
    
    var name: String
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
  trait EventPayload extends StObject
  
  trait FeaturePayload
    extends StObject
       with EventPayload {
    
    var description: String
    
    var keyword: String
    
    var line: Double
    
    var name: String
    
    var scenarios: js.Array[Scenario]
    
    var tags: js.Array[Tag]
    
    var uri: String
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
  
  trait FeaturesPayload
    extends StObject
       with EventPayload {
    
    def getFeatures(): js.Array[js.Any]
  }
  object FeaturesPayload {
    
    @scala.inline
    def apply(getFeatures: () => js.Array[js.Any]): FeaturesPayload = {
      val __obj = js.Dynamic.literal(getFeatures = js.Any.fromFunction0(getFeatures))
      __obj.asInstanceOf[FeaturesPayload]
    }
    
    @scala.inline
    implicit class FeaturesPayloadMutableBuilder[Self <: FeaturesPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetFeatures(value: () => js.Array[js.Any]): Self = StObject.set(x, "getFeatures", js.Any.fromFunction0(value))
    }
  }
  
  trait FeaturesResultPayload
    extends StObject
       with EventPayload {
    
    var duration: Double
    
    var scenarioResults: js.Array[js.Any]
    
    var stepsResults: js.Array[js.Any]
    
    var strict: Boolean
    
    var success: Boolean
  }
  object FeaturesResultPayload {
    
    @scala.inline
    def apply(
      duration: Double,
      scenarioResults: js.Array[js.Any],
      stepsResults: js.Array[js.Any],
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
      def setScenarioResults(value: js.Array[js.Any]): Self = StObject.set(x, "scenarioResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScenarioResultsVarargs(value: js.Any*): Self = StObject.set(x, "scenarioResults", js.Array(value :_*))
      
      @scala.inline
      def setStepsResults(value: js.Array[js.Any]): Self = StObject.set(x, "stepsResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsResultsVarargs(value: js.Any*): Self = StObject.set(x, "stepsResults", js.Array(value :_*))
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScenarioPayload
    extends StObject
       with EventPayload {
    
    var description: String
    
    var exception: Error
    
    var feature: Feature
    
    var keyword: String
    
    var line: Double
    
    var lines: js.Array[Double]
    
    var name: String
    
    var steps: js.Array[Step]
    
    var tags: js.Array[Tag]
    
    var uri: String
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
  
  trait ScenarioResultPayload
    extends StObject
       with EventPayload {
    
    var duration: js.Any
    
    var failureException: Error
    
    var scenario: Scenario
    
    var status: Status
    
    var stepResults: js.Array[js.Any]
  }
  object ScenarioResultPayload {
    
    @scala.inline
    def apply(
      duration: js.Any,
      failureException: Error,
      scenario: Scenario,
      status: Status,
      stepResults: js.Array[js.Any]
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
      def setStepResults(value: js.Array[js.Any]): Self = StObject.set(x, "stepResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepResultsVarargs(value: js.Any*): Self = StObject.set(x, "stepResults", js.Array(value :_*))
    }
  }
  
  trait StepPayload
    extends StObject
       with EventPayload {
    
    var arguments: js.Any
    
    var isBackground: Boolean
    
    var keyword: String
    
    var keywordType: String
    
    var line: Double
    
    var name: String
    
    var scenario: Scenario
    
    var uri: String
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
  
  trait StepResultPayload
    extends StObject
       with EventPayload {
    
    var ambiguousStepDefinitions: js.Any
    
    var attachments: js.Array[js.Any]
    
    var duration: js.Any
    
    var failureException: Error
    
    var status: Status
    
    var step: Step
    
    var stepDefinition: StepDefinition
  }
  object StepResultPayload {
    
    @scala.inline
    def apply(
      ambiguousStepDefinitions: js.Any,
      attachments: js.Array[js.Any],
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
      def setAttachments(value: js.Array[js.Any]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
      
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
