package typings.babylonjs.global.BABYLON

import typings.babylonjs.anon.Diameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HemisphereBuilder {
  
  @JSGlobal("BABYLON.HemisphereBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.HemisphereBuilder.CreateHemisphere")
  @js.native
  def CreateHemisphere: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[Diameter], 
    /* scene */ js.UndefOr[typings.babylonjs.BABYLON.Scene], 
    typings.babylonjs.BABYLON.Mesh
  ] = js.native
  inline def CreateHemisphere(name: String): typings.babylonjs.BABYLON.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateHemisphere")(name.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateHemisphere(name: String, options: Unit, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateHemisphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateHemisphere(name: String, options: Diameter): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateHemisphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateHemisphere(name: String, options: Diameter, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateHemisphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateHemisphere_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[Diameter], 
      /* scene */ js.UndefOr[typings.babylonjs.BABYLON.Scene], 
      typings.babylonjs.BABYLON.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateHemisphere")(x.asInstanceOf[js.Any])
}
