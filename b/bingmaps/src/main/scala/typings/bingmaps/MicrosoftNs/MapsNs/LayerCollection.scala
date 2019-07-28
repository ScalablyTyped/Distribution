package typings.bingmaps.MicrosoftNs.MapsNs

import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.LayerCollection")
@js.native
class LayerCollection ()
  extends Array[
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for T */ js.Any
    ] {
  /**
    * Removes all layers from the map.
    */
  def clear(): Unit = js.native
  /**
    * Gets the index of a layer in the collection.
    * @param layer The layer to get the index of.
    * @returns The index of the specified layer.
    */
  def indexOf(layer: ILayer): Double = js.native
  /**
    * Adds a layer to the map.
    * @param layer The layer to insert into the collection.
    */
  def insert(layer: ILayer): Unit = js.native
  /**
    * Adds an array of layers to the map.
    * @param layers The layers to insert into the collection.
    */
  def insertAll(layers: js.Array[ILayer]): Unit = js.native
  /**
    * Removes a layer from the map.
    * @param layer The layer to remove from the collection.
    */
  def remove(layer: ILayer): Unit = js.native
  /**
    * Removes a layer from the map at the specified index in the collection.        
    * @param idx The index of the layer to remove.
    */
  def removeAt(idx: Double): Unit = js.native
}

