package typings.bingmaps.Microsoft.Maps.Directions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimeType extends StObject
@JSGlobal("Microsoft.Maps.Directions.TimeType")
@js.native
object TimeType extends StObject {
  
  /** The dateTime parameter contains the desired arrival time for a transit request. */
  @js.native
  sealed trait arrival
    extends StObject
       with TimeType
  
  /** The dateTime parameter contains the desired departure time for a transit request. */
  @js.native
  sealed trait departure
    extends StObject
       with TimeType
  
  /** The dateTime parameter should be ignored and the first available transit taken. */
  @js.native
  sealed trait firstAvailable
    extends StObject
       with TimeType
  
  /** The dateTime parameter contains the latest departure time available for a transit request.  */
  @js.native
  sealed trait lastAvailable
    extends StObject
       with TimeType
}
