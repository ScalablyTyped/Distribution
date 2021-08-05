package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushNotificationTemplateResponse extends StObject {
  
  /**
    * The message template that's used for the ADM (Amazon Device Messaging) channel. This message template overrides the default template for push notification channels (DefaultPushNotificationTemplate).
    */
  var ADM: js.UndefOr[AndroidPushNotificationTemplate] = js.undefined
  
  /**
    * The message template that's used for the APNs (Apple Push Notification service) channel. This message template overrides the default template for push notification channels (DefaultPushNotificationTemplate).
    */
  var APNS: js.UndefOr[APNSPushNotificationTemplate] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the message template.
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  /**
    * The message template that's used for the Baidu (Baidu Cloud Push) channel. This message template overrides the default template for push notification channels (DefaultPushNotificationTemplate).
    */
  var Baidu: js.UndefOr[AndroidPushNotificationTemplate] = js.undefined
  
  /**
    * The date, in ISO 8601 format, when the message template was created.
    */
  var CreationDate: string
  
  /**
    * The default message template that's used for push notification channels.
    */
  var Default: js.UndefOr[DefaultPushNotificationTemplate] = js.undefined
  
  /**
    * The JSON object that specifies the default values that are used for message variables in the message template. This object is a set of key-value pairs. Each key defines a message variable in the template. The corresponding value defines the default value for that variable.
    */
  var DefaultSubstitutions: js.UndefOr[string] = js.undefined
  
  /**
    * The message template that's used for the GCM channel, which is used to send notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service. This message template overrides the default template for push notification channels (DefaultPushNotificationTemplate).
    */
  var GCM: js.UndefOr[AndroidPushNotificationTemplate] = js.undefined
  
  /**
    * The date, in ISO 8601 format, when the message template was last modified.
    */
  var LastModifiedDate: string
  
  /**
    * The unique identifier for the recommender model that's used by the message template.
    */
  var RecommenderId: js.UndefOr[string] = js.undefined
  
  /**
    * The custom description of the message template.
    */
  var TemplateDescription: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the message template.
    */
  var TemplateName: string
  
  /**
    * The type of channel that the message template is designed for. For a push notification template, this value is PUSH.
    */
  var TemplateType: typings.awsSdk.pinpointMod.TemplateType
  
  /**
    * The unique identifier, as an integer, for the active version of the message template, or the version of the template that you specified by using the version parameter in your request.
    */
  var Version: js.UndefOr[string] = js.undefined
  
  /**
    * A string-to-string map of key-value pairs that identifies the tags that are associated with the message template. Each tag consists of a required tag key and an associated tag value.
    */
  var tags: js.UndefOr[MapOfString] = js.undefined
}
object PushNotificationTemplateResponse {
  
  inline def apply(CreationDate: string, LastModifiedDate: string, TemplateName: string, TemplateType: TemplateType): PushNotificationTemplateResponse = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], LastModifiedDate = LastModifiedDate.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any], TemplateType = TemplateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushNotificationTemplateResponse]
  }
  
  extension [Self <: PushNotificationTemplateResponse](x: Self) {
    
    inline def setADM(value: AndroidPushNotificationTemplate): Self = StObject.set(x, "ADM", value.asInstanceOf[js.Any])
    
    inline def setADMUndefined: Self = StObject.set(x, "ADM", js.undefined)
    
    inline def setAPNS(value: APNSPushNotificationTemplate): Self = StObject.set(x, "APNS", value.asInstanceOf[js.Any])
    
    inline def setAPNSUndefined: Self = StObject.set(x, "APNS", js.undefined)
    
    inline def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setBaidu(value: AndroidPushNotificationTemplate): Self = StObject.set(x, "Baidu", value.asInstanceOf[js.Any])
    
    inline def setBaiduUndefined: Self = StObject.set(x, "Baidu", js.undefined)
    
    inline def setCreationDate(value: string): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: DefaultPushNotificationTemplate): Self = StObject.set(x, "Default", value.asInstanceOf[js.Any])
    
    inline def setDefaultSubstitutions(value: string): Self = StObject.set(x, "DefaultSubstitutions", value.asInstanceOf[js.Any])
    
    inline def setDefaultSubstitutionsUndefined: Self = StObject.set(x, "DefaultSubstitutions", js.undefined)
    
    inline def setDefaultUndefined: Self = StObject.set(x, "Default", js.undefined)
    
    inline def setGCM(value: AndroidPushNotificationTemplate): Self = StObject.set(x, "GCM", value.asInstanceOf[js.Any])
    
    inline def setGCMUndefined: Self = StObject.set(x, "GCM", js.undefined)
    
    inline def setLastModifiedDate(value: string): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setRecommenderId(value: string): Self = StObject.set(x, "RecommenderId", value.asInstanceOf[js.Any])
    
    inline def setRecommenderIdUndefined: Self = StObject.set(x, "RecommenderId", js.undefined)
    
    inline def setTags(value: MapOfString): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTemplateDescription(value: string): Self = StObject.set(x, "TemplateDescription", value.asInstanceOf[js.Any])
    
    inline def setTemplateDescriptionUndefined: Self = StObject.set(x, "TemplateDescription", js.undefined)
    
    inline def setTemplateName(value: string): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
    
    inline def setTemplateType(value: TemplateType): Self = StObject.set(x, "TemplateType", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: string): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
