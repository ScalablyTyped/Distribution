package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushNotificationTemplateRequest extends StObject {
  
  /**
    * The message template to use for the ADM (Amazon Device Messaging) channel. This message template overrides the default template for push notification channels (DefaultPushNotificationTemplate).
    */
  var ADM: js.UndefOr[AndroidPushNotificationTemplate] = js.native
  
  /**
    * The message template to use for the APNs (Apple Push Notification service) channel. This message template overrides the default template for push notification channels (DefaultPushNotificationTemplate).
    */
  var APNS: js.UndefOr[APNSPushNotificationTemplate] = js.native
  
  /**
    * The message template to use for the Baidu (Baidu Cloud Push) channel. This message template overrides the default template for push notification channels (DefaultPushNotificationTemplate).
    */
  var Baidu: js.UndefOr[AndroidPushNotificationTemplate] = js.native
  
  /**
    * The default message template to use for push notification channels.
    */
  var Default: js.UndefOr[DefaultPushNotificationTemplate] = js.native
  
  /**
    * A JSON object that specifies the default values to use for message variables in the message template. This object is a set of key-value pairs. Each key defines a message variable in the template. The corresponding value defines the default value for that variable. When you create a message that's based on the template, you can override these defaults with message-specific and address-specific variables and values.
    */
  var DefaultSubstitutions: js.UndefOr[string] = js.native
  
  /**
    * The message template to use for the GCM channel, which is used to send notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service. This message template overrides the default template for push notification channels (DefaultPushNotificationTemplate).
    */
  var GCM: js.UndefOr[AndroidPushNotificationTemplate] = js.native
  
  /**
    * The unique identifier for the recommender model to use for the message template. Amazon Pinpoint uses this value to determine how to retrieve and process data from a recommender model when it sends messages that use the template, if the template contains message variables for recommendation data.
    */
  var RecommenderId: js.UndefOr[string] = js.native
  
  /**
    * A custom description of the message template.
    */
  var TemplateDescription: js.UndefOr[string] = js.native
  
  /**
    * A string-to-string map of key-value pairs that defines the tags to associate with the message template. Each tag consists of a required tag key and an associated tag value.
    */
  var tags: js.UndefOr[MapOfString] = js.native
}
object PushNotificationTemplateRequest {
  
  @scala.inline
  def apply(): PushNotificationTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushNotificationTemplateRequest]
  }
  
  @scala.inline
  implicit class PushNotificationTemplateRequestMutableBuilder[Self <: PushNotificationTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setADM(value: AndroidPushNotificationTemplate): Self = StObject.set(x, "ADM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setADMUndefined: Self = StObject.set(x, "ADM", js.undefined)
    
    @scala.inline
    def setAPNS(value: APNSPushNotificationTemplate): Self = StObject.set(x, "APNS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAPNSUndefined: Self = StObject.set(x, "APNS", js.undefined)
    
    @scala.inline
    def setBaidu(value: AndroidPushNotificationTemplate): Self = StObject.set(x, "Baidu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaiduUndefined: Self = StObject.set(x, "Baidu", js.undefined)
    
    @scala.inline
    def setDefault(value: DefaultPushNotificationTemplate): Self = StObject.set(x, "Default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSubstitutions(value: string): Self = StObject.set(x, "DefaultSubstitutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSubstitutionsUndefined: Self = StObject.set(x, "DefaultSubstitutions", js.undefined)
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "Default", js.undefined)
    
    @scala.inline
    def setGCM(value: AndroidPushNotificationTemplate): Self = StObject.set(x, "GCM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGCMUndefined: Self = StObject.set(x, "GCM", js.undefined)
    
    @scala.inline
    def setRecommenderId(value: string): Self = StObject.set(x, "RecommenderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommenderIdUndefined: Self = StObject.set(x, "RecommenderId", js.undefined)
    
    @scala.inline
    def setTags(value: MapOfString): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTemplateDescription(value: string): Self = StObject.set(x, "TemplateDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateDescriptionUndefined: Self = StObject.set(x, "TemplateDescription", js.undefined)
  }
}
