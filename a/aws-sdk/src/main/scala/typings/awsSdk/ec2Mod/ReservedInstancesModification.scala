package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReservedInstancesModification extends js.Object {
  
  /**
    * A unique, case-sensitive key supplied by the client to ensure that the request is idempotent. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  
  /**
    * The time when the modification request was created.
    */
  var CreateDate: js.UndefOr[DateTime] = js.native
  
  /**
    * The time for the modification to become effective.
    */
  var EffectiveDate: js.UndefOr[DateTime] = js.native
  
  /**
    * Contains target configurations along with their corresponding new Reserved Instance IDs.
    */
  var ModificationResults: js.UndefOr[ReservedInstancesModificationResultList] = js.native
  
  /**
    * The IDs of one or more Reserved Instances.
    */
  var ReservedInstancesIds: js.UndefOr[ReservedIntancesIds] = js.native
  
  /**
    * A unique ID for the Reserved Instance modification.
    */
  var ReservedInstancesModificationId: js.UndefOr[String] = js.native
  
  /**
    * The status of the Reserved Instances modification request.
    */
  var Status: js.UndefOr[String] = js.native
  
  /**
    * The reason for the status.
    */
  var StatusMessage: js.UndefOr[String] = js.native
  
  /**
    * The time when the modification request was last updated.
    */
  var UpdateDate: js.UndefOr[DateTime] = js.native
}
object ReservedInstancesModification {
  
  @scala.inline
  def apply(): ReservedInstancesModification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedInstancesModification]
  }
  
  @scala.inline
  implicit class ReservedInstancesModificationOps[Self <: ReservedInstancesModification] (val x: Self) extends AnyVal {
    
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
    def setClientToken(value: String): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    
    @scala.inline
    def setCreateDate(value: DateTime): Self = this.set("CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateDate: Self = this.set("CreateDate", js.undefined)
    
    @scala.inline
    def setEffectiveDate(value: DateTime): Self = this.set("EffectiveDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectiveDate: Self = this.set("EffectiveDate", js.undefined)
    
    @scala.inline
    def setModificationResultsVarargs(value: ReservedInstancesModificationResult*): Self = this.set("ModificationResults", js.Array(value :_*))
    
    @scala.inline
    def setModificationResults(value: ReservedInstancesModificationResultList): Self = this.set("ModificationResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModificationResults: Self = this.set("ModificationResults", js.undefined)
    
    @scala.inline
    def setReservedInstancesIdsVarargs(value: ReservedInstancesId*): Self = this.set("ReservedInstancesIds", js.Array(value :_*))
    
    @scala.inline
    def setReservedInstancesIds(value: ReservedIntancesIds): Self = this.set("ReservedInstancesIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedInstancesIds: Self = this.set("ReservedInstancesIds", js.undefined)
    
    @scala.inline
    def setReservedInstancesModificationId(value: String): Self = this.set("ReservedInstancesModificationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedInstancesModificationId: Self = this.set("ReservedInstancesModificationId", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusMessage: Self = this.set("StatusMessage", js.undefined)
    
    @scala.inline
    def setUpdateDate(value: DateTime): Self = this.set("UpdateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateDate: Self = this.set("UpdateDate", js.undefined)
  }
}
