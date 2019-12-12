package typings.cesium.cesiumMod

import org.scalablytyped.runtime.TopLevel
import typings.cesium.cesiumMod.VerticalOrigin.BOTTOM
import typings.cesium.cesiumMod.VerticalOrigin.CENTER
import typings.cesium.cesiumMod.VerticalOrigin.TOP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VerticalOrigin extends js.Object

@JSImport("cesium", "VerticalOrigin")
@js.native
object VerticalOrigin extends js.Object {
  @js.native
  sealed trait BOTTOM extends VerticalOrigin
  
  @js.native
  sealed trait CENTER extends VerticalOrigin
  
  @js.native
  sealed trait TOP extends VerticalOrigin
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VerticalOrigin with Double] = js.native
  /* 1 */ @js.native
  object BOTTOM extends TopLevel[BOTTOM with Double]
  
  /* 0 */ @js.native
  object CENTER extends TopLevel[CENTER with Double]
  
  /* 2 */ @js.native
  object TOP extends TopLevel[TOP with Double]
  
}

