package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProtocolsListDataSummary extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the specified protocols list.
    */
  var ListArn: js.UndefOr[ResourceArn] = js.native
  
  /**
    * The ID of the specified protocols list.
    */
  var ListId: js.UndefOr[typings.awsSdk.fmsMod.ListId] = js.native
  
  /**
    * The name of the specified protocols list.
    */
  var ListName: js.UndefOr[ResourceName] = js.native
  
  /**
    * An array of protocols in the AWS Firewall Manager protocols list.
    */
  var ProtocolsList: js.UndefOr[typings.awsSdk.fmsMod.ProtocolsList] = js.native
}
object ProtocolsListDataSummary {
  
  @scala.inline
  def apply(): ProtocolsListDataSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProtocolsListDataSummary]
  }
  
  @scala.inline
  implicit class ProtocolsListDataSummaryOps[Self <: ProtocolsListDataSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setListArn(value: ResourceArn): Self = this.set("ListArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListArn: Self = this.set("ListArn", js.undefined)
    
    @scala.inline
    def setListId(value: ListId): Self = this.set("ListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListId: Self = this.set("ListId", js.undefined)
    
    @scala.inline
    def setListName(value: ResourceName): Self = this.set("ListName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListName: Self = this.set("ListName", js.undefined)
    
    @scala.inline
    def setProtocolsListVarargs(value: Protocol*): Self = this.set("ProtocolsList", js.Array(value :_*))
    
    @scala.inline
    def setProtocolsList(value: ProtocolsList): Self = this.set("ProtocolsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocolsList: Self = this.set("ProtocolsList", js.undefined)
  }
}
