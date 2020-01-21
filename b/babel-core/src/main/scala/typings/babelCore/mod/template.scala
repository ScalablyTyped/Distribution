package typings.babelCore.mod

import typings.babelTemplate.mod.UseTemplate
import typings.babylon.mod.BabylonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-core", "template")
@js.native
object template extends js.Object {
  def apply(code: String): UseTemplate = js.native
  def apply(code: String, opts: BabylonOptions): UseTemplate = js.native
}

