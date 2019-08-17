package typings.babelDashWebpackDashPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object babelDashWebpackDashPluginMod {
  import typings.std.RegExp
  import typings.webpack.webpackMod.Plugin

  type BabelWebpackPlugin = Plugin
  type Matcher = RegExp | String | (js.Array[RegExp | String])
}
