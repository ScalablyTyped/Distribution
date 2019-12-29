package typings.bingmaps.Microsoft.Maps.Directions

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimeType extends js.Object

@JSGlobal("Microsoft.Maps.Directions.TimeType")
@js.native
object TimeType extends js.Object {
  /** The dateTime parameter contains the desired arrival time for a transit request. */
  @js.native
  sealed trait arrival extends TimeType
  
  /** The dateTime parameter contains the desired departure time for a transit request. */
  @js.native
  sealed trait departure extends TimeType
  
  /** The dateTime parameter should be ignored and the first available transit taken. */
  @js.native
  sealed trait firstAvailable extends TimeType
  
  /** The dateTime parameter contains the latest departure time available for a transit request.  */
  @js.native
  sealed trait lastAvailable extends TimeType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimeType with Double] = js.native
  /* 0 */ @js.native
  object arrival extends TopLevel[arrival with Double]
  
  /* 1 */ @js.native
  object departure extends TopLevel[departure with Double]
  
  /* 2 */ @js.native
  object firstAvailable extends TopLevel[firstAvailable with Double]
  
  /* 3 */ @js.native
  object lastAvailable extends TopLevel[lastAvailable with Double]
  
}

