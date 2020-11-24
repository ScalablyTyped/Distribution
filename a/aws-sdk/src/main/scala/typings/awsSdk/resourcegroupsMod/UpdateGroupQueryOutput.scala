package typings.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateGroupQueryOutput extends js.Object {
  
  /**
    * The updated resource query associated with the resource group after the update.
    */
  var GroupQuery: js.UndefOr[typings.awsSdk.resourcegroupsMod.GroupQuery] = js.native
}
object UpdateGroupQueryOutput {
  
  @scala.inline
  def apply(): UpdateGroupQueryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGroupQueryOutput]
  }
  
  @scala.inline
  implicit class UpdateGroupQueryOutputOps[Self <: UpdateGroupQueryOutput] (val x: Self) extends AnyVal {
    
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
    def setGroupQuery(value: GroupQuery): Self = this.set("GroupQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupQuery: Self = this.set("GroupQuery", js.undefined)
  }
}
