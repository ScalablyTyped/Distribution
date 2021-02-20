package typings.backlogJs.mod.Option.Project

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetProjectsParams extends StObject {
  
  var all: js.UndefOr[Boolean] = js.native
  
  var archived: js.UndefOr[Boolean] = js.native
}
object GetProjectsParams {
  
  @scala.inline
  def apply(): GetProjectsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetProjectsParams]
  }
  
  @scala.inline
  implicit class GetProjectsParamsMutableBuilder[Self <: GetProjectsParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    @scala.inline
    def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
  }
}
