package typings.compressionDashWebpackDashPlugin

import typings.node.Buffer
import typings.std.Error
import typings.std.RegExp
import typings.webpack.webpackMod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object compressionDashWebpackDashPluginMod {
  type Algorithm[O] = js.Function3[/* source */ String, /* options */ O, /* callback */ AlgorithmCallback, Unit]
  type AlgorithmCallback = js.Function2[/* error */ Error | Null, /* result */ Buffer, Unit]
  type CompressionPlugin[O] = Plugin
  type Pattern = String | RegExp | (js.Array[RegExp | String])
}
