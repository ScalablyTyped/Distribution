package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetProjectsInput extends StObject {
  
  /**
    * The names or ARNs of the build projects. To get information about a project shared with your AWS account, its ARN must be specified. You cannot specify a shared project using its name.
    */
  var names: ProjectNames = js.native
}
object BatchGetProjectsInput {
  
  @scala.inline
  def apply(names: ProjectNames): BatchGetProjectsInput = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetProjectsInput]
  }
  
  @scala.inline
  implicit class BatchGetProjectsInputMutableBuilder[Self <: BatchGetProjectsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNames(value: ProjectNames): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesVarargs(value: NonEmptyString*): Self = StObject.set(x, "names", js.Array(value :_*))
  }
}
