package typings.backboneAssociations.mod.Associations

import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("backbone", "Associations.AssociatedModel")
@js.native
class AssociatedModel ()
  extends Model[js.Any, ModelSetOptions, js.Object] {
  
  var _proxyCalls: js.Any = js.native
  
  /** Cleans up any parent relations on other AssociatedModels */
  def cleanup(): Unit = js.native
  
  /** Reverse association lookup for objects that contain this object */
  var parents: js.Array[_] = js.native
  
  /** Relations with their associated model */
  var relations: js.Array[IRelation] = js.native
}
