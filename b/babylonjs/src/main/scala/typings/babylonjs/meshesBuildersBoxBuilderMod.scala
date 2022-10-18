package typings.babylonjs

import typings.babylonjs.anon.BackUVs
import typings.babylonjs.anon.BottomBaseAt
import typings.babylonjs.meshesMeshDotvertexDataMod.VertexData
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshesBuildersBoxBuilderMod {
  
  @JSImport("babylonjs/Meshes/Builders/boxBuilder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object BoxBuilder {
    
    @JSImport("babylonjs/Meshes/Builders/boxBuilder", "BoxBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Meshes/Builders/boxBuilder", "BoxBuilder.CreateBox")
    @js.native
    def CreateBox: js.Function3[
        /* name */ String, 
        /* options */ js.UndefOr[BackUVs], 
        /* scene */ js.UndefOr[Nullable[Scene]], 
        Mesh
      ] = js.native
    inline def CreateBox(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateBox")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
    inline def CreateBox(name: String, options: Unit, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateBox(name: String, options: BackUVs): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateBox(name: String, options: BackUVs, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateBox_=(
      x: js.Function3[
          /* name */ String, 
          /* options */ js.UndefOr[BackUVs], 
          /* scene */ js.UndefOr[Nullable[Scene]], 
          Mesh
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateBox")(x.asInstanceOf[js.Any])
  }
  
  inline def CreateBox(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateBox")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
  inline def CreateBox(name: String, options: Unit, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateBox(name: String, options: BackUVs): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateBox(name: String, options: BackUVs, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  
  inline def CreateBoxVertexData(options: BottomBaseAt): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateBoxVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
}
