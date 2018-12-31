package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class used to generate realtime reflection / refraction cube textures
  * @see http://doc.babylonjs.com/how_to/how_to_use_reflection_probes
  */
@JSImport("babylonjs", "ReflectionProbe")
@js.native
class ReflectionProbe protected ()
  extends babylonjsLib.BABYLONNs.ReflectionProbe {
  /**
    * Creates a new reflection probe
    * @param name defines the name of the probe
    * @param size defines the texture resolution (for each face)
    * @param scene defines the hosting scene
    * @param generateMipMaps defines if mip maps should be generated automatically (true by default)
    * @param useFloat defines if HDR data (flaot data) should be used to store colors (false by default)
    */
  def this(/** defines the name of the probe */
  name: java.lang.String, size: scala.Double, scene: babylonjsLib.BABYLONNs.Scene) = this()
  def this(/** defines the name of the probe */
  name: java.lang.String, size: scala.Double, scene: babylonjsLib.BABYLONNs.Scene, generateMipMaps: scala.Boolean) = this()
  def this(/** defines the name of the probe */
  name: java.lang.String, size: scala.Double, scene: babylonjsLib.BABYLONNs.Scene, generateMipMaps: scala.Boolean, useFloat: scala.Boolean) = this()
}

