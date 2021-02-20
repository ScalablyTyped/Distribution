package typings.backlogJs.mod.Option.Project

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostVersionsParams extends StObject {
  
  var description: String = js.native
  
  var name: String = js.native
  
  var releaseDueDate: String = js.native
  
  var startDate: String = js.native
}
object PostVersionsParams {
  
  @scala.inline
  def apply(description: String, name: String, releaseDueDate: String, startDate: String): PostVersionsParams = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], releaseDueDate = releaseDueDate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostVersionsParams]
  }
  
  @scala.inline
  implicit class PostVersionsParamsMutableBuilder[Self <: PostVersionsParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseDueDate(value: String): Self = StObject.set(x, "releaseDueDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
  }
}
