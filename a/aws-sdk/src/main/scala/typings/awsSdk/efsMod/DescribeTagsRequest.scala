package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTagsRequest extends js.Object {
  /**
    * The ID of the file system whose tag set you want to retrieve.
    */
  var FileSystemId: typings.awsSdk.efsMod.FileSystemId = js.native
  /**
    * (Optional) An opaque pagination token returned from a previous DescribeTags operation (String). If present, it specifies to continue the list from where the previous call left off.
    */
  var Marker: js.UndefOr[typings.awsSdk.efsMod.Marker] = js.native
  /**
    * (Optional) The maximum number of file system tags to return in the response. Currently, this number is automatically set to 100, and other values are ignored. The response is paginated at 100 per page if you have more than 100 tags.
    */
  var MaxItems: js.UndefOr[typings.awsSdk.efsMod.MaxItems] = js.native
}

object DescribeTagsRequest {
  @scala.inline
  def apply(FileSystemId: FileSystemId): DescribeTagsRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTagsRequest]
  }
  @scala.inline
  implicit class DescribeTagsRequestOps[Self <: DescribeTagsRequest] (val x: Self) extends AnyVal {
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
    def setFileSystemId(value: FileSystemId): Self = this.set("FileSystemId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarker(value: Marker): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setMaxItems(value: MaxItems): Self = this.set("MaxItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxItems: Self = this.set("MaxItems", js.undefined)
  }
  
}

