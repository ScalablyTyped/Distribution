package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProjectVisibilityInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the build project.
    */
  var projectArn: NonEmptyString
  
  var projectVisibility: ProjectVisibilityType
  
  /**
    * The ARN of the IAM role that enables CodeBuild to access the CloudWatch Logs and Amazon S3 artifacts for the project's builds.
    */
  var resourceAccessRole: js.UndefOr[NonEmptyString] = js.undefined
}
object UpdateProjectVisibilityInput {
  
  inline def apply(projectArn: NonEmptyString, projectVisibility: ProjectVisibilityType): UpdateProjectVisibilityInput = {
    val __obj = js.Dynamic.literal(projectArn = projectArn.asInstanceOf[js.Any], projectVisibility = projectVisibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProjectVisibilityInput]
  }
  
  extension [Self <: UpdateProjectVisibilityInput](x: Self) {
    
    inline def setProjectArn(value: NonEmptyString): Self = StObject.set(x, "projectArn", value.asInstanceOf[js.Any])
    
    inline def setProjectVisibility(value: ProjectVisibilityType): Self = StObject.set(x, "projectVisibility", value.asInstanceOf[js.Any])
    
    inline def setResourceAccessRole(value: NonEmptyString): Self = StObject.set(x, "resourceAccessRole", value.asInstanceOf[js.Any])
    
    inline def setResourceAccessRoleUndefined: Self = StObject.set(x, "resourceAccessRole", js.undefined)
  }
}
