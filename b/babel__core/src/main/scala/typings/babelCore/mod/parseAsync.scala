package typings.babelCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/core", "parseAsync")
@js.native
object parseAsync extends js.Object {
  def apply(code: String): js.Promise[ParseResult | Null] = js.native
  def apply(code: String, options: TransformOptions): js.Promise[ParseResult | Null] = js.native
}

