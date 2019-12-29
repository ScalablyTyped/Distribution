package typings.cesium.cesiumMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HeightReference extends js.Object

@JSImport("cesium", "HeightReference")
@js.native
object HeightReference extends js.Object {
  @js.native
  sealed trait CLAMP_TO_GROUND extends HeightReference
  
  @js.native
  sealed trait NONE extends HeightReference
  
  @js.native
  sealed trait RELATIVE_TO_GROUND extends HeightReference
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HeightReference with Double] = js.native
  /* 0 */ @js.native
  object CLAMP_TO_GROUND extends TopLevel[CLAMP_TO_GROUND with Double]
  
  /* 1 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  /* 2 */ @js.native
  object RELATIVE_TO_GROUND extends TopLevel[RELATIVE_TO_GROUND with Double]
  
}

