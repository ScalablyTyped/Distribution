package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteProjectVersionResponse extends StObject {
  
  /**
    * The status of the deletion operation.
    */
  var Status: js.UndefOr[ProjectVersionStatus] = js.undefined
}
object DeleteProjectVersionResponse {
  
  @scala.inline
  def apply(): DeleteProjectVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteProjectVersionResponse]
  }
  
  @scala.inline
  implicit class DeleteProjectVersionResponseMutableBuilder[Self <: DeleteProjectVersionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: ProjectVersionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
