package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.anon.HeightPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TiledPlaneBuilder {
  
  @JSGlobal("BABYLON.TiledPlaneBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.TiledPlaneBuilder.CreateTiledPlane")
  @js.native
  def CreateTiledPlane: js.Function3[
    /* name */ String, 
    /* options */ HeightPattern, 
    /* scene */ js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]], 
    typings.babylonjs.BABYLON.Mesh
  ] = js.native
  inline def CreateTiledPlane(name: String, options: HeightPattern): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledPlane")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateTiledPlane(name: String, options: HeightPattern, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledPlane")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateTiledPlane_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ HeightPattern, 
      /* scene */ js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]], 
      typings.babylonjs.BABYLON.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateTiledPlane")(x.asInstanceOf[js.Any])
}
