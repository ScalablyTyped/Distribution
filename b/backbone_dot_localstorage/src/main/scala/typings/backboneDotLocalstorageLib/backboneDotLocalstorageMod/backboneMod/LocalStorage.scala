package typings
package backboneDotLocalstorageLib.backboneDotLocalstorageMod.backboneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone.localstorage/backbone", "LocalStorage")
@js.native
class LocalStorage protected () extends js.Object {
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, serializer: Serializer) = this()
  var name: java.lang.String = js.native
  var records: js.Array[java.lang.String] = js.native
  var serializer: Serializer = js.native
  // Clear localStorage for specific collection.
  def _clear(): scala.Unit = js.native
  def _itemName(id: js.Any): java.lang.String = js.native
  def _storageSize(): scala.Double = js.native
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
  def save(): scala.Unit = js.native
  // Update a model by replacing its copy in `this.data`.
  def update(model: js.Any): js.Any = js.native
}

