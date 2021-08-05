package typings.braintreeSanitizeUrl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@braintree/sanitize-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sanitizeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeUrl")().asInstanceOf[String]
  inline def sanitizeUrl(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeUrl")(url.asInstanceOf[js.Any]).asInstanceOf[String]
}
