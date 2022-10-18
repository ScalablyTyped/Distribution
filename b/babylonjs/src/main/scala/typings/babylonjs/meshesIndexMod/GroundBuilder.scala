package typings.babylonjs.meshesIndexMod

import typings.babylonjs.anon.AlphaFilter
import typings.babylonjs.anon.Precision
import typings.babylonjs.anon.Subdivisions
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GroundBuilder {
  
  @JSImport("babylonjs/Meshes/index", "GroundBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Meshes/index", "GroundBuilder.CreateGround")
  @js.native
  def CreateGround: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[Subdivisions], 
    /* scene */ js.UndefOr[Scene], 
    typings.babylonjs.meshesGroundMeshMod.GroundMesh
  ] = js.native
  inline def CreateGround(name: String): typings.babylonjs.meshesGroundMeshMod.GroundMesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.meshesGroundMeshMod.GroundMesh]
  inline def CreateGround(name: String, options: Unit, scene: Scene): typings.babylonjs.meshesGroundMeshMod.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesGroundMeshMod.GroundMesh]
  inline def CreateGround(name: String, options: Subdivisions): typings.babylonjs.meshesGroundMeshMod.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesGroundMeshMod.GroundMesh]
  inline def CreateGround(name: String, options: Subdivisions, scene: Scene): typings.babylonjs.meshesGroundMeshMod.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesGroundMeshMod.GroundMesh]
  
  @JSImport("babylonjs/Meshes/index", "GroundBuilder.CreateGroundFromHeightMap")
  @js.native
  def CreateGroundFromHeightMap: js.Function4[
    /* name */ String, 
    /* url */ String, 
    /* options */ js.UndefOr[AlphaFilter], 
    /* scene */ js.UndefOr[Nullable[Scene]], 
    typings.babylonjs.meshesGroundMeshMod.GroundMesh
  ] = js.native
  inline def CreateGroundFromHeightMap(name: String, url: String): typings.babylonjs.meshesGroundMeshMod.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesGroundMeshMod.GroundMesh]
  inline def CreateGroundFromHeightMap(name: String, url: String, options: Unit, scene: Nullable[Scene]): typings.babylonjs.meshesGroundMeshMod.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesGroundMeshMod.GroundMesh]
  inline def CreateGroundFromHeightMap(name: String, url: String, options: AlphaFilter): typings.babylonjs.meshesGroundMeshMod.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesGroundMeshMod.GroundMesh]
  inline def CreateGroundFromHeightMap(name: String, url: String, options: AlphaFilter, scene: Nullable[Scene]): typings.babylonjs.meshesGroundMeshMod.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesGroundMeshMod.GroundMesh]
  inline def CreateGroundFromHeightMap_=(
    x: js.Function4[
      /* name */ String, 
      /* url */ String, 
      /* options */ js.UndefOr[AlphaFilter], 
      /* scene */ js.UndefOr[Nullable[Scene]], 
      typings.babylonjs.meshesGroundMeshMod.GroundMesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateGroundFromHeightMap")(x.asInstanceOf[js.Any])
  
  inline def CreateGround_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[Subdivisions], 
      /* scene */ js.UndefOr[Scene], 
      typings.babylonjs.meshesGroundMeshMod.GroundMesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateGround")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Meshes/index", "GroundBuilder.CreateTiledGround")
  @js.native
  def CreateTiledGround: js.Function3[
    /* name */ String, 
    /* options */ Precision, 
    /* scene */ js.UndefOr[Nullable[Scene]], 
    Mesh
  ] = js.native
  inline def CreateTiledGround(name: String, options: Precision): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTiledGround(name: String, options: Precision, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTiledGround_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ Precision, 
      /* scene */ js.UndefOr[Nullable[Scene]], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateTiledGround")(x.asInstanceOf[js.Any])
}
