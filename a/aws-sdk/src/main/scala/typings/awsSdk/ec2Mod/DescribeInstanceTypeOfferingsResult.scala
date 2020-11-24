package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeInstanceTypeOfferingsResult extends js.Object {
  
  /**
    * The instance types offered.
    */
  var InstanceTypeOfferings: js.UndefOr[InstanceTypeOfferingsList] = js.native
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.native
}
object DescribeInstanceTypeOfferingsResult {
  
  @scala.inline
  def apply(): DescribeInstanceTypeOfferingsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstanceTypeOfferingsResult]
  }
  
  @scala.inline
  implicit class DescribeInstanceTypeOfferingsResultOps[Self <: DescribeInstanceTypeOfferingsResult] (val x: Self) extends AnyVal {
    
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
    def setInstanceTypeOfferingsVarargs(value: InstanceTypeOffering*): Self = this.set("InstanceTypeOfferings", js.Array(value :_*))
    
    @scala.inline
    def setInstanceTypeOfferings(value: InstanceTypeOfferingsList): Self = this.set("InstanceTypeOfferings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceTypeOfferings: Self = this.set("InstanceTypeOfferings", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
