package typings.awsSdkEndpointCache

import typings.awsSdkEndpointCache.distTypesEndpointMod.Endpoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEndpointCacheMod {
  
  @JSImport("@aws-sdk/endpoint-cache/dist-types/EndpointCache", "EndpointCache")
  @js.native
  open class EndpointCache protected () extends StObject {
    def this(capacity: Double) = this()
    
    /* private */ val cache: Any = js.native
    
    /**
      * Clears the cache.
      */
    def clear(): Unit = js.native
    
    /**
      * Deletes the value for the given key in the cache.
      *
      * @param {string} key
      */
    def delete(key: String): Unit = js.native
    
    /**
      * Returns un-expired endpoints for the given key.
      *
      * @param key
      * @returns
      */
    def get(key: String): js.UndefOr[js.Array[EndpointWithExpiry]] = js.native
    
    /**
      * Returns an un-expired endpoint for the given key.
      *
      * @param endpointsWithExpiry
      * @returns
      */
    def getEndpoint(key: String): js.UndefOr[String] = js.native
    
    /**
      * Checks whether the key exists in cache.
      *
      * @param {string} key
      * @returns {boolean}
      */
    def has(key: String): Boolean = js.native
    
    /**
      * Stores the endpoints passed for the key in cache.
      * If not defined, uses empty string for the Address in endpoint.
      * If not defined, uses one minute for CachePeriodInMinutes in endpoint.
      * Stores milliseconds elapsed since the UNIX epoch in Expires param based
      * on value provided in CachePeriodInMinutes.
      *
      * @param key
      * @param endpoints
      */
    def set(key: String, endpoints: js.Array[Endpoint]): Unit = js.native
  }
  
  /* Inlined parent std.Pick<@aws-sdk/endpoint-cache.@aws-sdk/endpoint-cache/dist-types/Endpoint.Endpoint, 'Address'> */
  trait EndpointWithExpiry extends StObject {
    
    var Address: String
    
    var Expires: Double
  }
  object EndpointWithExpiry {
    
    inline def apply(Address: String, Expires: Double): EndpointWithExpiry = {
      val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], Expires = Expires.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointWithExpiry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EndpointWithExpiry] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: String): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
      
      inline def setExpires(value: Double): Self = StObject.set(x, "Expires", value.asInstanceOf[js.Any])
    }
  }
}
