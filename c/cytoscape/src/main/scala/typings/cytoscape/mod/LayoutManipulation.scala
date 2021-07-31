package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#layouts/layout-manipulation
  * Layouts have a set of functions available to them,
  * which allow for more complex behaviour than the primary run-one-layout-at-a-time usecase.
  * A new, developer accessible layout can be made via cy.makeLayout().
  */
trait LayoutManipulation extends StObject {
  
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
  
  @scala.inline
  implicit class LayoutManipulationMutableBuilder[Self <: LayoutManipulation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRun(value: () => LayoutManipulation): Self = StObject.set(x, "run", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStart(value: () => LayoutManipulation): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStop(value: () => LayoutManipulation): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
