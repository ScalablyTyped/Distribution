package typings.atAwsDashSdkUtilDashBufferDashFrom

import typings.atAwsDashSdkUtilDashBufferDashFrom.atAwsDashSdkUtilDashBufferDashFromStrings.ascii
import typings.atAwsDashSdkUtilDashBufferDashFrom.atAwsDashSdkUtilDashBufferDashFromStrings.base64
import typings.atAwsDashSdkUtilDashBufferDashFrom.atAwsDashSdkUtilDashBufferDashFromStrings.binary
import typings.atAwsDashSdkUtilDashBufferDashFrom.atAwsDashSdkUtilDashBufferDashFromStrings.hex
import typings.atAwsDashSdkUtilDashBufferDashFrom.atAwsDashSdkUtilDashBufferDashFromStrings.latin1
import typings.atAwsDashSdkUtilDashBufferDashFrom.atAwsDashSdkUtilDashBufferDashFromStrings.ucs2
import typings.atAwsDashSdkUtilDashBufferDashFrom.atAwsDashSdkUtilDashBufferDashFromStrings.utf16le
import typings.atAwsDashSdkUtilDashBufferDashFrom.atAwsDashSdkUtilDashBufferDashFromStrings.utf8
import typings.node.Buffer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/util-buffer-from", JSImport.Namespace)
@js.native
object atAwsDashSdkUtilDashBufferDashFromMod extends js.Object {
  def fromArrayBuffer(input: ArrayBuffer): Buffer = js.native
  def fromArrayBuffer(input: ArrayBuffer, offset: Double): Buffer = js.native
  def fromArrayBuffer(input: ArrayBuffer, offset: Double, length: Double): Buffer = js.native
  def fromString(input: String): Buffer = js.native
  def fromString(input: String, encoding: String): Buffer = js.native
  @JSName("fromString")
  def fromString_ascii(input: String, encoding: ascii): Buffer = js.native
  @JSName("fromString")
  def fromString_base64(input: String, encoding: base64): Buffer = js.native
  @JSName("fromString")
  def fromString_binary(input: String, encoding: binary): Buffer = js.native
  @JSName("fromString")
  def fromString_hex(input: String, encoding: hex): Buffer = js.native
  @JSName("fromString")
  def fromString_latin1(input: String, encoding: latin1): Buffer = js.native
  @JSName("fromString")
  def fromString_ucs2(input: String, encoding: ucs2): Buffer = js.native
  @JSName("fromString")
  def fromString_utf16le(input: String, encoding: utf16le): Buffer = js.native
  @JSName("fromString")
  def fromString_utf8(input: String, encoding: utf8): Buffer = js.native
}

