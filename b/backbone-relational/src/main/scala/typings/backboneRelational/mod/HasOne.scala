package typings.backboneRelational.mod

import typings.backbone.mod.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone-relational", "HasOne")
@js.native
class HasOne () extends Relation {
  var collectionType: js.Any = js.native
  def addRelated(model: typings.backbone.mod.Model, options: js.Any): Unit = js.native
  def findRelated(options: js.Any): typings.backbone.mod.Model = js.native
  def handleAddition(model: typings.backbone.mod.Model, coll: Collection[typings.backbone.mod.Model], options: js.Any): Unit = js.native
  def handleRemoval(model: typings.backbone.mod.Model, coll: Collection[typings.backbone.mod.Model], options: js.Any): Unit = js.native
  def handleReset(coll: Collection[typings.backbone.mod.Model], options: js.Any): Unit = js.native
  def onChange(model: typings.backbone.mod.Model, attr: js.Any, options: js.Any): Unit = js.native
  def removeRelated(model: typings.backbone.mod.Model, coll: js.Any, options: js.Any): Unit = js.native
  def setKeyContents(keyContents: String): Unit = js.native
  def setKeyContents(keyContents: js.Array[Double | String]): Unit = js.native
  def setKeyContents(keyContents: Double): Unit = js.native
  def setKeyContents(keyContents: Collection[typings.backbone.mod.Model]): Unit = js.native
  def tryAddRelated(model: typings.backbone.mod.Model, coll: js.Any, options: js.Any): Unit = js.native
}

