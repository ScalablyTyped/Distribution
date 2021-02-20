package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeOfferingRequest extends StObject {
  
  /**
    * Unique offering ID, e.g. '87654321'
    */
  var OfferingId: string = js.native
}
object DescribeOfferingRequest {
  
  @scala.inline
  def apply(OfferingId: string): DescribeOfferingRequest = {
    val __obj = js.Dynamic.literal(OfferingId = OfferingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOfferingRequest]
  }
  
  @scala.inline
  implicit class DescribeOfferingRequestMutableBuilder[Self <: DescribeOfferingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOfferingId(value: string): Self = StObject.set(x, "OfferingId", value.asInstanceOf[js.Any])
  }
}
