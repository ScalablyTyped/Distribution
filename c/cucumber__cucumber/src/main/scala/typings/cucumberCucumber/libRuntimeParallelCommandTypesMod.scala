package typings.cucumberCucumber

import typings.cucumberCucumber.libRuntimeMod.IRuntimeOptions
import typings.cucumberMessages.mod.Duration
import typings.cucumberMessages.mod.GherkinDocument
import typings.cucumberMessages.mod.Pickle
import typings.cucumberMessages.mod.TestCase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRuntimeParallelCommandTypesMod {
  
  trait ICanonicalSupportCodeIds extends StObject {
    
    var afterTestCaseHookDefinitionIds: js.Array[String]
    
    var beforeTestCaseHookDefinitionIds: js.Array[String]
    
    var stepDefinitionIds: js.Array[String]
  }
  object ICanonicalSupportCodeIds {
    
    inline def apply(
      afterTestCaseHookDefinitionIds: js.Array[String],
      beforeTestCaseHookDefinitionIds: js.Array[String],
      stepDefinitionIds: js.Array[String]
    ): ICanonicalSupportCodeIds = {
      val __obj = js.Dynamic.literal(afterTestCaseHookDefinitionIds = afterTestCaseHookDefinitionIds.asInstanceOf[js.Any], beforeTestCaseHookDefinitionIds = beforeTestCaseHookDefinitionIds.asInstanceOf[js.Any], stepDefinitionIds = stepDefinitionIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICanonicalSupportCodeIds]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICanonicalSupportCodeIds] (val x: Self) extends AnyVal {
      
      inline def setAfterTestCaseHookDefinitionIds(value: js.Array[String]): Self = StObject.set(x, "afterTestCaseHookDefinitionIds", value.asInstanceOf[js.Any])
      
      inline def setAfterTestCaseHookDefinitionIdsVarargs(value: String*): Self = StObject.set(x, "afterTestCaseHookDefinitionIds", js.Array(value*))
      
      inline def setBeforeTestCaseHookDefinitionIds(value: js.Array[String]): Self = StObject.set(x, "beforeTestCaseHookDefinitionIds", value.asInstanceOf[js.Any])
      
      inline def setBeforeTestCaseHookDefinitionIdsVarargs(value: String*): Self = StObject.set(x, "beforeTestCaseHookDefinitionIds", js.Array(value*))
      
      inline def setStepDefinitionIds(value: js.Array[String]): Self = StObject.set(x, "stepDefinitionIds", value.asInstanceOf[js.Any])
      
      inline def setStepDefinitionIdsVarargs(value: String*): Self = StObject.set(x, "stepDefinitionIds", js.Array(value*))
    }
  }
  
  trait ICoordinatorReport extends StObject {
    
    var jsonEnvelope: js.UndefOr[String] = js.undefined
    
    var ready: js.UndefOr[Boolean] = js.undefined
  }
  object ICoordinatorReport {
    
    inline def apply(): ICoordinatorReport = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICoordinatorReport]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICoordinatorReport] (val x: Self) extends AnyVal {
      
      inline def setJsonEnvelope(value: String): Self = StObject.set(x, "jsonEnvelope", value.asInstanceOf[js.Any])
      
      inline def setJsonEnvelopeUndefined: Self = StObject.set(x, "jsonEnvelope", js.undefined)
      
      inline def setReady(value: Boolean): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
      
      inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    }
  }
  
  trait IWorkerCommand extends StObject {
    
    @JSName("finalize")
    var finalize_FIWorkerCommand: js.UndefOr[Boolean] = js.undefined
    
    var initialize: js.UndefOr[IWorkerCommandInitialize] = js.undefined
    
    var run: js.UndefOr[IWorkerCommandRun] = js.undefined
  }
  object IWorkerCommand {
    
    inline def apply(): IWorkerCommand = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWorkerCommand]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IWorkerCommand] (val x: Self) extends AnyVal {
      
      inline def setFinalize_(value: Boolean): Self = StObject.set(x, "finalize", value.asInstanceOf[js.Any])
      
      inline def setFinalize_Undefined: Self = StObject.set(x, "finalize", js.undefined)
      
      inline def setInitialize(value: IWorkerCommandInitialize): Self = StObject.set(x, "initialize", value.asInstanceOf[js.Any])
      
      inline def setInitializeUndefined: Self = StObject.set(x, "initialize", js.undefined)
      
      inline def setRun(value: IWorkerCommandRun): Self = StObject.set(x, "run", value.asInstanceOf[js.Any])
      
      inline def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
    }
  }
  
  trait IWorkerCommandInitialize extends StObject {
    
    var filterStacktraces: Boolean
    
    var importPaths: js.Array[String]
    
    var options: IRuntimeOptions
    
    var requireModules: js.Array[String]
    
    var requirePaths: js.Array[String]
    
    var supportCodeIds: js.UndefOr[ICanonicalSupportCodeIds] = js.undefined
  }
  object IWorkerCommandInitialize {
    
    inline def apply(
      filterStacktraces: Boolean,
      importPaths: js.Array[String],
      options: IRuntimeOptions,
      requireModules: js.Array[String],
      requirePaths: js.Array[String]
    ): IWorkerCommandInitialize = {
      val __obj = js.Dynamic.literal(filterStacktraces = filterStacktraces.asInstanceOf[js.Any], importPaths = importPaths.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], requireModules = requireModules.asInstanceOf[js.Any], requirePaths = requirePaths.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWorkerCommandInitialize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IWorkerCommandInitialize] (val x: Self) extends AnyVal {
      
      inline def setFilterStacktraces(value: Boolean): Self = StObject.set(x, "filterStacktraces", value.asInstanceOf[js.Any])
      
      inline def setImportPaths(value: js.Array[String]): Self = StObject.set(x, "importPaths", value.asInstanceOf[js.Any])
      
      inline def setImportPathsVarargs(value: String*): Self = StObject.set(x, "importPaths", js.Array(value*))
      
      inline def setOptions(value: IRuntimeOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setRequireModules(value: js.Array[String]): Self = StObject.set(x, "requireModules", value.asInstanceOf[js.Any])
      
      inline def setRequireModulesVarargs(value: String*): Self = StObject.set(x, "requireModules", js.Array(value*))
      
      inline def setRequirePaths(value: js.Array[String]): Self = StObject.set(x, "requirePaths", value.asInstanceOf[js.Any])
      
      inline def setRequirePathsVarargs(value: String*): Self = StObject.set(x, "requirePaths", js.Array(value*))
      
      inline def setSupportCodeIds(value: ICanonicalSupportCodeIds): Self = StObject.set(x, "supportCodeIds", value.asInstanceOf[js.Any])
      
      inline def setSupportCodeIdsUndefined: Self = StObject.set(x, "supportCodeIds", js.undefined)
    }
  }
  
  trait IWorkerCommandRun extends StObject {
    
    var elapsed: Duration
    
    var gherkinDocument: GherkinDocument
    
    var pickle: Pickle
    
    var retries: Double
    
    var skip: Boolean
    
    var testCase: TestCase
  }
  object IWorkerCommandRun {
    
    inline def apply(
      elapsed: Duration,
      gherkinDocument: GherkinDocument,
      pickle: Pickle,
      retries: Double,
      skip: Boolean,
      testCase: TestCase
    ): IWorkerCommandRun = {
      val __obj = js.Dynamic.literal(elapsed = elapsed.asInstanceOf[js.Any], gherkinDocument = gherkinDocument.asInstanceOf[js.Any], pickle = pickle.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any], testCase = testCase.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWorkerCommandRun]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IWorkerCommandRun] (val x: Self) extends AnyVal {
      
      inline def setElapsed(value: Duration): Self = StObject.set(x, "elapsed", value.asInstanceOf[js.Any])
      
      inline def setGherkinDocument(value: GherkinDocument): Self = StObject.set(x, "gherkinDocument", value.asInstanceOf[js.Any])
      
      inline def setPickle(value: Pickle): Self = StObject.set(x, "pickle", value.asInstanceOf[js.Any])
      
      inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      inline def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setTestCase(value: TestCase): Self = StObject.set(x, "testCase", value.asInstanceOf[js.Any])
    }
  }
}
