package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvalidateProjectCacheInput extends StObject {
  
  /**
    * The name of the AWS CodeBuild build project that the cache is reset for.
    */
  var projectName: NonEmptyString
}
object InvalidateProjectCacheInput {
  
  @scala.inline
  def apply(projectName: NonEmptyString): InvalidateProjectCacheInput = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidateProjectCacheInput]
  }
  
  @scala.inline
  implicit class InvalidateProjectCacheInputMutableBuilder[Self <: InvalidateProjectCacheInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjectName(value: NonEmptyString): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
  }
}
