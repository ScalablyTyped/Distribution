package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeClientPropertiesResult extends js.Object {
  
  /**
    * Information about the specified Amazon WorkSpaces clients.
    */
  var ClientPropertiesList: js.UndefOr[typings.awsSdk.workspacesMod.ClientPropertiesList] = js.native
}
object DescribeClientPropertiesResult {
  
  @scala.inline
  def apply(): DescribeClientPropertiesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClientPropertiesResult]
  }
  
  @scala.inline
  implicit class DescribeClientPropertiesResultOps[Self <: DescribeClientPropertiesResult] (val x: Self) extends AnyVal {
    
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
    def setClientPropertiesListVarargs(value: ClientPropertiesResult*): Self = this.set("ClientPropertiesList", js.Array(value :_*))
    
    @scala.inline
    def setClientPropertiesList(value: ClientPropertiesList): Self = this.set("ClientPropertiesList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientPropertiesList: Self = this.set("ClientPropertiesList", js.undefined)
  }
}
