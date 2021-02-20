package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateProjectOutput extends StObject {
  
  /**
    * Information about the build project that was created.
    */
  var project: js.UndefOr[Project] = js.native
}
object CreateProjectOutput {
  
  @scala.inline
  def apply(): CreateProjectOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProjectOutput]
  }
  
  @scala.inline
  implicit class CreateProjectOutputMutableBuilder[Self <: CreateProjectOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProject(value: Project): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
