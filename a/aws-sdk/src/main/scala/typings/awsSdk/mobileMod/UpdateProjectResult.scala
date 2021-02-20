package typings.awsSdk.mobileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateProjectResult extends StObject {
  
  /**
    *  Detailed information about the updated AWS Mobile Hub project. 
    */
  var details: js.UndefOr[ProjectDetails] = js.native
}
object UpdateProjectResult {
  
  @scala.inline
  def apply(): UpdateProjectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProjectResult]
  }
  
  @scala.inline
  implicit class UpdateProjectResultMutableBuilder[Self <: UpdateProjectResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: ProjectDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
  }
}
