package typings.caseless.caselessMod

import typings.caseless.KeyType
import typings.caseless.RawDict
import typings.caseless.ValueType
import typings.caseless.caselessNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Httpified extends js.Object {
  var headers: RawDict = js.native
  def getHeader(name: KeyType): js.UndefOr[ValueType] = js.native
  def hasHeader(name: KeyType): KeyType | `false` = js.native
  def removeHeader(name: KeyType): Boolean = js.native
  def setHeader(dict: RawDict): Unit = js.native
  def setHeader(name: KeyType, value: ValueType): KeyType | `false` = js.native
  def setHeader(name: KeyType, value: ValueType, clobber: Boolean): KeyType | `false` = js.native
}

