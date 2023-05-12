package typings.cucumberCucumber

import typings.cucumberCucumber.libModelsDefinitionMod.IDefinition
import typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.ITestCaseHookParameter
import typings.cucumberMessages.mod.PickleStep
import typings.cucumberMessages.mod.TestStepResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRuntimeStepRunnerMod {
  
  @JSImport("@cucumber/cucumber/lib/runtime/step_runner", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("@cucumber/cucumber/lib/runtime/step_runner", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@cucumber/cucumber/lib/runtime/step_runner", "default.run")
    @js.native
    def run: js.Function1[/* param0 */ IRunOptions, js.Promise[TestStepResult]] = js.native
    inline def run(param0: IRunOptions): js.Promise[TestStepResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TestStepResult]]
    inline def run_=(x: js.Function1[/* param0 */ IRunOptions, js.Promise[TestStepResult]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("run")(x.asInstanceOf[js.Any])
  }
  
  inline def run(param0: IRunOptions): js.Promise[TestStepResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TestStepResult]]
  
  trait IRunOptions extends StObject {
    
    var defaultTimeout: Double
    
    var filterStackTraces: Boolean
    
    var hookParameter: ITestCaseHookParameter
    
    var step: PickleStep
    
    var stepDefinition: IDefinition
    
    var world: Any
  }
  object IRunOptions {
    
    inline def apply(
      defaultTimeout: Double,
      filterStackTraces: Boolean,
      hookParameter: ITestCaseHookParameter,
      step: PickleStep,
      stepDefinition: IDefinition,
      world: Any
    ): IRunOptions = {
      val __obj = js.Dynamic.literal(defaultTimeout = defaultTimeout.asInstanceOf[js.Any], filterStackTraces = filterStackTraces.asInstanceOf[js.Any], hookParameter = hookParameter.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], stepDefinition = stepDefinition.asInstanceOf[js.Any], world = world.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRunOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRunOptions] (val x: Self) extends AnyVal {
      
      inline def setDefaultTimeout(value: Double): Self = StObject.set(x, "defaultTimeout", value.asInstanceOf[js.Any])
      
      inline def setFilterStackTraces(value: Boolean): Self = StObject.set(x, "filterStackTraces", value.asInstanceOf[js.Any])
      
      inline def setHookParameter(value: ITestCaseHookParameter): Self = StObject.set(x, "hookParameter", value.asInstanceOf[js.Any])
      
      inline def setStep(value: PickleStep): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepDefinition(value: IDefinition): Self = StObject.set(x, "stepDefinition", value.asInstanceOf[js.Any])
      
      inline def setWorld(value: Any): Self = StObject.set(x, "world", value.asInstanceOf[js.Any])
    }
  }
}
