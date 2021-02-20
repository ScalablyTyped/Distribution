package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeOfferingRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the offering.
    */
  var OfferingArn: string = js.native
}
object DescribeOfferingRequest {
  
  @scala.inline
  def apply(OfferingArn: string): DescribeOfferingRequest = {
    val __obj = js.Dynamic.literal(OfferingArn = OfferingArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOfferingRequest]
  }
  
  @scala.inline
  implicit class DescribeOfferingRequestMutableBuilder[Self <: DescribeOfferingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOfferingArn(value: string): Self = StObject.set(x, "OfferingArn", value.asInstanceOf[js.Any])
  }
}
