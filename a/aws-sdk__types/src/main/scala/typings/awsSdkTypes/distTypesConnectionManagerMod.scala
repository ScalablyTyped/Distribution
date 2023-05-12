package typings.awsSdkTypes

import typings.awsSdkTypes.distTypesConnectionConfigMod.ConnectConfiguration
import typings.awsSdkTypes.distTypesTransferMod.RequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesConnectionManagerMod {
  
  trait ConnectionManager[T] extends StObject {
    
    /**
      * Destroys the connection manager. All connections will be closed.
      */
    def destroy(): Unit
    
    /**
      * Retrieves a connection from the connection pool if available,
      * otherwise establish a new connection
      */
    def lease(requestContext: RequestContext, connectionConfiguration: ConnectConfiguration): T
    
    /**
      * Releases the connection back to the pool making it potentially
      * re-usable by other requests.
      */
    def release(requestContext: RequestContext, connection: T): Unit
  }
  object ConnectionManager {
    
    inline def apply[T](
      destroy: () => Unit,
      lease: (RequestContext, ConnectConfiguration) => T,
      release: (RequestContext, T) => Unit
    ): ConnectionManager[T] = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), lease = js.Any.fromFunction2(lease), release = js.Any.fromFunction2(release))
      __obj.asInstanceOf[ConnectionManager[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectionManager[?], T] (val x: Self & ConnectionManager[T]) extends AnyVal {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setLease(value: (RequestContext, ConnectConfiguration) => T): Self = StObject.set(x, "lease", js.Any.fromFunction2(value))
      
      inline def setRelease(value: (RequestContext, T) => Unit): Self = StObject.set(x, "release", js.Any.fromFunction2(value))
    }
  }
  
  trait ConnectionManagerConfiguration extends StObject {
    
    /**
      * Disables concurrent requests per connection.
      */
    var disableConcurrency: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Maximum number of allowed concurrent requests per connection.
      */
    var maxConcurrency: js.UndefOr[Double] = js.undefined
  }
  object ConnectionManagerConfiguration {
    
    inline def apply(): ConnectionManagerConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionManagerConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectionManagerConfiguration] (val x: Self) extends AnyVal {
      
      inline def setDisableConcurrency(value: Boolean): Self = StObject.set(x, "disableConcurrency", value.asInstanceOf[js.Any])
      
      inline def setDisableConcurrencyUndefined: Self = StObject.set(x, "disableConcurrency", js.undefined)
      
      inline def setMaxConcurrency(value: Double): Self = StObject.set(x, "maxConcurrency", value.asInstanceOf[js.Any])
      
      inline def setMaxConcurrencyUndefined: Self = StObject.set(x, "maxConcurrency", js.undefined)
    }
  }
}
