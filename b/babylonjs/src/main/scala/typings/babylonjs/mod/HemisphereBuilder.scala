package typings.babylonjs.mod

import typings.babylonjs.anon.Diameter
import typings.babylonjs.meshesMeshMod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HemisphereBuilder {
  
  @JSImport("babylonjs", "HemisphereBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs", "HemisphereBuilder.CreateHemisphere")
  @js.native
  def CreateHemisphere: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[Diameter], 
    /* scene */ js.UndefOr[typings.babylonjs.sceneMod.Scene], 
    Mesh
  ] = js.native
  inline def CreateHemisphere(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateHemisphere")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
  inline def CreateHemisphere(name: String, options: Unit, scene: typings.babylonjs.sceneMod.Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateHemisphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateHemisphere(name: String, options: Diameter): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateHemisphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateHemisphere(name: String, options: Diameter, scene: typings.babylonjs.sceneMod.Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateHemisphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateHemisphere_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[Diameter], 
      /* scene */ js.UndefOr[typings.babylonjs.sceneMod.Scene], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateHemisphere")(x.asInstanceOf[js.Any])
}
