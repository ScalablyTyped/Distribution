package typings.cucumberCucumber

import typings.cucumberCucumber.libFormatterHelpersEventDataCollectorMod.default
import typings.cucumberCucumber.libFormatterHelpersIssueHelpersMod.IFormatIssueRequest
import typings.cucumberCucumber.libFormatterHelpersKeywordTypeMod.IGetStepKeywordTypeOptions
import typings.cucumberCucumber.libFormatterHelpersKeywordTypeMod.KeywordType
import typings.cucumberCucumber.libFormatterHelpersPickleParserMod.IGetPickleLocationRequest
import typings.cucumberCucumber.libFormatterHelpersPickleParserMod.IGetScenarioDescriptionRequest
import typings.cucumberCucumber.libFormatterHelpersPickleParserMod.IGetStepKeywordRequest
import typings.cucumberCucumber.libFormatterHelpersSummaryHelpersMod.IFormatSummaryRequest
import typings.cucumberCucumber.libFormatterHelpersTestCaseAttemptParserMod.IParseTestCaseAttemptRequest
import typings.cucumberCucumber.libFormatterHelpersTestCaseAttemptParserMod.IParsedTestCaseAttempt
import typings.cucumberCucumber.libFormatterHelpersUsageHelpersMod.IGetUsageRequest
import typings.cucumberCucumber.libFormatterHelpersUsageHelpersMod.IUsage
import typings.cucumberCucumber.libTypesMod.ILineAndUri
import typings.cucumberMessages.mod.GherkinDocument
import typings.cucumberMessages.mod.Location
import typings.cucumberMessages.mod.Pickle
import typings.cucumberMessages.mod.PickleStep
import typings.cucumberMessages.mod.Rule
import typings.cucumberMessages.mod.Scenario
import typings.cucumberMessages.mod.Step
import typings.cucumberMessages.mod.TestStepResult
import typings.node.eventsMod.EventEmitter
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterHelpersMod {
  
  @JSImport("@cucumber/cucumber/lib/formatter/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@cucumber/cucumber/lib/formatter/helpers", "EventDataCollector")
  @js.native
  open class EventDataCollector protected () extends default {
    def this(eventBroadcaster: EventEmitter) = this()
  }
  
  object GherkinDocumentParser {
    
    @JSImport("@cucumber/cucumber/lib/formatter/helpers", "GherkinDocumentParser")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getGherkinExampleRuleMap(gherkinDocument: GherkinDocument): Record[String, Rule] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGherkinExampleRuleMap")(gherkinDocument.asInstanceOf[js.Any]).asInstanceOf[Record[String, Rule]]
    
    inline def getGherkinScenarioLocationMap(gherkinDocument: GherkinDocument): Record[String, Location] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGherkinScenarioLocationMap")(gherkinDocument.asInstanceOf[js.Any]).asInstanceOf[Record[String, Location]]
    
    inline def getGherkinScenarioMap(gherkinDocument: GherkinDocument): Record[String, Scenario] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGherkinScenarioMap")(gherkinDocument.asInstanceOf[js.Any]).asInstanceOf[Record[String, Scenario]]
    
    inline def getGherkinStepMap(gherkinDocument: GherkinDocument): Record[String, Step] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGherkinStepMap")(gherkinDocument.asInstanceOf[js.Any]).asInstanceOf[Record[String, Step]]
  }
  
  @JSImport("@cucumber/cucumber/lib/formatter/helpers", "KeywordType")
  @js.native
  object KeywordType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.cucumberCucumber.libFormatterHelpersKeywordTypeMod.KeywordType & String] = js.native
    
    /* "event" */ val Event: typings.cucumberCucumber.libFormatterHelpersKeywordTypeMod.KeywordType.Event & String = js.native
    
    /* "outcome" */ val Outcome: typings.cucumberCucumber.libFormatterHelpersKeywordTypeMod.KeywordType.Outcome & String = js.native
    
    /* "precondition" */ val Precondition: typings.cucumberCucumber.libFormatterHelpersKeywordTypeMod.KeywordType.Precondition & String = js.native
  }
  
  object PickleParser {
    
    @JSImport("@cucumber/cucumber/lib/formatter/helpers", "PickleParser")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getPickleLocation(param0: IGetPickleLocationRequest): Location = ^.asInstanceOf[js.Dynamic].applyDynamic("getPickleLocation")(param0.asInstanceOf[js.Any]).asInstanceOf[Location]
    
    inline def getPickleStepMap(pickle: Pickle): Record[String, PickleStep] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPickleStepMap")(pickle.asInstanceOf[js.Any]).asInstanceOf[Record[String, PickleStep]]
    
    inline def getScenarioDescription(param0: IGetScenarioDescriptionRequest): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getScenarioDescription")(param0.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getStepKeyword(param0: IGetStepKeywordRequest): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStepKeyword")(param0.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  inline def formatIssue(param0: IFormatIssueRequest): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatIssue")(param0.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def formatLocation(obj: ILineAndUri): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatLocation")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatLocation(obj: ILineAndUri, cwd: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatLocation")(obj.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatSummary(param0: IFormatSummaryRequest): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatSummary")(param0.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getStepKeywordType(param0: IGetStepKeywordTypeOptions): KeywordType = ^.asInstanceOf[js.Dynamic].applyDynamic("getStepKeywordType")(param0.asInstanceOf[js.Any]).asInstanceOf[KeywordType]
  
  inline def getUsage(param0: IGetUsageRequest): js.Array[IUsage] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUsage")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[IUsage]]
  
  inline def isFailure(result: TestStepResult): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFailure")(result.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isFailure(result: TestStepResult, willBeRetried: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFailure")(result.asInstanceOf[js.Any], willBeRetried.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isIssue(result: TestStepResult): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIssue")(result.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isWarning(result: TestStepResult): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWarning")(result.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isWarning(result: TestStepResult, willBeRetried: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWarning")(result.asInstanceOf[js.Any], willBeRetried.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def parseTestCaseAttempt(param0: IParseTestCaseAttemptRequest): IParsedTestCaseAttempt = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTestCaseAttempt")(param0.asInstanceOf[js.Any]).asInstanceOf[IParsedTestCaseAttempt]
}
