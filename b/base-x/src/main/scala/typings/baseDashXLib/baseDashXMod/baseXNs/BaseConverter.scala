package typings
package baseDashXLib.baseDashXMod.baseXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseConverter extends js.Object {
  def decode(string: java.lang.String): bufferLib.bufferMod.Buffer
  def decodeUnsafe(string: java.lang.String): js.UndefOr[bufferLib.bufferMod.Buffer]
  def encode(buffer: bufferLib.bufferMod.Buffer): java.lang.String
}

