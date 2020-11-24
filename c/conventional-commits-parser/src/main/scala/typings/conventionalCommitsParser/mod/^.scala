package typings.conventionalCommitsParser.mod

import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("conventional-commits-parser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Returns an transform stream. If there is any malformed commits it will be
    * gracefully ignored (an empty data will be emitted so down stream can notice).
    *
    * @param options
    */
  def apply(): Transform = js.native
  def apply(options: Options): Transform = js.native
}
