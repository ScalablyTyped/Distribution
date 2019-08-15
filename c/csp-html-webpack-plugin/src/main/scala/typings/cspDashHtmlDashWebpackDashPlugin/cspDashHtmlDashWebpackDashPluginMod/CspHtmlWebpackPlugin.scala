package typings.cspDashHtmlDashWebpackDashPlugin.cspDashHtmlDashWebpackDashPluginMod

import typings.webpack.webpackMod.Compiler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CspHtmlWebpackPlugin extends js.Object {
  @JSName("apply")
  def apply(compiler: Compiler): Unit
}

object CspHtmlWebpackPlugin {
  @scala.inline
  def apply(apply: Compiler => Unit): CspHtmlWebpackPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
  
    __obj.asInstanceOf[CspHtmlWebpackPlugin]
  }
}

