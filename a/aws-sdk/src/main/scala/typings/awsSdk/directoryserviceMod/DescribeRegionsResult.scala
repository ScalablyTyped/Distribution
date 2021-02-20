package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRegionsResult extends StObject {
  
  /**
    * If not null, more results are available. Pass this value for the NextToken parameter in a subsequent call to DescribeRegions to retrieve the next set of items.
    */
  var NextToken: js.UndefOr[typings.awsSdk.directoryserviceMod.NextToken] = js.native
  
  /**
    * List of regional information related to the directory per replicated Region.
    */
  var RegionsDescription: js.UndefOr[typings.awsSdk.directoryserviceMod.RegionsDescription] = js.native
}
object DescribeRegionsResult {
  
  @scala.inline
  def apply(): DescribeRegionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRegionsResult]
  }
  
  @scala.inline
  implicit class DescribeRegionsResultMutableBuilder[Self <: DescribeRegionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRegionsDescription(value: RegionsDescription): Self = StObject.set(x, "RegionsDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionsDescriptionUndefined: Self = StObject.set(x, "RegionsDescription", js.undefined)
    
    @scala.inline
    def setRegionsDescriptionVarargs(value: RegionDescription*): Self = StObject.set(x, "RegionsDescription", js.Array(value :_*))
  }
}
