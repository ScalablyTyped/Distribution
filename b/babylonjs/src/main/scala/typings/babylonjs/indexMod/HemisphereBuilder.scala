package typings.babylonjs.indexMod

import typings.babylonjs.anon.Segments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HemisphereBuilder {
  
  @JSImport("babylonjs/index", "HemisphereBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/index", "HemisphereBuilder.CreateHemisphere")
  @js.native
  def CreateHemisphere: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[Segments], 
    /* scene */ js.UndefOr[typings.babylonjs.sceneMod.Scene], 
    typings.babylonjs.meshesMeshMod.Mesh
  ] = js.native
  inline def CreateHemisphere(name: String): typings.babylonjs.meshesMeshMod.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateHemisphere")(name.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.meshesMeshMod.Mesh]
  inline def CreateHemisphere(name: String, options: Unit, scene: typings.babylonjs.sceneMod.Scene): typings.babylonjs.meshesMeshMod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateHemisphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesMeshMod.Mesh]
  inline def CreateHemisphere(name: String, options: Segments): typings.babylonjs.meshesMeshMod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateHemisphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesMeshMod.Mesh]
  inline def CreateHemisphere(name: String, options: Segments, scene: typings.babylonjs.sceneMod.Scene): typings.babylonjs.meshesMeshMod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateHemisphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesMeshMod.Mesh]
  inline def CreateHemisphere_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[Segments], 
      /* scene */ js.UndefOr[typings.babylonjs.sceneMod.Scene], 
      typings.babylonjs.meshesMeshMod.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateHemisphere")(x.asInstanceOf[js.Any])
}
