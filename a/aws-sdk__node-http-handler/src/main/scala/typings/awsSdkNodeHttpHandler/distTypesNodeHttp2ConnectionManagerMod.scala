package typings.awsSdkNodeHttpHandler

import typings.awsSdkTypes.distTypesConnectionConfigMod.ConnectConfiguration
import typings.awsSdkTypes.distTypesConnectionManagerMod.ConnectionManager
import typings.awsSdkTypes.distTypesConnectionManagerMod.ConnectionManagerConfiguration
import typings.awsSdkTypes.distTypesTransferMod.RequestContext
import typings.node.http2Mod.ClientHttp2Session
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesNodeHttp2ConnectionManagerMod {
  
  @JSImport("@aws-sdk/node-http-handler/dist-types/node-http2-connection-manager", "NodeHttp2ConnectionManager")
  @js.native
  open class NodeHttp2ConnectionManager protected ()
    extends StObject
       with ConnectionManager[ClientHttp2Session] {
    def this(config: ConnectionManagerConfiguration) = this()
    
    /* private */ var config: Any = js.native
    
    /**
      * Delete a session from the connection pool.
      * @param authority The authority of the session to delete.
      * @param session The session to delete.
      */
    def deleteSession(authority: String, session: ClientHttp2Session): Unit = js.native
    
    /**
      * Destroys the connection manager. All connections will be closed.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* private */ var getUrlString: Any = js.native
    
    /**
      * Retrieves a connection from the connection pool if available,
      * otherwise establish a new connection
      */
    /* CompleteClass */
    override def lease(requestContext: RequestContext, connectionConfiguration: ConnectConfiguration): ClientHttp2Session = js.native
    
    /**
      * Releases the connection back to the pool making it potentially
      * re-usable by other requests.
      */
    /* CompleteClass */
    override def release(requestContext: RequestContext, connection: ClientHttp2Session): Unit = js.native
    
    /* private */ val sessionCache: Any = js.native
    
    def setDisableConcurrentStreams(disableConcurrentStreams: Boolean): Unit = js.native
    
    def setMaxConcurrentStreams(maxConcurrentStreams: Double): Unit = js.native
  }
}
