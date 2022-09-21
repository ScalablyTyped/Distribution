package typings.cometd

import typings.cometd.mod.ReconnectAdvice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Hosts extends StObject {
    
    var hosts: js.UndefOr[js.Array[String]] = js.undefined
    
    var interval: js.UndefOr[Double] = js.undefined
    
    var `multiple-clients`: js.UndefOr[Boolean] = js.undefined
    
    var reconnect: js.UndefOr[ReconnectAdvice] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object Hosts {
    
    inline def apply(): Hosts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Hosts]
    }
    
    extension [Self <: Hosts](x: Self) {
      
      inline def setHosts(value: js.Array[String]): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
      
      inline def setHostsUndefined: Self = StObject.set(x, "hosts", js.undefined)
      
      inline def setHostsVarargs(value: String*): Self = StObject.set(x, "hosts", js.Array(value*))
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def `setMultiple-clients`(value: Boolean): Self = StObject.set(x, "multiple-clients", value.asInstanceOf[js.Any])
      
      inline def `setMultiple-clientsUndefined`: Self = StObject.set(x, "multiple-clients", js.undefined)
      
      inline def setReconnect(value: ReconnectAdvice): Self = StObject.set(x, "reconnect", value.asInstanceOf[js.Any])
      
      inline def setReconnectUndefined: Self = StObject.set(x, "reconnect", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait Name extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
  }
  object Name {
    
    inline def apply(): Name = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
