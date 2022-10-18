package typings.babylonjs.mod

import typings.babylonjs.anon.Tessellation
import typings.babylonjs.meshesMeshMod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TorusBuilder {
  
  @JSImport("babylonjs", "TorusBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs", "TorusBuilder.CreateTorus")
  @js.native
  def CreateTorus: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[Tessellation], 
    /* scene */ js.UndefOr[typings.babylonjs.sceneMod.Scene], 
    Mesh
  ] = js.native
  inline def CreateTorus(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
  inline def CreateTorus(name: String, options: Unit, scene: typings.babylonjs.sceneMod.Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTorus(name: String, options: Tessellation): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTorus(name: String, options: Tessellation, scene: typings.babylonjs.sceneMod.Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTorus_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[Tessellation], 
      /* scene */ js.UndefOr[typings.babylonjs.sceneMod.Scene], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateTorus")(x.asInstanceOf[js.Any])
}
