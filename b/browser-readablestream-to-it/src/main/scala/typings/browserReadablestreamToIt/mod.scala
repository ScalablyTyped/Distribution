package typings.browserReadablestreamToIt

import typings.std.AsyncGenerator
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("browser-readablestream-to-it", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](stream: ReadableStream[T]): AsyncGenerator[T, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(stream.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[T, Unit, Unit]]
  inline def default[T](stream: ReadableStream[T], options: BrowserReadableStreamToItOptions): AsyncGenerator[T, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[T, Unit, Unit]]
  
  trait BrowserReadableStreamToItOptions extends StObject {
    
    var preventCancel: js.UndefOr[Boolean] = js.undefined
  }
  object BrowserReadableStreamToItOptions {
    
    inline def apply(): BrowserReadableStreamToItOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrowserReadableStreamToItOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BrowserReadableStreamToItOptions] (val x: Self) extends AnyVal {
      
      inline def setPreventCancel(value: Boolean): Self = StObject.set(x, "preventCancel", value.asInstanceOf[js.Any])
      
      inline def setPreventCancelUndefined: Self = StObject.set(x, "preventCancel", js.undefined)
    }
  }
}
