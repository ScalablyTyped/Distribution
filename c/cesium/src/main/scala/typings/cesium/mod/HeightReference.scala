package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HeightReference extends StObject
@JSImport("cesium", "HeightReference")
@js.native
object HeightReference extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HeightReference with Double] = js.native
  
  @js.native
  sealed trait CLAMP_TO_GROUND extends HeightReference
  /* 0 */ val CLAMP_TO_GROUND: typings.cesium.mod.HeightReference.CLAMP_TO_GROUND with Double = js.native
  
  @js.native
  sealed trait NONE extends HeightReference
  /* 1 */ val NONE: typings.cesium.mod.HeightReference.NONE with Double = js.native
  
  @js.native
  sealed trait RELATIVE_TO_GROUND extends HeightReference
  /* 2 */ val RELATIVE_TO_GROUND: typings.cesium.mod.HeightReference.RELATIVE_TO_GROUND with Double = js.native
}
