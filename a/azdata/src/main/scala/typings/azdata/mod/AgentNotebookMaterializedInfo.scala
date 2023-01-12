package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentNotebookMaterializedInfo extends StObject {
  
  var favorite: Boolean
  
  var materializedId: Double
  
  var materializedName: String
  
  var targetDatabase: String
}
object AgentNotebookMaterializedInfo {
  
  inline def apply(favorite: Boolean, materializedId: Double, materializedName: String, targetDatabase: String): AgentNotebookMaterializedInfo = {
    val __obj = js.Dynamic.literal(favorite = favorite.asInstanceOf[js.Any], materializedId = materializedId.asInstanceOf[js.Any], materializedName = materializedName.asInstanceOf[js.Any], targetDatabase = targetDatabase.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentNotebookMaterializedInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AgentNotebookMaterializedInfo] (val x: Self) extends AnyVal {
    
    inline def setFavorite(value: Boolean): Self = StObject.set(x, "favorite", value.asInstanceOf[js.Any])
    
    inline def setMaterializedId(value: Double): Self = StObject.set(x, "materializedId", value.asInstanceOf[js.Any])
    
    inline def setMaterializedName(value: String): Self = StObject.set(x, "materializedName", value.asInstanceOf[js.Any])
    
    inline def setTargetDatabase(value: String): Self = StObject.set(x, "targetDatabase", value.asInstanceOf[js.Any])
  }
}
