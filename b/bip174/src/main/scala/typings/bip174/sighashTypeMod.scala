package typings.bip174

import typings.bip174.bip174Strings.number
import typings.bip174.interfacesMod.KeyValue
import typings.bip174.interfacesMod.SighashType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip174/src/lib/converter/input/sighashType", JSImport.Namespace)
@js.native
object sighashTypeMod extends js.Object {
  val expected: number = js.native
  def canAdd(currentData: js.Any, newData: js.Any): Boolean = js.native
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.SighashType */ Boolean = js.native
  def decode(keyVal: KeyValue): SighashType = js.native
  def encode(data: SighashType): KeyValue = js.native
}

