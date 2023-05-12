package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HeightReference extends StObject
@JSImport("@cesium/engine", "HeightReference")
@js.native
object HeightReference extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HeightReference & Double] = js.native
  
  /**
    * The position is clamped to the terrain.
    */
  @js.native
  sealed trait CLAMP_TO_GROUND
    extends StObject
       with HeightReference
  /* 1 */ val CLAMP_TO_GROUND: typings.cesiumEngine.mod.HeightReference.CLAMP_TO_GROUND & Double = js.native
  
  /**
    * The position is absolute.
    */
  @js.native
  sealed trait NONE
    extends StObject
       with HeightReference
  /* 0 */ val NONE: typings.cesiumEngine.mod.HeightReference.NONE & Double = js.native
  
  /**
    * The position height is the height above the terrain.
    */
  @js.native
  sealed trait RELATIVE_TO_GROUND
    extends StObject
       with HeightReference
  /* 2 */ val RELATIVE_TO_GROUND: typings.cesiumEngine.mod.HeightReference.RELATIVE_TO_GROUND & Double = js.native
}
