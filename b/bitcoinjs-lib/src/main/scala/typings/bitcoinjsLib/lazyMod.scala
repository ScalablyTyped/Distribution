package typings.bitcoinjsLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lazyMod {
  
  @JSImport("bitcoinjs-lib/src/payments/lazy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def prop(`object`: js.Object, name: String, f: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("prop")(`object`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def value[T](f: js.Function0[T]): js.Function0[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("value")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function0[T]]
}
