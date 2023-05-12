package typings.contractProxyKit.anon

import typings.ethers.typesUtilsDataMod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofscryptSync extends StObject {
  
  def apply(_passwd: BytesLike, _salt: BytesLike, N: Double, r: Double, p: Double, dkLen: Double): String = js.native
  
  @JSName("_")
  def _underscore(
    passwd: js.typedarray.Uint8Array,
    salt: js.typedarray.Uint8Array,
    N: Double,
    r: Double,
    p: Double,
    dkLen: Double
  ): js.typedarray.Uint8Array = js.native
  @JSName("_")
  var _underscore_Original: js.Function6[
    /* passwd */ js.typedarray.Uint8Array, 
    /* salt */ js.typedarray.Uint8Array, 
    /* N */ Double, 
    /* r */ Double, 
    /* p */ Double, 
    /* dkLen */ Double, 
    js.typedarray.Uint8Array
  ] = js.native
  
  def lock(): Unit = js.native
  @JSName("lock")
  var lock_Original: js.Function0[Unit] = js.native
  
  def register(
    func: js.Function6[
      /* passwd */ js.typedarray.Uint8Array, 
      /* salt */ js.typedarray.Uint8Array, 
      /* N */ Double, 
      /* r */ Double, 
      /* p */ Double, 
      /* dkLen */ Double, 
      BytesLike
    ]
  ): Unit = js.native
  @JSName("register")
  var register_Original: js.Function1[
    /* func */ js.Function6[
      /* passwd */ js.typedarray.Uint8Array, 
      /* salt */ js.typedarray.Uint8Array, 
      /* N */ Double, 
      /* r */ Double, 
      /* p */ Double, 
      /* dkLen */ Double, 
      BytesLike
    ], 
    Unit
  ] = js.native
}
