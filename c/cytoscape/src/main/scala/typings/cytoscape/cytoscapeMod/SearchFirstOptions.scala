package typings.cytoscape.cytoscapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.cytoscape.cytoscapeMod.SearchFirstOptions1
  - typings.cytoscape.cytoscapeMod.SearchFirstOptions2
*/
trait SearchFirstOptions extends js.Object

object SearchFirstOptions {
  @scala.inline
  def SearchFirstOptions1(
    root: Selector | CollectionArgument,
    directed: js.UndefOr[Boolean] = js.undefined,
    visit: (/* v */ NodeSingular, /* e */ EdgeSingular, /* u */ NodeSingular, /* i */ Double, /* depth */ Double) => Boolean | Unit = null
  ): SearchFirstOptions = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    if (!js.isUndefined(directed)) __obj.updateDynamic("directed")(directed.asInstanceOf[js.Any])
    if (visit != null) __obj.updateDynamic("visit")(js.Any.fromFunction5(visit))
    __obj.asInstanceOf[SearchFirstOptions]
  }
  @scala.inline
  def SearchFirstOptions2(
    roots: Selector | CollectionArgument,
    directed: js.UndefOr[Boolean] = js.undefined,
    visit: (/* v */ NodeSingular, /* e */ EdgeSingular, /* u */ NodeSingular, /* i */ Double, /* depth */ Double) => Boolean | Unit = null
  ): SearchFirstOptions = {
    val __obj = js.Dynamic.literal(roots = roots.asInstanceOf[js.Any])
    if (!js.isUndefined(directed)) __obj.updateDynamic("directed")(directed.asInstanceOf[js.Any])
    if (visit != null) __obj.updateDynamic("visit")(js.Any.fromFunction5(visit))
    __obj.asInstanceOf[SearchFirstOptions]
  }
}

