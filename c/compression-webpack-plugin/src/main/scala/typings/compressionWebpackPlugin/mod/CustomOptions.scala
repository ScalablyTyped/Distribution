package typings.compressionWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomOptions[O]
  extends BaseOptions
     with Options[O] {
  
  def algorithm(source: String, options: O, callback: AlgorithmCallback): Unit = js.native
  @JSName("algorithm")
  var algorithm_Original: Algorithm[O] = js.native
  
  var compressionOptions: js.UndefOr[O] = js.native
}
