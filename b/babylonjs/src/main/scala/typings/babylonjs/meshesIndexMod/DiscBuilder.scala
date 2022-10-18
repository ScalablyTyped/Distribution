package typings.babylonjs.meshesIndexMod

import typings.babylonjs.anon.FrontUVs
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DiscBuilder {
  
  @JSImport("babylonjs/Meshes/index", "DiscBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Meshes/index", "DiscBuilder.CreateDisc")
  @js.native
  def CreateDisc: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[FrontUVs], 
    /* scene */ js.UndefOr[Nullable[Scene]], 
    Mesh
  ] = js.native
  inline def CreateDisc(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateDisc")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
  inline def CreateDisc(name: String, options: Unit, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDisc")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateDisc(name: String, options: FrontUVs): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDisc")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateDisc(name: String, options: FrontUVs, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDisc")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateDisc_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[FrontUVs], 
      /* scene */ js.UndefOr[Nullable[Scene]], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateDisc")(x.asInstanceOf[js.Any])
}
