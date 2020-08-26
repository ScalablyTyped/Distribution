package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGroupVersionRequest extends js.Object {
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: string = js.native
  /**
    * The ID of the group version. This value maps to the ''Version'' property of the corresponding ''VersionInformation'' object, which is returned by ''ListGroupVersions'' requests. If the version is the last one that was associated with a group, the value also maps to the ''LatestVersion'' property of the corresponding ''GroupInformation'' object.
    */
  var GroupVersionId: string = js.native
}

object GetGroupVersionRequest {
  @scala.inline
  def apply(GroupId: string, GroupVersionId: string): GetGroupVersionRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any], GroupVersionId = GroupVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGroupVersionRequest]
  }
  @scala.inline
  implicit class GetGroupVersionRequestOps[Self <: GetGroupVersionRequest] (val x: Self) extends AnyVal {
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
    def setGroupId(value: string): Self = this.set("GroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupVersionId(value: string): Self = this.set("GroupVersionId", value.asInstanceOf[js.Any])
  }
  
}

