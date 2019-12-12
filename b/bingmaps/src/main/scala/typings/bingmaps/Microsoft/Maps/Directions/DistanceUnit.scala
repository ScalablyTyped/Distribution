package typings.bingmaps.Microsoft.Maps.Directions

import org.scalablytyped.runtime.TopLevel
import typings.bingmaps.Microsoft.Maps.Directions.DistanceUnit.km
import typings.bingmaps.Microsoft.Maps.Directions.DistanceUnit.miles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DistanceUnit extends js.Object

@JSGlobal("Microsoft.Maps.Directions.DistanceUnit")
@js.native
object DistanceUnit extends js.Object {
  /** A distance in Kilometers. */
  @js.native
  sealed trait km extends DistanceUnit
  
  /** A distance in Miles. */
  @js.native
  sealed trait miles extends DistanceUnit
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DistanceUnit with Double] = js.native
  /* 0 */ @js.native
  object km extends TopLevel[km with Double]
  
  /* 1 */ @js.native
  object miles extends TopLevel[miles with Double]
  
}

