package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInvalidationRequest extends StObject {
  
  /**
    * The distribution's ID.
    */
  var DistributionId: String = js.native
  
  /**
    * The identifier for the invalidation request, for example, IDFDVBD632BHDS5.
    */
  var Id: String = js.native
}
object GetInvalidationRequest {
  
  @scala.inline
  def apply(DistributionId: String, Id: String): GetInvalidationRequest = {
    val __obj = js.Dynamic.literal(DistributionId = DistributionId.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInvalidationRequest]
  }
  
  @scala.inline
  implicit class GetInvalidationRequestMutableBuilder[Self <: GetInvalidationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistributionId(value: String): Self = StObject.set(x, "DistributionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
