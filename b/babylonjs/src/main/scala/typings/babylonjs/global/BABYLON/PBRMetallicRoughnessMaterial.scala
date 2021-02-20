package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PBRMetallicRoughnessMaterial")
@js.native
class PBRMetallicRoughnessMaterial protected ()
  extends typings.babylonjs.BABYLON.PBRMetallicRoughnessMaterial {
  /**
    * Instantiates a new PBRMetalRoughnessMaterial instance.
    *
    * @param name The material name
    * @param scene The scene the material will be use in.
    */
  def this(name: String, scene: typings.babylonjs.BABYLON.Scene) = this()
}
/* static members */
object PBRMetallicRoughnessMaterial {
  
  /**
    * Parses a JSON object correponding to the serialize function.
    */
  @JSGlobal("BABYLON.PBRMetallicRoughnessMaterial.Parse")
  @js.native
  def Parse(source: js.Any, scene: typings.babylonjs.BABYLON.Scene, rootUrl: String): typings.babylonjs.BABYLON.PBRMetallicRoughnessMaterial = js.native
}
