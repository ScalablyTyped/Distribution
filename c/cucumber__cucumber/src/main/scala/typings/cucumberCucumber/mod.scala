package typings.cucumberCucumber

import org.scalablytyped.runtime.Instantiable1
import typings.cucumberCucumber.anon.Argv
import typings.cucumberCucumber.anon.TypeofFormatter
import typings.cucumberCucumber.cucumberCucumberStrings.formatter
import typings.cucumberCucumber.cucumberCucumberStrings.syntax
import typings.cucumberCucumber.libCliHelpersMod.IParseGherkinMessageStreamRequest
import typings.cucumberCucumber.libCliMod.default
import typings.cucumberCucumber.libFormatterBuilderMod.IBuildOptions
import typings.cucumberCucumber.libFormatterBuilderMod.IGetStepDefinitionSnippetBuilderOptions
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
import typings.cucumberCucumber.libFormatterMod.IFormatterOptions
import typings.cucumberCucumber.libModelsDefinitionMod.IDefinitionParameters
import typings.cucumberCucumber.libModelsDefinitionMod.IHookDefinitionOptions
import typings.cucumberCucumber.libPickleFilterMod.IPickleFilterOptions
import typings.cucumberCucumber.libRuntimeMod.INewRuntimeOptions
import typings.cucumberCucumber.libSupportCodeLibraryBuilderMod.SupportCodeLibraryBuilder
import typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.IDefineStep
import typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.IDefineTestCaseHookOptions
import typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.IDefineTestRunHookOptions
import typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.IDefineTestStepHookOptions
import typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.IParameterTypeDefinition
import typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.ParallelAssignmentValidator
import typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.TestCaseHookFunction
import typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.TestStepHookFunction
import typings.cucumberCucumber.libSupportCodeLibraryBuilderWorldMod.IWorld
import typings.cucumberCucumber.libSupportCodeLibraryBuilderWorldMod.IWorldOptions
import typings.cucumberCucumber.libTypesMod.ILineAndUri
import typings.cucumberMessages.mod.GherkinDocument
import typings.cucumberMessages.mod.Location
import typings.cucumberMessages.mod.Pickle
import typings.cucumberMessages.mod.PickleStep
import typings.cucumberMessages.mod.PickleTable
import typings.cucumberMessages.mod.Rule
import typings.cucumberMessages.mod.Scenario
import typings.cucumberMessages.mod.Step
import typings.cucumberMessages.mod.TestStepResult
import typings.node.eventsMod.EventEmitter
import typings.std.Record
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@cucumber/cucumber", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@cucumber/cucumber", "After")
  @js.native
  val After: (js.Function1[/* code */ TestCaseHookFunction[IWorld[Any]], Unit]) & (js.Function2[/* tags */ String, /* code */ TestCaseHookFunction[IWorld[Any]], Unit]) & (js.Function2[
    /* options */ IDefineTestCaseHookOptions, 
    /* code */ TestCaseHookFunction[IWorld[Any]], 
    Unit
  ]) = js.native
  
  @JSImport("@cucumber/cucumber", "AfterAll")
  @js.native
  val AfterAll: (js.Function1[/* code */ js.Function, Unit]) & (js.Function2[/* options */ IDefineTestRunHookOptions, /* code */ js.Function, Unit]) = js.native
  
  @JSImport("@cucumber/cucumber", "AfterStep")
  @js.native
  val AfterStep: (js.Function1[/* code */ TestStepHookFunction[IWorld[Any]], Unit]) & (js.Function2[/* tags */ String, /* code */ TestStepHookFunction[IWorld[Any]], Unit]) & (js.Function2[
    /* options */ IDefineTestStepHookOptions, 
    /* code */ TestStepHookFunction[IWorld[Any]], 
    Unit
  ]) = js.native
  
  @JSImport("@cucumber/cucumber", "Before")
  @js.native
  val Before: (js.Function1[/* code */ TestCaseHookFunction[IWorld[Any]], Unit]) & (js.Function2[/* tags */ String, /* code */ TestCaseHookFunction[IWorld[Any]], Unit]) & (js.Function2[
    /* options */ IDefineTestCaseHookOptions, 
    /* code */ TestCaseHookFunction[IWorld[Any]], 
    Unit
  ]) = js.native
  
  @JSImport("@cucumber/cucumber", "BeforeAll")
  @js.native
  val BeforeAll: (js.Function1[/* code */ js.Function, Unit]) & (js.Function2[/* options */ IDefineTestRunHookOptions, /* code */ js.Function, Unit]) = js.native
  
  @JSImport("@cucumber/cucumber", "BeforeStep")
  @js.native
  val BeforeStep: (js.Function1[/* code */ TestStepHookFunction[IWorld[Any]], Unit]) & (js.Function2[/* tags */ String, /* code */ TestStepHookFunction[IWorld[Any]], Unit]) & (js.Function2[
    /* options */ IDefineTestStepHookOptions, 
    /* code */ TestStepHookFunction[IWorld[Any]], 
    Unit
  ]) = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@cucumber/cucumber", "Cli")
  @js.native
  open class Cli protected () extends default {
    def this(param0: Argv) = this()
  }
  @JSImport("@cucumber/cucumber", "Cli")
  @js.native
  val Cli: Instantiable1[/* param0 */ Argv, default] = js.native
  
  @JSImport("@cucumber/cucumber", "DataTable")
  @js.native
  open class DataTable protected ()
    extends typings.cucumberCucumber.libModelsDataTableMod.default {
    def this(sourceTable: js.Array[js.Array[String]]) = this()
    def this(sourceTable: PickleTable) = this()
  }
  
  @JSImport("@cucumber/cucumber", "Formatter")
  @js.native
  open class Formatter protected ()
    extends typings.cucumberCucumber.libFormatterMod.default {
    def this(options: IFormatterOptions) = this()
  }
  /* static members */
  object Formatter {
    
    @JSImport("@cucumber/cucumber", "Formatter.documentation")
    @js.native
    val documentation: String = js.native
  }
  
  object FormatterBuilder {
    
    @JSImport("@cucumber/cucumber", "FormatterBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    inline def build(`type`: String, options: IBuildOptions): js.Promise[typings.cucumberCucumber.libFormatterMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.cucumberCucumber.libFormatterMod.default]]
    
    inline def getConstructorByType(`type`: String, cwd: String): js.Promise[TypeofFormatter] = (^.asInstanceOf[js.Dynamic].applyDynamic("getConstructorByType")(`type`.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TypeofFormatter]]
    
    inline def getStepDefinitionSnippetBuilder(param0: IGetStepDefinitionSnippetBuilderOptions): js.Promise[typings.cucumberCucumber.libFormatterStepDefinitionSnippetBuilderMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStepDefinitionSnippetBuilder")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.cucumberCucumber.libFormatterStepDefinitionSnippetBuilderMod.default]]
    
    inline def loadCustomClass(`type`: formatter | syntax, descriptor: String, cwd: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadCustomClass")(`type`.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    inline def loadFile(urlOrName: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFile")(urlOrName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    inline def loadFile(urlOrName: URL): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFile")(urlOrName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    
    inline def resolveConstructor(ImportedCode: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveConstructor")(ImportedCode.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
  
  @JSImport("@cucumber/cucumber", "Given")
  @js.native
  val Given: IDefineStep = js.native
  
  @JSImport("@cucumber/cucumber", "JsonFormatter")
  @js.native
  open class JsonFormatter protected ()
    extends typings.cucumberCucumber.libFormatterJsonFormatterMod.default {
    def this(options: IFormatterOptions) = this()
  }
  /* static members */
  object JsonFormatter {
    
    @JSImport("@cucumber/cucumber", "JsonFormatter.documentation")
    @js.native
    val documentation: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@cucumber/cucumber", "PickleFilter")
  @js.native
  open class PickleFilter protected ()
    extends typings.cucumberCucumber.libPickleFilterMod.default {
    def this(param0: IPickleFilterOptions) = this()
  }
  @JSImport("@cucumber/cucumber", "PickleFilter")
  @js.native
  val PickleFilter: Instantiable1[
    /* param0 */ IPickleFilterOptions, 
    typings.cucumberCucumber.libPickleFilterMod.default
  ] = js.native
  
  @JSImport("@cucumber/cucumber", "ProgressFormatter")
  @js.native
  open class ProgressFormatter protected ()
    extends typings.cucumberCucumber.libFormatterProgressFormatterMod.default {
    def this(options: IFormatterOptions) = this()
  }
  /* static members */
  object ProgressFormatter {
    
    @JSImport("@cucumber/cucumber", "ProgressFormatter.documentation")
    @js.native
    val documentation: String = js.native
  }
  
  @JSImport("@cucumber/cucumber", "RerunFormatter")
  @js.native
  open class RerunFormatter protected ()
    extends typings.cucumberCucumber.libFormatterRerunFormatterMod.default {
    def this(options: IFormatterOptions) = this()
  }
  /* static members */
  object RerunFormatter {
    
    @JSImport("@cucumber/cucumber", "RerunFormatter.documentation")
    @js.native
    val documentation: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@cucumber/cucumber", "Runtime")
  @js.native
  open class Runtime protected ()
    extends typings.cucumberCucumber.libRuntimeMod.default {
    def this(param0: INewRuntimeOptions) = this()
  }
  @JSImport("@cucumber/cucumber", "Runtime")
  @js.native
  val Runtime: Instantiable1[/* param0 */ INewRuntimeOptions, typings.cucumberCucumber.libRuntimeMod.default] = js.native
  
  @JSImport("@cucumber/cucumber", "SnippetsFormatter")
  @js.native
  open class SnippetsFormatter protected ()
    extends typings.cucumberCucumber.libFormatterSnippetsFormatterMod.default {
    def this(options: IFormatterOptions) = this()
  }
  /* static members */
  object SnippetsFormatter {
    
    @JSImport("@cucumber/cucumber", "SnippetsFormatter.documentation")
    @js.native
    val documentation: String = js.native
  }
  
  @JSImport("@cucumber/cucumber", "Status")
  @js.native
  val Status: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof messages.TestStepResultStatus */ Any = js.native
  
  @JSImport("@cucumber/cucumber", "SummaryFormatter")
  @js.native
  open class SummaryFormatter protected ()
    extends typings.cucumberCucumber.libFormatterSummaryFormatterMod.default {
    def this(options: IFormatterOptions) = this()
  }
  /* static members */
  object SummaryFormatter {
    
    @JSImport("@cucumber/cucumber", "SummaryFormatter.documentation")
    @js.native
    val documentation: String = js.native
  }
  
  @JSImport("@cucumber/cucumber", "TestCaseHookDefinition")
  @js.native
  open class TestCaseHookDefinition protected ()
    extends typings.cucumberCucumber.libModelsTestCaseHookDefinitionMod.default {
    def this(data: IDefinitionParameters[IHookDefinitionOptions]) = this()
  }
  
  @JSImport("@cucumber/cucumber", "Then")
  @js.native
  val Then: IDefineStep = js.native
  
  @JSImport("@cucumber/cucumber", "UsageFormatter")
  @js.native
  open class UsageFormatter protected ()
    extends typings.cucumberCucumber.libFormatterUsageFormatterMod.default {
    def this(options: IFormatterOptions) = this()
  }
  /* static members */
  object UsageFormatter {
    
    @JSImport("@cucumber/cucumber", "UsageFormatter.documentation")
    @js.native
    val documentation: String = js.native
  }
  
  @JSImport("@cucumber/cucumber", "UsageJsonFormatter")
  @js.native
  open class UsageJsonFormatter protected ()
    extends typings.cucumberCucumber.libFormatterUsageJsonFormatterMod.default {
    def this(options: IFormatterOptions) = this()
  }
  /* static members */
  object UsageJsonFormatter {
    
    @JSImport("@cucumber/cucumber", "UsageJsonFormatter.documentation")
    @js.native
    val documentation: String = js.native
  }
  
  @JSImport("@cucumber/cucumber", "When")
  @js.native
  val When: IDefineStep = js.native
  
  @JSImport("@cucumber/cucumber", "World")
  @js.native
  open class World[ParametersType] protected ()
    extends typings.cucumberCucumber.libSupportCodeLibraryBuilderWorldMod.default[ParametersType] {
    def this(param0: IWorldOptions[ParametersType]) = this()
  }
  
  inline def defineParameterType(options: IParameterTypeDefinition[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("defineParameterType")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@cucumber/cucumber", "defineStep")
  @js.native
  val defineStep: IDefineStep = js.native
  
  object formatterHelpers {
    
    @JSImport("@cucumber/cucumber", "formatterHelpers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@cucumber/cucumber", "formatterHelpers.EventDataCollector")
    @js.native
    open class EventDataCollector protected ()
      extends typings.cucumberCucumber.libFormatterHelpersMod.EventDataCollector {
      def this(eventBroadcaster: EventEmitter) = this()
    }
    
    object GherkinDocumentParser {
      
      @JSImport("@cucumber/cucumber", "formatterHelpers.GherkinDocumentParser")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getGherkinExampleRuleMap(gherkinDocument: GherkinDocument): Record[String, Rule] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGherkinExampleRuleMap")(gherkinDocument.asInstanceOf[js.Any]).asInstanceOf[Record[String, Rule]]
      
      inline def getGherkinScenarioLocationMap(gherkinDocument: GherkinDocument): Record[String, Location] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGherkinScenarioLocationMap")(gherkinDocument.asInstanceOf[js.Any]).asInstanceOf[Record[String, Location]]
      
      inline def getGherkinScenarioMap(gherkinDocument: GherkinDocument): Record[String, Scenario] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGherkinScenarioMap")(gherkinDocument.asInstanceOf[js.Any]).asInstanceOf[Record[String, Scenario]]
      
      inline def getGherkinStepMap(gherkinDocument: GherkinDocument): Record[String, Step] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGherkinStepMap")(gherkinDocument.asInstanceOf[js.Any]).asInstanceOf[Record[String, Step]]
    }
    
    @JSImport("@cucumber/cucumber", "formatterHelpers.KeywordType")
    @js.native
    object KeywordType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.cucumberCucumber.libFormatterHelpersKeywordTypeMod.KeywordType & String] = js.native
      
      /* "event" */ val Event: typings.cucumberCucumber.libFormatterHelpersKeywordTypeMod.KeywordType.Event & String = js.native
      
      /* "outcome" */ val Outcome: typings.cucumberCucumber.libFormatterHelpersKeywordTypeMod.KeywordType.Outcome & String = js.native
      
      /* "precondition" */ val Precondition: typings.cucumberCucumber.libFormatterHelpersKeywordTypeMod.KeywordType.Precondition & String = js.native
    }
    
    object PickleParser {
      
      @JSImport("@cucumber/cucumber", "formatterHelpers.PickleParser")
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
  
  object parallelCanAssignHelpers {
    
    @JSImport("@cucumber/cucumber", "parallelCanAssignHelpers")
    @js.native
    val ^ : js.Any = js.native
    
    inline def atMostOnePicklePerTag(tagNames: js.Array[String]): ParallelAssignmentValidator = ^.asInstanceOf[js.Dynamic].applyDynamic("atMostOnePicklePerTag")(tagNames.asInstanceOf[js.Any]).asInstanceOf[ParallelAssignmentValidator]
  }
  
  @JSImport("@cucumber/cucumber", "parseGherkinMessageStream")
  @js.native
  val parseGherkinMessageStream: js.Function1[/* param0 */ IParseGherkinMessageStreamRequest, js.Promise[js.Array[String]]] = js.native
  
  inline def setDefaultTimeout(milliseconds: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultTimeout")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setDefinitionFunctionWrapper(fn: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefinitionFunctionWrapper")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setParallelCanAssign(fn: ParallelAssignmentValidator): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setParallelCanAssign")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setWorldConstructor(fn: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setWorldConstructor")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@cucumber/cucumber", "supportCodeLibraryBuilder")
  @js.native
  val supportCodeLibraryBuilder: SupportCodeLibraryBuilder = js.native
  
  @JSImport("@cucumber/cucumber", "version")
  @js.native
  val version: /* "9.1.2" */ String = js.native
  
  inline def wrapPromiseWithTimeout[T](promise: js.Promise[T], timeoutInMilliseconds: Double): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapPromiseWithTimeout")(promise.asInstanceOf[js.Any], timeoutInMilliseconds.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def wrapPromiseWithTimeout[T](promise: js.Promise[T], timeoutInMilliseconds: Double, timeoutMessage: String): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapPromiseWithTimeout")(promise.asInstanceOf[js.Any], timeoutInMilliseconds.asInstanceOf[js.Any], timeoutMessage.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
}
