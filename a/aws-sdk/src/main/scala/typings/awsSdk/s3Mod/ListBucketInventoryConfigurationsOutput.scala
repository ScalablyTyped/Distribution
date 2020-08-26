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
  def apply(): ListBucketInventoryConfigurationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBucketInventoryConfigurationsOutput]
  }
  @scala.inline
  implicit class ListBucketInventoryConfigurationsOutputOps[Self <: ListBucketInventoryConfigurationsOutput] (val x: Self) extends AnyVal {
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
    def setContinuationToken(value: Token): Self = this.set("ContinuationToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContinuationToken: Self = this.set("ContinuationToken", js.undefined)
    @scala.inline
    def setInventoryConfigurationListVarargs(value: InventoryConfiguration*): Self = this.set("InventoryConfigurationList", js.Array(value :_*))
    @scala.inline
    def setInventoryConfigurationList(value: InventoryConfigurationList): Self = this.set("InventoryConfigurationList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInventoryConfigurationList: Self = this.set("InventoryConfigurationList", js.undefined)
    @scala.inline
    def setIsTruncated(value: IsTruncated): Self = this.set("IsTruncated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsTruncated: Self = this.set("IsTruncated", js.undefined)
    @scala.inline
    def setNextContinuationToken(value: NextToken): Self = this.set("NextContinuationToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextContinuationToken: Self = this.set("NextContinuationToken", js.undefined)
  }
  
}

