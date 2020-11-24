package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetApplicationsInput extends js.Object {
  
  /**
    * A list of application names separated by spaces. The maximum number of application names you can specify is 100.
    */
  var applicationNames: ApplicationsList = js.native
}
object BatchGetApplicationsInput {
  
  @scala.inline
  def apply(applicationNames: ApplicationsList): BatchGetApplicationsInput = {
    val __obj = js.Dynamic.literal(applicationNames = applicationNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetApplicationsInput]
  }
  
  @scala.inline
  implicit class BatchGetApplicationsInputOps[Self <: BatchGetApplicationsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplicationNamesVarargs(value: ApplicationName*): Self = this.set("applicationNames", js.Array(value :_*))
    
    @scala.inline
    def setApplicationNames(value: ApplicationsList): Self = this.set("applicationNames", value.asInstanceOf[js.Any])
  }
}
