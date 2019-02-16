package typings
package backboneDashRelationalLib.backboneDashRelationalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone-relational", "Relation")
@js.native
class Relation ()
  extends backboneLib.backboneMod.Model {
  var instance: js.Any = js.native
  var key: js.Any = js.native
  var keyContents: js.Any = js.native
  var options: js.Any = js.native
  var related: js.Any = js.native
  var relatedCollection: js.Any = js.native
  var relatedModel: js.Any = js.native
  var reverseRelation: js.Any = js.native
  def checkPreconditions(): scala.Boolean = js.native
  def destroy(): scala.Unit = js.native
  def getReverseRelations(model: Model): Relation = js.native
  def setRelated(related: backboneLib.backboneMod.Collection[backboneLib.backboneMod.Model]): scala.Unit = js.native
  def setRelated(related: backboneLib.backboneMod.Model): scala.Unit = js.native
}

