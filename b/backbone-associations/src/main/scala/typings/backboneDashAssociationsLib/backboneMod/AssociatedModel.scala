package typings
package backboneDashAssociationsLib.backboneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone", "AssociatedModel")
@js.native
class AssociatedModel ()
  extends backboneLib.backboneMod.Model {
  var _proxyCalls: js.Any = js.native
  /** Reverse association lookup for objects that contain this object */
  var parents: js.Array[_] = js.native
  /** Relations with their associated model */
  var relations: js.Array[backboneDashAssociationsLib.backboneMod.AssociationsNs.IRelation] = js.native
  /** Cleans up any parent relations on other AssociatedModels */
  def cleanup(): scala.Unit = js.native
}

