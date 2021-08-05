package typings.awsSdkUtilUriEscape

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/util-uri-escape", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def escapeUri(uri: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeUri")(uri.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def escapeUriPath(uri: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeUriPath")(uri.asInstanceOf[js.Any]).asInstanceOf[String]
}
