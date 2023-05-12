package typings.cucumberCucumber

import typings.cucumberCucumber.libFormatterMod.IFormatterOptions
import typings.cucumberMessages.mod.Attachment
import typings.cucumberMessages.mod.Feature
import typings.cucumberMessages.mod.Location
import typings.cucumberMessages.mod.Pickle
import typings.cucumberMessages.mod.PickleDocString
import typings.cucumberMessages.mod.PickleStep
import typings.cucumberMessages.mod.PickleStepArgument
import typings.cucumberMessages.mod.PickleTable
import typings.cucumberMessages.mod.Rule
import typings.cucumberMessages.mod.Scenario
import typings.cucumberMessages.mod.Step
import typings.cucumberMessages.mod.TestStep
import typings.cucumberMessages.mod.TestStepResult
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterJsonFormatterMod {
  
  @JSImport("@cucumber/cucumber/lib/formatter/json_formatter", JSImport.Default)
  @js.native
  open class default protected () extends JsonFormatter {
    def this(options: IFormatterOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@cucumber/cucumber/lib/formatter/json_formatter", "default.documentation")
    @js.native
    val documentation: String = js.native
  }
  
  trait IBuildJsonFeatureOptions extends StObject {
    
    var elements: js.Array[IJsonScenario]
    
    var feature: Feature
    
    var uri: String
  }
  object IBuildJsonFeatureOptions {
    
    inline def apply(elements: js.Array[IJsonScenario], feature: Feature, uri: String): IBuildJsonFeatureOptions = {
      val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBuildJsonFeatureOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBuildJsonFeatureOptions] (val x: Self) extends AnyVal {
      
      inline def setElements(value: js.Array[IJsonScenario]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setElementsVarargs(value: IJsonScenario*): Self = StObject.set(x, "elements", js.Array(value*))
      
      inline def setFeature(value: Feature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait IBuildJsonScenarioOptions extends StObject {
    
    var feature: Feature
    
    var gherkinExampleRuleMap: Record[String, Rule]
    
    var gherkinScenarioLocationMap: Record[String, Location]
    
    var gherkinScenarioMap: Record[String, Scenario]
    
    var pickle: Pickle
    
    var steps: js.Array[IJsonStep]
  }
  object IBuildJsonScenarioOptions {
    
    inline def apply(
      feature: Feature,
      gherkinExampleRuleMap: Record[String, Rule],
      gherkinScenarioLocationMap: Record[String, Location],
      gherkinScenarioMap: Record[String, Scenario],
      pickle: Pickle,
      steps: js.Array[IJsonStep]
    ): IBuildJsonScenarioOptions = {
      val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], gherkinExampleRuleMap = gherkinExampleRuleMap.asInstanceOf[js.Any], gherkinScenarioLocationMap = gherkinScenarioLocationMap.asInstanceOf[js.Any], gherkinScenarioMap = gherkinScenarioMap.asInstanceOf[js.Any], pickle = pickle.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBuildJsonScenarioOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBuildJsonScenarioOptions] (val x: Self) extends AnyVal {
      
      inline def setFeature(value: Feature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      inline def setGherkinExampleRuleMap(value: Record[String, Rule]): Self = StObject.set(x, "gherkinExampleRuleMap", value.asInstanceOf[js.Any])
      
      inline def setGherkinScenarioLocationMap(value: Record[String, Location]): Self = StObject.set(x, "gherkinScenarioLocationMap", value.asInstanceOf[js.Any])
      
      inline def setGherkinScenarioMap(value: Record[String, Scenario]): Self = StObject.set(x, "gherkinScenarioMap", value.asInstanceOf[js.Any])
      
      inline def setPickle(value: Pickle): Self = StObject.set(x, "pickle", value.asInstanceOf[js.Any])
      
      inline def setSteps(value: js.Array[IJsonStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsVarargs(value: IJsonStep*): Self = StObject.set(x, "steps", js.Array(value*))
    }
  }
  
  trait IBuildJsonStepOptions extends StObject {
    
    var gherkinStepMap: Record[String, Step]
    
    var isBeforeHook: Boolean
    
    var pickleStepMap: Record[String, PickleStep]
    
    var testStep: TestStep
    
    var testStepAttachments: js.Array[Attachment]
    
    var testStepResult: TestStepResult
  }
  object IBuildJsonStepOptions {
    
    inline def apply(
      gherkinStepMap: Record[String, Step],
      isBeforeHook: Boolean,
      pickleStepMap: Record[String, PickleStep],
      testStep: TestStep,
      testStepAttachments: js.Array[Attachment],
      testStepResult: TestStepResult
    ): IBuildJsonStepOptions = {
      val __obj = js.Dynamic.literal(gherkinStepMap = gherkinStepMap.asInstanceOf[js.Any], isBeforeHook = isBeforeHook.asInstanceOf[js.Any], pickleStepMap = pickleStepMap.asInstanceOf[js.Any], testStep = testStep.asInstanceOf[js.Any], testStepAttachments = testStepAttachments.asInstanceOf[js.Any], testStepResult = testStepResult.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBuildJsonStepOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBuildJsonStepOptions] (val x: Self) extends AnyVal {
      
      inline def setGherkinStepMap(value: Record[String, Step]): Self = StObject.set(x, "gherkinStepMap", value.asInstanceOf[js.Any])
      
      inline def setIsBeforeHook(value: Boolean): Self = StObject.set(x, "isBeforeHook", value.asInstanceOf[js.Any])
      
      inline def setPickleStepMap(value: Record[String, PickleStep]): Self = StObject.set(x, "pickleStepMap", value.asInstanceOf[js.Any])
      
      inline def setTestStep(value: TestStep): Self = StObject.set(x, "testStep", value.asInstanceOf[js.Any])
      
      inline def setTestStepAttachments(value: js.Array[Attachment]): Self = StObject.set(x, "testStepAttachments", value.asInstanceOf[js.Any])
      
      inline def setTestStepAttachmentsVarargs(value: Attachment*): Self = StObject.set(x, "testStepAttachments", js.Array(value*))
      
      inline def setTestStepResult(value: TestStepResult): Self = StObject.set(x, "testStepResult", value.asInstanceOf[js.Any])
    }
  }
  
  trait IJsonFeature extends StObject {
    
    var description: String
    
    var elements: js.Array[IJsonScenario]
    
    var id: String
    
    var keyword: String
    
    var line: Double
    
    var name: String
    
    var tags: js.Array[IJsonTag]
    
    var uri: String
  }
  object IJsonFeature {
    
    inline def apply(
      description: String,
      elements: js.Array[IJsonScenario],
      id: String,
      keyword: String,
      line: Double,
      name: String,
      tags: js.Array[IJsonTag],
      uri: String
    ): IJsonFeature = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[IJsonFeature]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IJsonFeature] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setElements(value: js.Array[IJsonScenario]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setElementsVarargs(value: IJsonScenario*): Self = StObject.set(x, "elements", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTags(value: js.Array[IJsonTag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: IJsonTag*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait IJsonScenario extends StObject {
    
    var description: String
    
    var id: String
    
    var keyword: String
    
    var line: Double
    
    var name: String
    
    var steps: js.Array[IJsonStep]
    
    var tags: js.Array[IJsonTag]
    
    var `type`: String
  }
  object IJsonScenario {
    
    inline def apply(
      description: String,
      id: String,
      keyword: String,
      line: Double,
      name: String,
      steps: js.Array[IJsonStep],
      tags: js.Array[IJsonTag],
      `type`: String
    ): IJsonScenario = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IJsonScenario]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IJsonScenario] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSteps(value: js.Array[IJsonStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsVarargs(value: IJsonStep*): Self = StObject.set(x, "steps", js.Array(value*))
      
      inline def setTags(value: js.Array[IJsonTag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: IJsonTag*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IJsonStep extends StObject {
    
    var arguments: js.UndefOr[Any] = js.undefined
    
    var embeddings: js.UndefOr[Any] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var keyword: js.UndefOr[String] = js.undefined
    
    var line: js.UndefOr[Double] = js.undefined
    
    var `match`: js.UndefOr[Any] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var result: js.UndefOr[Any] = js.undefined
  }
  object IJsonStep {
    
    inline def apply(): IJsonStep = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IJsonStep]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IJsonStep] (val x: Self) extends AnyVal {
      
      inline def setArguments(value: Any): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
      
      inline def setEmbeddings(value: Any): Self = StObject.set(x, "embeddings", value.asInstanceOf[js.Any])
      
      inline def setEmbeddingsUndefined: Self = StObject.set(x, "embeddings", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      inline def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      inline def setMatch(value: Any): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
  
  trait IJsonTag extends StObject {
    
    var line: Double
    
    var name: String
  }
  object IJsonTag {
    
    inline def apply(line: Double, name: String): IJsonTag = {
      val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IJsonTag]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IJsonTag] (val x: Self) extends AnyVal {
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait JsonFormatter
    extends typings.cucumberCucumber.libFormatterMod.default {
    
    def convertNameToId(obj: Feature): String = js.native
    def convertNameToId(obj: Pickle): String = js.native
    
    def formatDataTable(dataTable: PickleTable): Any = js.native
    
    def formatDocString(docString: PickleDocString, gherkinStep: Step): Any = js.native
    
    /* private */ var formatScenarioId: Any = js.native
    
    def formatStepArgument(stepArgument: PickleStepArgument, gherkinStep: Step): Any = js.native
    
    def getFeatureData(param0: IBuildJsonFeatureOptions): IJsonFeature = js.native
    
    def getFeatureTags(feature: Feature): js.Array[IJsonTag] = js.native
    
    def getScenarioData(param0: IBuildJsonScenarioOptions): IJsonScenario = js.native
    
    /* private */ var getScenarioTag: Any = js.native
    
    def getScenarioTags(param0: typings.cucumberCucumber.anon.Feature): js.Array[IJsonTag] = js.native
    
    def getStepData(param0: IBuildJsonStepOptions): IJsonStep = js.native
    
    def onTestRunFinished(): Unit = js.native
  }
}
