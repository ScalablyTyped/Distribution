package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNodeOutput extends StObject {
  
  /**
    * The unique identifier of the node.
    */
  var NodeId: js.UndefOr[ResourceIdString] = js.undefined
}
object CreateNodeOutput {
  
  @scala.inline
  def apply(): CreateNodeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNodeOutput]
  }
  
  @scala.inline
  implicit class CreateNodeOutputMutableBuilder[Self <: CreateNodeOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeId(value: ResourceIdString): Self = StObject.set(x, "NodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeIdUndefined: Self = StObject.set(x, "NodeId", js.undefined)
  }
}
