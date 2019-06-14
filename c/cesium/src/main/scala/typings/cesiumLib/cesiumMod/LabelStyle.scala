package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LabelStyle extends js.Object

@JSImport("cesium", "LabelStyle")
@js.native
object LabelStyle extends js.Object {
  @js.native
  sealed trait FILL
    extends cesiumLib.cesiumMod.LabelStyle
  
  @js.native
  sealed trait FILL_AND_OUTLINE
    extends cesiumLib.cesiumMod.LabelStyle
  
  @js.native
  sealed trait OUTLINE
    extends cesiumLib.cesiumMod.LabelStyle
  
  /* 0 */ val FILL: FILL with scala.Double = js.native
  /* 2 */ val FILL_AND_OUTLINE: FILL_AND_OUTLINE with scala.Double = js.native
  /* 1 */ val OUTLINE: OUTLINE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[cesiumLib.cesiumMod.LabelStyle with scala.Double] = js.native
}

