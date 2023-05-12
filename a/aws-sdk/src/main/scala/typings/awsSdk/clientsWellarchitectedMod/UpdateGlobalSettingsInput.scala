package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGlobalSettingsInput extends StObject {
  
  /**
    * The status of discovery support settings.
    */
  var DiscoveryIntegrationStatus: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.DiscoveryIntegrationStatus] = js.undefined
  
  /**
    * The status of organization sharing settings.
    */
  var OrganizationSharingStatus: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.OrganizationSharingStatus] = js.undefined
}
object UpdateGlobalSettingsInput {
  
  inline def apply(): UpdateGlobalSettingsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGlobalSettingsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateGlobalSettingsInput] (val x: Self) extends AnyVal {
    
    inline def setDiscoveryIntegrationStatus(value: DiscoveryIntegrationStatus): Self = StObject.set(x, "DiscoveryIntegrationStatus", value.asInstanceOf[js.Any])
    
    inline def setDiscoveryIntegrationStatusUndefined: Self = StObject.set(x, "DiscoveryIntegrationStatus", js.undefined)
    
    inline def setOrganizationSharingStatus(value: OrganizationSharingStatus): Self = StObject.set(x, "OrganizationSharingStatus", value.asInstanceOf[js.Any])
    
    inline def setOrganizationSharingStatusUndefined: Self = StObject.set(x, "OrganizationSharingStatus", js.undefined)
  }
}
