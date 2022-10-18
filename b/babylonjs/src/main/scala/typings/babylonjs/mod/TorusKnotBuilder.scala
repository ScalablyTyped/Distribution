package typings.babylonjs.mod

import typings.babylonjs.anon.P
import typings.babylonjs.meshesMeshMod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TorusKnotBuilder {
  
  @JSImport("babylonjs", "TorusKnotBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs", "TorusKnotBuilder.CreateTorusKnot")
  @js.native
  def CreateTorusKnot: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[P], 
    /* scene */ js.UndefOr[typings.babylonjs.sceneMod.Scene], 
    Mesh
  ] = js.native
  inline def CreateTorusKnot(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
  inline def CreateTorusKnot(name: String, options: Unit, scene: typings.babylonjs.sceneMod.Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTorusKnot(name: String, options: P): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTorusKnot(name: String, options: P, scene: typings.babylonjs.sceneMod.Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTorusKnot_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[P], 
      /* scene */ js.UndefOr[typings.babylonjs.sceneMod.Scene], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateTorusKnot")(x.asInstanceOf[js.Any])
}
