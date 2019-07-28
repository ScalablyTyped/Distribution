package typings.babelDashWebpackDashPlugin

import typings.std.RegExp
import typings.webpack.webpackMod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object babelDashWebpackDashPluginMod {
  type BabelWebpackPlugin = Plugin
  type Matcher = RegExp | String | (js.Array[RegExp | String])
}
