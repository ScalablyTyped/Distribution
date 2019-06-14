package typings
package bingmapsLib.MicrosoftNs.MapsNs

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
  sealed trait hidden
    extends bingmapsLib.MicrosoftNs.MapsNs.LabelOverlay
  
  /**  Map labels are visible. */
  @js.native
  sealed trait visible
    extends bingmapsLib.MicrosoftNs.MapsNs.LabelOverlay
  
  /* 0 */ val hidden: hidden with scala.Double = js.native
  /* 1 */ val visible: visible with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.LabelOverlay with scala.Double] = js.native
}

