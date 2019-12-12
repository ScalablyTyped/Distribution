package typings.cesium.cesiumMod

import org.scalablytyped.runtime.TopLevel
import typings.cesium.cesiumMod.Visibility.FULL
import typings.cesium.cesiumMod.Visibility.NONE
import typings.cesium.cesiumMod.Visibility.PARTIAL
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Visibility with Double] = js.native
  /* 2 */ @js.native
  object FULL extends TopLevel[FULL with Double]
  
  /* 0 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  /* 1 */ @js.native
  object PARTIAL extends TopLevel[PARTIAL with Double]
  
}

