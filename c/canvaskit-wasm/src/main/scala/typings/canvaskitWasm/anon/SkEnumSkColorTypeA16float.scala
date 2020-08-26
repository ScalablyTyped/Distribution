package typings.canvaskitWasm.anon

import typings.canvaskitWasm.mod.SkColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined canvaskit-wasm.canvaskit-wasm.SkEnum<canvaskit-wasm.canvaskit-wasm.SkColorType, {  A16_float :canvaskit-wasm.canvaskit-wasm.SkColorType,   A16_unorm :canvaskit-wasm.canvaskit-wasm.SkColorType,   ARGB_4444 :canvaskit-wasm.canvaskit-wasm.SkColorType,   Alpha_8 :canvaskit-wasm.canvaskit-wasm.SkColorType,   BGRA_8888 :canvaskit-wasm.canvaskit-wasm.SkColorType,   Gray_8 :canvaskit-wasm.canvaskit-wasm.SkColorType,   R8G8_unorm :canvaskit-wasm.canvaskit-wasm.SkColorType,   R16G16B16A16_unorm :canvaskit-wasm.canvaskit-wasm.SkColorType,   R16G16_float :canvaskit-wasm.canvaskit-wasm.SkColorType,   R16G16_unorm :canvaskit-wasm.canvaskit-wasm.SkColorType,   RGBA_8888 :canvaskit-wasm.canvaskit-wasm.SkColorType,   RGBA_1010102 :canvaskit-wasm.canvaskit-wasm.SkColorType,   RGBA_F16 :canvaskit-wasm.canvaskit-wasm.SkColorType,   RGBA_F32 :canvaskit-wasm.canvaskit-wasm.SkColorType,   RGB_565 :canvaskit-wasm.canvaskit-wasm.SkColorType,   RGB_888x :canvaskit-wasm.canvaskit-wasm.SkColorType,   RGB_101010x :canvaskit-wasm.canvaskit-wasm.SkColorType}> */
@js.native
trait SkEnumSkColorTypeA16float extends js.Object {
  val A16_float: SkColorType = js.native
  val A16_unorm: SkColorType = js.native
  val ARGB_4444: SkColorType = js.native
  val Alpha_8: SkColorType = js.native
  val BGRA_8888: SkColorType = js.native
  val Gray_8: SkColorType = js.native
  val R16G16B16A16_unorm: SkColorType = js.native
  val R16G16_float: SkColorType = js.native
  val R16G16_unorm: SkColorType = js.native
  val R8G8_unorm: SkColorType = js.native
  val RGBA_1010102: SkColorType = js.native
  val RGBA_8888: SkColorType = js.native
  val RGBA_F16: SkColorType = js.native
  val RGBA_F32: SkColorType = js.native
  val RGB_101010x: SkColorType = js.native
  val RGB_565: SkColorType = js.native
  val RGB_888x: SkColorType = js.native
  val values: js.Array[SkColorType] = js.native
}

object SkEnumSkColorTypeA16float {
  @scala.inline
  def apply(
    A16_float: SkColorType,
    A16_unorm: SkColorType,
    ARGB_4444: SkColorType,
    Alpha_8: SkColorType,
    BGRA_8888: SkColorType,
    Gray_8: SkColorType,
    R16G16B16A16_unorm: SkColorType,
    R16G16_float: SkColorType,
    R16G16_unorm: SkColorType,
    R8G8_unorm: SkColorType,
    RGBA_1010102: SkColorType,
    RGBA_8888: SkColorType,
    RGBA_F16: SkColorType,
    RGBA_F32: SkColorType,
    RGB_101010x: SkColorType,
    RGB_565: SkColorType,
    RGB_888x: SkColorType,
    values: js.Array[SkColorType]
  ): SkEnumSkColorTypeA16float = {
    val __obj = js.Dynamic.literal(A16_float = A16_float.asInstanceOf[js.Any], A16_unorm = A16_unorm.asInstanceOf[js.Any], ARGB_4444 = ARGB_4444.asInstanceOf[js.Any], Alpha_8 = Alpha_8.asInstanceOf[js.Any], BGRA_8888 = BGRA_8888.asInstanceOf[js.Any], Gray_8 = Gray_8.asInstanceOf[js.Any], R16G16B16A16_unorm = R16G16B16A16_unorm.asInstanceOf[js.Any], R16G16_float = R16G16_float.asInstanceOf[js.Any], R16G16_unorm = R16G16_unorm.asInstanceOf[js.Any], R8G8_unorm = R8G8_unorm.asInstanceOf[js.Any], RGBA_1010102 = RGBA_1010102.asInstanceOf[js.Any], RGBA_8888 = RGBA_8888.asInstanceOf[js.Any], RGBA_F16 = RGBA_F16.asInstanceOf[js.Any], RGBA_F32 = RGBA_F32.asInstanceOf[js.Any], RGB_101010x = RGB_101010x.asInstanceOf[js.Any], RGB_565 = RGB_565.asInstanceOf[js.Any], RGB_888x = RGB_888x.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkEnumSkColorTypeA16float]
  }
  @scala.inline
  implicit class SkEnumSkColorTypeA16floatOps[Self <: SkEnumSkColorTypeA16float] (val x: Self) extends AnyVal {
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
    def setA16_float(value: SkColorType): Self = this.set("A16_float", value.asInstanceOf[js.Any])
    @scala.inline
    def setA16_unorm(value: SkColorType): Self = this.set("A16_unorm", value.asInstanceOf[js.Any])
    @scala.inline
    def setARGB_4444(value: SkColorType): Self = this.set("ARGB_4444", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlpha_8(value: SkColorType): Self = this.set("Alpha_8", value.asInstanceOf[js.Any])
    @scala.inline
    def setBGRA_8888(value: SkColorType): Self = this.set("BGRA_8888", value.asInstanceOf[js.Any])
    @scala.inline
    def setGray_8(value: SkColorType): Self = this.set("Gray_8", value.asInstanceOf[js.Any])
    @scala.inline
    def setR16G16B16A16_unorm(value: SkColorType): Self = this.set("R16G16B16A16_unorm", value.asInstanceOf[js.Any])
    @scala.inline
    def setR16G16_float(value: SkColorType): Self = this.set("R16G16_float", value.asInstanceOf[js.Any])
    @scala.inline
    def setR16G16_unorm(value: SkColorType): Self = this.set("R16G16_unorm", value.asInstanceOf[js.Any])
    @scala.inline
    def setR8G8_unorm(value: SkColorType): Self = this.set("R8G8_unorm", value.asInstanceOf[js.Any])
    @scala.inline
    def setRGBA_1010102(value: SkColorType): Self = this.set("RGBA_1010102", value.asInstanceOf[js.Any])
    @scala.inline
    def setRGBA_8888(value: SkColorType): Self = this.set("RGBA_8888", value.asInstanceOf[js.Any])
    @scala.inline
    def setRGBA_F16(value: SkColorType): Self = this.set("RGBA_F16", value.asInstanceOf[js.Any])
    @scala.inline
    def setRGBA_F32(value: SkColorType): Self = this.set("RGBA_F32", value.asInstanceOf[js.Any])
    @scala.inline
    def setRGB_101010x(value: SkColorType): Self = this.set("RGB_101010x", value.asInstanceOf[js.Any])
    @scala.inline
    def setRGB_565(value: SkColorType): Self = this.set("RGB_565", value.asInstanceOf[js.Any])
    @scala.inline
    def setRGB_888x(value: SkColorType): Self = this.set("RGB_888x", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: SkColorType*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[SkColorType]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

