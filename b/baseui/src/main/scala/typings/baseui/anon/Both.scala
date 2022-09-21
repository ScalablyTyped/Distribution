package typings.baseui.anon

import typings.baseui.baseuiStrings.both
import typings.baseui.baseuiStrings.left
import typings.baseui.baseuiStrings.none
import typings.baseui.baseuiStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Both extends StObject {
  
  val both: typings.baseui.baseuiStrings.both
  
  val left: typings.baseui.baseuiStrings.left
  
  val none: typings.baseui.baseuiStrings.none
  
  val right: typings.baseui.baseuiStrings.right
}
object Both {
  
  inline def apply(): Both = {
    val __obj = js.Dynamic.literal(both = "both", left = "left", none = "none", right = "right")
    __obj.asInstanceOf[Both]
  }
  
  extension [Self <: Both](x: Self) {
    
    inline def setBoth(value: both): Self = StObject.set(x, "both", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: left): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setNone(value: none): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setRight(value: right): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
  }
}
