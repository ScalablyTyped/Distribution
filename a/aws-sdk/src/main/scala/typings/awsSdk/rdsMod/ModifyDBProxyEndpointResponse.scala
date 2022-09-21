package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyDBProxyEndpointResponse extends StObject {
  
  /**
    * The DBProxyEndpoint object representing the new settings for the DB proxy endpoint.
    */
  var DBProxyEndpoint: js.UndefOr[typings.awsSdk.rdsMod.DBProxyEndpoint] = js.undefined
}
object ModifyDBProxyEndpointResponse {
  
  inline def apply(): ModifyDBProxyEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyDBProxyEndpointResponse]
  }
  
  extension [Self <: ModifyDBProxyEndpointResponse](x: Self) {
    
    inline def setDBProxyEndpoint(value: DBProxyEndpoint): Self = StObject.set(x, "DBProxyEndpoint", value.asInstanceOf[js.Any])
    
    inline def setDBProxyEndpointUndefined: Self = StObject.set(x, "DBProxyEndpoint", js.undefined)
  }
}
