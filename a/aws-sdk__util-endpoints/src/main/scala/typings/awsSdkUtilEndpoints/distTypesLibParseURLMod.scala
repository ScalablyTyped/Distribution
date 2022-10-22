package typings.awsSdkUtilEndpoints

import typings.awsSdkTypes.distTypesEndpointMod.EndpointURL
import typings.awsSdkTypes.distTypesHttpMod.Endpoint
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibParseURLMod {
  
  @JSImport("@aws-sdk/util-endpoints/dist-types/lib/parseURL", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseURL(value: String): EndpointURL | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseURL")(value.asInstanceOf[js.Any]).asInstanceOf[EndpointURL | Null]
  inline def parseURL(value: Endpoint): EndpointURL | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseURL")(value.asInstanceOf[js.Any]).asInstanceOf[EndpointURL | Null]
  inline def parseURL(value: URL): EndpointURL | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseURL")(value.asInstanceOf[js.Any]).asInstanceOf[EndpointURL | Null]
}
