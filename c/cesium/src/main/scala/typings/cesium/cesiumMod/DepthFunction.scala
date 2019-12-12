package typings.cesium.cesiumMod

import org.scalablytyped.runtime.TopLevel
import typings.cesium.cesiumMod.DepthFunction.ALWAYS
import typings.cesium.cesiumMod.DepthFunction.EQUAL
import typings.cesium.cesiumMod.DepthFunction.GREATER
import typings.cesium.cesiumMod.DepthFunction.GREATER_OR_EQUAL
import typings.cesium.cesiumMod.DepthFunction.LESS
import typings.cesium.cesiumMod.DepthFunction.LESS_OR_EQUAL
import typings.cesium.cesiumMod.DepthFunction.NEVER
import typings.cesium.cesiumMod.DepthFunction.NOT_EQUAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DepthFunction extends js.Object

@JSImport("cesium", "DepthFunction")
@js.native
object DepthFunction extends js.Object {
  @js.native
  sealed trait ALWAYS extends DepthFunction
  
  @js.native
  sealed trait EQUAL extends DepthFunction
  
  @js.native
  sealed trait GREATER extends DepthFunction
  
  @js.native
  sealed trait GREATER_OR_EQUAL extends DepthFunction
  
  @js.native
  sealed trait LESS extends DepthFunction
  
  @js.native
  sealed trait LESS_OR_EQUAL extends DepthFunction
  
  @js.native
  sealed trait NEVER extends DepthFunction
  
  @js.native
  sealed trait NOT_EQUAL extends DepthFunction
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DepthFunction with Double] = js.native
  /* 7 */ @js.native
  object ALWAYS extends TopLevel[ALWAYS with Double]
  
  /* 2 */ @js.native
  object EQUAL extends TopLevel[EQUAL with Double]
  
  /* 4 */ @js.native
  object GREATER extends TopLevel[GREATER with Double]
  
  /* 6 */ @js.native
  object GREATER_OR_EQUAL extends TopLevel[GREATER_OR_EQUAL with Double]
  
  /* 1 */ @js.native
  object LESS extends TopLevel[LESS with Double]
  
  /* 3 */ @js.native
  object LESS_OR_EQUAL extends TopLevel[LESS_OR_EQUAL with Double]
  
  /* 0 */ @js.native
  object NEVER extends TopLevel[NEVER with Double]
  
  /* 5 */ @js.native
  object NOT_EQUAL extends TopLevel[NOT_EQUAL with Double]
  
}

