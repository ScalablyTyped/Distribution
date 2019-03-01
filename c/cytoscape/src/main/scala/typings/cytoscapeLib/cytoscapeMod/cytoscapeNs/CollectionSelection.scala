package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#collection/layout
  */
trait CollectionSelection extends js.Object {
  def deselect(): this.type
  /**
    * Make the elements selected (NB other elements outside the collection are not affected).
    * http://js.cytoscape.org/#eles.select
    */
  def select(): this.type
  /**
    * Make the selection states of the elements mutable.
    * http://js.cytoscape.org/#eles.selectify
    */
  def selectify(): this.type
  /**
    * Make the elements not selected (NB other elements outside the collection are not affected).
    * http://js.cytoscape.org/#eles.unselect
    */
  def unselect(): this.type
  /**
    * Make the selection states of the elements immutable.
    * http://js.cytoscape.org/#eles.unselectify
    */
  def unselectify(): this.type
}

object CollectionSelection {
  @scala.inline
  def apply(
    deselect: js.Function0[CollectionSelection],
    select: js.Function0[CollectionSelection],
    selectify: js.Function0[CollectionSelection],
    unselect: js.Function0[CollectionSelection],
    unselectify: js.Function0[CollectionSelection]
  ): CollectionSelection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deselect")(deselect)
    __obj.updateDynamic("select")(select)
    __obj.updateDynamic("selectify")(selectify)
    __obj.updateDynamic("unselect")(unselect)
    __obj.updateDynamic("unselectify")(unselectify)
    __obj.asInstanceOf[CollectionSelection]
  }
}

