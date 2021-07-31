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
    
    @scala.inline
    def apply(): Fn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fn]
    }
    
    @scala.inline
    implicit class FnMutableBuilder[Self <: Fn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFn(value: (/* snippet */ String, /* match */ String) => js.Any): Self = StObject.set(x, "fn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
      
      @scala.inline
      def setMatch(value: RegExp): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    }
  }
  
  trait HeartbeatTimeout extends StObject {
    
    var heartbeatTimeout: js.UndefOr[Double] = js.undefined
  }
  object HeartbeatTimeout {
    
    @scala.inline
    def apply(): HeartbeatTimeout = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeartbeatTimeout]
    }
    
    @scala.inline
    implicit class HeartbeatTimeoutMutableBuilder[Self <: HeartbeatTimeout] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeartbeatTimeout(value: Double): Self = StObject.set(x, "heartbeatTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeartbeatTimeoutUndefined: Self = StObject.set(x, "heartbeatTimeout", js.undefined)
    }
  }
  
  trait Plugin extends StObject {
    
    def plugin(opts: js.Object, bs: BrowserSyncInstance): js.Any
    
    @JSName("plugin:name")
    var pluginColonname: js.UndefOr[String] = js.undefined
  }
  object Plugin {
    
    @scala.inline
    def apply(plugin: (js.Object, BrowserSyncInstance) => js.Any): Plugin = {
      val __obj = js.Dynamic.literal(plugin = js.Any.fromFunction2(plugin))
      __obj.asInstanceOf[Plugin]
    }
    
    @scala.inline
    implicit class PluginMutableBuilder[Self <: Plugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlugin(value: (js.Object, BrowserSyncInstance) => js.Any): Self = StObject.set(x, "plugin", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPluginColonname(value: String): Self = StObject.set(x, "plugin:name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginColonnameUndefined: Self = StObject.set(x, "plugin:name", js.undefined)
    }
  }
  
  trait Port extends StObject {
    
    var port: js.UndefOr[Double] = js.undefined
  }
  object Port {
    
    @scala.inline
    def apply(): Port = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Port]
    }
    
    @scala.inline
    implicit class PortMutableBuilder[Self <: Port] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
  
  trait Stream extends StObject {
    
    var stream: Boolean
  }
  object Stream {
    
    @scala.inline
    def apply(stream: Boolean): Stream = {
      val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stream]
    }
    
    @scala.inline
    implicit class StreamMutableBuilder[Self <: Stream] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
}
