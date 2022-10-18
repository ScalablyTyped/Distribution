package typings.babylonjs.legacyLegacyMod

import typings.babylonjs.anon.AlignHorizontal
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TiledBoxBuilder {
  
  @JSImport("babylonjs/Legacy/legacy", "TiledBoxBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "TiledBoxBuilder.CreateTiledBox")
  @js.native
  def CreateTiledBox: js.Function3[
    /* name */ String, 
    /* options */ AlignHorizontal, 
    /* scene */ js.UndefOr[Nullable[typings.babylonjs.sceneMod.Scene]], 
    Mesh
  ] = js.native
  inline def CreateTiledBox(name: String, options: AlignHorizontal): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTiledBox(name: String, options: AlignHorizontal, scene: Nullable[typings.babylonjs.sceneMod.Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTiledBox_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ AlignHorizontal, 
      /* scene */ js.UndefOr[Nullable[typings.babylonjs.sceneMod.Scene]], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateTiledBox")(x.asInstanceOf[js.Any])
}
