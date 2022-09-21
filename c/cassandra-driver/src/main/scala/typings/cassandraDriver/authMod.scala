package typings.cassandraDriver

import typings.cassandraDriver.anon.AuthorizationId
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authMod {
  
  object auth {
    
    @JSImport("cassandra-driver/lib/auth", "auth.DseGssapiAuthProvider")
    @js.native
    open class DseGssapiAuthProvider ()
      extends StObject
         with AuthProvider {
      def this(gssOptions: AuthorizationId) = this()
      
      /* CompleteClass */
      override def newAuthenticator(endpoint: String, name: String): Authenticator = js.native
    }
    
    @JSImport("cassandra-driver/lib/auth", "auth.DsePlainTextAuthProvider")
    @js.native
    open class DsePlainTextAuthProvider protected ()
      extends StObject
         with AuthProvider {
      def this(username: String, password: String) = this()
      def this(username: String, password: String, authorizationId: String) = this()
      
      /* CompleteClass */
      override def newAuthenticator(endpoint: String, name: String): Authenticator = js.native
    }
    
    @JSImport("cassandra-driver/lib/auth", "auth.PlainTextAuthProvider")
    @js.native
    open class PlainTextAuthProvider protected ()
      extends StObject
         with AuthProvider {
      def this(username: String, password: String) = this()
      
      /* CompleteClass */
      override def newAuthenticator(endpoint: String, name: String): Authenticator = js.native
    }
    
    trait AuthProvider extends StObject {
      
      def newAuthenticator(endpoint: String, name: String): Authenticator
    }
    object AuthProvider {
      
      inline def apply(newAuthenticator: (String, String) => Authenticator): AuthProvider = {
        val __obj = js.Dynamic.literal(newAuthenticator = js.Any.fromFunction2(newAuthenticator))
        __obj.asInstanceOf[AuthProvider]
      }
      
      extension [Self <: AuthProvider](x: Self) {
        
        inline def setNewAuthenticator(value: (String, String) => Authenticator): Self = StObject.set(x, "newAuthenticator", js.Any.fromFunction2(value))
      }
    }
    
    @js.native
    trait Authenticator extends StObject {
      
      def evaluateChallenge(challenge: Buffer, callback: js.Function): Unit = js.native
      
      def initialResponse(callback: js.Function): Unit = js.native
      
      def onAuthenticationSuccess(): Unit = js.native
      def onAuthenticationSuccess(token: Buffer): Unit = js.native
    }
  }
}
