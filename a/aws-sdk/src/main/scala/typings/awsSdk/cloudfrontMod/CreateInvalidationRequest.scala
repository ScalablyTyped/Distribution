package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInvalidationRequest extends StObject {
  
  /**
    * The distribution's id.
    */
  var DistributionId: String
  
  /**
    * The batch information for the invalidation.
    */
  var InvalidationBatch: typings.awsSdk.cloudfrontMod.InvalidationBatch
}
object CreateInvalidationRequest {
  
  @scala.inline
  def apply(DistributionId: String, InvalidationBatch: InvalidationBatch): CreateInvalidationRequest = {
    val __obj = js.Dynamic.literal(DistributionId = DistributionId.asInstanceOf[js.Any], InvalidationBatch = InvalidationBatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInvalidationRequest]
  }
  
  @scala.inline
  implicit class CreateInvalidationRequestMutableBuilder[Self <: CreateInvalidationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistributionId(value: String): Self = StObject.set(x, "DistributionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidationBatch(value: InvalidationBatch): Self = StObject.set(x, "InvalidationBatch", value.asInstanceOf[js.Any])
  }
}
