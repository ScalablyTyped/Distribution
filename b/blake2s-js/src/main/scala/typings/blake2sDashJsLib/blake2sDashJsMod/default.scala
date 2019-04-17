package typings
package blake2sDashJsLib.blake2sDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blake2s-js", JSImport.Default)
@js.native
class default () extends BLAKE2s {
  def this(digestLength: scala.Double) = this()
  def this(digestLength: js.UndefOr[scala.Nothing], config: BLAKE2sConfig) = this()
  def this(digestLength: js.UndefOr[scala.Nothing], key: ByteArray) = this()
  def this(digestLength: scala.Double, config: BLAKE2sConfig) = this()
  def this(digestLength: scala.Double, key: ByteArray) = this()
}

/* static members */
@JSImport("blake2s-js", JSImport.Default)
@js.native
object default extends js.Object {
  val blockLength: blake2sDashJsLib.blake2sDashJsLibNumbers.`64` = js.native
  val digestLength: blake2sDashJsLib.blake2sDashJsLibNumbers.`32` = js.native
  val keyLength: blake2sDashJsLib.blake2sDashJsLibNumbers.`32` = js.native
  val personalizationLength: blake2sDashJsLib.blake2sDashJsLibNumbers.`8` = js.native
  val saltLength: blake2sDashJsLib.blake2sDashJsLibNumbers.`8` = js.native
}

