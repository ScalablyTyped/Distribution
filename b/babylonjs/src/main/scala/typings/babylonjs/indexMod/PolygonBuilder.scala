package typings.babylonjs.indexMod

import typings.babylonjs.anon.Depth
import typings.babylonjs.anon.Holes
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PolygonBuilder {
  
  @JSImport("babylonjs/index", "PolygonBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/index", "PolygonBuilder.CreatePolygon")
  @js.native
  def CreatePolygon: js.Function4[
    /* name */ String, 
    /* options */ Depth, 
    /* scene */ js.UndefOr[Nullable[typings.babylonjs.sceneMod.Scene]], 
    /* earcutInjection */ js.UndefOr[Any], 
    Mesh
  ] = js.native
  inline def CreatePolygon(name: String, options: Depth): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreatePolygon(name: String, options: Depth, scene: Unit, earcutInjection: Any): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreatePolygon(name: String, options: Depth, scene: Nullable[typings.babylonjs.sceneMod.Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreatePolygon(
    name: String,
    options: Depth,
    scene: Nullable[typings.babylonjs.sceneMod.Scene],
    earcutInjection: Any
  ): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreatePolygon_=(
    x: js.Function4[
      /* name */ String, 
      /* options */ Depth, 
      /* scene */ js.UndefOr[Nullable[typings.babylonjs.sceneMod.Scene]], 
      /* earcutInjection */ js.UndefOr[Any], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreatePolygon")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "PolygonBuilder.ExtrudePolygon")
  @js.native
  def ExtrudePolygon: js.Function4[
    /* name */ String, 
    /* options */ Holes, 
    /* scene */ js.UndefOr[Nullable[typings.babylonjs.sceneMod.Scene]], 
    /* earcutInjection */ js.UndefOr[Any], 
    Mesh
  ] = js.native
  inline def ExtrudePolygon(name: String, options: Holes): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def ExtrudePolygon(name: String, options: Holes, scene: Unit, earcutInjection: Any): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def ExtrudePolygon(name: String, options: Holes, scene: Nullable[typings.babylonjs.sceneMod.Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def ExtrudePolygon(
    name: String,
    options: Holes,
    scene: Nullable[typings.babylonjs.sceneMod.Scene],
    earcutInjection: Any
  ): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def ExtrudePolygon_=(
    x: js.Function4[
      /* name */ String, 
      /* options */ Holes, 
      /* scene */ js.UndefOr[Nullable[typings.babylonjs.sceneMod.Scene]], 
      /* earcutInjection */ js.UndefOr[Any], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExtrudePolygon")(x.asInstanceOf[js.Any])
}
