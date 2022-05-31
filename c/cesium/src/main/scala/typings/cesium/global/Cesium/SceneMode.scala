package typings.cesium.global.Cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.SceneMode")
@js.native
object SceneMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.cesium.mod.SceneMode & Double] = js.native
  
  /* 1 */ val COLUMBUS_VIEW: typings.cesium.mod.SceneMode.COLUMBUS_VIEW & Double = js.native
  
  /* 0 */ val MORPHING: typings.cesium.mod.SceneMode.MORPHING & Double = js.native
  
  /* 2 */ val SCENE2D: typings.cesium.mod.SceneMode.SCENE2D & Double = js.native
  
  /* 3 */ val SCENE3D: typings.cesium.mod.SceneMode.SCENE3D & Double = js.native
  
  def getMorphTime(value: typings.cesium.mod.SceneMode): Double = js.native
}
