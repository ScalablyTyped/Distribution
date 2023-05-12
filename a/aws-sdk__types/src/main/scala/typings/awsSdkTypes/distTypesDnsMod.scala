package typings.awsSdkTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDnsMod {
  
  @js.native
  sealed trait HostAddressType extends StObject
  @JSImport("@aws-sdk/types/dist-types/dns", "HostAddressType")
  @js.native
  object HostAddressType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[HostAddressType & String] = js.native
    
    /**
      * IPv4
      */
    @js.native
    sealed trait A
      extends StObject
         with HostAddressType
    /* "A" */ val A: typings.awsSdkTypes.distTypesDnsMod.HostAddressType.A & String = js.native
    
    /**
      * IPv6
      */
    @js.native
    sealed trait AAAA
      extends StObject
         with HostAddressType
    /* "AAAA" */ val AAAA: typings.awsSdkTypes.distTypesDnsMod.HostAddressType.AAAA & String = js.native
  }
  
  trait HostAddress extends StObject {
    
    /**
      * The resolved numerical address represented as a
      * string.
      */
    var address: String
    
    /**
      * The {@link HostAddressType} of the host address.
      */
    var addressType: HostAddressType
    
    /**
      * The host name the {@link address} was resolved from.
      */
    var hostName: String
    
    /**
      * The service record of {@link hostName}.
      */
    var service: js.UndefOr[String] = js.undefined
  }
  object HostAddress {
    
    inline def apply(address: String, addressType: HostAddressType, hostName: String): HostAddress = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], addressType = addressType.asInstanceOf[js.Any], hostName = hostName.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostAddress]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HostAddress] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressType(value: HostAddressType): Self = StObject.set(x, "addressType", value.asInstanceOf[js.Any])
      
      inline def setHostName(value: String): Self = StObject.set(x, "hostName", value.asInstanceOf[js.Any])
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    }
  }
  
  @js.native
  trait HostResolver extends StObject {
    
    /**
      * Empties the cache (if implemented) for a {@link HostResolverArguments.hostName}.
      * If {@link HostResolverArguments.hostName} is not provided, the cache (if
      * implemented) is emptied for all host names.
      * @param args - optional arguments to empty the cache for
      */
    def purgeCache(): Unit = js.native
    def purgeCache(args: HostResolverArguments): Unit = js.native
    
    /**
      * Reports a failure on a {@link HostAddress} so that the cache (if implemented)
      * can accomodate the failure and likely not return the address until it recovers.
      * @param addr - host address to report a failure on
      */
    def reportFailureOnAddress(addr: HostAddress): Unit = js.native
    
    /**
      * Resolves the address(es) for {@link HostResolverArguments} and returns a
      * list of addresses with (most likely) two addresses, one {@link HostAddressType.AAAA}
      * and one {@link HostAddressType.A}. Calls to this function will likely alter
      * the cache (if implemented) so that if there's multiple addresses, a different
      * set will be returned on the next call.
      * In the case of multi-answer, still only a maximum of two records should be
      * returned. The resolver implementation is responsible for caching and rotation
      * of the multiple addresses that get returned.
      * Implementations don't have to explictly call getaddrinfo(), they can use
      * high level abstractions provided in their language runtimes/libraries.
      * @param args - arguments with host name query addresses for
      * @returns promise with a list of {@link HostAddress}
      */
    def resolveAddress(args: HostResolverArguments): js.Promise[js.Array[HostAddress]] = js.native
  }
  
  trait HostResolverArguments extends StObject {
    
    /**
      * The host name to resolve.
      */
    var hostName: String
    
    /**
      * The service record of {@link hostName}.
      */
    var service: js.UndefOr[String] = js.undefined
  }
  object HostResolverArguments {
    
    inline def apply(hostName: String): HostResolverArguments = {
      val __obj = js.Dynamic.literal(hostName = hostName.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostResolverArguments]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HostResolverArguments] (val x: Self) extends AnyVal {
      
      inline def setHostName(value: String): Self = StObject.set(x, "hostName", value.asInstanceOf[js.Any])
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    }
  }
}
