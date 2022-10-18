package typings.babylonjs.meshesIndexMod

import typings.babylonjs.anon.P
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TorusKnotBuilder {
  
  @JSImport("babylonjs/Meshes/index", "TorusKnotBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Meshes/index", "TorusKnotBuilder.CreateTorusKnot")
  @js.native
  def CreateTorusKnot: js.Function3[/* name */ String, /* options */ js.UndefOr[P], /* scene */ js.UndefOr[Scene], Mesh] = js.native
  inline def CreateTorusKnot(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
  inline def CreateTorusKnot(name: String, options: Unit, scene: Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTorusKnot(name: String, options: P): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTorusKnot(name: String, options: P, scene: Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTorusKnot_=(
    x: js.Function3[/* name */ String, /* options */ js.UndefOr[P], /* scene */ js.UndefOr[Scene], Mesh]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateTorusKnot")(x.asInstanceOf[js.Any])
}
