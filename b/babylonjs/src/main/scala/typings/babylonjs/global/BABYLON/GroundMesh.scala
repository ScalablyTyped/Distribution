package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.GroundMesh")
@js.native
class GroundMesh protected ()
  extends typings.babylonjs.BABYLON.GroundMesh {
  def this(name: String, scene: typings.babylonjs.BABYLON.Scene) = this()
}
/* static members */
object GroundMesh {
  
  /**
    * Parses a serialized ground mesh
    * @param parsedMesh the serialized mesh
    * @param scene the scene to create the ground mesh in
    * @returns the created ground mesh
    */
  @JSGlobal("BABYLON.GroundMesh.Parse")
  @js.native
  def Parse(parsedMesh: js.Any, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.GroundMesh = js.native
}
