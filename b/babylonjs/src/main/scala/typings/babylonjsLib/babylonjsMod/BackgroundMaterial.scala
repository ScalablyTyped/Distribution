package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Background material used to create an efficient environement around your scene.
     */
@JSImport("babylonjs", "BackgroundMaterial")
@js.native
class BackgroundMaterial protected ()
  extends babylonjsLib.BABYLONNs.BackgroundMaterial {
  /**
           * Instantiates a Background Material in the given scene
           * @param name The friendly name of the material
           * @param scene The scene to add the material to
           */
  def this(name: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene) = this()
}

/**
     * Background material used to create an efficient environement around your scene.
     */
@JSImport("babylonjs", "BackgroundMaterial")
@js.native
object BackgroundMaterial extends js.Object {
  /**
           * Standard reflectance value at parallel view angle.
           */
  var StandardReflectance0: scala.Double = js.native
  /**
           * Standard reflectance value at grazing angle.
           */
  var StandardReflectance90: scala.Double = js.native
  /**
           * Parse a JSON input to create back a background material.
           * @param source The JSON data to parse
           * @param scene The scene to create the parsed material in
           * @param rootUrl The root url of the assets the material depends upon
           * @returns the instantiated BackgroundMaterial.
           */
  def Parse(source: js.Any, scene: babylonjsLib.BABYLONNs.Scene, rootUrl: java.lang.String): babylonjsLib.BABYLONNs.BackgroundMaterial = js.native
}

