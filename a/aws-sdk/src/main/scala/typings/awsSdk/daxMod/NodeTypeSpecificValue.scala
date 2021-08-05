package typings.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeTypeSpecificValue extends StObject {
  
  /**
    * A node type to which the parameter value applies.
    */
  var NodeType: js.UndefOr[String] = js.undefined
  
  /**
    * The parameter value for this node type.
    */
  var Value: js.UndefOr[String] = js.undefined
}
object NodeTypeSpecificValue {
  
  inline def apply(): NodeTypeSpecificValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeTypeSpecificValue]
  }
  
  extension [Self <: NodeTypeSpecificValue](x: Self) {
    
    inline def setNodeType(value: String): Self = StObject.set(x, "NodeType", value.asInstanceOf[js.Any])
    
    inline def setNodeTypeUndefined: Self = StObject.set(x, "NodeType", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
