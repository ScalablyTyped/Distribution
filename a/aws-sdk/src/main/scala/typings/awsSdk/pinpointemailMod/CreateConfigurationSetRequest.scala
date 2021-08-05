package typings.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConfigurationSetRequest extends StObject {
  
  /**
    * The name of the configuration set.
    */
  var ConfigurationSetName: typings.awsSdk.pinpointemailMod.ConfigurationSetName
  
  /**
    * An object that defines the dedicated IP pool that is used to send emails that you send using the configuration set.
    */
  var DeliveryOptions: js.UndefOr[typings.awsSdk.pinpointemailMod.DeliveryOptions] = js.undefined
  
  /**
    * An object that defines whether or not Amazon Pinpoint collects reputation metrics for the emails that you send that use the configuration set.
    */
  var ReputationOptions: js.UndefOr[typings.awsSdk.pinpointemailMod.ReputationOptions] = js.undefined
  
  /**
    * An object that defines whether or not Amazon Pinpoint can send email that you send using the configuration set.
    */
  var SendingOptions: js.UndefOr[typings.awsSdk.pinpointemailMod.SendingOptions] = js.undefined
  
  /**
    * An array of objects that define the tags (keys and values) that you want to associate with the configuration set.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * An object that defines the open and click tracking options for emails that you send using the configuration set.
    */
  var TrackingOptions: js.UndefOr[typings.awsSdk.pinpointemailMod.TrackingOptions] = js.undefined
}
object CreateConfigurationSetRequest {
  
  inline def apply(ConfigurationSetName: ConfigurationSetName): CreateConfigurationSetRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfigurationSetRequest]
  }
  
  extension [Self <: CreateConfigurationSetRequest](x: Self) {
    
    inline def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setDeliveryOptions(value: DeliveryOptions): Self = StObject.set(x, "DeliveryOptions", value.asInstanceOf[js.Any])
    
    inline def setDeliveryOptionsUndefined: Self = StObject.set(x, "DeliveryOptions", js.undefined)
    
    inline def setReputationOptions(value: ReputationOptions): Self = StObject.set(x, "ReputationOptions", value.asInstanceOf[js.Any])
    
    inline def setReputationOptionsUndefined: Self = StObject.set(x, "ReputationOptions", js.undefined)
    
    inline def setSendingOptions(value: SendingOptions): Self = StObject.set(x, "SendingOptions", value.asInstanceOf[js.Any])
    
    inline def setSendingOptionsUndefined: Self = StObject.set(x, "SendingOptions", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    inline def setTrackingOptions(value: TrackingOptions): Self = StObject.set(x, "TrackingOptions", value.asInstanceOf[js.Any])
    
    inline def setTrackingOptionsUndefined: Self = StObject.set(x, "TrackingOptions", js.undefined)
  }
}
