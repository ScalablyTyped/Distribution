package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetProjectsInput extends js.Object {
  
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
  implicit class BatchGetProjectsInputOps[Self <: BatchGetProjectsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNamesVarargs(value: NonEmptyString*): Self = this.set("names", js.Array(value :_*))
    
    @scala.inline
    def setNames(value: ProjectNames): Self = this.set("names", value.asInstanceOf[js.Any])
  }
}
