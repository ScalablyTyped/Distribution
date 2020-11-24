package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HeightReference extends js.Object
@JSImport("cesium", "HeightReference")
@js.native
object HeightReference extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HeightReference with Double] = js.native
  
  @js.native
  sealed trait CLAMP_TO_GROUND extends HeightReference
  /* 0 */ @js.native
  object CLAMP_TO_GROUND extends TopLevel[CLAMP_TO_GROUND with Double]
  
  @js.native
  sealed trait NONE extends HeightReference
  /* 1 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  @js.native
  sealed trait RELATIVE_TO_GROUND extends HeightReference
  /* 2 */ @js.native
  object RELATIVE_TO_GROUND extends TopLevel[RELATIVE_TO_GROUND with Double]
}
