package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeInstanceTypeOfferingsResult extends StObject {
  
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
  implicit class DescribeInstanceTypeOfferingsResultMutableBuilder[Self <: DescribeInstanceTypeOfferingsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceTypeOfferings(value: InstanceTypeOfferingsList): Self = StObject.set(x, "InstanceTypeOfferings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeOfferingsUndefined: Self = StObject.set(x, "InstanceTypeOfferings", js.undefined)
    
    @scala.inline
    def setInstanceTypeOfferingsVarargs(value: InstanceTypeOffering*): Self = StObject.set(x, "InstanceTypeOfferings", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
