package typings.bip174

import typings.bip174.interfacesMod.KeyValue
import typings.bip174.interfacesMod.PorCommitment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object porCommitmentMod {
  
  @JSImport("bip174/src/lib/converter/input/porCommitment", "canAdd")
  @js.native
  def canAdd(currentData: js.Any, newData: js.Any): Boolean = js.native
  
  @JSImport("bip174/src/lib/converter/input/porCommitment", "check")
  @js.native
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.PorCommitment */ Boolean = js.native
  
  @JSImport("bip174/src/lib/converter/input/porCommitment", "decode")
  @js.native
  def decode(keyVal: KeyValue): PorCommitment = js.native
  
  @JSImport("bip174/src/lib/converter/input/porCommitment", "encode")
  @js.native
  def encode(data: PorCommitment): KeyValue = js.native
  
  @JSImport("bip174/src/lib/converter/input/porCommitment", "expected")
  @js.native
  val expected: /* "string" */ String = js.native
}
