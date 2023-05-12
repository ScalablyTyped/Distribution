package typings.cucumberCucumber

import typings.cucumberCucumber.anon.PickTestStepResultmessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRuntimeFormatErrorMod {
  
  @JSImport("@cucumber/cucumber/lib/runtime/format_error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatError(error: js.Error, filterStackTraces: Boolean): PickTestStepResultmessage = (^.asInstanceOf[js.Dynamic].applyDynamic("formatError")(error.asInstanceOf[js.Any], filterStackTraces.asInstanceOf[js.Any])).asInstanceOf[PickTestStepResultmessage]
}
