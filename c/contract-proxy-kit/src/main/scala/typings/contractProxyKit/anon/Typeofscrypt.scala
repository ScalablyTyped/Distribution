package typings.contractProxyKit.anon

import typings.ethers.typesCryptoScryptMod.ProgressCallback
import typings.ethers.typesUtilsDataMod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofscrypt extends StObject {
  
  def apply(_passwd: BytesLike, _salt: BytesLike, N: Double, r: Double, p: Double, dkLen: Double): js.Promise[String] = js.native
  def apply(
    _passwd: BytesLike,
    _salt: BytesLike,
    N: Double,
    r: Double,
    p: Double,
    dkLen: Double,
    progress: ProgressCallback
  ): js.Promise[String] = js.native
  
  @JSName("_")
  def _underscore(
    passwd: js.typedarray.Uint8Array,
    salt: js.typedarray.Uint8Array,
    N: Double,
    r: Double,
    p: Double,
    dkLen: Double
  ): js.Promise[js.typedarray.Uint8Array] = js.native
  @JSName("_")
  def _underscore(
    passwd: js.typedarray.Uint8Array,
    salt: js.typedarray.Uint8Array,
    N: Double,
    r: Double,
    p: Double,
    dkLen: Double,
    onProgress: ProgressCallback
  ): js.Promise[js.typedarray.Uint8Array] = js.native
  @JSName("_")
  var _underscore_Original: js.Function7[
    /* passwd */ js.typedarray.Uint8Array, 
    /* salt */ js.typedarray.Uint8Array, 
    /* N */ Double, 
    /* r */ Double, 
    /* p */ Double, 
    /* dkLen */ Double, 
    /* onProgress */ js.UndefOr[ProgressCallback], 
    js.Promise[js.typedarray.Uint8Array]
  ] = js.native
  
  def lock(): Unit = js.native
  @JSName("lock")
  var lock_Original: js.Function0[Unit] = js.native
  
  def register(
    func: js.Function7[
      /* passwd */ js.typedarray.Uint8Array, 
      /* salt */ js.typedarray.Uint8Array, 
      /* N */ Double, 
      /* r */ Double, 
      /* p */ Double, 
      /* dkLen */ Double, 
      /* progress */ js.UndefOr[ProgressCallback], 
      js.Promise[BytesLike]
    ]
  ): Unit = js.native
  @JSName("register")
  var register_Original: js.Function1[
    /* func */ js.Function7[
      /* passwd */ js.typedarray.Uint8Array, 
      /* salt */ js.typedarray.Uint8Array, 
      /* N */ Double, 
      /* r */ Double, 
      /* p */ Double, 
      /* dkLen */ Double, 
      /* progress */ js.UndefOr[ProgressCallback], 
      js.Promise[BytesLike]
    ], 
    Unit
  ] = js.native
}
