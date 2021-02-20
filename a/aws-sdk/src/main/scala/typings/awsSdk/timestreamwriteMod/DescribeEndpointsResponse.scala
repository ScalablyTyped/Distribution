package typings.awsSdk.timestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEndpointsResponse extends StObject {
  
  /**
    * An Endpoints object is returned when a DescribeEndpoints request is made.
    */
  var Endpoints: typings.awsSdk.timestreamwriteMod.Endpoints = js.native
}
object DescribeEndpointsResponse {
  
  @scala.inline
  def apply(Endpoints: Endpoints): DescribeEndpointsResponse = {
    val __obj = js.Dynamic.literal(Endpoints = Endpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEndpointsResponse]
  }
  
  @scala.inline
  implicit class DescribeEndpointsResponseMutableBuilder[Self <: DescribeEndpointsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpoints(value: Endpoints): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointsVarargs(value: Endpoint*): Self = StObject.set(x, "Endpoints", js.Array(value :_*))
  }
}
