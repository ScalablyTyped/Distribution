package typings.babylonjs.legacyLegacyMod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PlaneBuilder {
  
  @JSImport("babylonjs/Legacy/legacy", "PlaneBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "PlaneBuilder.CreatePlane")
  @js.native
  def CreatePlane: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[typings.babylonjs.anon.Size], 
    /* scene */ js.UndefOr[Nullable[typings.babylonjs.sceneMod.Scene]], 
    typings.babylonjs.meshesMeshMod.Mesh
  ] = js.native
  inline def CreatePlane(name: String): typings.babylonjs.meshesMeshMod.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreatePlane")(name.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.meshesMeshMod.Mesh]
  inline def CreatePlane(name: String, options: Unit, scene: Nullable[typings.babylonjs.sceneMod.Scene]): typings.babylonjs.meshesMeshMod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePlane")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesMeshMod.Mesh]
  inline def CreatePlane(name: String, options: typings.babylonjs.anon.Size): typings.babylonjs.meshesMeshMod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePlane")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesMeshMod.Mesh]
  inline def CreatePlane(
    name: String,
    options: typings.babylonjs.anon.Size,
    scene: Nullable[typings.babylonjs.sceneMod.Scene]
  ): typings.babylonjs.meshesMeshMod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePlane")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesMeshMod.Mesh]
  inline def CreatePlane_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[typings.babylonjs.anon.Size], 
      /* scene */ js.UndefOr[Nullable[typings.babylonjs.sceneMod.Scene]], 
      typings.babylonjs.meshesMeshMod.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreatePlane")(x.asInstanceOf[js.Any])
}
