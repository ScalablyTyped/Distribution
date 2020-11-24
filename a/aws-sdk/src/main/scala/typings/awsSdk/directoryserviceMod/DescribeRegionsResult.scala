package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRegionsResult extends js.Object {
  
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
  implicit class DescribeRegionsResultOps[Self <: DescribeRegionsResult] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setRegionsDescriptionVarargs(value: RegionDescription*): Self = this.set("RegionsDescription", js.Array(value :_*))
    
    @scala.inline
    def setRegionsDescription(value: RegionsDescription): Self = this.set("RegionsDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionsDescription: Self = this.set("RegionsDescription", js.undefined)
  }
}
