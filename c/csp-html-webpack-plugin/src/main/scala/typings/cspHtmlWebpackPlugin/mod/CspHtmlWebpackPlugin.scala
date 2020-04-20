package typings.cspHtmlWebpackPlugin.mod

import typings.webpack.mod.Compiler_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CspHtmlWebpackPlugin extends js.Object {
  @JSName("apply")
  def apply(compiler: Compiler_): Unit
}

object CspHtmlWebpackPlugin {
  @scala.inline
  def apply(apply: Compiler_ => Unit): CspHtmlWebpackPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
    __obj.asInstanceOf[CspHtmlWebpackPlugin]
  }
}

