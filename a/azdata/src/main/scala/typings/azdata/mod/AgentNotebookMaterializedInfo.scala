package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentNotebookMaterializedInfo extends StObject {
  
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
  implicit class AgentNotebookMaterializedInfoMutableBuilder[Self <: AgentNotebookMaterializedInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFavorite(value: Boolean): Self = StObject.set(x, "favorite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterializedId(value: Double): Self = StObject.set(x, "materializedId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterializedName(value: String): Self = StObject.set(x, "materializedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetDatabase(value: String): Self = StObject.set(x, "targetDatabase", value.asInstanceOf[js.Any])
  }
}
