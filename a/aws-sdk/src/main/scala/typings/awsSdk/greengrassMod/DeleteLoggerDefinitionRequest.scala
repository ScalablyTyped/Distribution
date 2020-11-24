package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteLoggerDefinitionRequest extends js.Object {
  
  /**
    * The ID of the logger definition.
    */
  var LoggerDefinitionId: string = js.native
}
object DeleteLoggerDefinitionRequest {
  
  @scala.inline
  def apply(LoggerDefinitionId: string): DeleteLoggerDefinitionRequest = {
    val __obj = js.Dynamic.literal(LoggerDefinitionId = LoggerDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLoggerDefinitionRequest]
  }
  
  @scala.inline
  implicit class DeleteLoggerDefinitionRequestOps[Self <: DeleteLoggerDefinitionRequest] (val x: Self) extends AnyVal {
    
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
    def setLoggerDefinitionId(value: string): Self = this.set("LoggerDefinitionId", value.asInstanceOf[js.Any])
  }
}
