package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutMobileDeviceAccessOverrideRequest extends StObject {
  
  /**
    * A description of the override.
    */
  var Description: js.UndefOr[MobileDeviceAccessRuleDescription] = js.undefined
  
  /**
    * The mobile device for which you create the override. DeviceId is case insensitive.
    */
  var DeviceId: typings.awsSdk.clientsWorkmailMod.DeviceId
  
  /**
    * The effect of the override, ALLOW or DENY.
    */
  var Effect: MobileDeviceAccessRuleEffect
  
  /**
    * Identifies the WorkMail organization for which you create the override.
    */
  var OrganizationId: typings.awsSdk.clientsWorkmailMod.OrganizationId
  
  /**
    * The WorkMail user for which you create the override. Accepts the following types of user identities:   User ID: 12345678-1234-1234-1234-123456789012 or S-1-1-12-1234567890-123456789-123456789-1234    Email address: user@domain.tld    User name: user   
    */
  var UserId: EntityIdentifier
}
object PutMobileDeviceAccessOverrideRequest {
  
  inline def apply(
    DeviceId: DeviceId,
    Effect: MobileDeviceAccessRuleEffect,
    OrganizationId: OrganizationId,
    UserId: EntityIdentifier
  ): PutMobileDeviceAccessOverrideRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any], Effect = Effect.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutMobileDeviceAccessOverrideRequest]
  }
  
  extension [Self <: PutMobileDeviceAccessOverrideRequest](x: Self) {
    
    inline def setDescription(value: MobileDeviceAccessRuleDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDeviceId(value: DeviceId): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setEffect(value: MobileDeviceAccessRuleEffect): Self = StObject.set(x, "Effect", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: EntityIdentifier): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
