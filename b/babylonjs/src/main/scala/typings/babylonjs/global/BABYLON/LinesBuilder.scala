package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.anon.Points
import typings.babylonjs.anon.UseVertexAlpha
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LinesBuilder {
  
  @JSGlobal("BABYLON.LinesBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.LinesBuilder.CreateDashedLines")
  @js.native
  def CreateDashedLines: js.Function3[
    /* name */ String, 
    /* options */ UseVertexAlpha, 
    /* scene */ js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]], 
    typings.babylonjs.BABYLON.LinesMesh
  ] = js.native
  inline def CreateDashedLines(name: String, options: UseVertexAlpha): typings.babylonjs.BABYLON.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDashedLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.LinesMesh]
  inline def CreateDashedLines(name: String, options: UseVertexAlpha, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDashedLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.LinesMesh]
  inline def CreateDashedLines_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ UseVertexAlpha, 
      /* scene */ js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]], 
      typings.babylonjs.BABYLON.LinesMesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateDashedLines")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.LinesBuilder.CreateLineSystem")
  @js.native
  def CreateLineSystem: js.Function3[
    /* name */ String, 
    /* options */ typings.babylonjs.anon.Material, 
    /* scene */ Nullable[typings.babylonjs.BABYLON.Scene], 
    typings.babylonjs.BABYLON.LinesMesh
  ] = js.native
  inline def CreateLineSystem(
    name: String,
    options: typings.babylonjs.anon.Material,
    scene: Nullable[typings.babylonjs.BABYLON.Scene]
  ): typings.babylonjs.BABYLON.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLineSystem")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.LinesMesh]
  inline def CreateLineSystem_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ typings.babylonjs.anon.Material, 
      /* scene */ Nullable[typings.babylonjs.BABYLON.Scene], 
      typings.babylonjs.BABYLON.LinesMesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateLineSystem")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.LinesBuilder.CreateLines")
  @js.native
  def CreateLines: js.Function3[
    /* name */ String, 
    /* options */ Points, 
    /* scene */ js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]], 
    typings.babylonjs.BABYLON.LinesMesh
  ] = js.native
  inline def CreateLines(name: String, options: Points): typings.babylonjs.BABYLON.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.LinesMesh]
  inline def CreateLines(name: String, options: Points, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.LinesMesh]
  inline def CreateLines_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ Points, 
      /* scene */ js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]], 
      typings.babylonjs.BABYLON.LinesMesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateLines")(x.asInstanceOf[js.Any])
}
