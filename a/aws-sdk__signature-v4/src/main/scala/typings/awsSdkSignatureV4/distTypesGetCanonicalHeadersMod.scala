package typings.awsSdkSignatureV4

import typings.awsSdkTypes.distTypesHttpMod.HeaderBag
import typings.awsSdkTypes.distTypesHttpMod.HttpRequest
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGetCanonicalHeadersMod {
  
  @JSImport("@aws-sdk/signature-v4/dist-types/getCanonicalHeaders", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCanonicalHeaders(param0: HttpRequest): HeaderBag = ^.asInstanceOf[js.Dynamic].applyDynamic("getCanonicalHeaders")(param0.asInstanceOf[js.Any]).asInstanceOf[HeaderBag]
  inline def getCanonicalHeaders(param0: HttpRequest, unsignableHeaders: Unit, signableHeaders: Set[String]): HeaderBag = (^.asInstanceOf[js.Dynamic].applyDynamic("getCanonicalHeaders")(param0.asInstanceOf[js.Any], unsignableHeaders.asInstanceOf[js.Any], signableHeaders.asInstanceOf[js.Any])).asInstanceOf[HeaderBag]
  inline def getCanonicalHeaders(param0: HttpRequest, unsignableHeaders: Set[String]): HeaderBag = (^.asInstanceOf[js.Dynamic].applyDynamic("getCanonicalHeaders")(param0.asInstanceOf[js.Any], unsignableHeaders.asInstanceOf[js.Any])).asInstanceOf[HeaderBag]
  inline def getCanonicalHeaders(param0: HttpRequest, unsignableHeaders: Set[String], signableHeaders: Set[String]): HeaderBag = (^.asInstanceOf[js.Dynamic].applyDynamic("getCanonicalHeaders")(param0.asInstanceOf[js.Any], unsignableHeaders.asInstanceOf[js.Any], signableHeaders.asInstanceOf[js.Any])).asInstanceOf[HeaderBag]
}
