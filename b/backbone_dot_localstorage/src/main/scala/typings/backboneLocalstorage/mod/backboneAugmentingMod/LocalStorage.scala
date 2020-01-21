package typings.backboneLocalstorage.mod.backboneAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone", "LocalStorage")
@js.native
class LocalStorage protected () extends js.Object {
  def this(name: String) = this()
  def this(name: String, serializer: Serializer) = this()
  var name: String = js.native
  var records: js.Array[String] = js.native
  var serializer: Serializer = js.native
  // Clear localStorage for specific collection.
  def _clear(): Unit = js.native
  def _itemName(id: js.Any): String = js.native
  def _storageSize(): Double = js.native
  // Add a model, giving it a (hopefully)-unique GUID, if it doesn't already
  // have an id of it's own.
  def create(model: js.Any): js.Any = js.native
  // Delete a model from `this.data`, returning it.
  def destroy[T](model: T): T = js.native
  // Retrieve a model from `this.data` by id.
  def find(model: js.Any): js.Any = js.native
  // Return the array of all models currently in storage.
  def findAll(): js.Any = js.native
  def localStorage(): js.Any = js.native
  def save(): Unit = js.native
  // Update a model by replacing its copy in `this.data`.
  def update(model: js.Any): js.Any = js.native
}

