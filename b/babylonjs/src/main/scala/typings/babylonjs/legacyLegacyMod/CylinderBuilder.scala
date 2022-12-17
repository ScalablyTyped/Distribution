package typings.babylonjs.legacyLegacyMod

import typings.babylonjs.anon.Cap
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
    /* options */ js.UndefOr[Cap], 
    /* scene */ js.UndefOr[Nullable[typings.babylonjs.sceneMod.Scene]], 
    typings.babylonjs.meshesMeshMod.Mesh
  ] = js.native
  inline def CreateCylinder(name: String): typings.babylonjs.meshesMeshMod.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.meshesMeshMod.Mesh]
  inline def CreateCylinder(name: String, options: Unit, scene: Nullable[typings.babylonjs.sceneMod.Scene]): typings.babylonjs.meshesMeshMod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesMeshMod.Mesh]
  inline def CreateCylinder(name: String, options: Cap): typings.babylonjs.meshesMeshMod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesMeshMod.Mesh]
  inline def CreateCylinder(name: String, options: Cap, scene: Nullable[typings.babylonjs.sceneMod.Scene]): typings.babylonjs.meshesMeshMod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesMeshMod.Mesh]
  inline def CreateCylinder_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[Cap], 
      /* scene */ js.UndefOr[Nullable[typings.babylonjs.sceneMod.Scene]], 
      typings.babylonjs.meshesMeshMod.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateCylinder")(x.asInstanceOf[js.Any])
}
