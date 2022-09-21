package typings.byteAccess

import typings.byteAccess.anon.Get
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("byte-access", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(buf: js.typedarray.Uint8Array): Get = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(buf.asInstanceOf[js.Any]).asInstanceOf[Get]
  inline def default(buf: Uint8ArrayList): Get = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(buf.asInstanceOf[js.Any]).asInstanceOf[Get]
}
