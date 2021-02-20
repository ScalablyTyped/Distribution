package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentTypeProfile extends StObject {
  
  /**
    * The content type for a field-level encryption content type-profile mapping. 
    */
  var ContentType: String = js.native
  
  /**
    * The format for a field-level encryption content type-profile mapping. 
    */
  var Format: typings.awsSdk.cloudfrontMod.Format = js.native
  
  /**
    * The profile ID for a field-level encryption content type-profile mapping. 
    */
  var ProfileId: js.UndefOr[String] = js.native
}
object ContentTypeProfile {
  
  @scala.inline
  def apply(ContentType: String, Format: Format): ContentTypeProfile = {
    val __obj = js.Dynamic.literal(ContentType = ContentType.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentTypeProfile]
  }
  
  @scala.inline
  implicit class ContentTypeProfileMutableBuilder[Self <: ContentTypeProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: Format): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileId(value: String): Self = StObject.set(x, "ProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileIdUndefined: Self = StObject.set(x, "ProfileId", js.undefined)
  }
}
