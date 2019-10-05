package typings.babylon.babylonMod

import typings.babelDashTypes.babelDashTypesMod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylon", "parse")
@js.native
object parse extends js.Object {
  def apply(code: String): File = js.native
  def apply(code: String, opts: BabylonOptions): File = js.native
}

