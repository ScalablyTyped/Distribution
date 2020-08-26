package typings.blake2sJs.mod

import typings.blake2sJs.blake2sJsNumbers.`32`
import typings.blake2sJs.blake2sJsNumbers.`64`
import typings.blake2sJs.blake2sJsNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blake2s-js", JSImport.Default)
@js.native
class default () extends BLAKE2s {
  def this(digestLength: Double) = this()
  def this(digestLength: js.UndefOr[scala.Nothing], config: BLAKE2sConfig) = this()
  def this(digestLength: js.UndefOr[scala.Nothing], key: ByteArray) = this()
  def this(digestLength: Double, config: BLAKE2sConfig) = this()
  def this(digestLength: Double, key: ByteArray) = this()
}

/* static members */
@JSImport("blake2s-js", JSImport.Default)
@js.native
object default extends js.Object {
  val blockLength: `64` = js.native
  val digestLength: `32` = js.native
  val keyLength: `32` = js.native
  val personalizationLength: `8` = js.native
  val saltLength: `8` = js.native
}

