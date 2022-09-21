package typings.awsSdkSignatureV4

import typings.awsSdkTypes.httpMod.HttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prepareRequestMod {
  
  @JSImport("@aws-sdk/signature-v4/dist-types/prepareRequest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def prepareRequest(request: HttpRequest): HttpRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareRequest")(request.asInstanceOf[js.Any]).asInstanceOf[HttpRequest]
}
