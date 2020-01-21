package typings.babelCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/core", "transformSync")
@js.native
object transformSync extends js.Object {
  def apply(code: String): BabelFileResult | Null = js.native
  def apply(code: String, opts: TransformOptions): BabelFileResult | Null = js.native
}

