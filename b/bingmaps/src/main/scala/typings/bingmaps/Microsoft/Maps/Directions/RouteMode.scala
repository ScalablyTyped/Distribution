package typings.bingmaps.Microsoft.Maps.Directions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
