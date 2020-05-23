package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.BackgroundMaterial")
@js.native
class BackgroundMaterial protected ()
  extends typings.babylonjs.BABYLON.BackgroundMaterial {
  /**
    * Instantiates a Background Material in the given scene
    * @param name The friendly name of the material
    * @param scene The scene to add the material to
    */
  def this(name: String, scene: typings.babylonjs.BABYLON.Scene) = this()
  /**
    * Array of animations
    */
  /* CompleteClass */
  override var animations: Nullable[js.Array[typings.babylonjs.BABYLON.Animation]] = js.native
}

/* static members */
@JSGlobal("BABYLON.BackgroundMaterial")
@js.native
object BackgroundMaterial extends js.Object {
  /**
    * Standard reflectance value at parallel view angle.
    */
  var StandardReflectance0: Double = js.native
  /**
    * Standard reflectance value at grazing angle.
    */
  var StandardReflectance90: Double = js.native
  /**
    * Parse a JSON input to create back a background material.
    * @param source The JSON data to parse
    * @param scene The scene to create the parsed material in
    * @param rootUrl The root url of the assets the material depends upon
    * @returns the instantiated BackgroundMaterial.
    */
  def Parse(source: js.Any, scene: typings.babylonjs.BABYLON.Scene, rootUrl: String): typings.babylonjs.BABYLON.BackgroundMaterial = js.native
}

