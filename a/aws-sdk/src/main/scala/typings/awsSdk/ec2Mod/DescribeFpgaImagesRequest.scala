package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFpgaImagesRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The filters.    create-time - The creation time of the AFI.    fpga-image-id - The FPGA image identifier (AFI ID).    fpga-image-global-id - The global FPGA image identifier (AGFI ID).    name - The name of the AFI.    owner-id - The AWS account ID of the AFI owner.    product-code - The product code.    shell-version - The version of the AWS Shell that was used to create the bitstream.    state - The state of the AFI (pending | failed | available | unavailable).    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.    update-time - The time of the most recent update.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * The AFI IDs.
    */
  var FpgaImageIds: js.UndefOr[FpgaImageIdList] = js.native
  /**
    * The maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[DescribeFpgaImagesMaxResults] = js.native
  /**
    * The token to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.native
  /**
    * Filters the AFI by owner. Specify an AWS account ID, self (owner is the sender of the request), or an AWS owner alias (valid values are amazon | aws-marketplace).
    */
  var Owners: js.UndefOr[OwnerStringList] = js.native
}

object DescribeFpgaImagesRequest {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Filters: FilterList = null,
    FpgaImageIds: FpgaImageIdList = null,
    MaxResults: js.UndefOr[DescribeFpgaImagesMaxResults] = js.undefined,
    NextToken: NextToken = null,
    Owners: OwnerStringList = null
  ): DescribeFpgaImagesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (FpgaImageIds != null) __obj.updateDynamic("FpgaImageIds")(FpgaImageIds.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Owners != null) __obj.updateDynamic("Owners")(Owners.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFpgaImagesRequest]
  }
}

