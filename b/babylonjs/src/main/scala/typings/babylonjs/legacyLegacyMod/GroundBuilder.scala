package typings.babylonjs.legacyLegacyMod

import typings.babylonjs.anon.ColorFilter
import typings.babylonjs.anon.SubdivisionsX
import typings.babylonjs.anon.Updatable
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GroundBuilder {
  
  @JSImport("babylonjs/Legacy/legacy", "GroundBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "GroundBuilder.CreateGround")
  @js.native
  def CreateGround: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[SubdivisionsX], 
    /* scene */ js.UndefOr[typings.babylonjs.sceneMod.Scene], 
    typings.babylonjs.meshesGroundMeshMod.GroundMesh
  ] = js.native
  inline def CreateGround(name: String): typings.babylonjs.meshesGroundMeshMod.GroundMesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.meshesGroundMeshMod.GroundMesh]
  inline def CreateGround(name: String, options: Unit, scene: typings.babylonjs.sceneMod.Scene): typings.babylonjs.meshesGroundMeshMod.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesGroundMeshMod.GroundMesh]
  inline def CreateGround(name: String, options: SubdivisionsX): typings.babylonjs.meshesGroundMeshMod.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesGroundMeshMod.GroundMesh]
  inline def CreateGround(name: String, options: SubdivisionsX, scene: typings.babylonjs.sceneMod.Scene): typings.babylonjs.meshesGroundMeshMod.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesGroundMeshMod.GroundMesh]
  
  @JSImport("babylonjs/Legacy/legacy", "GroundBuilder.CreateGroundFromHeightMap")
  @js.native
  def CreateGroundFromHeightMap: js.Function4[
    /* name */ String, 
    /* url */ String, 
    /* options */ js.UndefOr[ColorFilter], 
    /* scene */ js.UndefOr[Nullable[typings.babylonjs.sceneMod.Scene]], 
    typings.babylonjs.meshesGroundMeshMod.GroundMesh
  ] = js.native
  inline def CreateGroundFromHeightMap(name: String, url: String): typings.babylonjs.meshesGroundMeshMod.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesGroundMeshMod.GroundMesh]
  inline def CreateGroundFromHeightMap(name: String, url: String, options: Unit, scene: Nullable[typings.babylonjs.sceneMod.Scene]): typings.babylonjs.meshesGroundMeshMod.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesGroundMeshMod.GroundMesh]
  inline def CreateGroundFromHeightMap(name: String, url: String, options: ColorFilter): typings.babylonjs.meshesGroundMeshMod.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesGroundMeshMod.GroundMesh]
  inline def CreateGroundFromHeightMap(name: String, url: String, options: ColorFilter, scene: Nullable[typings.babylonjs.sceneMod.Scene]): typings.babylonjs.meshesGroundMeshMod.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesGroundMeshMod.GroundMesh]
  inline def CreateGroundFromHeightMap_=(
    x: js.Function4[
      /* name */ String, 
      /* url */ String, 
      /* options */ js.UndefOr[ColorFilter], 
      /* scene */ js.UndefOr[Nullable[typings.babylonjs.sceneMod.Scene]], 
      typings.babylonjs.meshesGroundMeshMod.GroundMesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateGroundFromHeightMap")(x.asInstanceOf[js.Any])
  
  inline def CreateGround_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[SubdivisionsX], 
      /* scene */ js.UndefOr[typings.babylonjs.sceneMod.Scene], 
      typings.babylonjs.meshesGroundMeshMod.GroundMesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateGround")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "GroundBuilder.CreateTiledGround")
  @js.native
  def CreateTiledGround: js.Function3[
    /* name */ String, 
    /* options */ Updatable, 
    /* scene */ js.UndefOr[Nullable[typings.babylonjs.sceneMod.Scene]], 
    typings.babylonjs.meshesMeshMod.Mesh
  ] = js.native
  inline def CreateTiledGround(name: String, options: Updatable): typings.babylonjs.meshesMeshMod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesMeshMod.Mesh]
  inline def CreateTiledGround(name: String, options: Updatable, scene: Nullable[typings.babylonjs.sceneMod.Scene]): typings.babylonjs.meshesMeshMod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesMeshMod.Mesh]
  inline def CreateTiledGround_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ Updatable, 
      /* scene */ js.UndefOr[Nullable[typings.babylonjs.sceneMod.Scene]], 
      typings.babylonjs.meshesMeshMod.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateTiledGround")(x.asInstanceOf[js.Any])
}
