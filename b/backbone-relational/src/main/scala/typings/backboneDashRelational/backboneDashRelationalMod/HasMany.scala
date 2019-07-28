package typings.backboneDashRelational.backboneDashRelationalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone-relational", "HasMany")
@js.native
class HasMany () extends Relation {
  var collectionType: js.Any = js.native
  def addRelated(model: typings.backbone.backboneMod.Model, options: js.Any): Unit = js.native
  def findRelated(options: js.Any): typings.backbone.backboneMod.Model = js.native
  def onChange(model: typings.backbone.backboneMod.Model, attr: js.Any, options: js.Any): Unit = js.native
  def removeRelated(model: typings.backbone.backboneMod.Model, coll: js.Any, options: js.Any): Unit = js.native
  def setKeyContents(keyContents: String): Unit = js.native
  def setKeyContents(keyContents: Double): Unit = js.native
  def setKeyContents(keyContents: typings.backbone.backboneMod.Model): Unit = js.native
  def tryAddRelated(model: typings.backbone.backboneMod.Model, coll: js.Any, options: js.Any): Unit = js.native
}

