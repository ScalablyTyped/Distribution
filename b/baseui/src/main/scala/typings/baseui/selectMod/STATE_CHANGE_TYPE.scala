package typings.baseui.selectMod

import typings.baseui.baseuiStrings.clear
import typings.baseui.baseuiStrings.remove
import typings.baseui.baseuiStrings.select
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait STATE_CHANGE_TYPE extends StObject {
  
  var clear: typings.baseui.baseuiStrings.clear
  
  var remove: typings.baseui.baseuiStrings.remove
  
  var select: typings.baseui.baseuiStrings.select
}
object STATE_CHANGE_TYPE {
  
  @JSImport("baseui/select", "STATE_CHANGE_TYPE")
  @js.native
  val ^ : STATE_CHANGE_TYPE = js.native
  
  extension [Self <: STATE_CHANGE_TYPE](x: Self) {
    
    inline def setClear(value: clear): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: remove): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: select): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
  }
}
