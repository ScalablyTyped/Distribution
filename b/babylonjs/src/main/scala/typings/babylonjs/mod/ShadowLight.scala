package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "ShadowLight")
@js.native
abstract class ShadowLight protected ()
  extends typings.babylonjs.legacyMod.ShadowLight {
  /**
    * Creates a Light object in the scene.
    * Documentation : https://doc.babylonjs.com/babylon101/lights
    * @param name The firendly name of the light
    * @param scene The scene the light belongs too
    */
  def this(name: String, scene: typings.babylonjs.sceneMod.Scene) = this()
}
