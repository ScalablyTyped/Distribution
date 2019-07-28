package typings.d3DashGraphviz.d3DashGraphvizMod

import typings.d3DashSelection.d3DashSelectionMod.BaseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-graphviz", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def graphviz(selector: String): Graphviz[BaseType, _, BaseType, _] = js.native
  def graphviz(selector: String, options: Boolean): Graphviz[BaseType, _, BaseType, _] = js.native
  def graphviz(selector: String, options: GraphvizOptions): Graphviz[BaseType, _, BaseType, _] = js.native
  def graphviz(selector: BaseType): Graphviz[BaseType, _, BaseType, _] = js.native
  def graphviz(selector: BaseType, options: Boolean): Graphviz[BaseType, _, BaseType, _] = js.native
  def graphviz(selector: BaseType, options: GraphvizOptions): Graphviz[BaseType, _, BaseType, _] = js.native
}

