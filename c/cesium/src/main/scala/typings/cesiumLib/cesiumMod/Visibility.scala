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
  
  val FULL: FULL with java.lang.String = js.native
  val NONE: NONE with java.lang.String = js.native
  val PARTIAL: PARTIAL with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[cesiumLib.cesiumMod.Visibility with java.lang.String] = js.native
}

