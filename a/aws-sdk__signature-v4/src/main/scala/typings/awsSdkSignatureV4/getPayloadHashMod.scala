package typings.awsSdkSignatureV4

import typings.awsSdkTypes.cryptoMod.HashConstructor
import typings.awsSdkTypes.httpMod.HttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPayloadHashMod {
  
  @JSImport("@aws-sdk/signature-v4/dist-types/getPayloadHash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPayloadHash(hasHeadersBody: HttpRequest, hashConstructor: HashConstructor): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPayloadHash")(hasHeadersBody.asInstanceOf[js.Any], hashConstructor.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
