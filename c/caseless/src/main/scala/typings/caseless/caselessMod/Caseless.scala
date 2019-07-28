package typings.caseless.caselessMod

import typings.caseless.KeyType
import typings.caseless.RawDict
import typings.caseless.ValueType
import typings.caseless.caselessNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Caseless extends js.Object {
  def del(name: KeyType): Boolean = js.native
  def get(name: KeyType): js.UndefOr[ValueType] = js.native
  def has(name: KeyType): KeyType | `false` = js.native
  def set(dict: RawDict): Unit = js.native
  def set(name: KeyType, value: ValueType): KeyType | `false` = js.native
  def set(name: KeyType, value: ValueType, clobber: Boolean): KeyType | `false` = js.native
  def swap(name: KeyType): Unit = js.native
}

