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
  def apply(
    AccountId: AccountId,
    Bucket: BucketName = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NonEmptyMaxLength1024String = null
  ): ListAccessPointsRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any])
    if (Bucket != null) __obj.updateDynamic("Bucket")(Bucket.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAccessPointsRequest]
  }
}

