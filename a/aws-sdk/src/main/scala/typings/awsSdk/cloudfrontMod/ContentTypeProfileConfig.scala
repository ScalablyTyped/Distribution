package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentTypeProfileConfig extends js.Object {
  /**
    * The configuration for a field-level encryption content type-profile. 
    */
  var ContentTypeProfiles: js.UndefOr[typings.awsSdk.cloudfrontMod.ContentTypeProfiles] = js.native
  /**
    * The setting in a field-level encryption content type-profile mapping that specifies what to do when an unknown content type is provided for the profile. If true, content is forwarded without being encrypted when the content type is unknown. If false (the default), an error is returned when the content type is unknown. 
    */
  var ForwardWhenContentTypeIsUnknown: Boolean = js.native
}

object ContentTypeProfileConfig {
  @scala.inline
  def apply(ForwardWhenContentTypeIsUnknown: Boolean): ContentTypeProfileConfig = {
    val __obj = js.Dynamic.literal(ForwardWhenContentTypeIsUnknown = ForwardWhenContentTypeIsUnknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentTypeProfileConfig]
  }
  @scala.inline
  implicit class ContentTypeProfileConfigOps[Self <: ContentTypeProfileConfig] (val x: Self) extends AnyVal {
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
    def setForwardWhenContentTypeIsUnknown(value: Boolean): Self = this.set("ForwardWhenContentTypeIsUnknown", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentTypeProfiles(value: ContentTypeProfiles): Self = this.set("ContentTypeProfiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentTypeProfiles: Self = this.set("ContentTypeProfiles", js.undefined)
  }
  
}

