package typings.awsSdkSignatureV4

import typings.awsSdkTypes.distTypesHttpMod.HttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGetCanonicalQueryMod {
  
  @JSImport("@aws-sdk/signature-v4/dist-types/getCanonicalQuery", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCanonicalQuery(hasQuery: HttpRequest): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCanonicalQuery")(hasQuery.asInstanceOf[js.Any]).asInstanceOf[String]
}
