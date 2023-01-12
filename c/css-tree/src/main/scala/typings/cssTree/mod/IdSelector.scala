package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdSelector
  extends StObject
     with CssNodeCommon
     with CssNode
     with CssNodePlain {
  
  var name: String
  
  @JSName("type")
  var type_IdSelector: typings.cssTree.cssTreeStrings.IdSelector
}
object IdSelector {
  
  inline def apply(name: String): IdSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IdSelector")
    __obj.asInstanceOf[IdSelector]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdSelector] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.cssTree.cssTreeStrings.IdSelector): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
