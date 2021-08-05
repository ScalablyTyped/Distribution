package typings.awsSdkUtilUriEscape

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object escapeUriMod {
  
  @JSImport("@aws-sdk/util-uri-escape/dist/cjs/escape-uri", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def escapeUri(uri: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeUri")(uri.asInstanceOf[js.Any]).asInstanceOf[String]
}
