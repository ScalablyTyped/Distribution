package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReturnShippingLabelRequest extends StObject {
  
  /**
    * The automatically generated ID for a job, for example JID123e4567-e89b-12d3-a456-426655440000.
    */
  var JobId: js.UndefOr[typings.awsSdk.snowballMod.JobId] = js.undefined
}
object DescribeReturnShippingLabelRequest {
  
  @scala.inline
  def apply(): DescribeReturnShippingLabelRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReturnShippingLabelRequest]
  }
  
  @scala.inline
  implicit class DescribeReturnShippingLabelRequestMutableBuilder[Self <: DescribeReturnShippingLabelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
  }
}
