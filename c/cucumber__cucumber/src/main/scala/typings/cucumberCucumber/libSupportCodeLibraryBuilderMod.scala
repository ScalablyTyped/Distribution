package typings.cucumberCucumber

import org.scalablytyped.runtime.Shortcut
import typings.cucumberCucumber.anon.Code
import typings.cucumberCucumber.anon.StepDefinitions
import typings.cucumberCucumber.libModelsGherkinStepKeywordMod.GherkinStepKeyword
import typings.cucumberCucumber.libRuntimeParallelCommandTypesMod.ICanonicalSupportCodeIds
import typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.IDefineStep
import typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.IDefineSupportCodeMethods
import typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.IDefineTestCaseHookOptions
import typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.IDefineTestRunHookOptions
import typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.IDefineTestStepHookOptions
import typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.IParameterTypeDefinition
import typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.ISupportCodeCoordinates
import typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.ISupportCodeLibrary
import typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.TestCaseHookFunction
import typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.TestStepHookFunction
import typings.cucumberMessages.distCjsSrcIdGeneratorMod.NewId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSupportCodeLibraryBuilderMod extends Shortcut {
  
  @JSImport("@cucumber/cucumber/lib/support_code_library_builder", JSImport.Default)
  @js.native
  val default: SupportCodeLibraryBuilder = js.native
  
  @JSImport("@cucumber/cucumber/lib/support_code_library_builder", "SupportCodeLibraryBuilder")
  @js.native
  open class SupportCodeLibraryBuilder () extends StObject {
    
    /* private */ var World: Any = js.native
    
    /* private */ var afterTestCaseHookDefinitionConfigs: Any = js.native
    
    /* private */ var afterTestRunHookDefinitionConfigs: Any = js.native
    
    /* private */ var afterTestStepHookDefinitionConfigs: Any = js.native
    
    /* private */ var beforeTestCaseHookDefinitionConfigs: Any = js.native
    
    /* private */ var beforeTestRunHookDefinitionConfigs: Any = js.native
    
    /* private */ var beforeTestStepHookDefinitionConfigs: Any = js.native
    
    def buildStepDefinitions(): StepDefinitions = js.native
    def buildStepDefinitions(canonicalIds: js.Array[String]): StepDefinitions = js.native
    
    def buildTestCaseHookDefinitions(configs: js.Array[ITestCaseHookDefinitionConfig]): js.Array[typings.cucumberCucumber.libModelsTestCaseHookDefinitionMod.default] = js.native
    def buildTestCaseHookDefinitions(configs: js.Array[ITestCaseHookDefinitionConfig], canonicalIds: js.Array[String]): js.Array[typings.cucumberCucumber.libModelsTestCaseHookDefinitionMod.default] = js.native
    
    def buildTestRunHookDefinitions(configs: js.Array[ITestRunHookDefinitionConfig]): js.Array[typings.cucumberCucumber.libModelsTestRunHookDefinitionMod.default] = js.native
    
    def buildTestStepHookDefinitions(configs: js.Array[ITestStepHookDefinitionConfig]): js.Array[typings.cucumberCucumber.libModelsTestStepHookDefinitionMod.default] = js.native
    
    /* private */ var cwd: Any = js.native
    
    /* private */ var defaultTimeout: Any = js.native
    
    def defineParameterType(options: IParameterTypeDefinition[Any]): Unit = js.native
    
    def defineStep(keyword: GherkinStepKeyword, getCollection: js.Function0[js.Array[IStepDefinitionConfig]]): IDefineStep = js.native
    
    def defineTestCaseHook(getCollection: js.Function0[js.Array[ITestCaseHookDefinitionConfig]]): js.Function2[
        /* options */ String | IDefineTestCaseHookOptions | TestCaseHookFunction[Any], 
        /* code */ js.UndefOr[TestCaseHookFunction[Any]], 
        Unit
      ] = js.native
    
    def defineTestRunHook(getCollection: js.Function0[js.Array[ITestRunHookDefinitionConfig]]): js.Function2[
        /* options */ IDefineTestRunHookOptions | js.Function, 
        /* code */ js.UndefOr[js.Function], 
        Unit
      ] = js.native
    
    def defineTestStepHook(getCollection: js.Function0[js.Array[ITestStepHookDefinitionConfig]]): js.Function2[
        /* options */ String | IDefineTestStepHookOptions | TestStepHookFunction[Any], 
        /* code */ js.UndefOr[TestStepHookFunction[Any]], 
        Unit
      ] = js.native
    
    /* private */ var definitionFunctionWrapper: Any = js.native
    
    def finalize(canonicalIds: ICanonicalSupportCodeIds): ISupportCodeLibrary = js.native
    
    val methods: IDefineSupportCodeMethods = js.native
    
    /* private */ var newId: Any = js.native
    
    /* private */ var originalCoordinates: Any = js.native
    
    /* private */ var parallelCanAssign: Any = js.native
    
    /* private */ var parameterTypeRegistry: Any = js.native
    
    def reset(cwd: String, newId: NewId): Unit = js.native
    def reset(cwd: String, newId: NewId, originalCoordinates: ISupportCodeCoordinates): Unit = js.native
    
    /* private */ var stepDefinitionConfigs: Any = js.native
    
    def wrapCode(param0: Code): js.Function = js.native
  }
  
  @JSImport("@cucumber/cucumber/lib/support_code_library_builder", "builtinParameterTypes")
  @js.native
  val builtinParameterTypes: js.Array[String] = js.native
  
  trait IStepDefinitionConfig extends StObject {
    
    var code: Any
    
    var keyword: GherkinStepKeyword
    
    var line: Double
    
    var options: Any
    
    var pattern: String | js.RegExp
    
    var uri: String
  }
  object IStepDefinitionConfig {
    
    inline def apply(
      code: Any,
      keyword: GherkinStepKeyword,
      line: Double,
      options: Any,
      pattern: String | js.RegExp,
      uri: String
    ): IStepDefinitionConfig = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStepDefinitionConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IStepDefinitionConfig] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Any): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setKeyword(value: GherkinStepKeyword): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPattern(value: String | js.RegExp): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITestCaseHookDefinitionConfig extends StObject {
    
    var code: Any
    
    var line: Double
    
    var options: Any
    
    var uri: String
  }
  object ITestCaseHookDefinitionConfig {
    
    inline def apply(code: Any, line: Double, options: Any, uri: String): ITestCaseHookDefinitionConfig = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITestCaseHookDefinitionConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITestCaseHookDefinitionConfig] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Any): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITestRunHookDefinitionConfig extends StObject {
    
    var code: Any
    
    var line: Double
    
    var options: Any
    
    var uri: String
  }
  object ITestRunHookDefinitionConfig {
    
    inline def apply(code: Any, line: Double, options: Any, uri: String): ITestRunHookDefinitionConfig = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITestRunHookDefinitionConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITestRunHookDefinitionConfig] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Any): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITestStepHookDefinitionConfig extends StObject {
    
    var code: Any
    
    var line: Double
    
    var options: Any
    
    var uri: String
  }
  object ITestStepHookDefinitionConfig {
    
    inline def apply(code: Any, line: Double, options: Any, uri: String): ITestStepHookDefinitionConfig = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITestStepHookDefinitionConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITestStepHookDefinitionConfig] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Any): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = SupportCodeLibraryBuilder
  
  /* This means you don't have to write `default`, but can instead just say `libSupportCodeLibraryBuilderMod.foo` */
  override def _to: SupportCodeLibraryBuilder = default
}
