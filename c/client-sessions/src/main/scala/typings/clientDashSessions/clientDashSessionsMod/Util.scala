package typings.clientDashSessions.clientDashSessionsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Util extends js.Object {
  def computeHmac(options: js.Any, iv: String, ciphertext: String, duration: Double, createdAt: Double): Buffer = js.native
  def decode(options: SessionOptions, encoded: String): DecodeResult = js.native
  def encode(options: SessionOptions, content: js.Any): String = js.native
  def encode(options: SessionOptions, content: js.Any, duration: Double): String = js.native
  def encode(options: SessionOptions, content: js.Any, duration: Double, createdAt: Double): String = js.native
}

