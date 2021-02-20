package typings.bip174

import typings.bip174.interfacesMod.KeyValue
import typings.bip174.interfacesMod.PartialSig
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object partialSigMod {
  
  @JSImport("bip174/src/lib/converter/input/partialSig", "canAddToArray")
  @js.native
  def canAddToArray(array: js.Array[PartialSig], item: PartialSig, dupeSet: Set[String]): Boolean = js.native
  
  @JSImport("bip174/src/lib/converter/input/partialSig", "check")
  @js.native
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.PartialSig */ Boolean = js.native
  
  @JSImport("bip174/src/lib/converter/input/partialSig", "decode")
  @js.native
  def decode(keyVal: KeyValue): PartialSig = js.native
  
  @JSImport("bip174/src/lib/converter/input/partialSig", "encode")
  @js.native
  def encode(pSig: PartialSig): KeyValue = js.native
  
  @JSImport("bip174/src/lib/converter/input/partialSig", "expected")
  @js.native
  val expected: /* "{ pubkey: Buffer; signature: Buffer; }" */ String = js.native
}
