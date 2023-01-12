package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMobileDeviceAccessOverrideResponse extends StObject {
  
  /**
    * The date the override was first created.
    */
  var DateCreated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date the description was last modified.
    */
  var DateModified: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A description of the override.
    */
  var Description: js.UndefOr[MobileDeviceAccessRuleDescription] = js.undefined
  
  /**
    * The device to which the access override applies.
    */
  var DeviceId: js.UndefOr[typings.awsSdk.clientsWorkmailMod.DeviceId] = js.undefined
  
  /**
    * The effect of the override, ALLOW or DENY.
    */
  var Effect: js.UndefOr[MobileDeviceAccessRuleEffect] = js.undefined
  
  /**
    * The WorkMail user to which the access override applies.
    */
  var UserId: js.UndefOr[WorkMailIdentifier] = js.undefined
}
object GetMobileDeviceAccessOverrideResponse {
  
  inline def apply(): GetMobileDeviceAccessOverrideResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMobileDeviceAccessOverrideResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMobileDeviceAccessOverrideResponse] (val x: Self) extends AnyVal {
    
    inline def setDateCreated(value: js.Date): Self = StObject.set(x, "DateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateCreatedUndefined: Self = StObject.set(x, "DateCreated", js.undefined)
    
    inline def setDateModified(value: js.Date): Self = StObject.set(x, "DateModified", value.asInstanceOf[js.Any])
    
    inline def setDateModifiedUndefined: Self = StObject.set(x, "DateModified", js.undefined)
    
    inline def setDescription(value: MobileDeviceAccessRuleDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDeviceId(value: DeviceId): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "DeviceId", js.undefined)
    
    inline def setEffect(value: MobileDeviceAccessRuleEffect): Self = StObject.set(x, "Effect", value.asInstanceOf[js.Any])
    
    inline def setEffectUndefined: Self = StObject.set(x, "Effect", js.undefined)
    
    inline def setUserId(value: WorkMailIdentifier): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
  }
}
