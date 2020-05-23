package typings.bingmaps.Microsoft.Maps.Traffic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrafficManager extends js.Object {
  /** Hides all traffic data. */
  def hide(): Unit
  /** Hides the traffic flow layer. */
  def hideFlow(): Unit
  /** Hides all traffic incidents. */
  def hideIncidents(): Unit
  /** Hides the traffic legend. */
  def hideLegend(): Unit
  /**
    * Sets the options for the traffic manager.
    * @param options The options for the traffic manager.
    */
  def setOptions(options: ITrafficOptions): Unit
  /** Displays all traffic data. */
  def show(): Unit
  /** Displays the traffic flow layer. */
  def showFlow(): Unit
  /** Displays all traffic incidents. */
  def showIncidents(): Unit
  /** Displays the traffic legend. */
  def showLegend(): Unit
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
}

