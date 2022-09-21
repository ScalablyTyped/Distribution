package typings.babylonjs.global.BABYLON

import typings.babylonjs.anon.DiameterFrontUVs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TorusBuilder {
  
  @JSGlobal("BABYLON.TorusBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.TorusBuilder.CreateTorus")
  @js.native
  def CreateTorus: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[DiameterFrontUVs], 
    /* scene */ js.UndefOr[typings.babylonjs.BABYLON.Scene], 
    typings.babylonjs.BABYLON.Mesh
  ] = js.native
  inline def CreateTorus(name: String): typings.babylonjs.BABYLON.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateTorus(name: String, options: Unit, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateTorus(name: String, options: DiameterFrontUVs): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateTorus(name: String, options: DiameterFrontUVs, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateTorus_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[DiameterFrontUVs], 
      /* scene */ js.UndefOr[typings.babylonjs.BABYLON.Scene], 
      typings.babylonjs.BABYLON.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateTorus")(x.asInstanceOf[js.Any])
}
