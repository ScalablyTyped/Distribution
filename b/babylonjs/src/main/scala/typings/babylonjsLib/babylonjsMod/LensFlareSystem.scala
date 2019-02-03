package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents a Lens Flare System or the shiny effect created by the light reflection on the  camera lenses.
  * It is usually composed of several `BABYLON.lensFlare`.
  * @see http://doc.babylonjs.com/how_to/how_to_use_lens_flares
  */
@JSImport("babylonjs", "LensFlareSystem")
@js.native
class LensFlareSystem protected ()
  extends babylonjsLib.BABYLONNs.LensFlareSystem {
  /**
    * Instantiates a lens flare system.
    * This represents a Lens Flare System or the shiny effect created by the light reflection on the  camera lenses.
    * It is usually composed of several `BABYLON.lensFlare`.
    * @see http://doc.babylonjs.com/how_to/how_to_use_lens_flares
    * @param name Define the name of the lens flare system in the scene
    * @param emitter Define the source (the emitter) of the lens flares (it can be a camera, a light or a mesh).
    * @param scene Define the scene the lens flare system belongs to
    */
  def this(/**
    * Define the name of the lens flare system
    */
  name: java.lang.String, emitter: js.Any, scene: babylonjsLib.BABYLONNs.Scene) = this()
}

/* static members */
@JSImport("babylonjs", "LensFlareSystem")
@js.native
object LensFlareSystem extends js.Object {
  /**
    * Parse a lens flare system from a JSON repressentation
    * @param parsedLensFlareSystem Define the JSON to parse
    * @param scene Define the scene the parsed system should be instantiated in
    * @param rootUrl Define the rootUrl of the load sequence to easily find a load relative dependencies such as textures
    * @returns the parsed system
    */
  def Parse(parsedLensFlareSystem: js.Any, scene: babylonjsLib.BABYLONNs.Scene, rootUrl: java.lang.String): babylonjsLib.BABYLONNs.LensFlareSystem = js.native
}

