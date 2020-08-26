package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#layouts/layout-manipulation
  * Layouts have a set of functions available to them,
  * which allow for more complex behaviour than the primary run-one-layout-at-a-time usecase.
  * A new, developer accessible layout can be made via cy.makeLayout().
  */
@js.native
trait LayoutManipulation extends js.Object {
  /**
    * Start running the layout
    * http://js.cytoscape.org/#layout.run
    */
  def run(): this.type = js.native
  def start(): this.type = js.native
  /**
    * Stop running the (asynchronous/discrete) layout
    * http://js.cytoscape.org/#layout.stop
    */
  def stop(): this.type = js.native
}

object LayoutManipulation {
  @scala.inline
  def apply(run: () => LayoutManipulation, start: () => LayoutManipulation, stop: () => LayoutManipulation): LayoutManipulation = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction0(run), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[LayoutManipulation]
  }
  @scala.inline
  implicit class LayoutManipulationOps[Self <: LayoutManipulation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRun(value: () => LayoutManipulation): Self = this.set("run", js.Any.fromFunction0(value))
    @scala.inline
    def setStart(value: () => LayoutManipulation): Self = this.set("start", js.Any.fromFunction0(value))
    @scala.inline
    def setStop(value: () => LayoutManipulation): Self = this.set("stop", js.Any.fromFunction0(value))
  }
  
}

