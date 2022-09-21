package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConnectorResponse extends StObject {
  
  /**
    * The structure that contains the details of the connector.
    */
  var Connector: DescribedConnector
}
object DescribeConnectorResponse {
  
  inline def apply(Connector: DescribedConnector): DescribeConnectorResponse = {
    val __obj = js.Dynamic.literal(Connector = Connector.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConnectorResponse]
  }
  
  extension [Self <: DescribeConnectorResponse](x: Self) {
    
    inline def setConnector(value: DescribedConnector): Self = StObject.set(x, "Connector", value.asInstanceOf[js.Any])
  }
}
