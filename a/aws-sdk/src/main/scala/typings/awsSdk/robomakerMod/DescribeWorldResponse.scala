package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeWorldResponse extends js.Object {
  
  /**
    * The Amazon Resource Name (arn) of the world.
    */
  var arn: js.UndefOr[Arn] = js.native
  
  /**
    * The time, in milliseconds since the epoch, when the world was created.
    */
  var createdAt: js.UndefOr[CreatedAt] = js.native
  
  /**
    * The Amazon Resource Name (arn) of the world generation job that generated the world.
    */
  var generationJob: js.UndefOr[Arn] = js.native
  
  /**
    * A map that contains tag keys and tag values that are attached to the world.
    */
  var tags: js.UndefOr[TagMap] = js.native
  
  /**
    * The world template.
    */
  var template: js.UndefOr[Arn] = js.native
}
object DescribeWorldResponse {
  
  @scala.inline
  def apply(): DescribeWorldResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorldResponse]
  }
  
  @scala.inline
  implicit class DescribeWorldResponseOps[Self <: DescribeWorldResponse] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Arn): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: CreatedAt): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    
    @scala.inline
    def setGenerationJob(value: Arn): Self = this.set("generationJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerationJob: Self = this.set("generationJob", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTemplate(value: Arn): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
}
