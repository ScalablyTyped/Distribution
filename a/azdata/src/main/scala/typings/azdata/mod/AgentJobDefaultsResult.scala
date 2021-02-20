package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentJobDefaultsResult extends ResultStatus {
  
  var categories: js.Array[AgentJobCategory] = js.native
  
  var owner: String = js.native
}
object AgentJobDefaultsResult {
  
  @scala.inline
  def apply(categories: js.Array[AgentJobCategory], errorMessage: String, owner: String, success: Boolean): AgentJobDefaultsResult = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentJobDefaultsResult]
  }
  
  @scala.inline
  implicit class AgentJobDefaultsResultMutableBuilder[Self <: AgentJobDefaultsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategories(value: js.Array[AgentJobCategory]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesVarargs(value: AgentJobCategory*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
  }
}
