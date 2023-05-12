package typings.awsSdkNodeHttpHandler

import typings.awsSdkTypes.distTypesConnectionPoolMod.ConnectionPool
import typings.node.http2Mod.ClientHttp2Session
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesNodeHttp2ConnectionPoolMod {
  
  @JSImport("@aws-sdk/node-http-handler/dist-types/node-http2-connection-pool", "NodeHttp2ConnectionPool")
  @js.native
  open class NodeHttp2ConnectionPool ()
    extends StObject
       with ConnectionPool[ClientHttp2Session] {
    def this(sessions: js.Array[ClientHttp2Session]) = this()
    
    def contains(session: ClientHttp2Session): Boolean = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_NodeHttp2ConnectionPool: js.Function0[IterableIterator[ClientHttp2Session]] = js.native
    
    def remove(session: ClientHttp2Session): Unit = js.native
    
    /* private */ var sessions: Any = js.native
  }
}
