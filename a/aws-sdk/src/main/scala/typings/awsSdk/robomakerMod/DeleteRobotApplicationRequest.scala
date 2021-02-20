package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteRobotApplicationRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the the robot application.
    */
  var application: Arn = js.native
  
  /**
    * The version of the robot application to delete.
    */
  var applicationVersion: js.UndefOr[Version] = js.native
}
object DeleteRobotApplicationRequest {
  
  @scala.inline
  def apply(application: Arn): DeleteRobotApplicationRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRobotApplicationRequest]
  }
  
  @scala.inline
  implicit class DeleteRobotApplicationRequestMutableBuilder[Self <: DeleteRobotApplicationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Arn): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationVersion(value: Version): Self = StObject.set(x, "applicationVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationVersionUndefined: Self = StObject.set(x, "applicationVersion", js.undefined)
  }
}
