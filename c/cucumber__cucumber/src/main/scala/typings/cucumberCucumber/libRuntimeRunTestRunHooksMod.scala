package typings.cucumberCucumber

import typings.cucumberCucumber.libModelsTestRunHookDefinitionMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRuntimeRunTestRunHooksMod {
  
  @JSImport("@cucumber/cucumber/lib/runtime/run_test_run_hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeRunTestRunHooks(
    dryRun: Boolean,
    defaultTimeout: Double,
    errorMessage: js.Function2[/* name */ String, /* location */ String, String]
  ): RunsTestRunHooks = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRunTestRunHooks")(dryRun.asInstanceOf[js.Any], defaultTimeout.asInstanceOf[js.Any], errorMessage.asInstanceOf[js.Any])).asInstanceOf[RunsTestRunHooks]
  
  type RunsTestRunHooks = js.Function2[/* definitions */ js.Array[default], /* name */ String, js.Promise[Unit]]
}
