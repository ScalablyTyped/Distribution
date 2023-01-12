package typings.axon

import org.scalablytyped.runtime.Instantiable0
import typings.axon.mod.PubEmitterSocket
import typings.axon.mod.PubSocket
import typings.axon.mod.PullSocket
import typings.axon.mod.PushSocket
import typings.axon.mod.RepSocket
import typings.axon.mod.ReqSocket
import typings.axon.mod.Socket_
import typings.axon.mod.SubEmitterSocket
import typings.axon.mod.SubSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Address extends StObject {
    
    var address: String
    
    var family: String
    
    var port: Double
    
    var string: String
  }
  object Address {
    
    inline def apply(address: String, family: String, port: Double, string: String): Address = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    }
  }
  
  trait Hostname extends StObject {
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var pathname: String
    
    var port: String | Double
    
    var protocol: js.UndefOr[String] = js.undefined
  }
  object Hostname {
    
    inline def apply(pathname: String, port: String | Double): Hostname = {
      val __obj = js.Dynamic.literal(pathname = pathname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hostname]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Hostname] (val x: Self) extends AnyVal {
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPort(value: String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    }
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable0[
          PubEmitterSocket | SubEmitterSocket | PushSocket | PullSocket | PubSocket | SubSocket | ReqSocket | RepSocket | Socket_
        ]
}
