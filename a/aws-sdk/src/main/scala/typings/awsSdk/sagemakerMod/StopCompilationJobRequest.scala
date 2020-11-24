package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopCompilationJobRequest extends js.Object {
  
  /**
    * The name of the model compilation job to stop.
    */
  var CompilationJobName: EntityName = js.native
}
object StopCompilationJobRequest {
  
  @scala.inline
  def apply(CompilationJobName: EntityName): StopCompilationJobRequest = {
    val __obj = js.Dynamic.literal(CompilationJobName = CompilationJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopCompilationJobRequest]
  }
  
  @scala.inline
  implicit class StopCompilationJobRequestOps[Self <: StopCompilationJobRequest] (val x: Self) extends AnyVal {
    
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
    def setCompilationJobName(value: EntityName): Self = this.set("CompilationJobName", value.asInstanceOf[js.Any])
  }
}
