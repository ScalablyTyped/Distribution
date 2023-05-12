package typings.contractProxyKit.anon

import typings.ethers.typesUtilsDataMod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofkeccak256 extends StObject {
  
  def apply(_data: BytesLike): String = js.native
  
  @JSName("_")
  def _underscore(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  @JSName("_")
  var _underscore_Original: js.Function1[/* data */ js.typedarray.Uint8Array, js.typedarray.Uint8Array] = js.native
  
  def lock(): Unit = js.native
  @JSName("lock")
  var lock_Original: js.Function0[Unit] = js.native
  
  def register(func: js.Function1[/* data */ js.typedarray.Uint8Array, BytesLike]): Unit = js.native
  @JSName("register")
  var register_Original: js.Function1[/* func */ js.Function1[/* data */ js.typedarray.Uint8Array, BytesLike], Unit] = js.native
}
