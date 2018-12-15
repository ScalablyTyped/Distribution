package typings
package compressionDashWebpackDashPluginLib.compressionDashWebpackDashPluginMod.CompressionPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomOptions[O] extends BaseOptions {
  @JSName("algorithm")
  var algorithm_Original: Algorithm[O] = js.native
  var compressionOptions: js.UndefOr[O] = js.native
  def algorithm(source: java.lang.String, options: O, callback: AlgorithmCallback): scala.Unit = js.native
}

