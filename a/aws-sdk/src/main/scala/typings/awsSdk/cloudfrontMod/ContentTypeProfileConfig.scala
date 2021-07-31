package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentTypeProfileConfig extends StObject {
  
  /**
    * The configuration for a field-level encryption content type-profile. 
    */
  var ContentTypeProfiles: js.UndefOr[typings.awsSdk.cloudfrontMod.ContentTypeProfiles] = js.undefined
  
  /**
    * The setting in a field-level encryption content type-profile mapping that specifies what to do when an unknown content type is provided for the profile. If true, content is forwarded without being encrypted when the content type is unknown. If false (the default), an error is returned when the content type is unknown. 
    */
  var ForwardWhenContentTypeIsUnknown: Boolean
}
object ContentTypeProfileConfig {
  
  @scala.inline
  def apply(ForwardWhenContentTypeIsUnknown: Boolean): ContentTypeProfileConfig = {
    val __obj = js.Dynamic.literal(ForwardWhenContentTypeIsUnknown = ForwardWhenContentTypeIsUnknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentTypeProfileConfig]
  }
  
  @scala.inline
  implicit class ContentTypeProfileConfigMutableBuilder[Self <: ContentTypeProfileConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentTypeProfiles(value: ContentTypeProfiles): Self = StObject.set(x, "ContentTypeProfiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeProfilesUndefined: Self = StObject.set(x, "ContentTypeProfiles", js.undefined)
    
    @scala.inline
    def setForwardWhenContentTypeIsUnknown(value: Boolean): Self = StObject.set(x, "ForwardWhenContentTypeIsUnknown", value.asInstanceOf[js.Any])
  }
}
