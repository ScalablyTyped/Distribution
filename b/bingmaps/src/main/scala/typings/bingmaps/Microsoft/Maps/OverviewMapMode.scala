package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OverviewMapMode extends js.Object
@JSGlobal("Microsoft.Maps.OverviewMapMode")
@js.native
object OverviewMapMode extends js.Object {
  
  /** Shows the overview map in an expanded state. */
  @js.native
  sealed trait expanded extends OverviewMapMode
  
  /** Hides the overview map. */
  @js.native
  sealed trait hidden extends OverviewMapMode
  
  /** Shows the overview map in a minimized state. */
  @js.native
  sealed trait minimized extends OverviewMapMode
}
