package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VerticalOrigin extends js.Object

@JSImport("cesium", "VerticalOrigin")
@js.native
object VerticalOrigin extends js.Object {
  @js.native
  sealed trait BOTTOM
    extends cesiumLib.cesiumMod.VerticalOrigin
  
  @js.native
  sealed trait CENTER
    extends cesiumLib.cesiumMod.VerticalOrigin
  
  @js.native
  sealed trait TOP
    extends cesiumLib.cesiumMod.VerticalOrigin
  
  val BOTTOM: BOTTOM with java.lang.String = js.native
  val CENTER: CENTER with java.lang.String = js.native
  val TOP: TOP with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[cesiumLib.cesiumMod.VerticalOrigin with java.lang.String] = js.native
}

