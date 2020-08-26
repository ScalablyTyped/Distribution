package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentTypeProfile extends js.Object {
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
  implicit class ContentTypeProfileOps[Self <: ContentTypeProfile] (val x: Self) extends AnyVal {
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
    def setContentType(value: String): Self = this.set("ContentType", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: Format): Self = this.set("Format", value.asInstanceOf[js.Any])
    @scala.inline
    def setProfileId(value: String): Self = this.set("ProfileId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileId: Self = this.set("ProfileId", js.undefined)
  }
  
}

