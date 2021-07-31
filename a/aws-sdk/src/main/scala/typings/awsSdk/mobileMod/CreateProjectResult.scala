package typings.awsSdk.mobileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProjectResult extends StObject {
  
  /**
    *  Detailed information about the created AWS Mobile Hub project. 
    */
  var details: js.UndefOr[ProjectDetails] = js.undefined
}
object CreateProjectResult {
  
  @scala.inline
  def apply(): CreateProjectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProjectResult]
  }
  
  @scala.inline
  implicit class CreateProjectResultMutableBuilder[Self <: CreateProjectResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: ProjectDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
  }
}
