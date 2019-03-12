package typings
package caselessLib.caselessMod.caselessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Httpified extends js.Object {
  var headers: caselessLib.RawDict = js.native
  def getHeader(name: caselessLib.KeyType): js.UndefOr[caselessLib.ValueType] = js.native
  def hasHeader(name: caselessLib.KeyType): caselessLib.KeyType | caselessLib.caselessLibNumbers.`false` = js.native
  def removeHeader(name: caselessLib.KeyType): scala.Boolean = js.native
  def setHeader(dict: caselessLib.RawDict): scala.Unit = js.native
  def setHeader(name: caselessLib.KeyType, value: caselessLib.ValueType): caselessLib.KeyType | caselessLib.caselessLibNumbers.`false` = js.native
  def setHeader(name: caselessLib.KeyType, value: caselessLib.ValueType, clobber: scala.Boolean): caselessLib.KeyType | caselessLib.caselessLibNumbers.`false` = js.native
}

