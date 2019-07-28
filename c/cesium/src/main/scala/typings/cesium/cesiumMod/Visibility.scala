package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Visibility extends js.Object

@JSImport("cesium", "Visibility")
@js.native
object Visibility extends js.Object {
  @js.native
  sealed trait FULL extends Visibility
  
  @js.native
  sealed trait NONE extends Visibility
  
  @js.native
  sealed trait PARTIAL extends Visibility
  
  /* 2 */ val FULL: typings.cesium.cesiumMod.Visibility.FULL with Double = js.native
  /* 0 */ val NONE: typings.cesium.cesiumMod.Visibility.NONE with Double = js.native
  /* 1 */ val PARTIAL: typings.cesium.cesiumMod.Visibility.PARTIAL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Visibility with Double] = js.native
}

