package typings
package base64urlLib.distBase64urlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Base64Url extends js.Object {
  def apply(input: java.lang.String): java.lang.String = js.native
  def apply(input: java.lang.String, encoding: java.lang.String): java.lang.String = js.native
  def apply(input: nodeLib.Buffer): java.lang.String = js.native
  def apply(input: nodeLib.Buffer, encoding: java.lang.String): java.lang.String = js.native
  def decode(base64url: java.lang.String): java.lang.String = js.native
  def decode(base64url: java.lang.String, encoding: java.lang.String): java.lang.String = js.native
  def encode(input: java.lang.String): java.lang.String = js.native
  def encode(input: java.lang.String, encoding: java.lang.String): java.lang.String = js.native
  def encode(input: nodeLib.Buffer): java.lang.String = js.native
  def encode(input: nodeLib.Buffer, encoding: java.lang.String): java.lang.String = js.native
  def fromBase64(base64: java.lang.String): java.lang.String = js.native
  def toBase64(base64url: java.lang.String): java.lang.String = js.native
  def toBase64(base64url: nodeLib.Buffer): java.lang.String = js.native
  def toBuffer(base64url: java.lang.String): nodeLib.Buffer = js.native
}

