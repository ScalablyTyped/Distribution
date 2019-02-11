package typings
package backboneDashRelationalLib.backboneDashRelationalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone-relational", "HasMany")
@js.native
class HasMany () extends Relation {
  var collectionType: js.Any = js.native
  def addRelated(model: backboneLib.backboneMod.Model, options: js.Any): scala.Unit = js.native
  def findRelated(options: js.Any): backboneLib.backboneMod.Model = js.native
  def onChange(model: backboneLib.backboneMod.Model, attr: js.Any, options: js.Any): scala.Unit = js.native
  def removeRelated(model: backboneLib.backboneMod.Model, coll: js.Any, options: js.Any): scala.Unit = js.native
  def setKeyContents(keyContents: backboneLib.backboneMod.Model): scala.Unit = js.native
  def setKeyContents(keyContents: java.lang.String): scala.Unit = js.native
  def setKeyContents(keyContents: scala.Double): scala.Unit = js.native
  def tryAddRelated(model: backboneLib.backboneMod.Model, coll: js.Any, options: js.Any): scala.Unit = js.native
}

