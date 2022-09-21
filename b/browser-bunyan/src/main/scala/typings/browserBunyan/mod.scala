package typings.browserBunyan

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.browserBunyan.anon.PartialConsoleFormattedSt
import typings.browserBunyan.anon.PartialConsoleFormattedStDef
import typings.browserBunyan.anon.Typeofbunyan
import typings.browserBunyan.mod.BrowserBunyan.ConsoleFormattedStreamOptions
import typings.bunyan.mod.LoggerOptions
import typings.bunyan.mod.RingBufferOptions
import typings.bunyan.mod.RotatingFileStreamOptions
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("browser-bunyan", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends typings.bunyan.mod.^ {
    def this(options: LoggerOptions) = this()
  }
  @JSImport("browser-bunyan", JSImport.Namespace)
  @js.native
  val ^ : BrowserBunyan = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("browser-bunyan", "ConsoleFormattedStream")
  @js.native
  open class ConsoleFormattedStream ()
    extends StObject
       with WritableStream[Any] {
    def this(options: ConsoleFormattedStreamOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("browser-bunyan", "ConsoleRawStream")
  @js.native
  open class ConsoleRawStream ()
    extends StObject
       with WritableStream[Any] {
    def this(options: ConsoleFormattedStreamOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("browser-bunyan", "RingBuffer")
  @js.native
  open class RingBuffer protected ()
    extends typings.bunyan.mod.RingBuffer {
    def this(options: RingBufferOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("browser-bunyan", "RotatingFileStream")
  @js.native
  open class RotatingFileStream protected ()
    extends typings.bunyan.mod.RotatingFileStream {
    def this(options: RotatingFileStreamOptions) = this()
  }
  
  object BrowserBunyan {
    
    type ConsoleFormattedStream = Instantiable1[/* options */ js.UndefOr[ConsoleFormattedStreamOptions], WritableStream[Any]]
    
    trait ConsoleFormattedStreamLevelStyle extends StObject {
      
      var debug: String
      
      var error: String
      
      var fatal: String
      
      var info: String
      
      var trace: String
      
      var warn: String
    }
    object ConsoleFormattedStreamLevelStyle {
      
      inline def apply(debug: String, error: String, fatal: String, info: String, trace: String, warn: String): ConsoleFormattedStreamLevelStyle = {
        val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], trace = trace.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
        __obj.asInstanceOf[ConsoleFormattedStreamLevelStyle]
      }
      
      extension [Self <: ConsoleFormattedStreamLevelStyle](x: Self) {
        
        inline def setDebug(value: String): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        inline def setFatal(value: String): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
        
        inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
        
        inline def setTrace(value: String): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
        
        inline def setWarn(value: String): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
      }
    }
    
    trait ConsoleFormattedStreamOptions extends StObject {
      
      var css: js.UndefOr[PartialConsoleFormattedStDef] = js.undefined
      
      var logByLevel: js.UndefOr[Boolean] = js.undefined
    }
    object ConsoleFormattedStreamOptions {
      
      inline def apply(): ConsoleFormattedStreamOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ConsoleFormattedStreamOptions]
      }
      
      extension [Self <: ConsoleFormattedStreamOptions](x: Self) {
        
        inline def setCss(value: PartialConsoleFormattedStDef): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
        
        inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
        
        inline def setLogByLevel(value: Boolean): Self = StObject.set(x, "logByLevel", value.asInstanceOf[js.Any])
        
        inline def setLogByLevelUndefined: Self = StObject.set(x, "logByLevel", js.undefined)
      }
    }
    
    trait ConsoleFormattedStreamStyle extends StObject {
      
      var `def`: String
      
      var levels: PartialConsoleFormattedSt
      
      var msg: String
      
      var src: String
    }
    object ConsoleFormattedStreamStyle {
      
      inline def apply(`def`: String, levels: PartialConsoleFormattedSt, msg: String, src: String): ConsoleFormattedStreamStyle = {
        val __obj = js.Dynamic.literal(levels = levels.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
        __obj.updateDynamic("def")(`def`.asInstanceOf[js.Any])
        __obj.asInstanceOf[ConsoleFormattedStreamStyle]
      }
      
      extension [Self <: ConsoleFormattedStreamStyle](x: Self) {
        
        inline def setDef(value: String): Self = StObject.set(x, "def", value.asInstanceOf[js.Any])
        
        inline def setLevels(value: PartialConsoleFormattedSt): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
        
        inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
        
        inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      }
    }
    
    type ConsoleRawStream = Instantiable1[/* options */ js.UndefOr[ConsoleFormattedStreamOptions], WritableStream[Any]]
  }
  type BrowserBunyan = (Instantiable1[/* options */ LoggerOptions, typings.bunyan.mod.^]) & Typeofbunyan & typings.browserBunyan.anon.ConsoleFormattedStream
  
  type _To = BrowserBunyan
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: BrowserBunyan = ^
}
