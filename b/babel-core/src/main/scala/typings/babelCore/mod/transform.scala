package typings.babelCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-core", "transform")
@js.native
object transform extends js.Object {
  def apply(code: String): BabelFileResult = js.native
  def apply(code: String, opts: TransformOptions): BabelFileResult = js.native
}

