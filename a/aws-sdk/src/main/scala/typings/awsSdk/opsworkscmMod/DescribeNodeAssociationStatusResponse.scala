package typings.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeNodeAssociationStatusResponse extends js.Object {
  /**
    * Attributes specific to the node association. In Puppet, the attibute PUPPET_NODE_CERT contains the signed certificate (the result of the CSR). 
    */
  var EngineAttributes: js.UndefOr[typings.awsSdk.opsworkscmMod.EngineAttributes] = js.native
  /**
    * The status of the association or disassociation request.   Possible values:     SUCCESS: The association or disassociation succeeded.     FAILED: The association or disassociation failed.     IN_PROGRESS: The association or disassociation is still in progress.   
    */
  var NodeAssociationStatus: js.UndefOr[typings.awsSdk.opsworkscmMod.NodeAssociationStatus] = js.native
}

object DescribeNodeAssociationStatusResponse {
  @scala.inline
  def apply(): DescribeNodeAssociationStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNodeAssociationStatusResponse]
  }
  @scala.inline
  implicit class DescribeNodeAssociationStatusResponseOps[Self <: DescribeNodeAssociationStatusResponse] (val x: Self) extends AnyVal {
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
    def setEngineAttributesVarargs(value: EngineAttribute*): Self = this.set("EngineAttributes", js.Array(value :_*))
    @scala.inline
    def setEngineAttributes(value: EngineAttributes): Self = this.set("EngineAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineAttributes: Self = this.set("EngineAttributes", js.undefined)
    @scala.inline
    def setNodeAssociationStatus(value: NodeAssociationStatus): Self = this.set("NodeAssociationStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeAssociationStatus: Self = this.set("NodeAssociationStatus", js.undefined)
  }
  
}

