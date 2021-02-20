package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterApplicationRevisionInput extends StObject {
  
  /**
    * The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
    */
  var applicationName: ApplicationName = js.native
  
  /**
    * A comment about the revision.
    */
  var description: js.UndefOr[Description] = js.native
  
  /**
    * Information about the application revision to register, including type and location.
    */
  var revision: RevisionLocation = js.native
}
object RegisterApplicationRevisionInput {
  
  @scala.inline
  def apply(applicationName: ApplicationName, revision: RevisionLocation): RegisterApplicationRevisionInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterApplicationRevisionInput]
  }
  
  @scala.inline
  implicit class RegisterApplicationRevisionInputMutableBuilder[Self <: RegisterApplicationRevisionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setRevision(value: RevisionLocation): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
  }
}
