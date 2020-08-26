package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAccessPointsRequest extends js.Object {
  /**
    * (Optional) Specifies an EFS access point to describe in the response; mutually exclusive with FileSystemId.
    */
  var AccessPointId: js.UndefOr[typings.awsSdk.efsMod.AccessPointId] = js.native
  /**
    * (Optional) If you provide a FileSystemId, EFS returns all access points for that file system; mutually exclusive with AccessPointId.
    */
  var FileSystemId: js.UndefOr[typings.awsSdk.efsMod.FileSystemId] = js.native
  /**
    * (Optional) When retrieving all access points for a file system, you can optionally specify the MaxItems parameter to limit the number of objects returned in a response. The default value is 100. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.efsMod.MaxResults] = js.native
  /**
    *  NextToken is present if the response is paginated. You can use NextMarker in the subsequent request to fetch the next page of access point descriptions.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object DescribeAccessPointsRequest {
  @scala.inline
  def apply(): DescribeAccessPointsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccessPointsRequest]
  }
  @scala.inline
  implicit class DescribeAccessPointsRequestOps[Self <: DescribeAccessPointsRequest] (val x: Self) extends AnyVal {
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
    def setAccessPointId(value: AccessPointId): Self = this.set("AccessPointId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessPointId: Self = this.set("AccessPointId", js.undefined)
    @scala.inline
    def setFileSystemId(value: FileSystemId): Self = this.set("FileSystemId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileSystemId: Self = this.set("FileSystemId", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

