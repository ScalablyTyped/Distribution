package typings.awsSdkClientKinesisBrowser.typesResourceInUseExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceInUseExceptionDetails extends js.Object {
  
  /**
    * <p>A message that provides information about the error.</p>
    */
  var message: js.UndefOr[String] = js.native
}
object ResourceInUseExceptionDetails {
  
  @scala.inline
  def apply(): ResourceInUseExceptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceInUseExceptionDetails]
  }
  
  @scala.inline
  implicit class ResourceInUseExceptionDetailsOps[Self <: ResourceInUseExceptionDetails] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
}
