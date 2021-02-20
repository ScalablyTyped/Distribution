package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SceneMode extends StObject
@JSImport("cesium", "SceneMode")
@js.native
object SceneMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SceneMode with Double] = js.native
  
  @js.native
  sealed trait COLUMBUS_VIEW extends SceneMode
  /* 1 */ val COLUMBUS_VIEW: typings.cesium.mod.SceneMode.COLUMBUS_VIEW with Double = js.native
  
  @js.native
  sealed trait MORPHING extends SceneMode
  /* 0 */ val MORPHING: typings.cesium.mod.SceneMode.MORPHING with Double = js.native
  
  @js.native
  sealed trait SCENE2D extends SceneMode
  /* 2 */ val SCENE2D: typings.cesium.mod.SceneMode.SCENE2D with Double = js.native
  
  @js.native
  sealed trait SCENE3D extends SceneMode
  /* 3 */ val SCENE3D: typings.cesium.mod.SceneMode.SCENE3D with Double = js.native
  
  def getMorphTime(value: SceneMode): Double = js.native
}
