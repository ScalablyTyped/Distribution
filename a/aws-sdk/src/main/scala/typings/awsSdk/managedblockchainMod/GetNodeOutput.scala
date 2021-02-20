package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetNodeOutput extends StObject {
  
  /**
    * Properties of the node configuration.
    */
  var Node: js.UndefOr[typings.awsSdk.managedblockchainMod.Node] = js.native
}
object GetNodeOutput {
  
  @scala.inline
  def apply(): GetNodeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNodeOutput]
  }
  
  @scala.inline
  implicit class GetNodeOutputMutableBuilder[Self <: GetNodeOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNode(value: Node): Self = StObject.set(x, "Node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeUndefined: Self = StObject.set(x, "Node", js.undefined)
  }
}
