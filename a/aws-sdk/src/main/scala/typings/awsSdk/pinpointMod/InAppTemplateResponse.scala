package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InAppTemplateResponse extends StObject {
  
  /**
    * The resource arn of the template.
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  /**
    * The content of the message, can include up to 5 modals. Each modal must contain a message, a header, and background color. ImageUrl and buttons are optional.
    */
  var Content: js.UndefOr[ListOfInAppMessageContent] = js.undefined
  
  /**
    * The creation date of the template.
    */
  var CreationDate: string
  
  /**
    * Custom config to be sent to client.
    */
  var CustomConfig: js.UndefOr[MapOfString] = js.undefined
  
  /**
    * The last modified date of the template.
    */
  var LastModifiedDate: string
  
  /**
    * The layout of the message.
    */
  var Layout: js.UndefOr[typings.awsSdk.pinpointMod.Layout] = js.undefined
  
  /**
    * The description of the template.
    */
  var TemplateDescription: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the template.
    */
  var TemplateName: string
  
  /**
    * The type of the template.
    */
  var TemplateType: typings.awsSdk.pinpointMod.TemplateType
  
  /**
    * The version id of the template.
    */
  var Version: js.UndefOr[string] = js.undefined
  
  /**
    * A string-to-string map of key-value pairs that defines the tags to associate with the message template. Each tag consists of a required tag key and an associated tag value.
    */
  var tags: js.UndefOr[MapOfString] = js.undefined
}
object InAppTemplateResponse {
  
  inline def apply(CreationDate: string, LastModifiedDate: string, TemplateName: string, TemplateType: TemplateType): InAppTemplateResponse = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], LastModifiedDate = LastModifiedDate.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any], TemplateType = TemplateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InAppTemplateResponse]
  }
  
  extension [Self <: InAppTemplateResponse](x: Self) {
    
    inline def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setContent(value: ListOfInAppMessageContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    inline def setContentVarargs(value: InAppMessageContent*): Self = StObject.set(x, "Content", js.Array(value*))
    
    inline def setCreationDate(value: string): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCustomConfig(value: MapOfString): Self = StObject.set(x, "CustomConfig", value.asInstanceOf[js.Any])
    
    inline def setCustomConfigUndefined: Self = StObject.set(x, "CustomConfig", js.undefined)
    
    inline def setLastModifiedDate(value: string): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLayout(value: Layout): Self = StObject.set(x, "Layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "Layout", js.undefined)
    
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
