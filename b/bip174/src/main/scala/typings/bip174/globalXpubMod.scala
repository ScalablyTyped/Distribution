package typings.bip174

import typings.bip174.interfacesMod.GlobalXpub
import typings.bip174.interfacesMod.KeyValue
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalXpubMod {
  
  @JSImport("bip174/src/lib/converter/global/globalXpub", "canAddToArray")
  @js.native
  def canAddToArray(array: js.Array[GlobalXpub], item: GlobalXpub, dupeSet: Set[String]): Boolean = js.native
  
  @JSImport("bip174/src/lib/converter/global/globalXpub", "check")
  @js.native
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.GlobalXpub */ Boolean = js.native
  
  @JSImport("bip174/src/lib/converter/global/globalXpub", "decode")
  @js.native
  def decode(keyVal: KeyValue): GlobalXpub = js.native
  
  @JSImport("bip174/src/lib/converter/global/globalXpub", "encode")
  @js.native
  def encode(data: GlobalXpub): KeyValue = js.native
  
  @JSImport("bip174/src/lib/converter/global/globalXpub", "expected")
  @js.native
  val expected: /* "{ masterFingerprint: Buffer; extendedPubkey: Buffer; path: string; }" */ String = js.native
}
