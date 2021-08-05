package typings.baseui.inputMod

import typings.baseui.baseuiStrings.textarea
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CUSTOM_INPUT_TYPE extends StObject {
  
  var textarea: typings.baseui.baseuiStrings.textarea
}
object CUSTOM_INPUT_TYPE {
  
  @JSImport("baseui/input", "CUSTOM_INPUT_TYPE")
  @js.native
  val ^ : CUSTOM_INPUT_TYPE = js.native
  
  extension [Self <: CUSTOM_INPUT_TYPE](x: Self) {
    
    inline def setTextarea(value: textarea): Self = StObject.set(x, "textarea", value.asInstanceOf[js.Any])
  }
}
