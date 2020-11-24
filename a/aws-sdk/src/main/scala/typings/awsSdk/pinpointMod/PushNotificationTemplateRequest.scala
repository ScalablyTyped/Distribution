package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushNotificationTemplateRequest extends js.Object {
  
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
  implicit class PushNotificationTemplateRequestOps[Self <: PushNotificationTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setADM(value: AndroidPushNotificationTemplate): Self = this.set("ADM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteADM: Self = this.set("ADM", js.undefined)
    
    @scala.inline
    def setAPNS(value: APNSPushNotificationTemplate): Self = this.set("APNS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAPNS: Self = this.set("APNS", js.undefined)
    
    @scala.inline
    def setBaidu(value: AndroidPushNotificationTemplate): Self = this.set("Baidu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaidu: Self = this.set("Baidu", js.undefined)
    
    @scala.inline
    def setDefault(value: DefaultPushNotificationTemplate): Self = this.set("Default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("Default", js.undefined)
    
    @scala.inline
    def setDefaultSubstitutions(value: string): Self = this.set("DefaultSubstitutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSubstitutions: Self = this.set("DefaultSubstitutions", js.undefined)
    
    @scala.inline
    def setGCM(value: AndroidPushNotificationTemplate): Self = this.set("GCM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGCM: Self = this.set("GCM", js.undefined)
    
    @scala.inline
    def setRecommenderId(value: string): Self = this.set("RecommenderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecommenderId: Self = this.set("RecommenderId", js.undefined)
    
    @scala.inline
    def setTemplateDescription(value: string): Self = this.set("TemplateDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateDescription: Self = this.set("TemplateDescription", js.undefined)
    
    @scala.inline
    def setTags(value: MapOfString): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
