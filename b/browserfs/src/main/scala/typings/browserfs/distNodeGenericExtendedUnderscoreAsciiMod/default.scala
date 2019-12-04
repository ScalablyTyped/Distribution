package typings.browserfs.distNodeGenericExtendedUnderscoreAsciiMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/generic/extended_ascii", JSImport.Default)
@js.native
class default () extends ExtendedASCII

/* static members */
@JSImport("browserfs/dist/node/generic/extended_ascii", JSImport.Default)
@js.native
object default extends js.Object {
  var extendedChars: js.Any = js.native
  def byte2str(buff: Buffer): String = js.native
  def byteLength(str: String): Double = js.native
  def str2byte(str: String, buf: Buffer): Double = js.native
}

