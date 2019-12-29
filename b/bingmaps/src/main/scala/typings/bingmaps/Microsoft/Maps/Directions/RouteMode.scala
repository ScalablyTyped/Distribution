package typings.bingmaps.Microsoft.Maps.Directions

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RouteMode extends js.Object

@JSGlobal("Microsoft.Maps.Directions.RouteMode")
@js.native
object RouteMode extends js.Object {
  /** Driving directions are calculated. */
  @js.native
  sealed trait driving extends RouteMode
  
  /** Transit directions are calculated. */
  @js.native
  sealed trait transit extends RouteMode
  
  /** Driving directions using truck attributes are calculationed. */
  @js.native
  sealed trait truck extends RouteMode
  
  /** Walking directions are calculated. */
  @js.native
  sealed trait walking extends RouteMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RouteMode with Double] = js.native
  /* 0 */ @js.native
  object driving extends TopLevel[driving with Double]
  
  /* 1 */ @js.native
  object transit extends TopLevel[transit with Double]
  
  /* 2 */ @js.native
  object truck extends TopLevel[truck with Double]
  
  /* 3 */ @js.native
  object walking extends TopLevel[walking with Double]
  
}

