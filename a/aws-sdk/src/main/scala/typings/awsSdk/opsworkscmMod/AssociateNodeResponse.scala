package typings.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateNodeResponse extends js.Object {
  
  /**
    * Contains a token which can be passed to the DescribeNodeAssociationStatus API call to get the status of the association request. 
    */
  var NodeAssociationStatusToken: js.UndefOr[typings.awsSdk.opsworkscmMod.NodeAssociationStatusToken] = js.native
}
object AssociateNodeResponse {
  
  @scala.inline
  def apply(): AssociateNodeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateNodeResponse]
  }
  
  @scala.inline
  implicit class AssociateNodeResponseOps[Self <: AssociateNodeResponse] (val x: Self) extends AnyVal {
    
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
    def setNodeAssociationStatusToken(value: NodeAssociationStatusToken): Self = this.set("NodeAssociationStatusToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeAssociationStatusToken: Self = this.set("NodeAssociationStatusToken", js.undefined)
  }
}
