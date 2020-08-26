package typings.browserfs.anon

import org.scalablytyped.runtime.Instantiable1
import typings.node.Buffer
import typings.node.bufferMod.SlowBuffer
import typings.node.bufferMod.TranscodeEncoding
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofbuffer extends js.Object {
  var Buffer: (Instantiable1[/* str */ String, typings.node.bufferMod.Buffer]) with TypeofBuffer_ = js.native
  val INSPECT_MAX_BYTES: Double = js.native
  var SlowBuffer: (Instantiable1[/* size */ Double, typings.node.bufferMod.SlowBuffer]) with Instantiable = js.native
  val constants: MAXLENGTH = js.native
  val kMaxLength: Double = js.native
  val kStringMaxLength: Double = js.native
  def transcode(source: Uint8Array, fromEnc: TranscodeEncoding, toEnc: TranscodeEncoding): Buffer = js.native
}

object Typeofbuffer {
  @scala.inline
  def apply(
    Buffer: (Instantiable1[/* str */ String, typings.node.bufferMod.Buffer]) with TypeofBuffer_,
    INSPECT_MAX_BYTES: Double,
    SlowBuffer: (Instantiable1[/* size */ Double, SlowBuffer]) with Instantiable,
    constants: MAXLENGTH,
    kMaxLength: Double,
    kStringMaxLength: Double,
    transcode: (Uint8Array, TranscodeEncoding, TranscodeEncoding) => Buffer
  ): Typeofbuffer = {
    val __obj = js.Dynamic.literal(Buffer = Buffer.asInstanceOf[js.Any], INSPECT_MAX_BYTES = INSPECT_MAX_BYTES.asInstanceOf[js.Any], SlowBuffer = SlowBuffer.asInstanceOf[js.Any], constants = constants.asInstanceOf[js.Any], kMaxLength = kMaxLength.asInstanceOf[js.Any], kStringMaxLength = kStringMaxLength.asInstanceOf[js.Any], transcode = js.Any.fromFunction3(transcode))
    __obj.asInstanceOf[Typeofbuffer]
  }
  @scala.inline
  implicit class TypeofbufferOps[Self <: Typeofbuffer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBuffer(value: (Instantiable1[/* str */ String, typings.node.bufferMod.Buffer]) with TypeofBuffer_): Self = this.set("Buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def setINSPECT_MAX_BYTES(value: Double): Self = this.set("INSPECT_MAX_BYTES", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlowBuffer(value: (Instantiable1[/* size */ Double, SlowBuffer]) with Instantiable): Self = this.set("SlowBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def setConstants(value: MAXLENGTH): Self = this.set("constants", value.asInstanceOf[js.Any])
    @scala.inline
    def setKMaxLength(value: Double): Self = this.set("kMaxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setKStringMaxLength(value: Double): Self = this.set("kStringMaxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranscode(value: (Uint8Array, TranscodeEncoding, TranscodeEncoding) => Buffer): Self = this.set("transcode", js.Any.fromFunction3(value))
  }
  
}

