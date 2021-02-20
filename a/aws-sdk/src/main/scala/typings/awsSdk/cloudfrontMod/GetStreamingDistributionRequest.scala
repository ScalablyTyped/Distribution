package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStreamingDistributionRequest extends StObject {
  
  /**
    * The streaming distribution's ID.
    */
  var Id: String = js.native
}
object GetStreamingDistributionRequest {
  
  @scala.inline
  def apply(Id: String): GetStreamingDistributionRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStreamingDistributionRequest]
  }
  
  @scala.inline
  implicit class GetStreamingDistributionRequestMutableBuilder[Self <: GetStreamingDistributionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
