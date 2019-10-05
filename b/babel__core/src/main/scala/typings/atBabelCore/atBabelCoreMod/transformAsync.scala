package typings.atBabelCore.atBabelCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/core", "transformAsync")
@js.native
object transformAsync extends js.Object {
  def apply(code: String): js.Promise[BabelFileResult | Null] = js.native
  def apply(code: String, opts: TransformOptions): js.Promise[BabelFileResult | Null] = js.native
}

