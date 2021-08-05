package typings.backlogJs.mod.Option.Project

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetProjectsParams extends StObject {
  
  var all: js.UndefOr[Boolean] = js.undefined
  
  var archived: js.UndefOr[Boolean] = js.undefined
}
object GetProjectsParams {
  
  inline def apply(): GetProjectsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetProjectsParams]
  }
  
  extension [Self <: GetProjectsParams](x: Self) {
    
    inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    inline def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    inline def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
  }
}
