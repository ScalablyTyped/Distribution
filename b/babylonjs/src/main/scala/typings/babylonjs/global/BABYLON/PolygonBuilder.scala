package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.anon.BackUVsDepth
import typings.babylonjs.anon.Shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PolygonBuilder {
  
  @JSGlobal("BABYLON.PolygonBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.PolygonBuilder.CreatePolygon")
  @js.native
  def CreatePolygon: js.Function4[
    /* name */ String, 
    /* options */ Shape, 
    /* scene */ js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]], 
    /* earcutInjection */ js.UndefOr[Any], 
    typings.babylonjs.BABYLON.Mesh
  ] = js.native
  inline def CreatePolygon(name: String, options: Shape): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreatePolygon(name: String, options: Shape, scene: Unit, earcutInjection: Any): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreatePolygon(name: String, options: Shape, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreatePolygon(
    name: String,
    options: Shape,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    earcutInjection: Any
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreatePolygon_=(
    x: js.Function4[
      /* name */ String, 
      /* options */ Shape, 
      /* scene */ js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]], 
      /* earcutInjection */ js.UndefOr[Any], 
      typings.babylonjs.BABYLON.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreatePolygon")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.PolygonBuilder.ExtrudePolygon")
  @js.native
  def ExtrudePolygon: js.Function4[
    /* name */ String, 
    /* options */ BackUVsDepth, 
    /* scene */ js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]], 
    /* earcutInjection */ js.UndefOr[Any], 
    typings.babylonjs.BABYLON.Mesh
  ] = js.native
  inline def ExtrudePolygon(name: String, options: BackUVsDepth): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def ExtrudePolygon(name: String, options: BackUVsDepth, scene: Unit, earcutInjection: Any): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def ExtrudePolygon(name: String, options: BackUVsDepth, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def ExtrudePolygon(
    name: String,
    options: BackUVsDepth,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    earcutInjection: Any
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def ExtrudePolygon_=(
    x: js.Function4[
      /* name */ String, 
      /* options */ BackUVsDepth, 
      /* scene */ js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]], 
      /* earcutInjection */ js.UndefOr[Any], 
      typings.babylonjs.BABYLON.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExtrudePolygon")(x.asInstanceOf[js.Any])
}
