package typings.awsSdkQuerystringParser

import typings.awsSdkTypes.distTypesHttpMod.QueryParameterBag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/querystring-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseQueryString(querystring: String): QueryParameterBag = ^.asInstanceOf[js.Dynamic].applyDynamic("parseQueryString")(querystring.asInstanceOf[js.Any]).asInstanceOf[QueryParameterBag]
}
