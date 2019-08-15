package typings.cspDashHtmlDashWebpackDashPlugin.cspDashHtmlDashWebpackDashPluginMod

import typings.webpack.webpackMod.Compiler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("csp-html-webpack-plugin", JSImport.Namespace)
@js.native
/**
  * Setup for our plugin
  * @param policy - the policy object
  * @param additionalOpts - additional config options
  */
class ^ () extends CspHtmlWebpackPlugin {
  def this(policy: Policy) = this()
  def this(policy: Policy, additionalOpts: AdditionalOptions) = this()
  /* CompleteClass */
  @JSName("apply")
  override def apply(compiler: Compiler): Unit = js.native
}

