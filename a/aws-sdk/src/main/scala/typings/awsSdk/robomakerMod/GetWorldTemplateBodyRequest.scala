package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetWorldTemplateBodyRequest extends js.Object {
  
  /**
    * The Amazon Resource Name (arn) of the world generator job.
    */
  var generationJob: js.UndefOr[Arn] = js.native
  
  /**
    * The Amazon Resource Name (arn) of the world template.
    */
  var template: js.UndefOr[Arn] = js.native
}
object GetWorldTemplateBodyRequest {
  
  @scala.inline
  def apply(): GetWorldTemplateBodyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorldTemplateBodyRequest]
  }
  
  @scala.inline
  implicit class GetWorldTemplateBodyRequestOps[Self <: GetWorldTemplateBodyRequest] (val x: Self) extends AnyVal {
    
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
    def setGenerationJob(value: Arn): Self = this.set("generationJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerationJob: Self = this.set("generationJob", js.undefined)
    
    @scala.inline
    def setTemplate(value: Arn): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
}
