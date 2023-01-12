package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnPlusB
  extends StObject
     with CssNodeCommon
     with CssNode
     with CssNodePlain {
  
  var a: String | Null
  
  var b: String | Null
  
  @JSName("type")
  var type_AnPlusB: typings.cssTree.cssTreeStrings.AnPlusB
}
object AnPlusB {
  
  inline def apply(): AnPlusB = {
    val __obj = js.Dynamic.literal(a = null, b = null)
    __obj.updateDynamic("type")("AnPlusB")
    __obj.asInstanceOf[AnPlusB]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnPlusB] (val x: Self) extends AnyVal {
    
    inline def setA(value: String): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setANull: Self = StObject.set(x, "a", null)
    
    inline def setB(value: String): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setBNull: Self = StObject.set(x, "b", null)
    
    inline def setType(value: typings.cssTree.cssTreeStrings.AnPlusB): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
