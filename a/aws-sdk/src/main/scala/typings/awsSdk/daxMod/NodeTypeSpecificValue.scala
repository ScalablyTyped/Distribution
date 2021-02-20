package typings.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeTypeSpecificValue extends StObject {
  
  /**
    * A node type to which the parameter value applies.
    */
  var NodeType: js.UndefOr[String] = js.native
  
  /**
    * The parameter value for this node type.
    */
  var Value: js.UndefOr[String] = js.native
}
object NodeTypeSpecificValue {
  
  @scala.inline
  def apply(): NodeTypeSpecificValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeTypeSpecificValue]
  }
  
  @scala.inline
  implicit class NodeTypeSpecificValueMutableBuilder[Self <: NodeTypeSpecificValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeType(value: String): Self = StObject.set(x, "NodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeTypeUndefined: Self = StObject.set(x, "NodeType", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
