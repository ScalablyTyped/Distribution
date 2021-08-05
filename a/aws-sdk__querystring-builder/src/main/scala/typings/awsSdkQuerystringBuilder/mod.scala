package typings.awsSdkQuerystringBuilder

import typings.awsSdkTypes.httpMod.QueryParameterBag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/querystring-builder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildQueryString(query: QueryParameterBag): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildQueryString")(query.asInstanceOf[js.Any]).asInstanceOf[String]
}
