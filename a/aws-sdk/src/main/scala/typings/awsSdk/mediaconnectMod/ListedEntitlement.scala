package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListedEntitlement extends StObject {
  
  /**
    * Percentage from 0-100 of the data transfer cost to be billed to the subscriber.
    */
  var DataTransferSubscriberFeePercent: js.UndefOr[integer] = js.native
  
  /**
    * The ARN of the entitlement.
    */
  var EntitlementArn: string = js.native
  
  /**
    * The name of the entitlement.
    */
  var EntitlementName: string = js.native
}
object ListedEntitlement {
  
  @scala.inline
  def apply(EntitlementArn: string, EntitlementName: string): ListedEntitlement = {
    val __obj = js.Dynamic.literal(EntitlementArn = EntitlementArn.asInstanceOf[js.Any], EntitlementName = EntitlementName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListedEntitlement]
  }
  
  @scala.inline
  implicit class ListedEntitlementMutableBuilder[Self <: ListedEntitlement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataTransferSubscriberFeePercent(value: integer): Self = StObject.set(x, "DataTransferSubscriberFeePercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTransferSubscriberFeePercentUndefined: Self = StObject.set(x, "DataTransferSubscriberFeePercent", js.undefined)
    
    @scala.inline
    def setEntitlementArn(value: string): Self = StObject.set(x, "EntitlementArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitlementName(value: string): Self = StObject.set(x, "EntitlementName", value.asInstanceOf[js.Any])
  }
}
