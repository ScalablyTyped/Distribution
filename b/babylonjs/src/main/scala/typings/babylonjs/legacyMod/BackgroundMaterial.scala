package typings.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "BackgroundMaterial")
@js.native
class BackgroundMaterial protected ()
  extends typings.babylonjs.indexMod.BackgroundMaterial {
  /**
    * Instantiates a Background Material in the given scene
    * @param name The friendly name of the material
    * @param scene The scene to add the material to
    */
  def this(name: String, scene: typings.babylonjs.sceneMod.Scene) = this()
}
/* static members */
@JSImport("babylonjs/Legacy/legacy", "BackgroundMaterial")
@js.native
object BackgroundMaterial extends js.Object {
  
  /**
    * Parse a JSON input to create back a background material.
    * @param source The JSON data to parse
    * @param scene The scene to create the parsed material in
    * @param rootUrl The root url of the assets the material depends upon
    * @returns the instantiated BackgroundMaterial.
    */
  def Parse(source: js.Any, scene: typings.babylonjs.sceneMod.Scene, rootUrl: String): typings.babylonjs.backgroundMaterialMod.BackgroundMaterial = js.native
  
  /**
    * Standard reflectance value at parallel view angle.
    */
  var StandardReflectance0: Double = js.native
  
  /**
    * Standard reflectance value at grazing angle.
    */
  var StandardReflectance90: Double = js.native
}
