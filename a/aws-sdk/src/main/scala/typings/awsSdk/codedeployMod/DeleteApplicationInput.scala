package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteApplicationInput extends StObject {
  
  /**
    * The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
    */
  var applicationName: ApplicationName = js.native
}
object DeleteApplicationInput {
  
  @scala.inline
  def apply(applicationName: ApplicationName): DeleteApplicationInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApplicationInput]
  }
  
  @scala.inline
  implicit class DeleteApplicationInputMutableBuilder[Self <: DeleteApplicationInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
  }
}
