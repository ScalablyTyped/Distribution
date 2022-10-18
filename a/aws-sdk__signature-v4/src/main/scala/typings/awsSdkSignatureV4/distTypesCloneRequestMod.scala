package typings.awsSdkSignatureV4

import typings.awsSdkTypes.distTypesHttpMod.HttpRequest
import typings.awsSdkTypes.distTypesHttpMod.QueryParameterBag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCloneRequestMod {
  
  @JSImport("@aws-sdk/signature-v4/dist-types/cloneRequest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cloneQuery(query: QueryParameterBag): QueryParameterBag = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneQuery")(query.asInstanceOf[js.Any]).asInstanceOf[QueryParameterBag]
  
  inline def cloneRequest(hasHeadersQueryRest: HttpRequest): HttpRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneRequest")(hasHeadersQueryRest.asInstanceOf[js.Any]).asInstanceOf[HttpRequest]
}
