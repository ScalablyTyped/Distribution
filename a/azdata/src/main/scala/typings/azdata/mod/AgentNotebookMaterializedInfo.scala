package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentNotebookMaterializedInfo extends js.Object {
  
  var favorite: Boolean = js.native
  
  var materializedId: Double = js.native
  
  var materializedName: String = js.native
  
  var targetDatabase: String = js.native
}
object AgentNotebookMaterializedInfo {
  
  @scala.inline
  def apply(favorite: Boolean, materializedId: Double, materializedName: String, targetDatabase: String): AgentNotebookMaterializedInfo = {
    val __obj = js.Dynamic.literal(favorite = favorite.asInstanceOf[js.Any], materializedId = materializedId.asInstanceOf[js.Any], materializedName = materializedName.asInstanceOf[js.Any], targetDatabase = targetDatabase.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentNotebookMaterializedInfo]
  }
  
  @scala.inline
  implicit class AgentNotebookMaterializedInfoOps[Self <: AgentNotebookMaterializedInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFavorite(value: Boolean): Self = this.set("favorite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterializedId(value: Double): Self = this.set("materializedId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterializedName(value: String): Self = this.set("materializedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetDatabase(value: String): Self = this.set("targetDatabase", value.asInstanceOf[js.Any])
  }
}
