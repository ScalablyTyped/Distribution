package typings.bingmaps.global.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.Traffic.ITrafficOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adds a traffic incident and flow data to the map.
  * @requires The Microsoft.Maps.Traffic module.
  */
@JSGlobal("Microsoft.Maps.Traffic")
@js.native
object Traffic extends js.Object {
  @js.native
  class TrafficManager protected ()
    extends typings.bingmaps.Microsoft.Maps.Traffic.TrafficManager {
    /**
      * @constructor
      * @requires The Microsoft.Maps.Traffic module.
      * @param map A map instnce to attach the traffic manager to.
      */
    def this(map: typings.bingmaps.Microsoft.Maps.Map) = this()
    /** Hides all traffic data. */
    /* CompleteClass */
    override def hide(): Unit = js.native
    /** Hides the traffic flow layer. */
    /* CompleteClass */
    override def hideFlow(): Unit = js.native
    /** Hides all traffic incidents. */
    /* CompleteClass */
    override def hideIncidents(): Unit = js.native
    /** Hides the traffic legend. */
    /* CompleteClass */
    override def hideLegend(): Unit = js.native
    /**
      * Sets the options for the traffic manager.
      * @param options The options for the traffic manager.
      */
    /* CompleteClass */
    override def setOptions(options: ITrafficOptions): Unit = js.native
    /** Displays all traffic data. */
    /* CompleteClass */
    override def show(): Unit = js.native
    /** Displays the traffic flow layer. */
    /* CompleteClass */
    override def showFlow(): Unit = js.native
    /** Displays all traffic incidents. */
    /* CompleteClass */
    override def showIncidents(): Unit = js.native
    /** Displays the traffic legend. */
    /* CompleteClass */
    override def showLegend(): Unit = js.native
  }
  
}

