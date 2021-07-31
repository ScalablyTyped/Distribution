package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProjectOutput extends StObject {
  
  /**
    * Information about the build project that was changed.
    */
  var project: js.UndefOr[Project] = js.undefined
}
object UpdateProjectOutput {
  
  @scala.inline
  def apply(): UpdateProjectOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProjectOutput]
  }
  
  @scala.inline
  implicit class UpdateProjectOutputMutableBuilder[Self <: UpdateProjectOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProject(value: Project): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
