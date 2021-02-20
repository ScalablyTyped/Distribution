package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteApplicationMessage extends StObject {
  
  /**
    * The name of the application to delete.
    */
  var ApplicationName: typings.awsSdk.elasticbeanstalkMod.ApplicationName = js.native
  
  /**
    * When set to true, running environments will be terminated before deleting the application.
    */
  var TerminateEnvByForce: js.UndefOr[TerminateEnvForce] = js.native
}
object DeleteApplicationMessage {
  
  @scala.inline
  def apply(ApplicationName: ApplicationName): DeleteApplicationMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApplicationMessage]
  }
  
  @scala.inline
  implicit class DeleteApplicationMessageMutableBuilder[Self <: DeleteApplicationMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminateEnvByForce(value: TerminateEnvForce): Self = StObject.set(x, "TerminateEnvByForce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminateEnvByForceUndefined: Self = StObject.set(x, "TerminateEnvByForce", js.undefined)
  }
}
