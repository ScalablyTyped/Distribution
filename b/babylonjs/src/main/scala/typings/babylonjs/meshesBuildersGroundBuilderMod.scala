package typings.babylonjs

import typings.babylonjs.anon.AlphaFilter
import typings.babylonjs.anon.ColorFilter
import typings.babylonjs.anon.Precision
import typings.babylonjs.anon.Subdivisions
import typings.babylonjs.anon.SubdivisionsX
import typings.babylonjs.anon.Updatable
import typings.babylonjs.meshesGroundMeshMod.GroundMesh
import typings.babylonjs.meshesMeshDotvertexDataMod.VertexData
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshesBuildersGroundBuilderMod {
  
  @JSImport("babylonjs/Meshes/Builders/groundBuilder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def CreateGround(name: String): GroundMesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any]).asInstanceOf[GroundMesh]
  inline def CreateGround(name: String, options: Unit, scene: Scene): GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[GroundMesh]
  inline def CreateGround(name: String, options: SubdivisionsX): GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GroundMesh]
  inline def CreateGround(name: String, options: SubdivisionsX, scene: Scene): GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[GroundMesh]
  
  inline def CreateGroundFromHeightMap(name: String, url: String): GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[GroundMesh]
  inline def CreateGroundFromHeightMap(name: String, url: String, options: Unit, scene: Nullable[Scene]): GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[GroundMesh]
  inline def CreateGroundFromHeightMap(name: String, url: String, options: ColorFilter): GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GroundMesh]
  inline def CreateGroundFromHeightMap(name: String, url: String, options: ColorFilter, scene: Nullable[Scene]): GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[GroundMesh]
  
  inline def CreateGroundFromHeightMapVertexData(options: AlphaFilter): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMapVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
  
  inline def CreateGroundVertexData(options: Subdivisions): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
  
  inline def CreateTiledGround(name: String, options: Updatable): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTiledGround(name: String, options: Updatable, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  
  inline def CreateTiledGroundVertexData(options: Precision): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledGroundVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
  
  object GroundBuilder {
    
    @JSImport("babylonjs/Meshes/Builders/groundBuilder", "GroundBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Meshes/Builders/groundBuilder", "GroundBuilder.CreateGround")
    @js.native
    def CreateGround: js.Function3[
        /* name */ String, 
        /* options */ js.UndefOr[SubdivisionsX], 
        /* scene */ js.UndefOr[Scene], 
        GroundMesh
      ] = js.native
    inline def CreateGround(name: String): GroundMesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any]).asInstanceOf[GroundMesh]
    inline def CreateGround(name: String, options: Unit, scene: Scene): GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[GroundMesh]
    inline def CreateGround(name: String, options: SubdivisionsX): GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GroundMesh]
    inline def CreateGround(name: String, options: SubdivisionsX, scene: Scene): GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[GroundMesh]
    
    @JSImport("babylonjs/Meshes/Builders/groundBuilder", "GroundBuilder.CreateGroundFromHeightMap")
    @js.native
    def CreateGroundFromHeightMap: js.Function4[
        /* name */ String, 
        /* url */ String, 
        /* options */ js.UndefOr[ColorFilter], 
        /* scene */ js.UndefOr[Nullable[Scene]], 
        GroundMesh
      ] = js.native
    inline def CreateGroundFromHeightMap(name: String, url: String): GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[GroundMesh]
    inline def CreateGroundFromHeightMap(name: String, url: String, options: Unit, scene: Nullable[Scene]): GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[GroundMesh]
    inline def CreateGroundFromHeightMap(name: String, url: String, options: ColorFilter): GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GroundMesh]
    inline def CreateGroundFromHeightMap(name: String, url: String, options: ColorFilter, scene: Nullable[Scene]): GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[GroundMesh]
    inline def CreateGroundFromHeightMap_=(
      x: js.Function4[
          /* name */ String, 
          /* url */ String, 
          /* options */ js.UndefOr[ColorFilter], 
          /* scene */ js.UndefOr[Nullable[Scene]], 
          GroundMesh
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateGroundFromHeightMap")(x.asInstanceOf[js.Any])
    
    inline def CreateGround_=(
      x: js.Function3[
          /* name */ String, 
          /* options */ js.UndefOr[SubdivisionsX], 
          /* scene */ js.UndefOr[Scene], 
          GroundMesh
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateGround")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Meshes/Builders/groundBuilder", "GroundBuilder.CreateTiledGround")
    @js.native
    def CreateTiledGround: js.Function3[
        /* name */ String, 
        /* options */ Updatable, 
        /* scene */ js.UndefOr[Nullable[Scene]], 
        Mesh
      ] = js.native
    inline def CreateTiledGround(name: String, options: Updatable): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateTiledGround(name: String, options: Updatable, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateTiledGround_=(
      x: js.Function3[
          /* name */ String, 
          /* options */ Updatable, 
          /* scene */ js.UndefOr[Nullable[Scene]], 
          Mesh
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateTiledGround")(x.asInstanceOf[js.Any])
  }
}
