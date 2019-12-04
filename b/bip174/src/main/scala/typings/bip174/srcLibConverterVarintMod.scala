package typings.bip174

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip174/src/lib/converter/varint", JSImport.Namespace)
@js.native
object srcLibConverterVarintMod extends js.Object {
  def decode(buffer: Buffer): Double = js.native
  def decode(buffer: Buffer, offset: Double): Double = js.native
  def encode(_number: Double): Buffer = js.native
  def encode(_number: Double, buffer: Buffer): Buffer = js.native
  def encode(_number: Double, buffer: Buffer, offset: Double): Buffer = js.native
  def encodingLength(_number: Double): Double = js.native
}

