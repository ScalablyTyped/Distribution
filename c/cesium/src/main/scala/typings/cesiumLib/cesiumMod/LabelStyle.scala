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
  
  val FILL: FILL with java.lang.String = js.native
  val FILL_AND_OUTLINE: FILL_AND_OUTLINE with java.lang.String = js.native
  val OUTLINE: OUTLINE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[cesiumLib.cesiumMod.LabelStyle with java.lang.String] = js.native
}

