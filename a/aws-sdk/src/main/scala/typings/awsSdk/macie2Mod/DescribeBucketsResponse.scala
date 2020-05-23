package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBucketsResponse extends js.Object {
  /**
    * An array of objects, one for each bucket that meets the filter criteria specified in the request.
    */
  var buckets: js.UndefOr[listOfBucketMetadata] = js.native
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var nextToken: js.UndefOr[string] = js.native
}

object DescribeBucketsResponse {
  @scala.inline
  def apply(buckets: listOfBucketMetadata = null, nextToken: string = null): DescribeBucketsResponse = {
    val __obj = js.Dynamic.literal()
    if (buckets != null) __obj.updateDynamic("buckets")(buckets.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBucketsResponse]
  }
}

