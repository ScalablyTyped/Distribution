package typings.bignum.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bignum", "toBuffer")
@js.native
object toBuffer extends js.Object {
  def apply(n: BigNumCompatible): Buffer = js.native
  def apply(n: BigNumCompatible, options: BufferOptions): Buffer = js.native
}

