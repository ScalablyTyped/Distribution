package typings.browserfs

import org.scalablytyped.runtime.Instantiable1
import typings.node.Buffer
import typings.node.bufferMod.SlowBuffer
import typings.node.bufferMod.TranscodeEncoding
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofbuffer extends js.Object {
  var Buffer: (Instantiable1[/* str */ String, typings.node.bufferMod.Buffer]) | TypeofClassBuffer
  val INSPECT_MAX_BYTES: Double
  var SlowBuffer: Anon_Size | (Instantiable1[/* size */ Double, typings.node.bufferMod.SlowBuffer])
  val constants: Anon_MAXLENGTH
  val kMaxLength: Double
  val kStringMaxLength: Double
  def transcode(source: Uint8Array, fromEnc: TranscodeEncoding, toEnc: TranscodeEncoding): Buffer
}

object Typeofbuffer {
  @scala.inline
  def apply(
    Buffer: Instantiable1[/* str */ String, typings.node.bufferMod.Buffer],
    INSPECT_MAX_BYTES: Double,
    SlowBuffer: Instantiable1[/* size */ Double, SlowBuffer],
    constants: Anon_MAXLENGTH,
    kMaxLength: Double,
    kStringMaxLength: Double,
    transcode: (Uint8Array, TranscodeEncoding, TranscodeEncoding) => Buffer
  ): Typeofbuffer = {
    val __obj = js.Dynamic.literal(Buffer = Buffer, INSPECT_MAX_BYTES = INSPECT_MAX_BYTES, SlowBuffer = SlowBuffer, constants = constants, kMaxLength = kMaxLength, kStringMaxLength = kStringMaxLength, transcode = js.Any.fromFunction3(transcode))
  
    __obj.asInstanceOf[Typeofbuffer]
  }
}

