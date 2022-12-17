package typings.babylonjs.meshesIndexMod

import typings.babylonjs.anon.SizeX
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PolyhedronBuilder {
  
  @JSImport("babylonjs/Meshes/index", "PolyhedronBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Meshes/index", "PolyhedronBuilder.CreatePolyhedron")
  @js.native
  def CreatePolyhedron: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[SizeX], 
    /* scene */ js.UndefOr[Nullable[Scene]], 
    typings.babylonjs.meshesMeshMod.Mesh
  ] = js.native
  inline def CreatePolyhedron(name: String): typings.babylonjs.meshesMeshMod.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolyhedron")(name.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.meshesMeshMod.Mesh]
  inline def CreatePolyhedron(name: String, options: Unit, scene: Nullable[Scene]): typings.babylonjs.meshesMeshMod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolyhedron")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesMeshMod.Mesh]
  inline def CreatePolyhedron(name: String, options: SizeX): typings.babylonjs.meshesMeshMod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolyhedron")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesMeshMod.Mesh]
  inline def CreatePolyhedron(name: String, options: SizeX, scene: Nullable[Scene]): typings.babylonjs.meshesMeshMod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolyhedron")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesMeshMod.Mesh]
  inline def CreatePolyhedron_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[SizeX], 
      /* scene */ js.UndefOr[Nullable[Scene]], 
      typings.babylonjs.meshesMeshMod.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreatePolyhedron")(x.asInstanceOf[js.Any])
}
