package typings.babelCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/core", "transform")
@js.native
object transform extends js.Object {
  def apply(code: String): BabelFileResult | Null = js.native
  def apply(code: String, callback: FileResultCallback): Unit = js.native
  def apply(code: String, opts: js.UndefOr[scala.Nothing], callback: FileResultCallback): Unit = js.native
  def apply(code: String, opts: TransformOptions): BabelFileResult | Null = js.native
  def apply(code: String, opts: TransformOptions, callback: FileResultCallback): Unit = js.native
}

