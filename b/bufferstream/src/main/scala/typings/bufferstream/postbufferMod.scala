package typings.bufferstream

import typings.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postbufferMod {
  
  @JSImport("bufferstream/postbuffer", JSImport.Namespace)
  @js.native
  class ^ protected () extends PostBuffer {
    /** for if you want to get all the post data from a http server request and do some db request before. */
    def this(req: IncomingMessage) = this()
  }
  
  @js.native
  trait PostBuffer
    extends typings.bufferstream.mod.^ {
    
    /** set a callback to get all post data from a http server request */
    def onEnd(callback: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
  }
}
