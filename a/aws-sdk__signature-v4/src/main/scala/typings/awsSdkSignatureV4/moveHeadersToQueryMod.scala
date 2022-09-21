package typings.awsSdkSignatureV4

import typings.awsSdkSignatureV4.anon.HttpRequestqueryQueryPara
import typings.awsSdkSignatureV4.anon.UnhoistableHeaders
import typings.awsSdkTypes.httpMod.HttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moveHeadersToQueryMod {
  
  @JSImport("@aws-sdk/signature-v4/dist-types/moveHeadersToQuery", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def moveHeadersToQuery(request: HttpRequest): HttpRequestqueryQueryPara = ^.asInstanceOf[js.Dynamic].applyDynamic("moveHeadersToQuery")(request.asInstanceOf[js.Any]).asInstanceOf[HttpRequestqueryQueryPara]
  inline def moveHeadersToQuery(request: HttpRequest, options: UnhoistableHeaders): HttpRequestqueryQueryPara = (^.asInstanceOf[js.Dynamic].applyDynamic("moveHeadersToQuery")(request.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HttpRequestqueryQueryPara]
}
