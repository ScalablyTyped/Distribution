package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartAssociationsOnceRequest extends js.Object {
  
  /**
    * The association IDs that you want to run immediately and only one time.
    */
  var AssociationIds: AssociationIdList = js.native
}
object StartAssociationsOnceRequest {
  
  @scala.inline
  def apply(AssociationIds: AssociationIdList): StartAssociationsOnceRequest = {
    val __obj = js.Dynamic.literal(AssociationIds = AssociationIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartAssociationsOnceRequest]
  }
  
  @scala.inline
  implicit class StartAssociationsOnceRequestOps[Self <: StartAssociationsOnceRequest] (val x: Self) extends AnyVal {
    
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
    def setAssociationIdsVarargs(value: AssociationId*): Self = this.set("AssociationIds", js.Array(value :_*))
    
    @scala.inline
    def setAssociationIds(value: AssociationIdList): Self = this.set("AssociationIds", value.asInstanceOf[js.Any])
  }
}
