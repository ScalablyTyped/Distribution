package typings.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEventDataStoreRequest extends StObject {
  
  /**
    * The advanced event selectors used to select events for the event data store. You can configure up to five advanced event selectors for each event data store.
    */
  var AdvancedEventSelectors: js.UndefOr[typings.awsSdk.cloudtrailMod.AdvancedEventSelectors] = js.undefined
  
  /**
    * The ARN (or the ID suffix of the ARN) of the event data store that you want to update.
    */
  var EventDataStore: EventDataStoreArn
  
  /**
    * Specifies whether an event data store collects events from all regions, or only from the region in which it was created.
    */
  var MultiRegionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The event data store name.
    */
  var Name: js.UndefOr[EventDataStoreName] = js.undefined
  
  /**
    * Specifies whether an event data store collects events logged for an organization in Organizations.
    */
  var OrganizationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The retention period, in days.
    */
  var RetentionPeriod: js.UndefOr[typings.awsSdk.cloudtrailMod.RetentionPeriod] = js.undefined
  
  /**
    * Indicates that termination protection is enabled and the event data store cannot be automatically deleted.
    */
  var TerminationProtectionEnabled: js.UndefOr[typings.awsSdk.cloudtrailMod.TerminationProtectionEnabled] = js.undefined
}
object UpdateEventDataStoreRequest {
  
  inline def apply(EventDataStore: EventDataStoreArn): UpdateEventDataStoreRequest = {
    val __obj = js.Dynamic.literal(EventDataStore = EventDataStore.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEventDataStoreRequest]
  }
  
  extension [Self <: UpdateEventDataStoreRequest](x: Self) {
    
    inline def setAdvancedEventSelectors(value: AdvancedEventSelectors): Self = StObject.set(x, "AdvancedEventSelectors", value.asInstanceOf[js.Any])
    
    inline def setAdvancedEventSelectorsUndefined: Self = StObject.set(x, "AdvancedEventSelectors", js.undefined)
    
    inline def setAdvancedEventSelectorsVarargs(value: AdvancedEventSelector*): Self = StObject.set(x, "AdvancedEventSelectors", js.Array(value*))
    
    inline def setEventDataStore(value: EventDataStoreArn): Self = StObject.set(x, "EventDataStore", value.asInstanceOf[js.Any])
    
    inline def setMultiRegionEnabled(value: Boolean): Self = StObject.set(x, "MultiRegionEnabled", value.asInstanceOf[js.Any])
    
    inline def setMultiRegionEnabledUndefined: Self = StObject.set(x, "MultiRegionEnabled", js.undefined)
    
    inline def setName(value: EventDataStoreName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOrganizationEnabled(value: Boolean): Self = StObject.set(x, "OrganizationEnabled", value.asInstanceOf[js.Any])
    
    inline def setOrganizationEnabledUndefined: Self = StObject.set(x, "OrganizationEnabled", js.undefined)
    
    inline def setRetentionPeriod(value: RetentionPeriod): Self = StObject.set(x, "RetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setRetentionPeriodUndefined: Self = StObject.set(x, "RetentionPeriod", js.undefined)
    
    inline def setTerminationProtectionEnabled(value: TerminationProtectionEnabled): Self = StObject.set(x, "TerminationProtectionEnabled", value.asInstanceOf[js.Any])
    
    inline def setTerminationProtectionEnabledUndefined: Self = StObject.set(x, "TerminationProtectionEnabled", js.undefined)
  }
}
