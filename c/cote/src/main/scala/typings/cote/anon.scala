package typings.cote

import typings.node.httpMod.Server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Monitor extends StObject {
    
    var monitor: typings.cote.mod.Monitor
    
    var server: Server
  }
  object Monitor {
    
    @scala.inline
    def apply(monitor: typings.cote.mod.Monitor, server: Server): Monitor = {
      val __obj = js.Dynamic.literal(monitor = monitor.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
      __obj.asInstanceOf[Monitor]
    }
    
    @scala.inline
    implicit class MonitorMutableBuilder[Self <: Monitor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMonitor(value: typings.cote.mod.Monitor): Self = StObject.set(x, "monitor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServer(value: Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    }
  }
}
