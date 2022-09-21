package typings.awsSdk.privatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigureAccessPointResponse extends StObject {
  
  /**
    * Information about the network resource.
    */
  var accessPoint: NetworkResource
}
object ConfigureAccessPointResponse {
  
  inline def apply(accessPoint: NetworkResource): ConfigureAccessPointResponse = {
    val __obj = js.Dynamic.literal(accessPoint = accessPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigureAccessPointResponse]
  }
  
  extension [Self <: ConfigureAccessPointResponse](x: Self) {
    
    inline def setAccessPoint(value: NetworkResource): Self = StObject.set(x, "accessPoint", value.asInstanceOf[js.Any])
  }
}
