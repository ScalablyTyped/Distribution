package typings.busboy

import org.scalablytyped.runtime.Instantiable1
import typings.busboy.anon.FieldNameSize
import typings.busboy.busboyStrings.field
import typings.busboy.busboyStrings.fieldsLimit
import typings.busboy.busboyStrings.file
import typings.busboy.busboyStrings.filesLimit
import typings.busboy.busboyStrings.finish
import typings.busboy.busboyStrings.partsLimit
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object busboy {
  
  @js.native
  trait Busboy
    extends StObject
       with WritableStream {
    
    def on(event: String, listener: js.Function): this.type = js.native
    @JSName("on")
    def on_field(
      event: field,
      listener: js.Function6[
          /* fieldname */ String, 
          /* val */ js.Any, 
          /* fieldnameTruncated */ Boolean, 
          /* valTruncated */ Boolean, 
          /* encoding */ String, 
          /* mimetype */ String, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_fieldsLimit(event: fieldsLimit, callback: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_file(
      event: file,
      listener: js.Function5[
          /* fieldname */ String, 
          /* file */ ReadableStream, 
          /* filename */ String, 
          /* encoding */ String, 
          /* mimetype */ String, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_filesLimit(event: filesLimit, callback: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_finish(event: finish, callback: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_partsLimit(event: partsLimit, callback: js.Function0[Unit]): this.type = js.native
  }
  
  trait BusboyConfig extends StObject {
    
    var defCharset: js.UndefOr[String] = js.undefined
    
    var fileHwm: js.UndefOr[Double] = js.undefined
    
    var headers: js.UndefOr[js.Any] = js.undefined
    
    var highWaterMark: js.UndefOr[Double] = js.undefined
    
    var limits: js.UndefOr[FieldNameSize] = js.undefined
    
    var preservePath: js.UndefOr[Boolean] = js.undefined
  }
  object BusboyConfig {
    
    inline def apply(): BusboyConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BusboyConfig]
    }
    
    extension [Self <: BusboyConfig](x: Self) {
      
      inline def setDefCharset(value: String): Self = StObject.set(x, "defCharset", value.asInstanceOf[js.Any])
      
      inline def setDefCharsetUndefined: Self = StObject.set(x, "defCharset", js.undefined)
      
      inline def setFileHwm(value: Double): Self = StObject.set(x, "fileHwm", value.asInstanceOf[js.Any])
      
      inline def setFileHwmUndefined: Self = StObject.set(x, "fileHwm", js.undefined)
      
      inline def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      inline def setLimits(value: FieldNameSize): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
      
      inline def setLimitsUndefined: Self = StObject.set(x, "limits", js.undefined)
      
      inline def setPreservePath(value: Boolean): Self = StObject.set(x, "preservePath", value.asInstanceOf[js.Any])
      
      inline def setPreservePathUndefined: Self = StObject.set(x, "preservePath", js.undefined)
    }
  }
  
  @js.native
  trait BusboyConstructor
    extends StObject
       with Instantiable1[/* options */ BusboyConfig, Busboy]
  
  trait Options extends StObject {
    
    var headers: js.Any
  }
  object Options {
    
    inline def apply(headers: js.Any): Options = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
}
