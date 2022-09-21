package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableClientAuthenticationRequest extends StObject {
  
  /**
    * The identifier of the specified directory. 
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId
  
  /**
    * The type of client authentication to enable. Currently only the value SmartCard is supported. Smart card authentication in AD Connector requires that you enable Kerberos Constrained Delegation for the Service User to the LDAP service in your self-managed AD. 
    */
  var Type: ClientAuthenticationType
}
object EnableClientAuthenticationRequest {
  
  inline def apply(DirectoryId: DirectoryId, Type: ClientAuthenticationType): EnableClientAuthenticationRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableClientAuthenticationRequest]
  }
  
  extension [Self <: EnableClientAuthenticationRequest](x: Self) {
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setType(value: ClientAuthenticationType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
