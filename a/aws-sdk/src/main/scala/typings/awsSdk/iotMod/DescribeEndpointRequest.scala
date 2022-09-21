package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEndpointRequest extends StObject {
  
  /**
    * The endpoint type. Valid endpoint types include:    iot:Data - Returns a VeriSign signed data endpoint.      iot:Data-ATS - Returns an ATS signed data endpoint.      iot:CredentialProvider - Returns an IoT credentials provider API endpoint.      iot:Jobs - Returns an IoT device management Jobs API endpoint.   We strongly recommend that customers use the newer iot:Data-ATS endpoint type to avoid issues related to the widespread distrust of Symantec certificate authorities.
    */
  var endpointType: js.UndefOr[EndpointType] = js.undefined
}
object DescribeEndpointRequest {
  
  inline def apply(): DescribeEndpointRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEndpointRequest]
  }
  
  extension [Self <: DescribeEndpointRequest](x: Self) {
    
    inline def setEndpointType(value: EndpointType): Self = StObject.set(x, "endpointType", value.asInstanceOf[js.Any])
    
    inline def setEndpointTypeUndefined: Self = StObject.set(x, "endpointType", js.undefined)
  }
}
