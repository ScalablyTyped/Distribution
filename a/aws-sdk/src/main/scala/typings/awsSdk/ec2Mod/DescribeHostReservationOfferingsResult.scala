package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeHostReservationOfferingsResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the offerings.
    */
  var OfferingSet: js.UndefOr[HostOfferingSet] = js.undefined
}
object DescribeHostReservationOfferingsResult {
  
  @scala.inline
  def apply(): DescribeHostReservationOfferingsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeHostReservationOfferingsResult]
  }
  
  @scala.inline
  implicit class DescribeHostReservationOfferingsResultMutableBuilder[Self <: DescribeHostReservationOfferingsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setOfferingSet(value: HostOfferingSet): Self = StObject.set(x, "OfferingSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferingSetUndefined: Self = StObject.set(x, "OfferingSet", js.undefined)
    
    @scala.inline
    def setOfferingSetVarargs(value: HostOffering*): Self = StObject.set(x, "OfferingSet", js.Array(value :_*))
  }
}
