package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailTemplateRequest extends StObject {
  
  /**
    * A JSON object that specifies the default values to use for message variables in the message template. This object is a set of key-value pairs. Each key defines a message variable in the template. The corresponding value defines the default value for that variable. When you create a message that's based on the template, you can override these defaults with message-specific and address-specific variables and values.
    */
  var DefaultSubstitutions: js.UndefOr[string] = js.undefined
  
  /**
    * The message body, in HTML format, to use in email messages that are based on the message template. We recommend using HTML format for email clients that render HTML content. You can include links, formatted text, and more in an HTML message.
    */
  var HtmlPart: js.UndefOr[string] = js.undefined
  
  /**
    * The unique identifier for the recommender model to use for the message template. Amazon Pinpoint uses this value to determine how to retrieve and process data from a recommender model when it sends messages that use the template, if the template contains message variables for recommendation data.
    */
  var RecommenderId: js.UndefOr[string] = js.undefined
  
  /**
    * The subject line, or title, to use in email messages that are based on the message template.
    */
  var Subject: js.UndefOr[string] = js.undefined
  
  /**
    * A custom description of the message template.
    */
  var TemplateDescription: js.UndefOr[string] = js.undefined
  
  /**
    * The message body, in plain text format, to use in email messages that are based on the message template. We recommend using plain text format for email clients that don't render HTML content and clients that are connected to high-latency networks, such as mobile devices.
    */
  var TextPart: js.UndefOr[string] = js.undefined
  
  /**
    * A string-to-string map of key-value pairs that defines the tags to associate with the message template. Each tag consists of a required tag key and an associated tag value.
    */
  var tags: js.UndefOr[MapOfString] = js.undefined
}
object EmailTemplateRequest {
  
  inline def apply(): EmailTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailTemplateRequest]
  }
  
  extension [Self <: EmailTemplateRequest](x: Self) {
    
    inline def setDefaultSubstitutions(value: string): Self = StObject.set(x, "DefaultSubstitutions", value.asInstanceOf[js.Any])
    
    inline def setDefaultSubstitutionsUndefined: Self = StObject.set(x, "DefaultSubstitutions", js.undefined)
    
    inline def setHtmlPart(value: string): Self = StObject.set(x, "HtmlPart", value.asInstanceOf[js.Any])
    
    inline def setHtmlPartUndefined: Self = StObject.set(x, "HtmlPart", js.undefined)
    
    inline def setRecommenderId(value: string): Self = StObject.set(x, "RecommenderId", value.asInstanceOf[js.Any])
    
    inline def setRecommenderIdUndefined: Self = StObject.set(x, "RecommenderId", js.undefined)
    
    inline def setSubject(value: string): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "Subject", js.undefined)
    
    inline def setTags(value: MapOfString): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTemplateDescription(value: string): Self = StObject.set(x, "TemplateDescription", value.asInstanceOf[js.Any])
    
    inline def setTemplateDescriptionUndefined: Self = StObject.set(x, "TemplateDescription", js.undefined)
    
    inline def setTextPart(value: string): Self = StObject.set(x, "TextPart", value.asInstanceOf[js.Any])
    
    inline def setTextPartUndefined: Self = StObject.set(x, "TextPart", js.undefined)
  }
}
