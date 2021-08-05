package typings.b64Lite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("b64-lite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def atob(encoded: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("atob")(encoded.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def btoa(source: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("btoa")(source.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def fromBase64(encoded: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64")(encoded.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toBase64(source: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toBase64")(source.asInstanceOf[js.Any]).asInstanceOf[String]
}
