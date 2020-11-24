package typings.awsSdkClientPinpointBrowser.typesApplicationResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationResponse extends js.Object {
  
  /**
    * The unique application ID.
    */
  var Id: js.UndefOr[String] = js.native
  
  /**
    * The display name of the application.
    */
  var Name: js.UndefOr[String] = js.native
}
object ApplicationResponse {
  
  @scala.inline
  def apply(): ApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationResponse]
  }
  
  @scala.inline
  implicit class ApplicationResponseOps[Self <: ApplicationResponse] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
