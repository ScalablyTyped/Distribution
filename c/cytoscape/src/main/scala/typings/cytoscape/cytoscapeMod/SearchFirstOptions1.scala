package typings.cytoscape.cytoscapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchFirstOptions1
  extends SearchFirstOptionsBase
     with SearchFirstOptions {
  /**
    * The root nodes (selector or collection) to start the search from.
    */
  var root: Selector | CollectionArgument
}

object SearchFirstOptions1 {
  @scala.inline
  def apply(
    root: Selector | CollectionArgument,
    directed: js.UndefOr[Boolean] = js.undefined,
    visit: (/* v */ NodeSingular, /* e */ EdgeSingular, /* u */ NodeSingular, /* i */ Double, /* depth */ Double) => Boolean | Unit = null
  ): SearchFirstOptions1 = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    if (!js.isUndefined(directed)) __obj.updateDynamic("directed")(directed)
    if (visit != null) __obj.updateDynamic("visit")(js.Any.fromFunction5(visit))
    __obj.asInstanceOf[SearchFirstOptions1]
  }
}

