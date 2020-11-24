package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): DescribeFpgaImagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFpgaImagesRequest]
  }
  
  @scala.inline
  implicit class DescribeFpgaImagesRequestOps[Self <: DescribeFpgaImagesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = this.set("Filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: FilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    
    @scala.inline
    def setFpgaImageIdsVarargs(value: FpgaImageId*): Self = this.set("FpgaImageIds", js.Array(value :_*))
    
    @scala.inline
    def setFpgaImageIds(value: FpgaImageIdList): Self = this.set("FpgaImageIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFpgaImageIds: Self = this.set("FpgaImageIds", js.undefined)
    
    @scala.inline
    def setMaxResults(value: DescribeFpgaImagesMaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setOwnersVarargs(value: String*): Self = this.set("Owners", js.Array(value :_*))
    
    @scala.inline
    def setOwners(value: OwnerStringList): Self = this.set("Owners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwners: Self = this.set("Owners", js.undefined)
  }
}
