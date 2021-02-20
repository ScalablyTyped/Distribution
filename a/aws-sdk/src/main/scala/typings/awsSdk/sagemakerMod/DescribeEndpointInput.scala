package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEndpointInput extends StObject {
  
  /**
    * The name of the endpoint.
    */
  var EndpointName: typings.awsSdk.sagemakerMod.EndpointName = js.native
}
object DescribeEndpointInput {
  
  @scala.inline
  def apply(EndpointName: EndpointName): DescribeEndpointInput = {
    val __obj = js.Dynamic.literal(EndpointName = EndpointName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEndpointInput]
  }
  
  @scala.inline
  implicit class DescribeEndpointInputMutableBuilder[Self <: DescribeEndpointInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointName(value: EndpointName): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
  }
}
