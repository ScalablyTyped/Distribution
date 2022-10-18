package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeServerResponse extends StObject {
  
  /**
    * An array containing the properties of a server with the ServerID you specified.
    */
  var Server: DescribedServer
}
object DescribeServerResponse {
  
  inline def apply(Server: DescribedServer): DescribeServerResponse = {
    val __obj = js.Dynamic.literal(Server = Server.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeServerResponse]
  }
  
  extension [Self <: DescribeServerResponse](x: Self) {
    
    inline def setServer(value: DescribedServer): Self = StObject.set(x, "Server", value.asInstanceOf[js.Any])
  }
}
