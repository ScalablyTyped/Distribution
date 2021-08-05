package typings.baseui.inputMod

import typings.baseui.baseuiStrings.both
import typings.baseui.baseuiStrings.left
import typings.baseui.baseuiStrings.none
import typings.baseui.baseuiStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ADJOINED extends StObject {
  
  var both: typings.baseui.baseuiStrings.both
  
  var left: typings.baseui.baseuiStrings.left
  
  var none: typings.baseui.baseuiStrings.none
  
  var right: typings.baseui.baseuiStrings.right
}
object ADJOINED {
  
  @JSImport("baseui/input", "ADJOINED")
  @js.native
  val ^ : ADJOINED = js.native
  
  extension [Self <: ADJOINED](x: Self) {
    
    inline def setBoth(value: both): Self = StObject.set(x, "both", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: left): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setNone(value: none): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setRight(value: right): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
  }
}
