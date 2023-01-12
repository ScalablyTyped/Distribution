package typings.awsSdk.clientsWorkdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteNotificationSubscriptionRequest extends StObject {
  
  /**
    * The ID of the organization.
    */
  var OrganizationId: IdType
  
  /**
    * The ID of the subscription.
    */
  var SubscriptionId: IdType
}
object DeleteNotificationSubscriptionRequest {
  
  inline def apply(OrganizationId: IdType, SubscriptionId: IdType): DeleteNotificationSubscriptionRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any], SubscriptionId = SubscriptionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNotificationSubscriptionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteNotificationSubscriptionRequest] (val x: Self) extends AnyVal {
    
    inline def setOrganizationId(value: IdType): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionId(value: IdType): Self = StObject.set(x, "SubscriptionId", value.asInstanceOf[js.Any])
  }
}
