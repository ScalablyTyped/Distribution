package typings.cesium

import typings.cesium.mod.JulianDate
import typings.cesium.mod.TimeInterval
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCoreIso8601Mod {
  
  object default {
    
    /**
      * A {@link TimeInterval} representing the largest interval representable by an ISO8601 interval.
      * This is equivalent to the interval string '0000-01-01T00:00:00Z/9999-12-31T24:00:00Z'
      */
    @JSImport("cesium/Source/Core/Iso8601", "default.MAXIMUM_INTERVAL")
    @js.native
    val MAXIMUM_INTERVAL: TimeInterval = js.native
    
    /**
      * A {@link JulianDate} representing the latest time representable by an ISO8601 date.
      * This is equivalent to the date string '9999-12-31T24:00:00Z'
      */
    @JSImport("cesium/Source/Core/Iso8601", "default.MAXIMUM_VALUE")
    @js.native
    val MAXIMUM_VALUE: JulianDate = js.native
    
    /**
      * A {@link JulianDate} representing the earliest time representable by an ISO8601 date.
      * This is equivalent to the date string '0000-01-01T00:00:00Z'
      */
    @JSImport("cesium/Source/Core/Iso8601", "default.MINIMUM_VALUE")
    @js.native
    val MINIMUM_VALUE: JulianDate = js.native
  }
}
