package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Class used to help serialization objects
     */
@JSImport("babylonjs", "SerializationHelper")
@js.native
class SerializationHelper ()
  extends babylonjsLib.BABYLONNs.SerializationHelper

/**
     * Class used to help serialization objects
     */
@JSImport("babylonjs", "SerializationHelper")
@js.native
object SerializationHelper extends js.Object {
  /**
           * Clones an object
           * @param creationFunction defines the function used to instanciate the new object
           * @param source defines the source object
           * @returns the cloned object
           */
  def Clone[T](creationFunction: js.Function0[T], source: T): T = js.native
  /**
           * Instanciates a new object based on a source one (some data will be shared between both object)
           * @param creationFunction defines the function used to instanciate the new object
           * @param source defines the source object
           * @returns the new object
           */
  def Instanciate[T](creationFunction: js.Function0[T], source: T): T = js.native
  /**
           * Creates a new entity from a serialization data object
           * @param creationFunction defines a function used to instanciated the new entity
           * @param source defines the source serialization data
           * @param scene defines the hosting scene
           * @param rootUrl defines the root url for resources
           * @returns a new entity
           */
  def Parse[T](
    creationFunction: js.Function0[T],
    source: js.Any,
    scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene]
  ): T = js.native
  /**
           * Creates a new entity from a serialization data object
           * @param creationFunction defines a function used to instanciated the new entity
           * @param source defines the source serialization data
           * @param scene defines the hosting scene
           * @param rootUrl defines the root url for resources
           * @returns a new entity
           */
  def Parse[T](
    creationFunction: js.Function0[T],
    source: js.Any,
    scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene],
    rootUrl: babylonjsLib.BABYLONNs.Nullable[java.lang.String]
  ): T = js.native
  /**
           * Static function used to serialized a specific entity
           * @param entity defines the entity to serialize
           * @param serializationObject defines the optional target obecjt where serialization data will be stored
           * @returns a JSON compatible object representing the serialization of the entity
           */
  def Serialize[T](entity: T): js.Any = js.native
  /**
           * Static function used to serialized a specific entity
           * @param entity defines the entity to serialize
           * @param serializationObject defines the optional target obecjt where serialization data will be stored
           * @returns a JSON compatible object representing the serialization of the entity
           */
  def Serialize[T](entity: T, serializationObject: js.Any): js.Any = js.native
}

