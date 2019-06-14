package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CornerType extends js.Object

@JSImport("cesium", "CornerType")
@js.native
object CornerType extends js.Object {
  @js.native
  sealed trait BEVELED
    extends cesiumLib.cesiumMod.CornerType
  
  @js.native
  sealed trait MITERED
    extends cesiumLib.cesiumMod.CornerType
  
  @js.native
  sealed trait ROUNDED
    extends cesiumLib.cesiumMod.CornerType
  
  /* 2 */ val BEVELED: BEVELED with scala.Double = js.native
  /* 1 */ val MITERED: MITERED with scala.Double = js.native
  /* 0 */ val ROUNDED: ROUNDED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[cesiumLib.cesiumMod.CornerType with scala.Double] = js.native
}

