package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIPSetResponse extends js.Object {
  /**
    * The format of the file that contains the IPSet.
    */
  var Format: IpSetFormat = js.native
  /**
    * The URI of the file that contains the IPSet. For example: https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key.
    */
  var Location: typings.awsSdk.guarddutyMod.Location = js.native
  /**
    * The user-friendly name for the IPSet.
    */
  var Name: typings.awsSdk.guarddutyMod.Name = js.native
  /**
    * The status of IPSet file that was uploaded.
    */
  var Status: IpSetStatus = js.native
  /**
    * The tags of the IPSet resource.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}

object GetIPSetResponse {
  @scala.inline
  def apply(Format: IpSetFormat, Location: Location, Name: Name, Status: IpSetStatus): GetIPSetResponse = {
    val __obj = js.Dynamic.literal(Format = Format.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIPSetResponse]
  }
  @scala.inline
  implicit class GetIPSetResponseOps[Self <: GetIPSetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFormat(value: IpSetFormat): Self = this.set("Format", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: Location): Self = this.set("Location", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Name): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: IpSetStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: TagMap): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

