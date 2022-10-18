package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.anon.AlignHorizontalAlignVertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TiledBoxBuilder {
  
  @JSGlobal("BABYLON.TiledBoxBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.TiledBoxBuilder.CreateTiledBox")
  @js.native
  def CreateTiledBox: js.Function3[
    /* name */ String, 
    /* options */ AlignHorizontalAlignVertical, 
    /* scene */ js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]], 
    typings.babylonjs.BABYLON.Mesh
  ] = js.native
  inline def CreateTiledBox(name: String, options: AlignHorizontalAlignVertical): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateTiledBox(
    name: String,
    options: AlignHorizontalAlignVertical,
    scene: Nullable[typings.babylonjs.BABYLON.Scene]
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateTiledBox_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ AlignHorizontalAlignVertical, 
      /* scene */ js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]], 
      typings.babylonjs.BABYLON.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateTiledBox")(x.asInstanceOf[js.Any])
}
