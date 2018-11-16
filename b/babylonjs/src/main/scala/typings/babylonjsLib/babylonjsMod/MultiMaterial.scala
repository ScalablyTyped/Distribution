package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A multi-material is used to apply different materials to different parts of the same object without the need of
     * separate meshes. This can be use to improve performances.
     * @see http://doc.babylonjs.com/how_to/multi_materials
     */
@JSImport("babylonjs", "MultiMaterial")
@js.native
class MultiMaterial protected ()
  extends babylonjsLib.BABYLONNs.MultiMaterial {
  /**
           * Instantiates a new Multi Material
           * A multi-material is used to apply different materials to different parts of the same object without the need of
           * separate meshes. This can be use to improve performances.
           * @see http://doc.babylonjs.com/how_to/multi_materials
           * @param name Define the name in the scene
           * @param scene Define the scene the material belongs to
           */
  def this(name: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene) = this()
}

