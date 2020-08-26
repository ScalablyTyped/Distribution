package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceSpec extends js.Object {
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[AppInstanceType] = js.native
  /**
    * The Amazon Resource Name (ARN) of the SageMaker image created on the instance.
    */
  var SageMakerImageArn: js.UndefOr[ImageArn] = js.native
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
  }
  
}

