package typings.backboneRelational.mod

import typings.backbone.mod.ModelSetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone-relational", "HasMany")
@js.native
class HasMany () extends Relation {
  var collectionType: js.Any = js.native
  def addRelated(model: typings.backbone.mod.Model[_, ModelSetOptions], options: js.Any): Unit = js.native
  def findRelated(options: js.Any): typings.backbone.mod.Model[_, ModelSetOptions] = js.native
  def onChange(model: typings.backbone.mod.Model[_, ModelSetOptions], attr: js.Any, options: js.Any): Unit = js.native
  def removeRelated(model: typings.backbone.mod.Model[_, ModelSetOptions], coll: js.Any, options: js.Any): Unit = js.native
  def setKeyContents(keyContents: String): Unit = js.native
  def setKeyContents(keyContents: Double): Unit = js.native
  def setKeyContents(keyContents: typings.backbone.mod.Model[_, ModelSetOptions]): Unit = js.native
  def tryAddRelated(model: typings.backbone.mod.Model[_, ModelSetOptions], coll: js.Any, options: js.Any): Unit = js.native
}

