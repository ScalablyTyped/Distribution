package typings.awsSdkTypes

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkTypes.anon.AuthSchemes
import typings.std.Record
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object endpointMod {
  
  @js.native
  sealed trait EndpointURLScheme extends StObject
  @JSImport("@aws-sdk/types/dist-types/endpoint", "EndpointURLScheme")
  @js.native
  object EndpointURLScheme extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EndpointURLScheme & String] = js.native
    
    @js.native
    sealed trait HTTP
      extends StObject
         with EndpointURLScheme
    /* "http" */ val HTTP: typings.awsSdkTypes.endpointMod.EndpointURLScheme.HTTP & String = js.native
    
    @js.native
    sealed trait HTTPS
      extends StObject
         with EndpointURLScheme
    /* "https" */ val HTTPS: typings.awsSdkTypes.endpointMod.EndpointURLScheme.HTTPS & String = js.native
  }
  
  trait EndpointARN extends StObject {
    
    var accountId: String
    
    var partition: String
    
    var region: String
    
    var resourceId: js.Array[String]
    
    var service: String
  }
  object EndpointARN {
    
    inline def apply(
      accountId: String,
      partition: String,
      region: String,
      resourceId: js.Array[String],
      service: String
    ): EndpointARN = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointARN]
    }
    
    extension [Self <: EndpointARN](x: Self) {
      
      inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      inline def setPartition(value: String): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setResourceId(value: js.Array[String]): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
      
      inline def setResourceIdVarargs(value: String*): Self = StObject.set(x, "resourceId", js.Array(value*))
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    }
  }
  
  type EndpointObjectProperty = String | Boolean | StringDictionary[Any] | js.Array[Any]
  
  type EndpointParameters = StringDictionary[js.UndefOr[String | Boolean]]
  
  trait EndpointPartition extends StObject {
    
    var dnsSuffix: String
    
    var dualStackDnsSuffix: String
    
    var name: String
    
    var supportsDualStack: Boolean
    
    var supportsFIPS: Boolean
  }
  object EndpointPartition {
    
    inline def apply(
      dnsSuffix: String,
      dualStackDnsSuffix: String,
      name: String,
      supportsDualStack: Boolean,
      supportsFIPS: Boolean
    ): EndpointPartition = {
      val __obj = js.Dynamic.literal(dnsSuffix = dnsSuffix.asInstanceOf[js.Any], dualStackDnsSuffix = dualStackDnsSuffix.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], supportsDualStack = supportsDualStack.asInstanceOf[js.Any], supportsFIPS = supportsFIPS.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointPartition]
    }
    
    extension [Self <: EndpointPartition](x: Self) {
      
      inline def setDnsSuffix(value: String): Self = StObject.set(x, "dnsSuffix", value.asInstanceOf[js.Any])
      
      inline def setDualStackDnsSuffix(value: String): Self = StObject.set(x, "dualStackDnsSuffix", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSupportsDualStack(value: Boolean): Self = StObject.set(x, "supportsDualStack", value.asInstanceOf[js.Any])
      
      inline def setSupportsFIPS(value: Boolean): Self = StObject.set(x, "supportsFIPS", value.asInstanceOf[js.Any])
    }
  }
  
  trait EndpointURL extends StObject {
    
    /**
      * The authority is the host and optional port component of the URL.
      */
    var authority: String
    
    /**
      * A boolean indicating whether the authority is an IP address.
      */
    var isIp: Boolean
    
    /**
      * The parsed path segment of the URL.
      * This value is guranteed to start and end with a "/".
      */
    var normalizedPath: String
    
    /**
      * The parsed path segment of the URL.
      * This value is as-is as provided by the user.
      */
    var path: String
    
    /**
      * The URL scheme such as http or https.
      */
    var scheme: EndpointURLScheme
  }
  object EndpointURL {
    
    inline def apply(authority: String, isIp: Boolean, normalizedPath: String, path: String, scheme: EndpointURLScheme): EndpointURL = {
      val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any], isIp = isIp.asInstanceOf[js.Any], normalizedPath = normalizedPath.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointURL]
    }
    
    extension [Self <: EndpointURL](x: Self) {
      
      inline def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
      
      inline def setIsIp(value: Boolean): Self = StObject.set(x, "isIp", value.asInstanceOf[js.Any])
      
      inline def setNormalizedPath(value: String): Self = StObject.set(x, "normalizedPath", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setScheme(value: EndpointURLScheme): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    }
  }
  
  trait EndpointV2 extends StObject {
    
    var headers: js.UndefOr[Record[String, js.Array[String]]] = js.undefined
    
    var properties: js.UndefOr[AuthSchemes & (Record[String, EndpointObjectProperty])] = js.undefined
    
    var url: URL
  }
  object EndpointV2 {
    
    inline def apply(url: URL): EndpointV2 = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointV2]
    }
    
    extension [Self <: EndpointV2](x: Self) {
      
      inline def setHeaders(value: Record[String, js.Array[String]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setProperties(value: AuthSchemes & (Record[String, EndpointObjectProperty])): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setUrl(value: URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
