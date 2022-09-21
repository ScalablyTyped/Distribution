package typings.babylonjs.babylonjsIndexMod

import typings.babylonjs.anon.Cap
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CylinderBuilder {
  
  @JSImport("babylonjs/Meshes/index", "CylinderBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Meshes/index", "CylinderBuilder.CreateCylinder")
  @js.native
  def CreateCylinder: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[Cap], 
    /* scene */ js.UndefOr[Nullable[Scene]], 
    typings.babylonjs.meshMod.Mesh
  ] = js.native
  inline def CreateCylinder(name: String): typings.babylonjs.meshMod.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.meshMod.Mesh]
  inline def CreateCylinder(name: String, options: Unit, scene: Nullable[Scene]): typings.babylonjs.meshMod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshMod.Mesh]
  inline def CreateCylinder(name: String, options: Cap): typings.babylonjs.meshMod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshMod.Mesh]
  inline def CreateCylinder(name: String, options: Cap, scene: Nullable[Scene]): typings.babylonjs.meshMod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshMod.Mesh]
  inline def CreateCylinder_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[Cap], 
      /* scene */ js.UndefOr[Nullable[Scene]], 
      typings.babylonjs.meshMod.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateCylinder")(x.asInstanceOf[js.Any])
}
