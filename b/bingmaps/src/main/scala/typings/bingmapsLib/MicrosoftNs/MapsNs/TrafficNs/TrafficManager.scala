package typings
package bingmapsLib.MicrosoftNs.MapsNs.TrafficNs

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
  def this(map: bingmapsLib.MicrosoftNs.MapsNs.Map) = this()
  /** Hides all traffic data. */
  def hide(): scala.Unit = js.native
  /** Hides the traffic flow layer. */
  def hideFlow(): scala.Unit = js.native
  /** Hides all traffic incidents. */
  def hideIncidents(): scala.Unit = js.native
  /** Hides the traffic legend. */
  def hideLegend(): scala.Unit = js.native
  /**
          * Sets the options for the traffic manager.
          * @param options The options for the traffic manager.
          */
  def setOptions(options: ITrafficOptions): scala.Unit = js.native
  /** Displays all traffic data. */
  def show(): scala.Unit = js.native
  /** Displays the traffic flow layer. */
  def showFlow(): scala.Unit = js.native
  /** Displays all traffic incidents. */
  def showIncidents(): scala.Unit = js.native
  /** Displays the traffic legend. */
  def showLegend(): scala.Unit = js.native
}

