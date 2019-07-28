package typings.bingmaps.MicrosoftNs.MapsNs.TrafficNs

import typings.bingmaps.MicrosoftNs.MapsNs.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.Traffic.TrafficManager")
@js.native
class TrafficManager protected () extends js.Object {
  /**
    * @constructor
    * @requires The Microsoft.Maps.Traffic module.
    * @param map A map instnce to attach the traffic manager to.
    */
  def this(map: Map) = this()
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

