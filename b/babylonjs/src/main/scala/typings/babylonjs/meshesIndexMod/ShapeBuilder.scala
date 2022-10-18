package typings.babylonjs.meshesIndexMod

import typings.babylonjs.anon.AdjustFrame
import typings.babylonjs.anon.CloseShape
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ShapeBuilder {
  
  @JSImport("babylonjs/Meshes/index", "ShapeBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Meshes/index", "ShapeBuilder.ExtrudeShape")
  @js.native
  def ExtrudeShape: js.Function3[
    /* name */ String, 
    /* options */ AdjustFrame, 
    /* scene */ js.UndefOr[Nullable[Scene]], 
    Mesh
  ] = js.native
  inline def ExtrudeShape(name: String, options: AdjustFrame): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShape")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def ExtrudeShape(name: String, options: AdjustFrame, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShape")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  
  @JSImport("babylonjs/Meshes/index", "ShapeBuilder.ExtrudeShapeCustom")
  @js.native
  def ExtrudeShapeCustom: js.Function3[
    /* name */ String, 
    /* options */ CloseShape, 
    /* scene */ js.UndefOr[Nullable[Scene]], 
    Mesh
  ] = js.native
  inline def ExtrudeShapeCustom(name: String, options: CloseShape): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShapeCustom")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def ExtrudeShapeCustom(name: String, options: CloseShape, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShapeCustom")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def ExtrudeShapeCustom_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ CloseShape, 
      /* scene */ js.UndefOr[Nullable[Scene]], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExtrudeShapeCustom")(x.asInstanceOf[js.Any])
  
  inline def ExtrudeShape_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ AdjustFrame, 
      /* scene */ js.UndefOr[Nullable[Scene]], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExtrudeShape")(x.asInstanceOf[js.Any])
}
