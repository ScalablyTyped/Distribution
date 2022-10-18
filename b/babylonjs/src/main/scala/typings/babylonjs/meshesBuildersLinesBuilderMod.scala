package typings.babylonjs

import typings.babylonjs.anon.Colors
import typings.babylonjs.anon.DashNb
import typings.babylonjs.anon.DashSize
import typings.babylonjs.anon.Instance
import typings.babylonjs.anon.Lines
import typings.babylonjs.meshesLinesMeshMod.LinesMesh
import typings.babylonjs.meshesMeshDotvertexDataMod.VertexData
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshesBuildersLinesBuilderMod {
  
  @JSImport("babylonjs/Meshes/Builders/linesBuilder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def CreateDashedLines(name: String, options: DashNb): LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDashedLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LinesMesh]
  inline def CreateDashedLines(name: String, options: DashNb, scene: Nullable[Scene]): LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDashedLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[LinesMesh]
  
  inline def CreateDashedLinesVertexData(options: DashSize): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateDashedLinesVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
  
  inline def CreateLineSystem(name: String, options: Colors, scene: Nullable[Scene]): LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLineSystem")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[LinesMesh]
  
  inline def CreateLineSystemVertexData(options: Lines): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateLineSystemVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
  
  inline def CreateLines(name: String, options: Instance): LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LinesMesh]
  inline def CreateLines(name: String, options: Instance, scene: Nullable[Scene]): LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[LinesMesh]
  
  object LinesBuilder {
    
    @JSImport("babylonjs/Meshes/Builders/linesBuilder", "LinesBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Meshes/Builders/linesBuilder", "LinesBuilder.CreateDashedLines")
    @js.native
    def CreateDashedLines: js.Function3[
        /* name */ String, 
        /* options */ DashNb, 
        /* scene */ js.UndefOr[Nullable[Scene]], 
        LinesMesh
      ] = js.native
    inline def CreateDashedLines(name: String, options: DashNb): LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDashedLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LinesMesh]
    inline def CreateDashedLines(name: String, options: DashNb, scene: Nullable[Scene]): LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDashedLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[LinesMesh]
    inline def CreateDashedLines_=(
      x: js.Function3[
          /* name */ String, 
          /* options */ DashNb, 
          /* scene */ js.UndefOr[Nullable[Scene]], 
          LinesMesh
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateDashedLines")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Meshes/Builders/linesBuilder", "LinesBuilder.CreateLineSystem")
    @js.native
    def CreateLineSystem: js.Function3[/* name */ String, /* options */ Colors, /* scene */ Nullable[Scene], LinesMesh] = js.native
    inline def CreateLineSystem(name: String, options: Colors, scene: Nullable[Scene]): LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLineSystem")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[LinesMesh]
    inline def CreateLineSystem_=(x: js.Function3[/* name */ String, /* options */ Colors, /* scene */ Nullable[Scene], LinesMesh]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateLineSystem")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Meshes/Builders/linesBuilder", "LinesBuilder.CreateLines")
    @js.native
    def CreateLines: js.Function3[
        /* name */ String, 
        /* options */ Instance, 
        /* scene */ js.UndefOr[Nullable[Scene]], 
        LinesMesh
      ] = js.native
    inline def CreateLines(name: String, options: Instance): LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LinesMesh]
    inline def CreateLines(name: String, options: Instance, scene: Nullable[Scene]): LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[LinesMesh]
    inline def CreateLines_=(
      x: js.Function3[
          /* name */ String, 
          /* options */ Instance, 
          /* scene */ js.UndefOr[Nullable[Scene]], 
          LinesMesh
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateLines")(x.asInstanceOf[js.Any])
  }
}
