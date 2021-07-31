package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailTemplateMetadata extends StObject {
  
  /**
    * The time and date the template was created.
    */
  var CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The name of the template.
    */
  var TemplateName: js.UndefOr[EmailTemplateName] = js.undefined
}
object EmailTemplateMetadata {
  
  @scala.inline
  def apply(): EmailTemplateMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailTemplateMetadata]
  }
  
  @scala.inline
  implicit class EmailTemplateMetadataMutableBuilder[Self <: EmailTemplateMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedTimestamp(value: Timestamp): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setTemplateName(value: EmailTemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateNameUndefined: Self = StObject.set(x, "TemplateName", js.undefined)
  }
}
