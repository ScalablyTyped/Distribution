package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PurchaseReservedDBInstancesOfferingMessage extends js.Object {
  
  /**
    * The number of instances to reserve. Default: 1 
    */
  var DBInstanceCount: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * Customer-specified identifier to track this reservation. Example: myreservationID
    */
  var ReservedDBInstanceId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the Reserved DB instance offering to purchase. Example: 438012d3-4052-4cc7-b2e3-8d3372e0e706
    */
  var ReservedDBInstancesOfferingId: String = js.native
  
  var Tags: js.UndefOr[TagList] = js.native
}
object PurchaseReservedDBInstancesOfferingMessage {
  
  @scala.inline
  def apply(ReservedDBInstancesOfferingId: String): PurchaseReservedDBInstancesOfferingMessage = {
    val __obj = js.Dynamic.literal(ReservedDBInstancesOfferingId = ReservedDBInstancesOfferingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseReservedDBInstancesOfferingMessage]
  }
  
  @scala.inline
  implicit class PurchaseReservedDBInstancesOfferingMessageOps[Self <: PurchaseReservedDBInstancesOfferingMessage] (val x: Self) extends AnyVal {
    
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
    def setReservedDBInstancesOfferingId(value: String): Self = this.set("ReservedDBInstancesOfferingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBInstanceCount(value: IntegerOptional): Self = this.set("DBInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBInstanceCount: Self = this.set("DBInstanceCount", js.undefined)
    
    @scala.inline
    def setReservedDBInstanceId(value: String): Self = this.set("ReservedDBInstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedDBInstanceId: Self = this.set("ReservedDBInstanceId", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
