package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBucketInventoryConfigurationsOutput extends js.Object {
  /**
    * If sent in the request, the marker that is used as a starting point for this inventory configuration list response.
    */
  var ContinuationToken: js.UndefOr[Token] = js.native
  /**
    * The list of inventory configurations for a bucket.
    */
  var InventoryConfigurationList: js.UndefOr[typings.awsSdk.s3Mod.InventoryConfigurationList] = js.native
  /**
    * Tells whether the returned list of inventory configurations is complete. A value of true indicates that the list is not complete and the NextContinuationToken is provided for a subsequent request.
    */
  var IsTruncated: js.UndefOr[typings.awsSdk.s3Mod.IsTruncated] = js.native
  /**
    * The marker used to continue this inventory configuration listing. Use the NextContinuationToken from this response to continue the listing in a subsequent request. The continuation token is an opaque value that Amazon S3 understands.
    */
  var NextContinuationToken: js.UndefOr[NextToken] = js.native
}

object ListBucketInventoryConfigurationsOutput {
  @scala.inline
  def apply(
    ContinuationToken: Token = null,
    InventoryConfigurationList: InventoryConfigurationList = null,
    IsTruncated: js.UndefOr[IsTruncated] = js.undefined,
    NextContinuationToken: NextToken = null
  ): ListBucketInventoryConfigurationsOutput = {
    val __obj = js.Dynamic.literal()
    if (ContinuationToken != null) __obj.updateDynamic("ContinuationToken")(ContinuationToken.asInstanceOf[js.Any])
    if (InventoryConfigurationList != null) __obj.updateDynamic("InventoryConfigurationList")(InventoryConfigurationList.asInstanceOf[js.Any])
    if (!js.isUndefined(IsTruncated)) __obj.updateDynamic("IsTruncated")(IsTruncated.get.asInstanceOf[js.Any])
    if (NextContinuationToken != null) __obj.updateDynamic("NextContinuationToken")(NextContinuationToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBucketInventoryConfigurationsOutput]
  }
}

