package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Class used to serialize a scene into a string
     */
@JSGlobal("BABYLON.SceneSerializer")
@js.native
class SceneSerializer () extends js.Object

/**
     * Class used to serialize a scene into a string
     */
@JSGlobal("BABYLON.SceneSerializer")
@js.native
object SceneSerializer extends js.Object {
  /**
           * Clear cache used by a previous serialization
           */
  def ClearCache(): scala.Unit = js.native
  /**
           * Serialize a scene into a JSON compatible object
           * @param scene defines the scene to serialize
           * @returns a JSON compatible object
           */
  def Serialize(scene: babylonjsLib.BABYLONNs.Scene): js.Any = js.native
  /**
           * Serialize a mesh into a JSON compatible object
           * @param toSerialize defines the mesh to serialize
           * @param withParents defines if parents must be serialized as well
           * @param withChildren defines if children must be serialized as well
           * @returns a JSON compatible object
           */
  def SerializeMesh(toSerialize: js.Any): js.Any = js.native
  /**
           * Serialize a mesh into a JSON compatible object
           * @param toSerialize defines the mesh to serialize
           * @param withParents defines if parents must be serialized as well
           * @param withChildren defines if children must be serialized as well
           * @returns a JSON compatible object
           */
  def SerializeMesh(toSerialize: js.Any, withParents: scala.Boolean): js.Any = js.native
  /**
           * Serialize a mesh into a JSON compatible object
           * @param toSerialize defines the mesh to serialize
           * @param withParents defines if parents must be serialized as well
           * @param withChildren defines if children must be serialized as well
           * @returns a JSON compatible object
           */
  def SerializeMesh(toSerialize: js.Any, withParents: scala.Boolean, withChildren: scala.Boolean): js.Any = js.native
}

