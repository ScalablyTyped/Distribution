package typings.babylonjs.legacyLegacyMod

import typings.babylonjs.anon.Arc
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CylinderBuilder {
  
  @JSImport("babylonjs/Legacy/legacy", "CylinderBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "CylinderBuilder.CreateCylinder")
  @js.native
  def CreateCylinder: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[Arc], 
    /* scene */ js.UndefOr[Nullable[typings.babylonjs.sceneMod.Scene]], 
    Mesh
  ] = js.native
  inline def CreateCylinder(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
  inline def CreateCylinder(name: String, options: Unit, scene: Nullable[typings.babylonjs.sceneMod.Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateCylinder(name: String, options: Arc): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateCylinder(name: String, options: Arc, scene: Nullable[typings.babylonjs.sceneMod.Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateCylinder_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[Arc], 
      /* scene */ js.UndefOr[Nullable[typings.babylonjs.sceneMod.Scene]], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateCylinder")(x.asInstanceOf[js.Any])
}
