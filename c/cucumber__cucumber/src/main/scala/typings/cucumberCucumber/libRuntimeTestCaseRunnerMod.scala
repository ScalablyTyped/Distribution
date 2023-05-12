package typings.cucumberCucumber

import typings.cucumberCucumber.libModelsDefinitionMod.IDefinition
import typings.cucumberCucumber.libRuntimeStopwatchMod.IStopwatch
import typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.ISupportCodeLibrary
import typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.ITestCaseHookParameter
import typings.cucumberMessages.distCjsSrcIdGeneratorMod.NewId
import typings.cucumberMessages.distCjsSrcMessagesMod.TestStepResultStatus
import typings.cucumberMessages.mod.GherkinDocument
import typings.cucumberMessages.mod.Pickle
import typings.cucumberMessages.mod.PickleStep
import typings.cucumberMessages.mod.TestCase
import typings.cucumberMessages.mod.TestStep
import typings.cucumberMessages.mod.TestStepResult
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRuntimeTestCaseRunnerMod {
  
  @JSImport("@cucumber/cucumber/lib/runtime/test_case_runner", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with TestCaseRunner {
    def this(param0: INewTestCaseRunnerOptions) = this()
  }
  
  trait INewTestCaseRunnerOptions extends StObject {
    
    var eventBroadcaster: EventEmitter
    
    var filterStackTraces: Boolean
    
    var gherkinDocument: GherkinDocument
    
    def newId(): String
    @JSName("newId")
    var newId_Original: NewId
    
    var pickle: Pickle
    
    var retries: Double
    
    var skip: Boolean
    
    var stopwatch: IStopwatch
    
    var supportCodeLibrary: ISupportCodeLibrary
    
    var testCase: TestCase
    
    var worldParameters: Any
  }
  object INewTestCaseRunnerOptions {
    
    inline def apply(
      eventBroadcaster: EventEmitter,
      filterStackTraces: Boolean,
      gherkinDocument: GherkinDocument,
      newId: () => String,
      pickle: Pickle,
      retries: Double,
      skip: Boolean,
      stopwatch: IStopwatch,
      supportCodeLibrary: ISupportCodeLibrary,
      testCase: TestCase,
      worldParameters: Any
    ): INewTestCaseRunnerOptions = {
      val __obj = js.Dynamic.literal(eventBroadcaster = eventBroadcaster.asInstanceOf[js.Any], filterStackTraces = filterStackTraces.asInstanceOf[js.Any], gherkinDocument = gherkinDocument.asInstanceOf[js.Any], newId = js.Any.fromFunction0(newId), pickle = pickle.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any], stopwatch = stopwatch.asInstanceOf[js.Any], supportCodeLibrary = supportCodeLibrary.asInstanceOf[js.Any], testCase = testCase.asInstanceOf[js.Any], worldParameters = worldParameters.asInstanceOf[js.Any])
      __obj.asInstanceOf[INewTestCaseRunnerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: INewTestCaseRunnerOptions] (val x: Self) extends AnyVal {
      
      inline def setEventBroadcaster(value: EventEmitter): Self = StObject.set(x, "eventBroadcaster", value.asInstanceOf[js.Any])
      
      inline def setFilterStackTraces(value: Boolean): Self = StObject.set(x, "filterStackTraces", value.asInstanceOf[js.Any])
      
      inline def setGherkinDocument(value: GherkinDocument): Self = StObject.set(x, "gherkinDocument", value.asInstanceOf[js.Any])
      
      inline def setNewId(value: () => String): Self = StObject.set(x, "newId", js.Any.fromFunction0(value))
      
      inline def setPickle(value: Pickle): Self = StObject.set(x, "pickle", value.asInstanceOf[js.Any])
      
      inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      inline def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setStopwatch(value: IStopwatch): Self = StObject.set(x, "stopwatch", value.asInstanceOf[js.Any])
      
      inline def setSupportCodeLibrary(value: ISupportCodeLibrary): Self = StObject.set(x, "supportCodeLibrary", value.asInstanceOf[js.Any])
      
      inline def setTestCase(value: TestCase): Self = StObject.set(x, "testCase", value.asInstanceOf[js.Any])
      
      inline def setWorldParameters(value: Any): Self = StObject.set(x, "worldParameters", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TestCaseRunner extends StObject {
    
    def aroundTestStep(testStepId: String, runStepFn: js.Function0[js.Promise[TestStepResult]]): js.Promise[Unit] = js.native
    
    /* private */ val attachmentManager: Any = js.native
    
    /* private */ var currentTestCaseStartedId: Any = js.native
    
    /* private */ var currentTestStepId: Any = js.native
    
    /* private */ val eventBroadcaster: Any = js.native
    
    /* private */ val filterStackTraces: Any = js.native
    
    def getAfterStepHookDefinitions(): js.Array[typings.cucumberCucumber.libModelsTestStepHookDefinitionMod.default] = js.native
    
    def getBeforeStepHookDefinitions(): js.Array[typings.cucumberCucumber.libModelsTestStepHookDefinitionMod.default] = js.native
    
    def getWorstStepResult(): TestStepResult = js.native
    
    /* private */ val gherkinDocument: Any = js.native
    
    def invokeStep(step: PickleStep, stepDefinition: IDefinition): js.Promise[TestStepResult] = js.native
    def invokeStep(step: PickleStep, stepDefinition: IDefinition, hookParameter: Any): js.Promise[TestStepResult] = js.native
    
    def isSkippingSteps(): Boolean = js.native
    
    /* private */ val maxAttempts: Any = js.native
    
    /* private */ val newId: Any = js.native
    
    /* private */ val pickle: Any = js.native
    
    def resetTestProgressData(): Unit = js.native
    
    def run(): js.Promise[TestStepResultStatus] = js.native
    
    def runAttempt(attempt: Double, moreAttemptsRemaining: Boolean): js.Promise[Boolean] = js.native
    
    def runHook(
      hookDefinition: typings.cucumberCucumber.libModelsTestCaseHookDefinitionMod.default,
      hookParameter: ITestCaseHookParameter,
      isBeforeHook: Boolean
    ): js.Promise[TestStepResult] = js.native
    
    def runStep(pickleStep: PickleStep, testStep: TestStep): js.Promise[TestStepResult] = js.native
    
    def runStepHooks(
      stepHooks: js.Array[typings.cucumberCucumber.libModelsTestStepHookDefinitionMod.default],
      pickleStep: PickleStep
    ): js.Promise[js.Array[TestStepResult]] = js.native
    def runStepHooks(
      stepHooks: js.Array[typings.cucumberCucumber.libModelsTestStepHookDefinitionMod.default],
      pickleStep: PickleStep,
      stepResult: TestStepResult
    ): js.Promise[js.Array[TestStepResult]] = js.native
    
    def shouldSkipHook(isBeforeHook: Boolean): Boolean = js.native
    
    /* private */ val skip: Any = js.native
    
    /* private */ val stopwatch: Any = js.native
    
    /* private */ val supportCodeLibrary: Any = js.native
    
    /* private */ val testCase: Any = js.native
    
    /* private */ var testStepResults: Any = js.native
    
    /* private */ var world: Any = js.native
    
    /* private */ val worldParameters: Any = js.native
  }
}
