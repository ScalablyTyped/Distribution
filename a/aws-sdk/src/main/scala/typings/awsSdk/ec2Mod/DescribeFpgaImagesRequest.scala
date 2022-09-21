package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFpgaImagesRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The filters.    create-time - The creation time of the AFI.    fpga-image-id - The FPGA image identifier (AFI ID).    fpga-image-global-id - The global FPGA image identifier (AGFI ID).    name - The name of the AFI.    owner-id - The Amazon Web Services account ID of the AFI owner.    product-code - The product code.    shell-version - The version of the Amazon Web Services Shell that was used to create the bitstream.    state - The state of the AFI (pending | failed | available | unavailable).    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.    update-time - The time of the most recent update.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The AFI IDs.
    */
  var FpgaImageIds: js.UndefOr[FpgaImageIdList] = js.undefined
  
  /**
    * The maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[DescribeFpgaImagesMaxResults] = js.undefined
  
  /**
    * The token to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.undefined
  
  /**
    * Filters the AFI by owner. Specify an Amazon Web Services account ID, self (owner is the sender of the request), or an Amazon Web Services owner alias (valid values are amazon | aws-marketplace).
    */
  var Owners: js.UndefOr[OwnerStringList] = js.undefined
}
object DescribeFpgaImagesRequest {
  
  inline def apply(): DescribeFpgaImagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFpgaImagesRequest]
  }
  
  extension [Self <: DescribeFpgaImagesRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setFpgaImageIds(value: FpgaImageIdList): Self = StObject.set(x, "FpgaImageIds", value.asInstanceOf[js.Any])
    
    inline def setFpgaImageIdsUndefined: Self = StObject.set(x, "FpgaImageIds", js.undefined)
    
    inline def setFpgaImageIdsVarargs(value: FpgaImageId*): Self = StObject.set(x, "FpgaImageIds", js.Array(value*))
    
    inline def setMaxResults(value: DescribeFpgaImagesMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOwners(value: OwnerStringList): Self = StObject.set(x, "Owners", value.asInstanceOf[js.Any])
    
    inline def setOwnersUndefined: Self = StObject.set(x, "Owners", js.undefined)
    
    inline def setOwnersVarargs(value: String*): Self = StObject.set(x, "Owners", js.Array(value*))
  }
}
