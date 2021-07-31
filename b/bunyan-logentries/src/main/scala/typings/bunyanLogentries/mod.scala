package typings.bunyanLogentries

import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bunyan-logentries", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createStream(options: StreamOptions): WritableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createStream")(options.asInstanceOf[js.Any]).asInstanceOf[WritableStream]
  
  trait StreamOptions extends StObject {
    
    var token: String
  }
  object StreamOptions {
    
    @scala.inline
    def apply(token: String): StreamOptions = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamOptions]
    }
    
    @scala.inline
    implicit class StreamOptionsMutableBuilder[Self <: StreamOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
}
