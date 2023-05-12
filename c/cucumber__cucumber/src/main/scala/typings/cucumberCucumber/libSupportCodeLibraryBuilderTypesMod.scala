package typings.cucumberCucumber

import typings.cucumberCucumber.libApiTypesMod.ISupportCodeCoordinatesOrLibrary
import typings.cucumberCucumber.libModelsTestCaseHookDefinitionMod.default
import typings.cucumberCucumber.libSupportCodeLibraryBuilderWorldMod.IWorld
import typings.cucumberCucumberExpressions.mod.ParameterTypeRegistry
import typings.cucumberMessages.mod.GherkinDocument
import typings.cucumberMessages.mod.Pickle
import typings.cucumberMessages.mod.PickleStep
import typings.cucumberMessages.mod.TestStepResult
import typings.cucumberMessages.mod.UndefinedParameterType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSupportCodeLibraryBuilderTypesMod {
  
  type DefineStepPattern = String | js.RegExp
  
  type IDefineStep = (js.Function2[/* pattern */ DefineStepPattern, /* code */ TestStepFunction[IWorld[Any]], Unit]) & (js.Function3[
    /* pattern */ DefineStepPattern, 
    /* options */ IDefineStepOptions, 
    /* code */ TestStepFunction[IWorld[Any]], 
    Unit
  ])
  
  trait IDefineStepOptions extends StObject {
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var wrapperOptions: js.UndefOr[Any] = js.undefined
  }
  object IDefineStepOptions {
    
    inline def apply(): IDefineStepOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDefineStepOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDefineStepOptions] (val x: Self) extends AnyVal {
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setWrapperOptions(value: Any): Self = StObject.set(x, "wrapperOptions", value.asInstanceOf[js.Any])
      
      inline def setWrapperOptionsUndefined: Self = StObject.set(x, "wrapperOptions", js.undefined)
    }
  }
  
  trait IDefineSupportCodeMethods extends StObject {
    
    def After[WorldType](code: TestCaseHookFunction[WorldType]): Unit
    def After[WorldType](options: IDefineTestCaseHookOptions, code: TestCaseHookFunction[WorldType]): Unit
    def After[WorldType](tags: String, code: TestCaseHookFunction[WorldType]): Unit
    
    def AfterAll(code: js.Function): Unit
    def AfterAll(options: IDefineTestRunHookOptions, code: js.Function): Unit
    @JSName("AfterAll")
    var AfterAll_Original: (js.Function1[/* code */ js.Function, Unit]) & (js.Function2[/* options */ IDefineTestRunHookOptions, /* code */ js.Function, Unit])
    
    def AfterStep[WorldType](code: TestStepHookFunction[WorldType]): Unit
    def AfterStep[WorldType](options: IDefineTestStepHookOptions, code: TestStepHookFunction[WorldType]): Unit
    def AfterStep[WorldType](tags: String, code: TestStepHookFunction[WorldType]): Unit
    @JSName("AfterStep")
    var AfterStep_Original: (js.Function1[/* code */ TestStepHookFunction[IWorld[Any]], Unit]) & (js.Function2[/* tags */ String, /* code */ TestStepHookFunction[IWorld[Any]], Unit]) & (js.Function2[
        /* options */ IDefineTestStepHookOptions, 
        /* code */ TestStepHookFunction[IWorld[Any]], 
        Unit
      ])
    
    @JSName("After")
    var After_Original: (js.Function1[/* code */ TestCaseHookFunction[IWorld[Any]], Unit]) & (js.Function2[/* tags */ String, /* code */ TestCaseHookFunction[IWorld[Any]], Unit]) & (js.Function2[
        /* options */ IDefineTestCaseHookOptions, 
        /* code */ TestCaseHookFunction[IWorld[Any]], 
        Unit
      ])
    
    def Before[WorldType](code: TestCaseHookFunction[WorldType]): Unit
    def Before[WorldType](options: IDefineTestCaseHookOptions, code: TestCaseHookFunction[WorldType]): Unit
    def Before[WorldType](tags: String, code: TestCaseHookFunction[WorldType]): Unit
    
    def BeforeAll(code: js.Function): Unit
    def BeforeAll(options: IDefineTestRunHookOptions, code: js.Function): Unit
    @JSName("BeforeAll")
    var BeforeAll_Original: (js.Function1[/* code */ js.Function, Unit]) & (js.Function2[/* options */ IDefineTestRunHookOptions, /* code */ js.Function, Unit])
    
    def BeforeStep[WorldType](code: TestStepHookFunction[WorldType]): Unit
    def BeforeStep[WorldType](options: IDefineTestStepHookOptions, code: TestStepHookFunction[WorldType]): Unit
    def BeforeStep[WorldType](tags: String, code: TestStepHookFunction[WorldType]): Unit
    @JSName("BeforeStep")
    var BeforeStep_Original: (js.Function1[/* code */ TestStepHookFunction[IWorld[Any]], Unit]) & (js.Function2[/* tags */ String, /* code */ TestStepHookFunction[IWorld[Any]], Unit]) & (js.Function2[
        /* options */ IDefineTestStepHookOptions, 
        /* code */ TestStepHookFunction[IWorld[Any]], 
        Unit
      ])
    
    @JSName("Before")
    var Before_Original: (js.Function1[/* code */ TestCaseHookFunction[IWorld[Any]], Unit]) & (js.Function2[/* tags */ String, /* code */ TestCaseHookFunction[IWorld[Any]], Unit]) & (js.Function2[
        /* options */ IDefineTestCaseHookOptions, 
        /* code */ TestCaseHookFunction[IWorld[Any]], 
        Unit
      ])
    
    def Given[WorldType](pattern: DefineStepPattern, code: TestStepFunction[WorldType]): Unit
    def Given[WorldType](pattern: DefineStepPattern, options: IDefineStepOptions, code: TestStepFunction[WorldType]): Unit
    @JSName("Given")
    var Given_Original: IDefineStep
    
    def Then[WorldType](pattern: DefineStepPattern, code: TestStepFunction[WorldType]): Unit
    def Then[WorldType](pattern: DefineStepPattern, options: IDefineStepOptions, code: TestStepFunction[WorldType]): Unit
    @JSName("Then")
    var Then_Original: IDefineStep
    
    def When[WorldType](pattern: DefineStepPattern, code: TestStepFunction[WorldType]): Unit
    def When[WorldType](pattern: DefineStepPattern, options: IDefineStepOptions, code: TestStepFunction[WorldType]): Unit
    @JSName("When")
    var When_Original: IDefineStep
    
    def defineParameterType(options: IParameterTypeDefinition[Any]): Unit
    
    def defineStep[WorldType](pattern: DefineStepPattern, code: TestStepFunction[WorldType]): Unit
    def defineStep[WorldType](pattern: DefineStepPattern, options: IDefineStepOptions, code: TestStepFunction[WorldType]): Unit
    @JSName("defineStep")
    var defineStep_Original: IDefineStep
    
    def setDefaultTimeout(milliseconds: Double): Unit
    
    def setDefinitionFunctionWrapper(fn: js.Function): Unit
    
    def setParallelCanAssign(fn: ParallelAssignmentValidator): Unit
    
    def setWorldConstructor(fn: Any): Unit
  }
  object IDefineSupportCodeMethods {
    
    inline def apply(
      After: (js.Function1[/* code */ TestCaseHookFunction[IWorld[Any]], Unit]) & (js.Function2[/* tags */ String, /* code */ TestCaseHookFunction[IWorld[Any]], Unit]) & (js.Function2[
          /* options */ IDefineTestCaseHookOptions, 
          /* code */ TestCaseHookFunction[IWorld[Any]], 
          Unit
        ]),
      AfterAll: (js.Function1[/* code */ js.Function, Unit]) & (js.Function2[/* options */ IDefineTestRunHookOptions, /* code */ js.Function, Unit]),
      AfterStep: (js.Function1[/* code */ TestStepHookFunction[IWorld[Any]], Unit]) & (js.Function2[/* tags */ String, /* code */ TestStepHookFunction[IWorld[Any]], Unit]) & (js.Function2[
          /* options */ IDefineTestStepHookOptions, 
          /* code */ TestStepHookFunction[IWorld[Any]], 
          Unit
        ]),
      Before: (js.Function1[/* code */ TestCaseHookFunction[IWorld[Any]], Unit]) & (js.Function2[/* tags */ String, /* code */ TestCaseHookFunction[IWorld[Any]], Unit]) & (js.Function2[
          /* options */ IDefineTestCaseHookOptions, 
          /* code */ TestCaseHookFunction[IWorld[Any]], 
          Unit
        ]),
      BeforeAll: (js.Function1[/* code */ js.Function, Unit]) & (js.Function2[/* options */ IDefineTestRunHookOptions, /* code */ js.Function, Unit]),
      BeforeStep: (js.Function1[/* code */ TestStepHookFunction[IWorld[Any]], Unit]) & (js.Function2[/* tags */ String, /* code */ TestStepHookFunction[IWorld[Any]], Unit]) & (js.Function2[
          /* options */ IDefineTestStepHookOptions, 
          /* code */ TestStepHookFunction[IWorld[Any]], 
          Unit
        ]),
      Given: IDefineStep,
      Then: IDefineStep,
      When: IDefineStep,
      defineParameterType: IParameterTypeDefinition[Any] => Unit,
      defineStep: IDefineStep,
      setDefaultTimeout: Double => Unit,
      setDefinitionFunctionWrapper: js.Function => Unit,
      setParallelCanAssign: ParallelAssignmentValidator => Unit,
      setWorldConstructor: Any => Unit
    ): IDefineSupportCodeMethods = {
      val __obj = js.Dynamic.literal(After = After.asInstanceOf[js.Any], AfterAll = AfterAll.asInstanceOf[js.Any], AfterStep = AfterStep.asInstanceOf[js.Any], Before = Before.asInstanceOf[js.Any], BeforeAll = BeforeAll.asInstanceOf[js.Any], BeforeStep = BeforeStep.asInstanceOf[js.Any], Given = Given.asInstanceOf[js.Any], Then = Then.asInstanceOf[js.Any], When = When.asInstanceOf[js.Any], defineParameterType = js.Any.fromFunction1(defineParameterType), defineStep = defineStep.asInstanceOf[js.Any], setDefaultTimeout = js.Any.fromFunction1(setDefaultTimeout), setDefinitionFunctionWrapper = js.Any.fromFunction1(setDefinitionFunctionWrapper), setParallelCanAssign = js.Any.fromFunction1(setParallelCanAssign), setWorldConstructor = js.Any.fromFunction1(setWorldConstructor))
      __obj.asInstanceOf[IDefineSupportCodeMethods]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDefineSupportCodeMethods] (val x: Self) extends AnyVal {
      
      inline def setAfter(
        value: (js.Function1[/* code */ TestCaseHookFunction[IWorld[Any]], Unit]) & (js.Function2[/* tags */ String, /* code */ TestCaseHookFunction[IWorld[Any]], Unit]) & (js.Function2[
              /* options */ IDefineTestCaseHookOptions, 
              /* code */ TestCaseHookFunction[IWorld[Any]], 
              Unit
            ])
      ): Self = StObject.set(x, "After", value.asInstanceOf[js.Any])
      
      inline def setAfterAll(
        value: (js.Function1[/* code */ js.Function, Unit]) & (js.Function2[/* options */ IDefineTestRunHookOptions, /* code */ js.Function, Unit])
      ): Self = StObject.set(x, "AfterAll", value.asInstanceOf[js.Any])
      
      inline def setAfterStep(
        value: (js.Function1[/* code */ TestStepHookFunction[IWorld[Any]], Unit]) & (js.Function2[/* tags */ String, /* code */ TestStepHookFunction[IWorld[Any]], Unit]) & (js.Function2[
              /* options */ IDefineTestStepHookOptions, 
              /* code */ TestStepHookFunction[IWorld[Any]], 
              Unit
            ])
      ): Self = StObject.set(x, "AfterStep", value.asInstanceOf[js.Any])
      
      inline def setBefore(
        value: (js.Function1[/* code */ TestCaseHookFunction[IWorld[Any]], Unit]) & (js.Function2[/* tags */ String, /* code */ TestCaseHookFunction[IWorld[Any]], Unit]) & (js.Function2[
              /* options */ IDefineTestCaseHookOptions, 
              /* code */ TestCaseHookFunction[IWorld[Any]], 
              Unit
            ])
      ): Self = StObject.set(x, "Before", value.asInstanceOf[js.Any])
      
      inline def setBeforeAll(
        value: (js.Function1[/* code */ js.Function, Unit]) & (js.Function2[/* options */ IDefineTestRunHookOptions, /* code */ js.Function, Unit])
      ): Self = StObject.set(x, "BeforeAll", value.asInstanceOf[js.Any])
      
      inline def setBeforeStep(
        value: (js.Function1[/* code */ TestStepHookFunction[IWorld[Any]], Unit]) & (js.Function2[/* tags */ String, /* code */ TestStepHookFunction[IWorld[Any]], Unit]) & (js.Function2[
              /* options */ IDefineTestStepHookOptions, 
              /* code */ TestStepHookFunction[IWorld[Any]], 
              Unit
            ])
      ): Self = StObject.set(x, "BeforeStep", value.asInstanceOf[js.Any])
      
      inline def setDefineParameterType(value: IParameterTypeDefinition[Any] => Unit): Self = StObject.set(x, "defineParameterType", js.Any.fromFunction1(value))
      
      inline def setDefineStep(value: IDefineStep): Self = StObject.set(x, "defineStep", value.asInstanceOf[js.Any])
      
      inline def setGiven(value: IDefineStep): Self = StObject.set(x, "Given", value.asInstanceOf[js.Any])
      
      inline def setSetDefaultTimeout(value: Double => Unit): Self = StObject.set(x, "setDefaultTimeout", js.Any.fromFunction1(value))
      
      inline def setSetDefinitionFunctionWrapper(value: js.Function => Unit): Self = StObject.set(x, "setDefinitionFunctionWrapper", js.Any.fromFunction1(value))
      
      inline def setSetParallelCanAssign(value: ParallelAssignmentValidator => Unit): Self = StObject.set(x, "setParallelCanAssign", js.Any.fromFunction1(value))
      
      inline def setSetWorldConstructor(value: Any => Unit): Self = StObject.set(x, "setWorldConstructor", js.Any.fromFunction1(value))
      
      inline def setThen(value: IDefineStep): Self = StObject.set(x, "Then", value.asInstanceOf[js.Any])
      
      inline def setWhen(value: IDefineStep): Self = StObject.set(x, "When", value.asInstanceOf[js.Any])
    }
  }
  
  trait IDefineTestCaseHookOptions extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var tags: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object IDefineTestCaseHookOptions {
    
    inline def apply(): IDefineTestCaseHookOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDefineTestCaseHookOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDefineTestCaseHookOptions] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTags(value: String): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait IDefineTestRunHookOptions extends StObject {
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object IDefineTestRunHookOptions {
    
    inline def apply(): IDefineTestRunHookOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDefineTestRunHookOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDefineTestRunHookOptions] (val x: Self) extends AnyVal {
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait IDefineTestStepHookOptions extends StObject {
    
    var tags: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object IDefineTestStepHookOptions {
    
    inline def apply(): IDefineTestStepHookOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDefineTestStepHookOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDefineTestStepHookOptions] (val x: Self) extends AnyVal {
      
      inline def setTags(value: String): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait IParameterTypeDefinition[T] extends StObject {
    
    var name: String
    
    var preferForRegexpMatch: js.UndefOr[Boolean] = js.undefined
    
    var regexp: (js.Array[js.RegExp | String]) | js.RegExp | String
    
    def transformer(`match`: String*): T
    
    var useForSnippets: js.UndefOr[Boolean] = js.undefined
  }
  object IParameterTypeDefinition {
    
    inline def apply[T](
      name: String,
      regexp: (js.Array[js.RegExp | String]) | js.RegExp | String,
      transformer: /* repeated */ String => T
    ): IParameterTypeDefinition[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any], transformer = js.Any.fromFunction1(transformer))
      __obj.asInstanceOf[IParameterTypeDefinition[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IParameterTypeDefinition[?], T] (val x: Self & IParameterTypeDefinition[T]) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPreferForRegexpMatch(value: Boolean): Self = StObject.set(x, "preferForRegexpMatch", value.asInstanceOf[js.Any])
      
      inline def setPreferForRegexpMatchUndefined: Self = StObject.set(x, "preferForRegexpMatch", js.undefined)
      
      inline def setRegexp(value: (js.Array[js.RegExp | String]) | js.RegExp | String): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
      
      inline def setRegexpVarargs(value: (js.RegExp | String)*): Self = StObject.set(x, "regexp", js.Array(value*))
      
      inline def setTransformer(value: /* repeated */ String => T): Self = StObject.set(x, "transformer", js.Any.fromFunction1(value))
      
      inline def setUseForSnippets(value: Boolean): Self = StObject.set(x, "useForSnippets", value.asInstanceOf[js.Any])
      
      inline def setUseForSnippetsUndefined: Self = StObject.set(x, "useForSnippets", js.undefined)
    }
  }
  
  trait ISupportCodeCoordinates extends StObject {
    
    var importPaths: js.Array[String]
    
    var requireModules: js.Array[String]
    
    var requirePaths: js.Array[String]
  }
  object ISupportCodeCoordinates {
    
    inline def apply(importPaths: js.Array[String], requireModules: js.Array[String], requirePaths: js.Array[String]): ISupportCodeCoordinates = {
      val __obj = js.Dynamic.literal(importPaths = importPaths.asInstanceOf[js.Any], requireModules = requireModules.asInstanceOf[js.Any], requirePaths = requirePaths.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISupportCodeCoordinates]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISupportCodeCoordinates] (val x: Self) extends AnyVal {
      
      inline def setImportPaths(value: js.Array[String]): Self = StObject.set(x, "importPaths", value.asInstanceOf[js.Any])
      
      inline def setImportPathsVarargs(value: String*): Self = StObject.set(x, "importPaths", js.Array(value*))
      
      inline def setRequireModules(value: js.Array[String]): Self = StObject.set(x, "requireModules", value.asInstanceOf[js.Any])
      
      inline def setRequireModulesVarargs(value: String*): Self = StObject.set(x, "requireModules", js.Array(value*))
      
      inline def setRequirePaths(value: js.Array[String]): Self = StObject.set(x, "requirePaths", value.asInstanceOf[js.Any])
      
      inline def setRequirePathsVarargs(value: String*): Self = StObject.set(x, "requirePaths", js.Array(value*))
    }
  }
  
  trait ISupportCodeLibrary
    extends StObject
       with ISupportCodeCoordinatesOrLibrary {
    
    val World: Any
    
    val afterTestCaseHookDefinitions: js.Array[default]
    
    val afterTestRunHookDefinitions: js.Array[typings.cucumberCucumber.libModelsTestRunHookDefinitionMod.default]
    
    val afterTestStepHookDefinitions: js.Array[typings.cucumberCucumber.libModelsTestStepHookDefinitionMod.default]
    
    val beforeTestCaseHookDefinitions: js.Array[default]
    
    val beforeTestRunHookDefinitions: js.Array[typings.cucumberCucumber.libModelsTestRunHookDefinitionMod.default]
    
    val beforeTestStepHookDefinitions: js.Array[typings.cucumberCucumber.libModelsTestStepHookDefinitionMod.default]
    
    val defaultTimeout: Double
    
    val originalCoordinates: ISupportCodeCoordinates
    
    def parallelCanAssign(pickle: Pickle, runningPickles: js.Array[Pickle]): Boolean
    
    val parameterTypeRegistry: ParameterTypeRegistry
    
    val stepDefinitions: js.Array[typings.cucumberCucumber.libModelsStepDefinitionMod.default]
    
    val undefinedParameterTypes: js.Array[UndefinedParameterType]
  }
  object ISupportCodeLibrary {
    
    inline def apply(
      World: Any,
      afterTestCaseHookDefinitions: js.Array[default],
      afterTestRunHookDefinitions: js.Array[typings.cucumberCucumber.libModelsTestRunHookDefinitionMod.default],
      afterTestStepHookDefinitions: js.Array[typings.cucumberCucumber.libModelsTestStepHookDefinitionMod.default],
      beforeTestCaseHookDefinitions: js.Array[default],
      beforeTestRunHookDefinitions: js.Array[typings.cucumberCucumber.libModelsTestRunHookDefinitionMod.default],
      beforeTestStepHookDefinitions: js.Array[typings.cucumberCucumber.libModelsTestStepHookDefinitionMod.default],
      defaultTimeout: Double,
      originalCoordinates: ISupportCodeCoordinates,
      parallelCanAssign: (Pickle, js.Array[Pickle]) => Boolean,
      parameterTypeRegistry: ParameterTypeRegistry,
      stepDefinitions: js.Array[typings.cucumberCucumber.libModelsStepDefinitionMod.default],
      undefinedParameterTypes: js.Array[UndefinedParameterType]
    ): ISupportCodeLibrary = {
      val __obj = js.Dynamic.literal(World = World.asInstanceOf[js.Any], afterTestCaseHookDefinitions = afterTestCaseHookDefinitions.asInstanceOf[js.Any], afterTestRunHookDefinitions = afterTestRunHookDefinitions.asInstanceOf[js.Any], afterTestStepHookDefinitions = afterTestStepHookDefinitions.asInstanceOf[js.Any], beforeTestCaseHookDefinitions = beforeTestCaseHookDefinitions.asInstanceOf[js.Any], beforeTestRunHookDefinitions = beforeTestRunHookDefinitions.asInstanceOf[js.Any], beforeTestStepHookDefinitions = beforeTestStepHookDefinitions.asInstanceOf[js.Any], defaultTimeout = defaultTimeout.asInstanceOf[js.Any], originalCoordinates = originalCoordinates.asInstanceOf[js.Any], parallelCanAssign = js.Any.fromFunction2(parallelCanAssign), parameterTypeRegistry = parameterTypeRegistry.asInstanceOf[js.Any], stepDefinitions = stepDefinitions.asInstanceOf[js.Any], undefinedParameterTypes = undefinedParameterTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISupportCodeLibrary]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISupportCodeLibrary] (val x: Self) extends AnyVal {
      
      inline def setAfterTestCaseHookDefinitions(value: js.Array[default]): Self = StObject.set(x, "afterTestCaseHookDefinitions", value.asInstanceOf[js.Any])
      
      inline def setAfterTestCaseHookDefinitionsVarargs(value: default*): Self = StObject.set(x, "afterTestCaseHookDefinitions", js.Array(value*))
      
      inline def setAfterTestRunHookDefinitions(value: js.Array[typings.cucumberCucumber.libModelsTestRunHookDefinitionMod.default]): Self = StObject.set(x, "afterTestRunHookDefinitions", value.asInstanceOf[js.Any])
      
      inline def setAfterTestRunHookDefinitionsVarargs(value: typings.cucumberCucumber.libModelsTestRunHookDefinitionMod.default*): Self = StObject.set(x, "afterTestRunHookDefinitions", js.Array(value*))
      
      inline def setAfterTestStepHookDefinitions(value: js.Array[typings.cucumberCucumber.libModelsTestStepHookDefinitionMod.default]): Self = StObject.set(x, "afterTestStepHookDefinitions", value.asInstanceOf[js.Any])
      
      inline def setAfterTestStepHookDefinitionsVarargs(value: typings.cucumberCucumber.libModelsTestStepHookDefinitionMod.default*): Self = StObject.set(x, "afterTestStepHookDefinitions", js.Array(value*))
      
      inline def setBeforeTestCaseHookDefinitions(value: js.Array[default]): Self = StObject.set(x, "beforeTestCaseHookDefinitions", value.asInstanceOf[js.Any])
      
      inline def setBeforeTestCaseHookDefinitionsVarargs(value: default*): Self = StObject.set(x, "beforeTestCaseHookDefinitions", js.Array(value*))
      
      inline def setBeforeTestRunHookDefinitions(value: js.Array[typings.cucumberCucumber.libModelsTestRunHookDefinitionMod.default]): Self = StObject.set(x, "beforeTestRunHookDefinitions", value.asInstanceOf[js.Any])
      
      inline def setBeforeTestRunHookDefinitionsVarargs(value: typings.cucumberCucumber.libModelsTestRunHookDefinitionMod.default*): Self = StObject.set(x, "beforeTestRunHookDefinitions", js.Array(value*))
      
      inline def setBeforeTestStepHookDefinitions(value: js.Array[typings.cucumberCucumber.libModelsTestStepHookDefinitionMod.default]): Self = StObject.set(x, "beforeTestStepHookDefinitions", value.asInstanceOf[js.Any])
      
      inline def setBeforeTestStepHookDefinitionsVarargs(value: typings.cucumberCucumber.libModelsTestStepHookDefinitionMod.default*): Self = StObject.set(x, "beforeTestStepHookDefinitions", js.Array(value*))
      
      inline def setDefaultTimeout(value: Double): Self = StObject.set(x, "defaultTimeout", value.asInstanceOf[js.Any])
      
      inline def setOriginalCoordinates(value: ISupportCodeCoordinates): Self = StObject.set(x, "originalCoordinates", value.asInstanceOf[js.Any])
      
      inline def setParallelCanAssign(value: (Pickle, js.Array[Pickle]) => Boolean): Self = StObject.set(x, "parallelCanAssign", js.Any.fromFunction2(value))
      
      inline def setParameterTypeRegistry(value: ParameterTypeRegistry): Self = StObject.set(x, "parameterTypeRegistry", value.asInstanceOf[js.Any])
      
      inline def setStepDefinitions(value: js.Array[typings.cucumberCucumber.libModelsStepDefinitionMod.default]): Self = StObject.set(x, "stepDefinitions", value.asInstanceOf[js.Any])
      
      inline def setStepDefinitionsVarargs(value: typings.cucumberCucumber.libModelsStepDefinitionMod.default*): Self = StObject.set(x, "stepDefinitions", js.Array(value*))
      
      inline def setUndefinedParameterTypes(value: js.Array[UndefinedParameterType]): Self = StObject.set(x, "undefinedParameterTypes", value.asInstanceOf[js.Any])
      
      inline def setUndefinedParameterTypesVarargs(value: UndefinedParameterType*): Self = StObject.set(x, "undefinedParameterTypes", js.Array(value*))
      
      inline def setWorld(value: Any): Self = StObject.set(x, "World", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITestCaseHookParameter extends StObject {
    
    var gherkinDocument: GherkinDocument
    
    var pickle: Pickle
    
    var result: js.UndefOr[TestStepResult] = js.undefined
    
    var testCaseStartedId: String
    
    var willBeRetried: js.UndefOr[Boolean] = js.undefined
  }
  object ITestCaseHookParameter {
    
    inline def apply(gherkinDocument: GherkinDocument, pickle: Pickle, testCaseStartedId: String): ITestCaseHookParameter = {
      val __obj = js.Dynamic.literal(gherkinDocument = gherkinDocument.asInstanceOf[js.Any], pickle = pickle.asInstanceOf[js.Any], testCaseStartedId = testCaseStartedId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITestCaseHookParameter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITestCaseHookParameter] (val x: Self) extends AnyVal {
      
      inline def setGherkinDocument(value: GherkinDocument): Self = StObject.set(x, "gherkinDocument", value.asInstanceOf[js.Any])
      
      inline def setPickle(value: Pickle): Self = StObject.set(x, "pickle", value.asInstanceOf[js.Any])
      
      inline def setResult(value: TestStepResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      inline def setTestCaseStartedId(value: String): Self = StObject.set(x, "testCaseStartedId", value.asInstanceOf[js.Any])
      
      inline def setWillBeRetried(value: Boolean): Self = StObject.set(x, "willBeRetried", value.asInstanceOf[js.Any])
      
      inline def setWillBeRetriedUndefined: Self = StObject.set(x, "willBeRetried", js.undefined)
    }
  }
  
  trait ITestStepHookParameter extends StObject {
    
    var gherkinDocument: GherkinDocument
    
    var pickle: Pickle
    
    var pickleStep: PickleStep
    
    var result: TestStepResult
    
    var testCaseStartedId: String
    
    var testStepId: String
  }
  object ITestStepHookParameter {
    
    inline def apply(
      gherkinDocument: GherkinDocument,
      pickle: Pickle,
      pickleStep: PickleStep,
      result: TestStepResult,
      testCaseStartedId: String,
      testStepId: String
    ): ITestStepHookParameter = {
      val __obj = js.Dynamic.literal(gherkinDocument = gherkinDocument.asInstanceOf[js.Any], pickle = pickle.asInstanceOf[js.Any], pickleStep = pickleStep.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], testCaseStartedId = testCaseStartedId.asInstanceOf[js.Any], testStepId = testStepId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITestStepHookParameter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITestStepHookParameter] (val x: Self) extends AnyVal {
      
      inline def setGherkinDocument(value: GherkinDocument): Self = StObject.set(x, "gherkinDocument", value.asInstanceOf[js.Any])
      
      inline def setPickle(value: Pickle): Self = StObject.set(x, "pickle", value.asInstanceOf[js.Any])
      
      inline def setPickleStep(value: PickleStep): Self = StObject.set(x, "pickleStep", value.asInstanceOf[js.Any])
      
      inline def setResult(value: TestStepResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setTestCaseStartedId(value: String): Self = StObject.set(x, "testCaseStartedId", value.asInstanceOf[js.Any])
      
      inline def setTestStepId(value: String): Self = StObject.set(x, "testStepId", value.asInstanceOf[js.Any])
    }
  }
  
  type ParallelAssignmentValidator = js.Function2[/* pickle */ Pickle, /* runningPickles */ js.Array[Pickle], Boolean]
  
  type TestCaseHookFunction[WorldType] = js.ThisFunction1[/* this */ WorldType, /* arg */ ITestCaseHookParameter, Any | js.Promise[Any]]
  
  @js.native
  trait TestStepFunction[WorldType] extends StObject {
    
    def apply(args: Any*): Any | js.Promise[Any] = js.native
  }
  
  type TestStepHookFunction[WorldType] = js.ThisFunction1[/* this */ WorldType, /* arg */ ITestStepHookParameter, Any | js.Promise[Any]]
}
