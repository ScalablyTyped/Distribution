package typings.babylonjs.buildersIndexMod

import typings.babylonjs.capsuleBuilderMod.ICreateCapsuleOptions
import typings.babylonjs.meshMod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Meshes/Builders/index", "CapsuleBuilder")
@js.native
class CapsuleBuilder ()
  extends typings.babylonjs.capsuleBuilderMod.CapsuleBuilder
/* static members */
object CapsuleBuilder {
  
  @JSImport("babylonjs/Meshes/Builders/index", "CapsuleBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  inline def CreateCapsule(name: String, options: Unit, scene: js.Any): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCapsule")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  /**
    * Creates a capsule or a pill mesh
    * @param name defines the name of the mesh
    * @param options The constructors options.
    * @param scene The scene the mesh is scoped to.
    * @returns Capsule Mesh
    */
  inline def CreateCapsule(name: String, options: ICreateCapsuleOptions, scene: js.Any): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCapsule")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
}
