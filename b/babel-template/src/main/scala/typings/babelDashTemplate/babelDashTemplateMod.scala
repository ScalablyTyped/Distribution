package typings.babelDashTemplate

import org.scalablytyped.runtime.StringDictionary
import typings.babylon.babylonMod.BabylonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-template", JSImport.Namespace)
@js.native
object babelDashTemplateMod extends js.Object {
  def apply(code: String): UseTemplate = js.native
  def apply(code: String, opts: BabylonOptions): UseTemplate = js.native
  type Node = typings.babelDashTypes.babelDashTypesMod.Node
  type UseTemplate = js.Function1[/* nodes */ js.UndefOr[StringDictionary[Node]], Node]
}

