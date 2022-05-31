package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxNodeName extends StObject {
  
  var maxNodeName: String
  
  var minNodeName: String
  
  var valueNodeName: String
}
object MaxNodeName {
  
  inline def apply(maxNodeName: String, minNodeName: String, valueNodeName: String): MaxNodeName = {
    val __obj = js.Dynamic.literal(maxNodeName = maxNodeName.asInstanceOf[js.Any], minNodeName = minNodeName.asInstanceOf[js.Any], valueNodeName = valueNodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxNodeName]
  }
  
  extension [Self <: MaxNodeName](x: Self) {
    
    inline def setMaxNodeName(value: String): Self = StObject.set(x, "maxNodeName", value.asInstanceOf[js.Any])
    
    inline def setMinNodeName(value: String): Self = StObject.set(x, "minNodeName", value.asInstanceOf[js.Any])
    
    inline def setValueNodeName(value: String): Self = StObject.set(x, "valueNodeName", value.asInstanceOf[js.Any])
  }
}
