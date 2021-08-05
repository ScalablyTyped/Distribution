package typings.browserSync

import typings.browserSync.mod.BrowserSyncInstance
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Fn extends StObject {
    
    var fn: js.UndefOr[js.Function2[/* snippet */ String, /* match */ String, js.Any]] = js.undefined
    
    var `match`: js.UndefOr[RegExp] = js.undefined
  }
  object Fn {
    
    inline def apply(): Fn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fn]
    }
    
    extension [Self <: Fn](x: Self) {
      
      inline def setFn(value: (/* snippet */ String, /* match */ String) => js.Any): Self = StObject.set(x, "fn", js.Any.fromFunction2(value))
      
      inline def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
      
      inline def setMatch(value: RegExp): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    }
  }
  
  trait HeartbeatTimeout extends StObject {
    
    var heartbeatTimeout: js.UndefOr[Double] = js.undefined
  }
  object HeartbeatTimeout {
    
    inline def apply(): HeartbeatTimeout = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeartbeatTimeout]
    }
    
    extension [Self <: HeartbeatTimeout](x: Self) {
      
      inline def setHeartbeatTimeout(value: Double): Self = StObject.set(x, "heartbeatTimeout", value.asInstanceOf[js.Any])
      
      inline def setHeartbeatTimeoutUndefined: Self = StObject.set(x, "heartbeatTimeout", js.undefined)
    }
  }
  
  trait Plugin extends StObject {
    
    def plugin(opts: js.Object, bs: BrowserSyncInstance): js.Any
    
    @JSName("plugin:name")
    var pluginColonname: js.UndefOr[String] = js.undefined
  }
  object Plugin {
    
    inline def apply(plugin: (js.Object, BrowserSyncInstance) => js.Any): Plugin = {
      val __obj = js.Dynamic.literal(plugin = js.Any.fromFunction2(plugin))
      __obj.asInstanceOf[Plugin]
    }
    
    extension [Self <: Plugin](x: Self) {
      
      inline def setPlugin(value: (js.Object, BrowserSyncInstance) => js.Any): Self = StObject.set(x, "plugin", js.Any.fromFunction2(value))
      
      inline def setPluginColonname(value: String): Self = StObject.set(x, "plugin:name", value.asInstanceOf[js.Any])
      
      inline def setPluginColonnameUndefined: Self = StObject.set(x, "plugin:name", js.undefined)
    }
  }
  
  trait Port extends StObject {
    
    var port: js.UndefOr[Double] = js.undefined
  }
  object Port {
    
    inline def apply(): Port = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Port]
    }
    
    extension [Self <: Port](x: Self) {
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
  
  trait Stream extends StObject {
    
    var stream: Boolean
  }
  object Stream {
    
    inline def apply(stream: Boolean): Stream = {
      val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stream]
    }
    
    extension [Self <: Stream](x: Self) {
      
      inline def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
}
