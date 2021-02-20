package typings.bingmaps.global.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Adds a traffic incident and flow data to the map.
  * @requires The Microsoft.Maps.Traffic module.
  */
object Traffic {
  
  @JSGlobal("Microsoft.Maps.Traffic.TrafficManager")
  @js.native
  class TrafficManager protected ()
    extends typings.bingmaps.Microsoft.Maps.Traffic.TrafficManager {
    /**
      * @constructor
      * @requires The Microsoft.Maps.Traffic module.
      * @param map A map instnce to attach the traffic manager to.
      */
    def this(map: typings.bingmaps.Microsoft.Maps.Map) = this()
  }
}
