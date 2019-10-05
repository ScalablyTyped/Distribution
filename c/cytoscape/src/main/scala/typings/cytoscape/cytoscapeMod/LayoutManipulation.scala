package typings.cytoscape.cytoscapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#layouts/layout-manipulation
  * Layouts have a set of functions available to them,
  * which allow for more complex behaviour than the primary run-one-layout-at-a-time usecase.
  * A new, developer accessible layout can be made via cy.makeLayout().
  */
trait LayoutManipulation extends js.Object {
  /**
    * Start running the layout
    * http://js.cytoscape.org/#layout.run
    */
  def run(): this.type
  def start(): this.type
  /**
    * Stop running the (asynchronous/discrete) layout
    * http://js.cytoscape.org/#layout.stop
    */
  def stop(): this.type
}

object LayoutManipulation {
  @scala.inline
  def apply(run: () => LayoutManipulation, start: () => LayoutManipulation, stop: () => LayoutManipulation): LayoutManipulation = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction0(run), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[LayoutManipulation]
  }
}

