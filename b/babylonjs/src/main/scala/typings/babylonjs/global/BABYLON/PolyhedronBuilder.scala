package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.anon.SizeY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PolyhedronBuilder {
  
  @JSGlobal("BABYLON.PolyhedronBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.PolyhedronBuilder.CreatePolyhedron")
  @js.native
  def CreatePolyhedron: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[SizeY], 
    /* scene */ js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]], 
    typings.babylonjs.BABYLON.Mesh
  ] = js.native
  inline def CreatePolyhedron(name: String): typings.babylonjs.BABYLON.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolyhedron")(name.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreatePolyhedron(name: String, options: Unit, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolyhedron")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreatePolyhedron(name: String, options: SizeY): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolyhedron")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreatePolyhedron(name: String, options: SizeY, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolyhedron")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreatePolyhedron_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[SizeY], 
      /* scene */ js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]], 
      typings.babylonjs.BABYLON.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreatePolyhedron")(x.asInstanceOf[js.Any])
}
