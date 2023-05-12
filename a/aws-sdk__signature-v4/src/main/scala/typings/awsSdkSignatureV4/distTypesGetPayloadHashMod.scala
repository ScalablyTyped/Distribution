package typings.awsSdkSignatureV4

import typings.awsSdkTypes.distTypesChecksumMod.ChecksumConstructor
import typings.awsSdkTypes.distTypesCryptoMod.HashConstructor
import typings.awsSdkTypes.distTypesHttpMod.HttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGetPayloadHashMod {
  
  @JSImport("@aws-sdk/signature-v4/dist-types/getPayloadHash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPayloadHash(param0: HttpRequest, hashConstructor: ChecksumConstructor): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPayloadHash")(param0.asInstanceOf[js.Any], hashConstructor.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def getPayloadHash(param0: HttpRequest, hashConstructor: HashConstructor): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPayloadHash")(param0.asInstanceOf[js.Any], hashConstructor.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
