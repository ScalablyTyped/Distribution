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
  var Buffer: (Instantiable1[/* str */ String, typings.node.bufferMod.Buffer]) with TypeofClassBuffer
  val INSPECT_MAX_BYTES: Double
  var SlowBuffer: (Instantiable1[/* size */ Double, typings.node.bufferMod.SlowBuffer]) with Anon_Size
  val constants: Anon_MAXLENGTH
  val kMaxLength: Double
  val kStringMaxLength: Double
  def transcode(source: Uint8Array, fromEnc: TranscodeEncoding, toEnc: TranscodeEncoding): Buffer
}

object Typeofbuffer {
  @scala.inline
  def apply(
    Buffer: (Instantiable1[/* str */ String, typings.node.bufferMod.Buffer]) with TypeofClassBuffer,
    INSPECT_MAX_BYTES: Double,
    SlowBuffer: (Instantiable1[/* size */ Double, SlowBuffer]) with Anon_Size,
    constants: Anon_MAXLENGTH,
    kMaxLength: Double,
    kStringMaxLength: Double,
    transcode: (Uint8Array, TranscodeEncoding, TranscodeEncoding) => Buffer
  ): Typeofbuffer = {
    val __obj = js.Dynamic.literal(Buffer = Buffer.asInstanceOf[js.Any], INSPECT_MAX_BYTES = INSPECT_MAX_BYTES.asInstanceOf[js.Any], SlowBuffer = SlowBuffer.asInstanceOf[js.Any], constants = constants.asInstanceOf[js.Any], kMaxLength = kMaxLength.asInstanceOf[js.Any], kStringMaxLength = kStringMaxLength.asInstanceOf[js.Any], transcode = js.Any.fromFunction3(transcode))
  
    __obj.asInstanceOf[Typeofbuffer]
  }
}

