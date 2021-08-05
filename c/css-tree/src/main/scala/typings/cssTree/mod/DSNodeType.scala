package typings.cssTree.mod

import typings.cssTree.cssTreeStrings.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DSNodeType
  extends StObject
     with DSNode
     with DSNodeMultiplied {
  
  var name: String
  
  var opts: DSNodeTypeOpts | Null
  
  var `type`: Type
}
object DSNodeType {
  
  inline def apply(name: String): DSNodeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], opts = null)
    __obj.updateDynamic("type")("Type")
    __obj.asInstanceOf[DSNodeType]
  }
  
  extension [Self <: DSNodeType](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOpts(value: DSNodeTypeOpts): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
    
    inline def setOptsNull: Self = StObject.set(x, "opts", null)
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
