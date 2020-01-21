package typings.binaryParser.mod

import typings.binaryParser.mod.Parser.ArrayOptions
import typings.binaryParser.mod.Parser.BufferOptions
import typings.binaryParser.mod.Parser.ChoiceOptions
import typings.binaryParser.mod.Parser.Endianness
import typings.binaryParser.mod.Parser.NestOptions
import typings.binaryParser.mod.Parser.Next
import typings.binaryParser.mod.Parser.Options
import typings.binaryParser.mod.Parser.Parsed
import typings.binaryParser.mod.Parser.StringOptions
import typings.node.Buffer
import typings.std.Error
import typings.std.ObjectConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parser_[O /* <: js.UndefOr[js.Object] */] extends js.Object {
  def array[N /* <: String */, Q /* <: ArrayOptions */](name: N, options: Q): Next[O, N, js.Array[_ | Double | js.Object]] = js.native
  def bit1[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def bit1[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def bit10[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def bit10[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def bit11[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def bit11[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def bit12[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def bit12[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def bit13[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def bit13[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def bit14[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def bit14[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def bit15[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def bit15[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def bit16[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def bit16[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def bit17[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def bit17[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def bit18[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def bit18[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def bit19[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def bit19[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def bit2[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def bit2[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def bit20[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def bit20[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def bit21[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def bit21[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def bit22[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def bit22[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def bit23[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def bit23[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def bit24[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def bit24[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def bit25[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def bit25[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def bit26[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def bit26[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def bit27[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def bit27[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def bit28[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def bit28[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def bit29[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def bit29[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def bit3[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def bit3[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def bit30[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def bit30[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def bit31[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def bit31[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def bit32[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def bit32[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def bit4[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def bit4[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def bit5[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def bit5[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def bit6[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def bit6[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def bit7[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def bit7[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def bit8[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def bit8[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def bit9[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def bit9[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def buffer[N /* <: String */](name: N, options: BufferOptions): Next[O, N, Buffer] = js.native
  def choice[N /* <: String */, Q /* <: ChoiceOptions */](name: N, options: Q): Next[O, N, _ | js.Object] = js.native
  def compile(): Unit = js.native
  def create(constructorFunction: ObjectConstructor): Parser[js.UndefOr[scala.Nothing]] = js.native
  def double[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def double[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def doublebe[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def doublebe[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def doublele[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def doublele[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def endianess(endianess: Endianness): Parser[O] = js.native
  def float[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def float[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def floatbe[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def floatbe[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def floatle[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def floatle[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def getCode(): String = js.native
  def int16[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def int16[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def int16be[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def int16be[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def int16le[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def int16le[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def int32[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def int32[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def int32be[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def int32be[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def int32le[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def int32le[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def int8[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def int8[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
     /* [sic] */ def namely(alias: String): Parser[O] = js.native
  def nest[N /* <: String */, Q /* <: NestOptions */](name: N, options: Q): Next[O, N, js.Object] = js.native
  def parse(buffer: Buffer): Parsed[O] = js.native
  def parse(
    buffer: Buffer,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* result */ js.UndefOr[js.Any], Unit]
  ): Parsed[O] = js.native
  def skip(length: Double): Parser[O] = js.native
  def string[N /* <: String */](name: N): Next[O, N, String] = js.native
  def string[N /* <: String */](name: N, options: StringOptions): Next[O, N, String] = js.native
  def uint16[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def uint16[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def uint16be[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def uint16be[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def uint16le[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def uint16le[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def uint32[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def uint32[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def uint32be[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def uint32be[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def uint32le[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def uint32le[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  def uint8[N /* <: String */](name: N): Next[O, N, Double] = js.native
  def uint8[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
}

