package typings.contractProxyKit.anon

import typings.contractProxyKit.contractProxyKitStrings.sha256
import typings.contractProxyKit.contractProxyKitStrings.sha512
import typings.ethers.typesUtilsDataMod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofpbkdf2 extends StObject {
  
  def apply(_password: BytesLike, _salt: BytesLike, iterations: Double, keylen: Double, algo: sha256 | sha512): String = js.native
  
  @JSName("_")
  def _underscore(
    password: js.typedarray.Uint8Array,
    salt: js.typedarray.Uint8Array,
    iterations: Double,
    keylen: Double,
    algo: sha256 | sha512
  ): BytesLike = js.native
  @JSName("_")
  var _underscore_Original: js.Function5[
    /* password */ js.typedarray.Uint8Array, 
    /* salt */ js.typedarray.Uint8Array, 
    /* iterations */ Double, 
    /* keylen */ Double, 
    /* algo */ sha256 | sha512, 
    BytesLike
  ] = js.native
  
  def lock(): Unit = js.native
  @JSName("lock")
  var lock_Original: js.Function0[Unit] = js.native
  
  def register(
    func: js.Function5[
      /* password */ js.typedarray.Uint8Array, 
      /* salt */ js.typedarray.Uint8Array, 
      /* iterations */ Double, 
      /* keylen */ Double, 
      /* algo */ sha256 | sha512, 
      BytesLike
    ]
  ): Unit = js.native
  @JSName("register")
  var register_Original: js.Function1[
    /* func */ js.Function5[
      /* password */ js.typedarray.Uint8Array, 
      /* salt */ js.typedarray.Uint8Array, 
      /* iterations */ Double, 
      /* keylen */ Double, 
      /* algo */ sha256 | sha512, 
      BytesLike
    ], 
    Unit
  ] = js.native
}
