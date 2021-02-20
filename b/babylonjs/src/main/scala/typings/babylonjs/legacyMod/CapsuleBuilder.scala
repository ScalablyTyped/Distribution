package typings.babylonjs.legacyMod

import typings.babylonjs.capsuleBuilderMod.ICreateCapsuleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "CapsuleBuilder")
@js.native
class CapsuleBuilder ()
  extends typings.babylonjs.indexMod.CapsuleBuilder
/* static members */
object CapsuleBuilder {
  
  @JSImport("babylonjs/Legacy/legacy", "CapsuleBuilder.CreateCapsule")
  @js.native
  def CreateCapsule(name: String, options: js.UndefOr[scala.Nothing], scene: js.Any): typings.babylonjs.meshMod.Mesh = js.native
  /**
    * Creates a capsule or a pill mesh
    * @param name defines the name of the mesh
    * @param options The constructors options.
    * @param scene The scene the mesh is scoped to.
    * @returns Capsule Mesh
    */
  @JSImport("babylonjs/Legacy/legacy", "CapsuleBuilder.CreateCapsule")
  @js.native
  def CreateCapsule(name: String, options: ICreateCapsuleOptions, scene: js.Any): typings.babylonjs.meshMod.Mesh = js.native
}
