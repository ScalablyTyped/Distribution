package typings.babylonjs.babylonjsIndexMod

import typings.babylonjs.capsuleBuilderMod.ICreateCapsuleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Meshes/index", "CapsuleBuilder")
@js.native
class CapsuleBuilder ()
  extends typings.babylonjs.buildersIndexMod.CapsuleBuilder
/* static members */
@JSImport("babylonjs/Meshes/index", "CapsuleBuilder")
@js.native
object CapsuleBuilder extends js.Object {
  
  def CreateCapsule(name: String, options: js.UndefOr[scala.Nothing], scene: js.Any): typings.babylonjs.meshMod.Mesh = js.native
  /**
    * Creates a capsule or a pill mesh
    * @param name defines the name of the mesh
    * @param options The constructors options.
    * @param scene The scene the mesh is scoped to.
    * @returns Capsule Mesh
    */
  def CreateCapsule(name: String, options: ICreateCapsuleOptions, scene: js.Any): typings.babylonjs.meshMod.Mesh = js.native
}
