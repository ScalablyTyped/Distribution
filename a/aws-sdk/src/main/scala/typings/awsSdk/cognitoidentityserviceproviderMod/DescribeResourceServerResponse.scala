package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeResourceServerResponse extends StObject {
  
  /**
    * The resource server.
    */
  var ResourceServer: ResourceServerType
}
object DescribeResourceServerResponse {
  
  inline def apply(ResourceServer: ResourceServerType): DescribeResourceServerResponse = {
    val __obj = js.Dynamic.literal(ResourceServer = ResourceServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeResourceServerResponse]
  }
  
  extension [Self <: DescribeResourceServerResponse](x: Self) {
    
    inline def setResourceServer(value: ResourceServerType): Self = StObject.set(x, "ResourceServer", value.asInstanceOf[js.Any])
  }
}
