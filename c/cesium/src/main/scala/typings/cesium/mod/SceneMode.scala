package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SceneMode extends StObject
@JSImport("cesium", "SceneMode")
@js.native
object SceneMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SceneMode & Double] = js.native
  
  @js.native
  sealed trait COLUMBUS_VIEW
    extends StObject
       with SceneMode
  /* 1 */ val COLUMBUS_VIEW: typings.cesium.mod.SceneMode.COLUMBUS_VIEW & Double = js.native
  
  @js.native
  sealed trait MORPHING
    extends StObject
       with SceneMode
  /* 0 */ val MORPHING: typings.cesium.mod.SceneMode.MORPHING & Double = js.native
  
  @js.native
  sealed trait SCENE2D
    extends StObject
       with SceneMode
  /* 2 */ val SCENE2D: typings.cesium.mod.SceneMode.SCENE2D & Double = js.native
  
  @js.native
  sealed trait SCENE3D
    extends StObject
       with SceneMode
  /* 3 */ val SCENE3D: typings.cesium.mod.SceneMode.SCENE3D & Double = js.native
  
  def getMorphTime(value: SceneMode): Double = js.native
}
