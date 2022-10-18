package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "GroundMesh")
@js.native
open class GroundMesh protected ()
  extends typings.babylonjs.meshesIndexMod.GroundMesh {
  def this(name: String) = this()
  def this(name: String, scene: typings.babylonjs.sceneMod.Scene) = this()
}
/* static members */
object GroundMesh {
  
  @JSImport("babylonjs/index", "GroundMesh")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parses a serialized ground mesh
    * @param parsedMesh the serialized mesh
    * @param scene the scene to create the ground mesh in
    * @returns the created ground mesh
    */
  inline def Parse(parsedMesh: Any, scene: typings.babylonjs.sceneMod.Scene): typings.babylonjs.meshesGroundMeshMod.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedMesh.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesGroundMeshMod.GroundMesh]
}
