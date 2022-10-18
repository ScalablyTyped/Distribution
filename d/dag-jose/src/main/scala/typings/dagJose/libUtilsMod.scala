package typings.dagJose

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMod {
  
  @JSImport("dag-jose/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromBase64url(s: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64url")(s.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def toBase64url(b: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toBase64url")(b.asInstanceOf[js.Any]).asInstanceOf[String]
}
