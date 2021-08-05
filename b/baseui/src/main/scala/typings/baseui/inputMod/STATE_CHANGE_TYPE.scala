package typings.baseui.inputMod

import typings.baseui.baseuiStrings.change_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait STATE_CHANGE_TYPE extends StObject {
  
  var change: change_
}
object STATE_CHANGE_TYPE {
  
  @JSImport("baseui/input", "STATE_CHANGE_TYPE")
  @js.native
  val ^ : STATE_CHANGE_TYPE = js.native
  
  extension [Self <: STATE_CHANGE_TYPE](x: Self) {
    
    inline def setChange(value: change_): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
  }
}
