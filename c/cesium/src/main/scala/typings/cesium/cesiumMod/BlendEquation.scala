package typings.cesium.cesiumMod

import org.scalablytyped.runtime.TopLevel
import typings.cesium.cesiumMod.BlendEquation.ADD
import typings.cesium.cesiumMod.BlendEquation.REVERSE_SUBTRACT
import typings.cesium.cesiumMod.BlendEquation.SUBTRACT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BlendEquation extends js.Object

@JSImport("cesium", "BlendEquation")
@js.native
object BlendEquation extends js.Object {
  @js.native
  sealed trait ADD extends BlendEquation
  
  @js.native
  sealed trait REVERSE_SUBTRACT extends BlendEquation
  
  @js.native
  sealed trait SUBTRACT extends BlendEquation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BlendEquation with Double] = js.native
  /* 0 */ @js.native
  object ADD extends TopLevel[ADD with Double]
  
  /* 2 */ @js.native
  object REVERSE_SUBTRACT extends TopLevel[REVERSE_SUBTRACT with Double]
  
  /* 1 */ @js.native
  object SUBTRACT extends TopLevel[SUBTRACT with Double]
  
}

