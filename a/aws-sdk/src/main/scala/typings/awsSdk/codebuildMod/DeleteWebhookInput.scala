package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWebhookInput extends StObject {
  
  /**
    * The name of the AWS CodeBuild project.
    */
  var projectName: ProjectName
}
object DeleteWebhookInput {
  
  @scala.inline
  def apply(projectName: ProjectName): DeleteWebhookInput = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWebhookInput]
  }
  
  @scala.inline
  implicit class DeleteWebhookInputMutableBuilder[Self <: DeleteWebhookInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjectName(value: ProjectName): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
  }
}
