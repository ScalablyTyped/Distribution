package typings.cssWhat.libEsTypesMod

import typings.cssWhat.libEsTypesMod.SelectorType.Pseudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PseudoSelector
  extends StObject
     with Selector {
  
  var data: DataType
  
  var name: String
  
  var `type`: Pseudo
}
object PseudoSelector {
  
  inline def apply(name: String, `type`: Pseudo): PseudoSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], data = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PseudoSelector]
  }
  
  extension [Self <: PseudoSelector](x: Self) {
    
    inline def setData(value: DataType): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDataVarargs(value: js.Array[Selector]*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: Pseudo): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
