package typings.awsSdkUtilUriEscape

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object escapeUriPathMod {
  
  @JSImport("@aws-sdk/util-uri-escape/dist-types/escape-uri-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def escapeUriPath(uri: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeUriPath")(uri.asInstanceOf[js.Any]).asInstanceOf[String]
}
