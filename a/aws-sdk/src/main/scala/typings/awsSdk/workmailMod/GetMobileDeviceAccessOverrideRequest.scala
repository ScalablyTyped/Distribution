package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMobileDeviceAccessOverrideRequest extends StObject {
  
  /**
    * The mobile device to which the override applies. DeviceId is case insensitive.
    */
  var DeviceId: typings.awsSdk.workmailMod.DeviceId
  
  /**
    * The Amazon WorkMail organization to which you want to apply the override.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId
  
  /**
    * Identifies the WorkMail user for the override. Accepts the following types of user identities:    User ID: 12345678-1234-1234-1234-123456789012 or S-1-1-12-1234567890-123456789-123456789-1234    Email address: user@domain.tld    User name: user   
    */
  var UserId: EntityIdentifier
}
object GetMobileDeviceAccessOverrideRequest {
  
  inline def apply(DeviceId: DeviceId, OrganizationId: OrganizationId, UserId: EntityIdentifier): GetMobileDeviceAccessOverrideRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMobileDeviceAccessOverrideRequest]
  }
  
  extension [Self <: GetMobileDeviceAccessOverrideRequest](x: Self) {
    
    inline def setDeviceId(value: DeviceId): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: EntityIdentifier): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
