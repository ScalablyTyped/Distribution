package typings.awsSdk.mobileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProjectResult extends StObject {
  
  /**
    *  Detailed information about the updated AWS Mobile Hub project. 
    */
  var details: js.UndefOr[ProjectDetails] = js.undefined
}
object UpdateProjectResult {
  
  inline def apply(): UpdateProjectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProjectResult]
  }
  
  extension [Self <: UpdateProjectResult](x: Self) {
    
    inline def setDetails(value: ProjectDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
  }
}
