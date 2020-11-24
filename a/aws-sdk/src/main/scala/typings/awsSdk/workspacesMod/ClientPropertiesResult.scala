package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientPropertiesResult extends js.Object {
  
  /**
    * Information about the Amazon WorkSpaces client.
    */
  var ClientProperties: js.UndefOr[typings.awsSdk.workspacesMod.ClientProperties] = js.native
  
  /**
    * The resource identifier, in the form of a directory ID.
    */
  var ResourceId: js.UndefOr[NonEmptyString] = js.native
}
object ClientPropertiesResult {
  
  @scala.inline
  def apply(): ClientPropertiesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientPropertiesResult]
  }
  
  @scala.inline
  implicit class ClientPropertiesResultOps[Self <: ClientPropertiesResult] (val x: Self) extends AnyVal {
    
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
    def setClientProperties(value: ClientProperties): Self = this.set("ClientProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientProperties: Self = this.set("ClientProperties", js.undefined)
    
    @scala.inline
    def setResourceId(value: NonEmptyString): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceId: Self = this.set("ResourceId", js.undefined)
  }
}
