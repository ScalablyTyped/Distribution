package typings.compressionWebpackPlugin.mod

import typings.std.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Prepare compressed versions of assets to serve them with Content-Encoding.
  */
@JSImport("compression-webpack-plugin", JSImport.Namespace)
@js.native
class ^[O] () extends Plugin {
  def this(options: Options[O]) = this()
}

@JSImport("compression-webpack-plugin", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def isWebpack4(): Boolean = js.native
}

