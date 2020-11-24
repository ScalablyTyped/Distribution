package typings.bingmaps.Microsoft.Maps.Traffic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrafficManager extends js.Object {
  
  /** Hides all traffic data. */
  def hide(): Unit = js.native
  
  /** Hides the traffic flow layer. */
  def hideFlow(): Unit = js.native
  
  /** Hides all traffic incidents. */
  def hideIncidents(): Unit = js.native
  
  /** Hides the traffic legend. */
  def hideLegend(): Unit = js.native
  
  /**
    * Sets the options for the traffic manager.
    * @param options The options for the traffic manager.
    */
  def setOptions(options: ITrafficOptions): Unit = js.native
  
  /** Displays all traffic data. */
  def show(): Unit = js.native
  
  /** Displays the traffic flow layer. */
  def showFlow(): Unit = js.native
  
  /** Displays all traffic incidents. */
  def showIncidents(): Unit = js.native
  
  /** Displays the traffic legend. */
  def showLegend(): Unit = js.native
}
object TrafficManager {
  
  @scala.inline
  def apply(
    hide: () => Unit,
    hideFlow: () => Unit,
    hideIncidents: () => Unit,
    hideLegend: () => Unit,
    setOptions: ITrafficOptions => Unit,
    show: () => Unit,
    showFlow: () => Unit,
    showIncidents: () => Unit,
    showLegend: () => Unit
  ): TrafficManager = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), hideFlow = js.Any.fromFunction0(hideFlow), hideIncidents = js.Any.fromFunction0(hideIncidents), hideLegend = js.Any.fromFunction0(hideLegend), setOptions = js.Any.fromFunction1(setOptions), show = js.Any.fromFunction0(show), showFlow = js.Any.fromFunction0(showFlow), showIncidents = js.Any.fromFunction0(showIncidents), showLegend = js.Any.fromFunction0(showLegend))
    __obj.asInstanceOf[TrafficManager]
  }
  
  @scala.inline
  implicit class TrafficManagerOps[Self <: TrafficManager] (val x: Self) extends AnyVal {
    
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
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideFlow(value: () => Unit): Self = this.set("hideFlow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideIncidents(value: () => Unit): Self = this.set("hideIncidents", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideLegend(value: () => Unit): Self = this.set("hideLegend", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetOptions(value: ITrafficOptions => Unit): Self = this.set("setOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowFlow(value: () => Unit): Self = this.set("showFlow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowIncidents(value: () => Unit): Self = this.set("showIncidents", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowLegend(value: () => Unit): Self = this.set("showLegend", js.Any.fromFunction0(value))
  }
}
