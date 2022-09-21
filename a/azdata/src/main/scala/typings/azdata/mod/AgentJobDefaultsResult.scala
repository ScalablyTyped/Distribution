package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentJobDefaultsResult
  extends StObject
     with ResultStatus {
  
  var categories: js.Array[AgentJobCategory]
  
  var owner: String
}
object AgentJobDefaultsResult {
  
  inline def apply(categories: js.Array[AgentJobCategory], errorMessage: String, owner: String, success: Boolean): AgentJobDefaultsResult = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentJobDefaultsResult]
  }
  
  extension [Self <: AgentJobDefaultsResult](x: Self) {
    
    inline def setCategories(value: js.Array[AgentJobCategory]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesVarargs(value: AgentJobCategory*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
  }
}
