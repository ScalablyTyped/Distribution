package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetNodeOutput extends js.Object {
  
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
  implicit class GetNodeOutputOps[Self <: GetNodeOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNode(value: Node): Self = this.set("Node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNode: Self = this.set("Node", js.undefined)
  }
}
