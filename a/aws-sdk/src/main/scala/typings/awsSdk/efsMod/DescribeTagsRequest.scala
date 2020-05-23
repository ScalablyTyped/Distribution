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
  def apply(FileSystemId: FileSystemId, Marker: Marker = null, MaxItems: js.UndefOr[MaxItems] = js.undefined): DescribeTagsRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxItems)) __obj.updateDynamic("MaxItems")(MaxItems.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTagsRequest]
  }
}

