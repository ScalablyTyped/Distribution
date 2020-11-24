package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteCoreDefinitionRequest extends js.Object {
  
  /**
    * The ID of the core definition.
    */
  var CoreDefinitionId: string = js.native
}
object DeleteCoreDefinitionRequest {
  
  @scala.inline
  def apply(CoreDefinitionId: string): DeleteCoreDefinitionRequest = {
    val __obj = js.Dynamic.literal(CoreDefinitionId = CoreDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCoreDefinitionRequest]
  }
  
  @scala.inline
  implicit class DeleteCoreDefinitionRequestOps[Self <: DeleteCoreDefinitionRequest] (val x: Self) extends AnyVal {
    
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
    def setCoreDefinitionId(value: string): Self = this.set("CoreDefinitionId", value.asInstanceOf[js.Any])
  }
}
