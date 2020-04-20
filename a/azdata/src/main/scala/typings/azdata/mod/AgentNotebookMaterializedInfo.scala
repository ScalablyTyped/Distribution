package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentNotebookMaterializedInfo extends js.Object {
  var favorite: Boolean
  var materializedId: Double
  var materializedName: String
  var targetDatabase: String
}

object AgentNotebookMaterializedInfo {
  @scala.inline
  def apply(favorite: Boolean, materializedId: Double, materializedName: String, targetDatabase: String): AgentNotebookMaterializedInfo = {
    val __obj = js.Dynamic.literal(favorite = favorite.asInstanceOf[js.Any], materializedId = materializedId.asInstanceOf[js.Any], materializedName = materializedName.asInstanceOf[js.Any], targetDatabase = targetDatabase.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentNotebookMaterializedInfo]
  }
}

