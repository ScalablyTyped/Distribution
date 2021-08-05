package typings.browserSync.mod

import typings.browserSync.anon.HeartbeatTimeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SocketOptions extends StObject {
  
  var clientPath: js.UndefOr[String] = js.undefined
  
  var clients: js.UndefOr[HeartbeatTimeout] = js.undefined
  
  var domain: js.UndefOr[String] = js.undefined
  
  var namespace: js.UndefOr[String] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var port: js.UndefOr[Double] = js.undefined
}
object SocketOptions {
  
  inline def apply(): SocketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocketOptions]
  }
  
  extension [Self <: SocketOptions](x: Self) {
    
    inline def setClientPath(value: String): Self = StObject.set(x, "clientPath", value.asInstanceOf[js.Any])
    
    inline def setClientPathUndefined: Self = StObject.set(x, "clientPath", js.undefined)
    
    inline def setClients(value: HeartbeatTimeout): Self = StObject.set(x, "clients", value.asInstanceOf[js.Any])
    
    inline def setClientsUndefined: Self = StObject.set(x, "clients", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
