package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetWorldTemplateBodyResponse extends js.Object {
  
  /**
    * The world template body.
    */
  var templateBody: js.UndefOr[Json] = js.native
}
object GetWorldTemplateBodyResponse {
  
  @scala.inline
  def apply(): GetWorldTemplateBodyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorldTemplateBodyResponse]
  }
  
  @scala.inline
  implicit class GetWorldTemplateBodyResponseOps[Self <: GetWorldTemplateBodyResponse] (val x: Self) extends AnyVal {
    
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
    def setTemplateBody(value: Json): Self = this.set("templateBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateBody: Self = this.set("templateBody", js.undefined)
  }
}
