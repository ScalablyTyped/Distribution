package typings.babylonjs.meshesIndexMod

import typings.babylonjs.anon.Pattern
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TiledPlaneBuilder {
  
  @JSImport("babylonjs/Meshes/index", "TiledPlaneBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Meshes/index", "TiledPlaneBuilder.CreateTiledPlane")
  @js.native
  def CreateTiledPlane: js.Function3[
    /* name */ String, 
    /* options */ Pattern, 
    /* scene */ js.UndefOr[Nullable[Scene]], 
    Mesh
  ] = js.native
  inline def CreateTiledPlane(name: String, options: Pattern): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledPlane")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTiledPlane(name: String, options: Pattern, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledPlane")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTiledPlane_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ Pattern, 
      /* scene */ js.UndefOr[Nullable[Scene]], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateTiledPlane")(x.asInstanceOf[js.Any])
}
