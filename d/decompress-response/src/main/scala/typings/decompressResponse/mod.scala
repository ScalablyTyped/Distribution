package typings.decompressResponse

import typings.node.httpMod.IncomingHttpHeaders
import typings.node.nodeColonhttpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("decompress-response", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(response: IncomingMessage): UncompressedIncomingMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(response.asInstanceOf[js.Any]).asInstanceOf[UncompressedIncomingMessage]
  
  trait UncompressedIncomingHttpHeaders
    extends StObject
       with IncomingHttpHeaders {
    
    @JSName("content-encoding")
    var `content-encoding_UncompressedIncomingHttpHeaders`: js.UndefOr[scala.Nothing] = js.undefined
  }
  object UncompressedIncomingHttpHeaders {
    
    inline def apply(): UncompressedIncomingHttpHeaders = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UncompressedIncomingHttpHeaders]
    }
  }
  
  @js.native
  trait UncompressedIncomingMessage extends IncomingMessage {
    
    var headers: UncompressedIncomingHttpHeaders = js.native
  }
}
