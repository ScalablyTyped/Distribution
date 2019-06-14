package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Visibility extends js.Object

@JSImport("cesium", "Visibility")
@js.native
object Visibility extends js.Object {
  @js.native
  sealed trait FULL
    extends cesiumLib.cesiumMod.Visibility
  
  @js.native
  sealed trait NONE
    extends cesiumLib.cesiumMod.Visibility
  
  @js.native
  sealed trait PARTIAL
    extends cesiumLib.cesiumMod.Visibility
  
  /* 2 */ val FULL: FULL with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 1 */ val PARTIAL: PARTIAL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[cesiumLib.cesiumMod.Visibility with scala.Double] = js.native
}

