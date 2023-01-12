package typings.cssWhat.libEsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PseudoElement
  extends StObject
     with Selector {
  
  var data: String | Null
  
  var name: String
  
  var `type`: typings.cssWhat.libEsTypesMod.SelectorType.PseudoElement
}
object PseudoElement {
  
  inline def apply(name: String, `type`: typings.cssWhat.libEsTypesMod.SelectorType.PseudoElement): PseudoElement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], data = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PseudoElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PseudoElement] (val x: Self) extends AnyVal {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.cssWhat.libEsTypesMod.SelectorType.PseudoElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
