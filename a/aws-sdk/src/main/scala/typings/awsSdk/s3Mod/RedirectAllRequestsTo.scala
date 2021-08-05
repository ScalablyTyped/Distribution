package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedirectAllRequestsTo extends StObject {
  
  /**
    * Name of the host where requests are redirected.
    */
  var HostName: typings.awsSdk.s3Mod.HostName
  
  /**
    * Protocol to use when redirecting requests. The default is the protocol that is used in the original request.
    */
  var Protocol: js.UndefOr[typings.awsSdk.s3Mod.Protocol] = js.undefined
}
object RedirectAllRequestsTo {
  
  inline def apply(HostName: HostName): RedirectAllRequestsTo = {
    val __obj = js.Dynamic.literal(HostName = HostName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectAllRequestsTo]
  }
  
  extension [Self <: RedirectAllRequestsTo](x: Self) {
    
    inline def setHostName(value: HostName): Self = StObject.set(x, "HostName", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: Protocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
  }
}
