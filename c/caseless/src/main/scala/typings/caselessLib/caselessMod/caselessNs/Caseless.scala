package typings
package caselessLib.caselessMod.caselessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Caseless extends js.Object {
  def del(name: caselessLib.KeyType): scala.Boolean = js.native
  def get(name: caselessLib.KeyType): js.UndefOr[caselessLib.ValueType] = js.native
  def has(name: caselessLib.KeyType): caselessLib.KeyType | caselessLib.caselessLibNumbers.`false` = js.native
  def set(dict: caselessLib.RawDict): scala.Unit = js.native
  def set(name: caselessLib.KeyType, value: caselessLib.ValueType): caselessLib.KeyType | caselessLib.caselessLibNumbers.`false` = js.native
  def set(name: caselessLib.KeyType, value: caselessLib.ValueType, clobber: scala.Boolean): caselessLib.KeyType | caselessLib.caselessLibNumbers.`false` = js.native
  def swap(name: caselessLib.KeyType): scala.Unit = js.native
}

