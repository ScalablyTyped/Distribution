package typings
package clientDashSessionsLib.clientDashSessionsMod.clientUnderscoreSessionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Util extends js.Object {
  def computeHmac(
    options: js.Any,
    iv: java.lang.String,
    ciphertext: java.lang.String,
    duration: scala.Double,
    createdAt: scala.Double
  ): nodeLib.Buffer = js.native
  def decode(options: SessionOptions, encoded: java.lang.String): DecodeResult = js.native
  def encode(options: SessionOptions, content: js.Any): java.lang.String = js.native
  def encode(options: SessionOptions, content: js.Any, duration: scala.Double): java.lang.String = js.native
  def encode(options: SessionOptions, content: js.Any, duration: scala.Double, createdAt: scala.Double): java.lang.String = js.native
}

