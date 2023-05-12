package typings.contractProxyKit.anon

import typings.contractProxyKit.contractProxyKitStrings.sha256
import typings.contractProxyKit.contractProxyKitStrings.sha512
import typings.ethers.typesUtilsDataMod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofcomputeHmac extends StObject {
  
  def apply(algorithm: sha256 | sha512, _key: BytesLike, _data: BytesLike): String = js.native
  
  @JSName("_")
  def _underscore(algorithm: sha256 | sha512, key: js.typedarray.Uint8Array, data: js.typedarray.Uint8Array): BytesLike = js.native
  @JSName("_")
  var _underscore_Original: js.Function3[
    /* algorithm */ sha256 | sha512, 
    /* key */ js.typedarray.Uint8Array, 
    /* data */ js.typedarray.Uint8Array, 
    BytesLike
  ] = js.native
  
  def lock(): Unit = js.native
  @JSName("lock")
  var lock_Original: js.Function0[Unit] = js.native
  
  def register(
    func: js.Function3[
      /* algorithm */ sha256 | sha512, 
      /* key */ js.typedarray.Uint8Array, 
      /* data */ js.typedarray.Uint8Array, 
      BytesLike
    ]
  ): Unit = js.native
  @JSName("register")
  var register_Original: js.Function1[
    /* func */ js.Function3[
      /* algorithm */ sha256 | sha512, 
      /* key */ js.typedarray.Uint8Array, 
      /* data */ js.typedarray.Uint8Array, 
      BytesLike
    ], 
    Unit
  ] = js.native
}
