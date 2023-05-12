package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.StandardMaterial")
@js.native
open class StandardMaterial protected ()
  extends StObject
     with typings.babylonjs.BABYLON.StandardMaterial {
  /**
    * Instantiates a new standard material.
    * This is the default material used in Babylon. It is the best trade off between quality
    * and performances.
    * @see https://doc.babylonjs.com/features/featuresDeepDive/materials/using/materials_introduction
    * @param name Define the name of the material in the scene
    * @param scene Define the scene the material belong to
    */
  def this(name: String) = this()
  def this(name: String, scene: typings.babylonjs.BABYLON.Scene) = this()
  
  /**
    * Array of animations
    */
  /* CompleteClass */
  var animations: Nullable[js.Array[typings.babylonjs.BABYLON.Animation]] = js.native
  
  /**
    * Gets or sets the active clipplane 1
    */
  /* CompleteClass */
  var clipPlane: Nullable[typings.babylonjs.BABYLON.Plane] = js.native
  
  /**
    * Gets or sets the active clipplane 2
    */
  /* CompleteClass */
  var clipPlane2: Nullable[typings.babylonjs.BABYLON.Plane] = js.native
  
  /**
    * Gets or sets the active clipplane 3
    */
  /* CompleteClass */
  var clipPlane3: Nullable[typings.babylonjs.BABYLON.Plane] = js.native
  
  /**
    * Gets or sets the active clipplane 4
    */
  /* CompleteClass */
  var clipPlane4: Nullable[typings.babylonjs.BABYLON.Plane] = js.native
  
  /**
    * Gets or sets the active clipplane 5
    */
  /* CompleteClass */
  var clipPlane5: Nullable[typings.babylonjs.BABYLON.Plane] = js.native
  
  /**
    * Gets or sets the active clipplane 6
    */
  /* CompleteClass */
  var clipPlane6: Nullable[typings.babylonjs.BABYLON.Plane] = js.native
}
/* static members */
object StandardMaterial {
  
  @JSGlobal("BABYLON.StandardMaterial")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a standard material from parsed material data
    * @param source defines the JSON representation of the material
    * @param scene defines the hosting scene
    * @param rootUrl defines the root URL to use to load textures and relative dependencies
    * @returns a new standard material
    */
  inline def Parse(source: Any, scene: typings.babylonjs.BABYLON.Scene, rootUrl: String): typings.babylonjs.BABYLON.StandardMaterial = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.StandardMaterial]
}
