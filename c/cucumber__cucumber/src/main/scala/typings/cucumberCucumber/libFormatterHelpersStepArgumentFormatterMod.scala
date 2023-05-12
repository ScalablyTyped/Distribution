package typings.cucumberCucumber

import typings.cucumberMessages.mod.PickleStepArgument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterHelpersStepArgumentFormatterMod {
  
  @JSImport("@cucumber/cucumber/lib/formatter/helpers/step_argument_formatter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatStepArgument(arg: PickleStepArgument): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatStepArgument")(arg.asInstanceOf[js.Any]).asInstanceOf[String]
}
