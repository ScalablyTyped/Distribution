package typings.babylonjs.meshesIndexMod

import typings.babylonjs.anon.AlignHorizontal
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TiledBoxBuilder {
  
  @JSImport("babylonjs/Meshes/index", "TiledBoxBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Meshes/index", "TiledBoxBuilder.CreateTiledBox")
  @js.native
  def CreateTiledBox: js.Function3[
    /* name */ String, 
    /* options */ AlignHorizontal, 
    /* scene */ js.UndefOr[Nullable[Scene]], 
    Mesh
  ] = js.native
  inline def CreateTiledBox(name: String, options: AlignHorizontal): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTiledBox(name: String, options: AlignHorizontal, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTiledBox_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ AlignHorizontal, 
      /* scene */ js.UndefOr[Nullable[Scene]], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateTiledBox")(x.asInstanceOf[js.Any])
}
