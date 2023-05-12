package typings.cucumberCucumber

import typings.cucumberCucumber.libModelsStepDefinitionMod.default
import typings.cucumberCucumber.libRuntimeMod.IRuntimeOptions
import typings.cucumberMessages.distCjsSrcMessagesMod.TestStepResultStatus
import typings.cucumberMessages.mod.Pickle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRuntimeHelpersMod {
  
  @JSImport("@cucumber/cucumber/lib/runtime/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAmbiguousStepException(stepDefinitions: js.Array[default]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAmbiguousStepException")(stepDefinitions.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def retriesForPickle(pickle: Pickle, options: IRuntimeOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("retriesForPickle")(pickle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def shouldCauseFailure(status: TestStepResultStatus, options: IRuntimeOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldCauseFailure")(status.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
