package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiMaterial extends Material {
  
  var _hookArray: js.Any = js.native
  
  var _subMaterials: js.Any = js.native
  
  def clone(name: String, cloneChildren: Boolean): MultiMaterial = js.native
  
  /**
    * Function used to align with Node.getChildren()
    * @returns the list of Materials used within the multi material
    */
  def getChildren(): js.Array[Nullable[Material]] = js.native
  
  /**
    * Get one of the submaterial by its index in the submaterials array
    * @param index The index to look the sub material at
    * @returns The Material if the index has been defined
    */
  def getSubMaterial(index: Double): Nullable[Material] = js.native
  
  /**
    * Gets or Sets the list of Materials used within the multi material.
    * They need to be ordered according to the submeshes order in the associated mesh
    */
  def subMaterials: js.Array[Nullable[Material]] = js.native
  def subMaterials_=(value: js.Array[Nullable[Material]]): Unit = js.native
}
