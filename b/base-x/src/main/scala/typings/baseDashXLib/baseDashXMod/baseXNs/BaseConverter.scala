package typings
package baseDashXLib.baseDashXMod.baseXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BaseConverter extends js.Object {
  def decode(string: java.lang.String): nodeLib.Buffer
  def decodeUnsafe(string: java.lang.String): js.UndefOr[nodeLib.Buffer]
  def encode(buffer: nodeLib.Buffer): java.lang.String
}

