package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateWorldGenerationJobRequest extends js.Object {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
  
  /**
    * A map that contains tag keys and tag values that are attached to the world generator job.
    */
  var tags: js.UndefOr[TagMap] = js.native
  
  /**
    * The Amazon Resource Name (arn) of the world template describing the worlds you want to create.
    */
  var template: Arn = js.native
  
  /**
    * Information about the world count.
    */
  var worldCount: WorldCount = js.native
  
  /**
    * A map that contains tag keys and tag values that are attached to the generated worlds.
    */
  var worldTags: js.UndefOr[TagMap] = js.native
}
object CreateWorldGenerationJobRequest {
  
  @scala.inline
  def apply(template: Arn, worldCount: WorldCount): CreateWorldGenerationJobRequest = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any], worldCount = worldCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorldGenerationJobRequest]
  }
  
  @scala.inline
  implicit class CreateWorldGenerationJobRequestOps[Self <: CreateWorldGenerationJobRequest] (val x: Self) extends AnyVal {
    
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
    def setTemplate(value: Arn): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldCount(value: WorldCount): Self = this.set("worldCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = this.set("clientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientRequestToken: Self = this.set("clientRequestToken", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setWorldTags(value: TagMap): Self = this.set("worldTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorldTags: Self = this.set("worldTags", js.undefined)
  }
}
