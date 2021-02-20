package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStreamingDistributionConfigRequest extends StObject {
  
  /**
    * The streaming distribution's ID.
    */
  var Id: String = js.native
}
object GetStreamingDistributionConfigRequest {
  
  @scala.inline
  def apply(Id: String): GetStreamingDistributionConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStreamingDistributionConfigRequest]
  }
  
  @scala.inline
  implicit class GetStreamingDistributionConfigRequestMutableBuilder[Self <: GetStreamingDistributionConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
