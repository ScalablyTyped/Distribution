package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ratio
  extends StObject
     with CssNodeCommon
     with CssNode
     with CssNodePlain {
  
  var left: String
  
  var right: String
  
  @JSName("type")
  var type_Ratio: typings.cssTree.cssTreeStrings.Ratio
}
object Ratio {
  
  inline def apply(left: String, right: String): Ratio = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Ratio")
    __obj.asInstanceOf[Ratio]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ratio] (val x: Self) extends AnyVal {
    
    inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.cssTree.cssTreeStrings.Ratio): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
