package typings.backlogJs.mod.Option.Project

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchVersionsParams extends StObject {
  
  var archived: js.UndefOr[Boolean] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var releaseDueDate: js.UndefOr[String] = js.undefined
  
  var startDate: js.UndefOr[String] = js.undefined
}
object PatchVersionsParams {
  
  @scala.inline
  def apply(name: String): PatchVersionsParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchVersionsParams]
  }
  
  @scala.inline
  implicit class PatchVersionsParamsMutableBuilder[Self <: PatchVersionsParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseDueDate(value: String): Self = StObject.set(x, "releaseDueDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseDueDateUndefined: Self = StObject.set(x, "releaseDueDate", js.undefined)
    
    @scala.inline
    def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}
