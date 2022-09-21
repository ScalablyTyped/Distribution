package typings.bunyanLogentries

import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bunyan-logentries", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createStream(options: StreamOptions): WritableStream[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStream")(options.asInstanceOf[js.Any]).asInstanceOf[WritableStream[Any]]
  
  trait StreamOptions extends StObject {
    
    var token: String
  }
  object StreamOptions {
    
    inline def apply(token: String): StreamOptions = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamOptions]
    }
    
    extension [Self <: StreamOptions](x: Self) {
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
}
