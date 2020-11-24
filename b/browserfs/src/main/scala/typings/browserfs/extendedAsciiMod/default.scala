package typings.browserfs.extendedAsciiMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("browserfs/dist/node/generic/extended_ascii", JSImport.Default)
@js.native
class default () extends ExtendedASCII
/* static members */
@JSImport("browserfs/dist/node/generic/extended_ascii", JSImport.Default)
@js.native
object default extends js.Object {
  
  def byte2str(buff: Buffer): String = js.native
  
  def byteLength(str: String): Double = js.native
  
  var extendedChars: js.Any = js.native
  
  def str2byte(str: String, buf: Buffer): Double = js.native
}
