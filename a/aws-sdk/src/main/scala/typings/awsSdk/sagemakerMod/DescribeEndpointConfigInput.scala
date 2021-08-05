package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEndpointConfigInput extends StObject {
  
  /**
    * The name of the endpoint configuration.
    */
  var EndpointConfigName: typings.awsSdk.sagemakerMod.EndpointConfigName
}
object DescribeEndpointConfigInput {
  
  inline def apply(EndpointConfigName: EndpointConfigName): DescribeEndpointConfigInput = {
    val __obj = js.Dynamic.literal(EndpointConfigName = EndpointConfigName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEndpointConfigInput]
  }
  
  extension [Self <: DescribeEndpointConfigInput](x: Self) {
    
    inline def setEndpointConfigName(value: EndpointConfigName): Self = StObject.set(x, "EndpointConfigName", value.asInstanceOf[js.Any])
  }
}
