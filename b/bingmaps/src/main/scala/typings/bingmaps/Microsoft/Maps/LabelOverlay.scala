package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LabelOverlay extends js.Object

@JSGlobal("Microsoft.Maps.LabelOverlay")
@js.native
object LabelOverlay extends js.Object {
  /**
    * Map labels are hidden. Note that this will have no effect on road maps unless the allowHidingLabelsOfRoad map option
    * is set to true.
    */
  @js.native
  sealed trait hidden extends LabelOverlay
  
  /**  Map labels are visible. */
  @js.native
  sealed trait visible extends LabelOverlay
  
  /* 0 */ val hidden: typings.bingmaps.Microsoft.Maps.LabelOverlay.hidden with Double = js.native
  /* 1 */ val visible: typings.bingmaps.Microsoft.Maps.LabelOverlay.visible with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LabelOverlay with Double] = js.native
}

