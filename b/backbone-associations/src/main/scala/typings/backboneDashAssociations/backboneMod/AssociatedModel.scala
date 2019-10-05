package typings.backboneDashAssociations.backboneMod

import typings.backbone.backboneMod.Model
import typings.backboneDashAssociations.backboneMod.Associations.IRelation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone", "AssociatedModel")
@js.native
class AssociatedModel () extends Model {
  var _proxyCalls: js.Any = js.native
  /** Reverse association lookup for objects that contain this object */
  var parents: js.Array[_] = js.native
  /** Relations with their associated model */
  var relations: js.Array[IRelation] = js.native
  /** Cleans up any parent relations on other AssociatedModels */
  def cleanup(): Unit = js.native
}

