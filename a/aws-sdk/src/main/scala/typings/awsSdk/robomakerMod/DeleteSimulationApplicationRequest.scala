package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSimulationApplicationRequest extends StObject {
  
  /**
    * The application information for the simulation application to delete.
    */
  var application: Arn
  
  /**
    * The version of the simulation application to delete.
    */
  var applicationVersion: js.UndefOr[Version] = js.undefined
}
object DeleteSimulationApplicationRequest {
  
  @scala.inline
  def apply(application: Arn): DeleteSimulationApplicationRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSimulationApplicationRequest]
  }
  
  @scala.inline
  implicit class DeleteSimulationApplicationRequestMutableBuilder[Self <: DeleteSimulationApplicationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Arn): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationVersion(value: Version): Self = StObject.set(x, "applicationVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationVersionUndefined: Self = StObject.set(x, "applicationVersion", js.undefined)
  }
}
