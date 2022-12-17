package typings.babylonjs.meshesIndexMod

import typings.babylonjs.anon.Clip
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LatheBuilder {
  
  @JSImport("babylonjs/Meshes/index", "LatheBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Meshes/index", "LatheBuilder.CreateLathe")
  @js.native
  def CreateLathe: js.Function3[
    /* name */ String, 
    /* options */ Clip, 
    /* scene */ js.UndefOr[Nullable[Scene]], 
    typings.babylonjs.meshesMeshMod.Mesh
  ] = js.native
  inline def CreateLathe(name: String, options: Clip): typings.babylonjs.meshesMeshMod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLathe")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesMeshMod.Mesh]
  inline def CreateLathe(name: String, options: Clip, scene: Nullable[Scene]): typings.babylonjs.meshesMeshMod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLathe")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesMeshMod.Mesh]
  inline def CreateLathe_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ Clip, 
      /* scene */ js.UndefOr[Nullable[Scene]], 
      typings.babylonjs.meshesMeshMod.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateLathe")(x.asInstanceOf[js.Any])
}
