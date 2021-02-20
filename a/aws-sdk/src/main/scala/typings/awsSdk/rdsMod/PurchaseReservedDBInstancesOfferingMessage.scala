package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PurchaseReservedDBInstancesOfferingMessage extends StObject {
  
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
  implicit class PurchaseReservedDBInstancesOfferingMessageMutableBuilder[Self <: PurchaseReservedDBInstancesOfferingMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBInstanceCount(value: IntegerOptional): Self = StObject.set(x, "DBInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBInstanceCountUndefined: Self = StObject.set(x, "DBInstanceCount", js.undefined)
    
    @scala.inline
    def setReservedDBInstanceId(value: String): Self = StObject.set(x, "ReservedDBInstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedDBInstanceIdUndefined: Self = StObject.set(x, "ReservedDBInstanceId", js.undefined)
    
    @scala.inline
    def setReservedDBInstancesOfferingId(value: String): Self = StObject.set(x, "ReservedDBInstancesOfferingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
