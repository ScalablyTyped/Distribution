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
  
  val BEVELED: BEVELED with java.lang.String = js.native
  val MITERED: MITERED with java.lang.String = js.native
  val ROUNDED: ROUNDED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[cesiumLib.cesiumMod.CornerType with java.lang.String] = js.native
}

