package typings.bonjourService

import typings.bonjourService.keyValueMod.KeyValue
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dnsTxtMod {
  
  @JSImport("bonjour-service/dist/lib/dns-txt", JSImport.Default)
  @js.native
  open class default () extends DnsTxt {
    def this(opts: KeyValue) = this()
  }
  
  @JSImport("bonjour-service/dist/lib/dns-txt", "DnsTxt")
  @js.native
  open class DnsTxt () extends StObject {
    def this(opts: KeyValue) = this()
    
    /* private */ var binary: Any = js.native
    
    def decode(buffer: Buffer): KeyValue = js.native
    
    def decodeAll(buffer: js.Array[Buffer]): KeyValue = js.native
    
    def encode(): js.Array[Buffer] = js.native
    def encode(data: KeyValue): js.Array[Buffer] = js.native
  }
}
