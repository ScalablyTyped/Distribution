package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A multi-material is used to apply different materials to different parts of the same object without the need of
  * separate meshes. This can be use to improve performances.
  * @see http://doc.babylonjs.com/how_to/multi_materials
  */
@JSGlobal("BABYLON.MultiMaterial")
@js.native
class MultiMaterial protected () extends Material {
  /**
    * Instantiates a new Multi Material
    * A multi-material is used to apply different materials to different parts of the same object without the need of
    * separate meshes. This can be use to improve performances.
    * @see http://doc.babylonjs.com/how_to/multi_materials
    * @param name Define the name in the scene
    * @param scene Define the scene the material belongs to
    */
  def this(name: java.lang.String, scene: Scene) = this()
  var _hookArray: js.Any = js.native
  var _subMaterials: js.Any = js.native
  /**
    * Gets or Sets the list of Materials used within the multi material.
    * They need to be ordered according to the submeshes order in the associated mesh
    */
  var subMaterials: js.Array[Nullable[Material]] = js.native
  def clone(name: java.lang.String, cloneChildren: scala.Boolean): MultiMaterial = js.native
  /**
    * Get one of the submaterial by its index in the submaterials array
    * @param index The index to look the sub material at
    * @returns The Material if the index has been defined
    */
  def getSubMaterial(index: scala.Double): Nullable[Material] = js.native
}

