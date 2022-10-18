package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.anon.Wrap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BoxBuilder {
  
  @JSGlobal("BABYLON.BoxBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.BoxBuilder.CreateBox")
  @js.native
  def CreateBox: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[Wrap], 
    /* scene */ js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]], 
    typings.babylonjs.BABYLON.Mesh
  ] = js.native
  inline def CreateBox(name: String): typings.babylonjs.BABYLON.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateBox")(name.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateBox(name: String, options: Unit, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateBox(name: String, options: Wrap): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateBox(name: String, options: Wrap, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateBox_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[Wrap], 
      /* scene */ js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]], 
      typings.babylonjs.BABYLON.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateBox")(x.asInstanceOf[js.Any])
}
