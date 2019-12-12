package typings.cesium.cesiumMod

import org.scalablytyped.runtime.TopLevel
import typings.cesium.cesiumMod.HorizontalOrigin.CENTER
import typings.cesium.cesiumMod.HorizontalOrigin.LEFT
import typings.cesium.cesiumMod.HorizontalOrigin.RIGHT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HorizontalOrigin extends js.Object

@JSImport("cesium", "HorizontalOrigin")
@js.native
object HorizontalOrigin extends js.Object {
  @js.native
  sealed trait CENTER extends HorizontalOrigin
  
  @js.native
  sealed trait LEFT extends HorizontalOrigin
  
  @js.native
  sealed trait RIGHT extends HorizontalOrigin
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HorizontalOrigin with Double] = js.native
  /* 0 */ @js.native
  object CENTER extends TopLevel[CENTER with Double]
  
  /* 1 */ @js.native
  object LEFT extends TopLevel[LEFT with Double]
  
  /* 2 */ @js.native
  object RIGHT extends TopLevel[RIGHT with Double]
  
}

