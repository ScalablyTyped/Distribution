package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerShortInfoResponse extends StObject {
  
  /**
    * The IP address of a server in a Fleet Advisor collector inventory.
    */
  var IpAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of a server in a Fleet Advisor collector inventory.
    */
  var ServerId: js.UndefOr[String] = js.undefined
  
  /**
    * The name address of a server in a Fleet Advisor collector inventory.
    */
  var ServerName: js.UndefOr[String] = js.undefined
}
object ServerShortInfoResponse {
  
  inline def apply(): ServerShortInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerShortInfoResponse]
  }
  
  extension [Self <: ServerShortInfoResponse](x: Self) {
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "IpAddress", js.undefined)
    
    inline def setServerId(value: String): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
    
    inline def setServerIdUndefined: Self = StObject.set(x, "ServerId", js.undefined)
    
    inline def setServerName(value: String): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
    
    inline def setServerNameUndefined: Self = StObject.set(x, "ServerName", js.undefined)
  }
}
