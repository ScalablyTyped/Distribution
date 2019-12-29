package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LabelOverlay with Double] = js.native
  /* 0 */ @js.native
  object hidden extends TopLevel[hidden with Double]
  
  /* 1 */ @js.native
  object visible extends TopLevel[visible with Double]
  
}

