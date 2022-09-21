package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProjectVisibilityOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the build project.
    */
  var projectArn: js.UndefOr[NonEmptyString] = js.undefined
  
  var projectVisibility: js.UndefOr[ProjectVisibilityType] = js.undefined
  
  /**
    * Contains the project identifier used with the public build APIs. 
    */
  var publicProjectAlias: js.UndefOr[NonEmptyString] = js.undefined
}
object UpdateProjectVisibilityOutput {
  
  inline def apply(): UpdateProjectVisibilityOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProjectVisibilityOutput]
  }
  
  extension [Self <: UpdateProjectVisibilityOutput](x: Self) {
    
    inline def setProjectArn(value: NonEmptyString): Self = StObject.set(x, "projectArn", value.asInstanceOf[js.Any])
    
    inline def setProjectArnUndefined: Self = StObject.set(x, "projectArn", js.undefined)
    
    inline def setProjectVisibility(value: ProjectVisibilityType): Self = StObject.set(x, "projectVisibility", value.asInstanceOf[js.Any])
    
    inline def setProjectVisibilityUndefined: Self = StObject.set(x, "projectVisibility", js.undefined)
    
    inline def setPublicProjectAlias(value: NonEmptyString): Self = StObject.set(x, "publicProjectAlias", value.asInstanceOf[js.Any])
    
    inline def setPublicProjectAliasUndefined: Self = StObject.set(x, "publicProjectAlias", js.undefined)
  }
}
