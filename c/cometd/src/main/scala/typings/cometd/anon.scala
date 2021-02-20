package typings.cometd

import typings.cometd.mod.ReconnectAdvice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Hosts extends StObject {
    
    var hosts: js.UndefOr[js.Array[String]] = js.native
    
    var interval: js.UndefOr[Double] = js.native
    
    var `multiple-clients`: js.UndefOr[Boolean] = js.native
    
    var reconnect: js.UndefOr[ReconnectAdvice] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object Hosts {
    
    @scala.inline
    def apply(): Hosts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Hosts]
    }
    
    @scala.inline
    implicit class HostsMutableBuilder[Self <: Hosts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHosts(value: js.Array[String]): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostsUndefined: Self = StObject.set(x, "hosts", js.undefined)
      
      @scala.inline
      def setHostsVarargs(value: String*): Self = StObject.set(x, "hosts", js.Array(value :_*))
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def `setMultiple-clients`(value: Boolean): Self = StObject.set(x, "multiple-clients", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMultiple-clientsUndefined`: Self = StObject.set(x, "multiple-clients", js.undefined)
      
      @scala.inline
      def setReconnect(value: ReconnectAdvice): Self = StObject.set(x, "reconnect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReconnectUndefined: Self = StObject.set(x, "reconnect", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
