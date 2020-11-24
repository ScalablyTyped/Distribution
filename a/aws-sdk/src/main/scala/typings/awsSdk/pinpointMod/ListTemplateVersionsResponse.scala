package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTemplateVersionsResponse extends js.Object {
  
  var TemplateVersionsResponse: typings.awsSdk.pinpointMod.TemplateVersionsResponse = js.native
}
object ListTemplateVersionsResponse {
  
  @scala.inline
  def apply(TemplateVersionsResponse: TemplateVersionsResponse): ListTemplateVersionsResponse = {
    val __obj = js.Dynamic.literal(TemplateVersionsResponse = TemplateVersionsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTemplateVersionsResponse]
  }
  
  @scala.inline
  implicit class ListTemplateVersionsResponseOps[Self <: ListTemplateVersionsResponse] (val x: Self) extends AnyVal {
    
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
    def setTemplateVersionsResponse(value: TemplateVersionsResponse): Self = this.set("TemplateVersionsResponse", value.asInstanceOf[js.Any])
  }
}
