package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.ICreateCapsuleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.CapsuleBuilder")
@js.native
class CapsuleBuilder ()
  extends typings.babylonjs.BABYLON.CapsuleBuilder
/* static members */
object CapsuleBuilder {
  
  @JSGlobal("BABYLON.CapsuleBuilder.CreateCapsule")
  @js.native
  def CreateCapsule(name: String, options: js.UndefOr[scala.Nothing], scene: js.Any): typings.babylonjs.BABYLON.Mesh = js.native
  /**
    * Creates a capsule or a pill mesh
    * @param name defines the name of the mesh
    * @param options The constructors options.
    * @param scene The scene the mesh is scoped to.
    * @returns Capsule Mesh
    */
  @JSGlobal("BABYLON.CapsuleBuilder.CreateCapsule")
  @js.native
  def CreateCapsule(name: String, options: ICreateCapsuleOptions, scene: js.Any): typings.babylonjs.BABYLON.Mesh = js.native
}
