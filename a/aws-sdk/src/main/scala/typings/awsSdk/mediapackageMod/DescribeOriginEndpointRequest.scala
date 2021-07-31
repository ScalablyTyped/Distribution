package typings.awsSdk.mediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOriginEndpointRequest extends StObject {
  
  /**
    * The ID of the OriginEndpoint.
    */
  var Id: string
}
object DescribeOriginEndpointRequest {
  
  @scala.inline
  def apply(Id: string): DescribeOriginEndpointRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOriginEndpointRequest]
  }
  
  @scala.inline
  implicit class DescribeOriginEndpointRequestMutableBuilder[Self <: DescribeOriginEndpointRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
