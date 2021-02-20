package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEndpointRequest extends StObject {
  
  /**
    * The endpoint type. Valid endpoint types include:    iot:Data - Returns a VeriSign signed data endpoint.      iot:Data-ATS - Returns an ATS signed data endpoint.      iot:CredentialProvider - Returns an AWS IoT credentials provider API endpoint.      iot:Jobs - Returns an AWS IoT device management Jobs API endpoint.   We strongly recommend that customers use the newer iot:Data-ATS endpoint type to avoid issues related to the widespread distrust of Symantec certificate authorities.
    */
  var endpointType: js.UndefOr[EndpointType] = js.native
}
object DescribeEndpointRequest {
  
  @scala.inline
  def apply(): DescribeEndpointRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEndpointRequest]
  }
  
  @scala.inline
  implicit class DescribeEndpointRequestMutableBuilder[Self <: DescribeEndpointRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointType(value: EndpointType): Self = StObject.set(x, "endpointType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointTypeUndefined: Self = StObject.set(x, "endpointType", js.undefined)
  }
}
