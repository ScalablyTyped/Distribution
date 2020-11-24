package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceSpec extends js.Object {
  
  /**
    * The instance type that the image version runs on.
    */
  var InstanceType: js.UndefOr[AppInstanceType] = js.native
  
  /**
    * The ARN of the SageMaker image that the image version belongs to.
    */
  var SageMakerImageArn: js.UndefOr[ImageArn] = js.native
  
  /**
    * The ARN of the image version created on the instance.
    */
  var SageMakerImageVersionArn: js.UndefOr[ImageVersionArn] = js.native
}
object ResourceSpec {
  
  @scala.inline
  def apply(): ResourceSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceSpec]
  }
  
  @scala.inline
  implicit class ResourceSpecOps[Self <: ResourceSpec] (val x: Self) extends AnyVal {
    
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
    def setInstanceType(value: AppInstanceType): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    
    @scala.inline
    def setSageMakerImageArn(value: ImageArn): Self = this.set("SageMakerImageArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSageMakerImageArn: Self = this.set("SageMakerImageArn", js.undefined)
    
    @scala.inline
    def setSageMakerImageVersionArn(value: ImageVersionArn): Self = this.set("SageMakerImageVersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSageMakerImageVersionArn: Self = this.set("SageMakerImageVersionArn", js.undefined)
  }
}
