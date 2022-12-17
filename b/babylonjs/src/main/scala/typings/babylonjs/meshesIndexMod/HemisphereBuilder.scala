package typings.babylonjs.meshesIndexMod

import typings.babylonjs.anon.Segments
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HemisphereBuilder {
  
  @JSImport("babylonjs/Meshes/index", "HemisphereBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Meshes/index", "HemisphereBuilder.CreateHemisphere")
  @js.native
  def CreateHemisphere: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[Segments], 
    /* scene */ js.UndefOr[Scene], 
    typings.babylonjs.meshesMeshMod.Mesh
  ] = js.native
  inline def CreateHemisphere(name: String): typings.babylonjs.meshesMeshMod.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateHemisphere")(name.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.meshesMeshMod.Mesh]
  inline def CreateHemisphere(name: String, options: Unit, scene: Scene): typings.babylonjs.meshesMeshMod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateHemisphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesMeshMod.Mesh]
  inline def CreateHemisphere(name: String, options: Segments): typings.babylonjs.meshesMeshMod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateHemisphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesMeshMod.Mesh]
  inline def CreateHemisphere(name: String, options: Segments, scene: Scene): typings.babylonjs.meshesMeshMod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateHemisphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesMeshMod.Mesh]
  inline def CreateHemisphere_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[Segments], 
      /* scene */ js.UndefOr[Scene], 
      typings.babylonjs.meshesMeshMod.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateHemisphere")(x.asInstanceOf[js.Any])
}
