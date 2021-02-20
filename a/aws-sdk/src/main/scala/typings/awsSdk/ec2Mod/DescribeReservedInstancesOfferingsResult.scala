package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeReservedInstancesOfferingsResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * A list of Reserved Instances offerings.
    */
  var ReservedInstancesOfferings: js.UndefOr[ReservedInstancesOfferingList] = js.native
}
object DescribeReservedInstancesOfferingsResult {
  
  @scala.inline
  def apply(): DescribeReservedInstancesOfferingsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedInstancesOfferingsResult]
  }
  
  @scala.inline
  implicit class DescribeReservedInstancesOfferingsResultMutableBuilder[Self <: DescribeReservedInstancesOfferingsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setReservedInstancesOfferings(value: ReservedInstancesOfferingList): Self = StObject.set(x, "ReservedInstancesOfferings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedInstancesOfferingsUndefined: Self = StObject.set(x, "ReservedInstancesOfferings", js.undefined)
    
    @scala.inline
    def setReservedInstancesOfferingsVarargs(value: ReservedInstancesOffering*): Self = StObject.set(x, "ReservedInstancesOfferings", js.Array(value :_*))
  }
}
