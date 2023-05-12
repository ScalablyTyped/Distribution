package typings.contractProxyKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofrandomBytes extends StObject {
  
  def apply(length: Double): js.typedarray.Uint8Array = js.native
  
  @JSName("_")
  def _underscore(length: Double): js.typedarray.Uint8Array = js.native
  @JSName("_")
  var _underscore_Original: js.Function1[/* length */ Double, js.typedarray.Uint8Array] = js.native
  
  def lock(): Unit = js.native
  @JSName("lock")
  var lock_Original: js.Function0[Unit] = js.native
  
  def register(func: js.Function1[/* length */ Double, js.typedarray.Uint8Array]): Unit = js.native
  @JSName("register")
  var register_Original: js.Function1[/* func */ js.Function1[/* length */ Double, js.typedarray.Uint8Array], Unit] = js.native
}
