package typings.babelCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/core", "parse")
@js.native
object parse extends js.Object {
  def apply(code: String): ParseResult | Null = js.native
  def apply(code: String, callback: FileParseCallback): Unit = js.native
  def apply(code: String, options: js.UndefOr[TransformOptions], callback: FileParseCallback): Unit = js.native
  def apply(code: String, options: TransformOptions): ParseResult | Null = js.native
}

