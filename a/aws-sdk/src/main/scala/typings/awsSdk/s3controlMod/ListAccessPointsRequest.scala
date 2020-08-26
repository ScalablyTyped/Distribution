package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAccessPointsRequest extends js.Object {
  /**
    * The AWS account ID for owner of the bucket whose access points you want to list.
    */
  var AccountId: typings.awsSdk.s3controlMod.AccountId = js.native
  /**
    * The name of the bucket whose associated access points you want to list.
    */
  var Bucket: js.UndefOr[BucketName] = js.native
  /**
    * The maximum number of access points that you want to include in the list. If the specified bucket has more than this number of access points, then the response will include a continuation token in the NextToken field that you can use to retrieve the next page of access points.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.s3controlMod.MaxResults] = js.native
  /**
    * A continuation token. If a previous call to ListAccessPoints returned a continuation token in the NextToken field, then providing that value here causes Amazon S3 to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[NonEmptyMaxLength1024String] = js.native
}

object ListAccessPointsRequest {
  @scala.inline
  def apply(AccountId: AccountId): ListAccessPointsRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAccessPointsRequest]
  }
  @scala.inline
  implicit class ListAccessPointsRequestOps[Self <: ListAccessPointsRequest] (val x: Self) extends AnyVal {
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
    def setAccountId(value: AccountId): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setBucket(value: BucketName): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucket: Self = this.set("Bucket", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NonEmptyMaxLength1024String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

