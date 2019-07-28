package typings.cipherDashBase.cipherDashBaseMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CipherBase extends js.Object {
  def `final`(): Buffer = js.native
  def update(value: Buffer): Buffer = js.native
  def update(value: Buffer, inputEnc: String): Buffer = js.native
  def update(value: Buffer, inputEnc: String, outputEnc: String): Buffer = js.native
}

