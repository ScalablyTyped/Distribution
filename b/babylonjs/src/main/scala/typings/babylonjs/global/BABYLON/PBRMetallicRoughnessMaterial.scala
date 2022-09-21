package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PBRMetallicRoughnessMaterial")
@js.native
open class PBRMetallicRoughnessMaterial protected ()
  extends StObject
     with typings.babylonjs.BABYLON.PBRMetallicRoughnessMaterial {
  /**
    * Instantiates a new PBRMetalRoughnessMaterial instance.
    *
    * @param name The material name
    * @param scene The scene the material will be use in.
    */
  def this(name: String) = this()
  def this(name: String, scene: typings.babylonjs.BABYLON.Scene) = this()
  
  /**
    * Array of animations
    */
  /* CompleteClass */
  var animations: Nullable[js.Array[typings.babylonjs.BABYLON.Animation]] = js.native
}
/* static members */
object PBRMetallicRoughnessMaterial {
  
  @JSGlobal("BABYLON.PBRMetallicRoughnessMaterial")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parses a JSON object corresponding to the serialize function.
    * @param source
    * @param scene
    * @param rootUrl
    */
  inline def Parse(source: Any, scene: typings.babylonjs.BABYLON.Scene, rootUrl: String): typings.babylonjs.BABYLON.PBRMetallicRoughnessMaterial = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.PBRMetallicRoughnessMaterial]
}
