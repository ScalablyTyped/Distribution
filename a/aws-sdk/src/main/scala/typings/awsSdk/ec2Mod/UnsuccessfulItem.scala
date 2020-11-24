package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnsuccessfulItem extends js.Object {
  
  /**
    * Information about the error.
    */
  var Error: js.UndefOr[UnsuccessfulItemError] = js.native
  
  /**
    * The ID of the resource.
    */
  var ResourceId: js.UndefOr[String] = js.native
}
object UnsuccessfulItem {
  
  @scala.inline
  def apply(): UnsuccessfulItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnsuccessfulItem]
  }
  
  @scala.inline
  implicit class UnsuccessfulItemOps[Self <: UnsuccessfulItem] (val x: Self) extends AnyVal {
    
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
    def setError(value: UnsuccessfulItemError): Self = this.set("Error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("Error", js.undefined)
    
    @scala.inline
    def setResourceId(value: String): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceId: Self = this.set("ResourceId", js.undefined)
  }
}
