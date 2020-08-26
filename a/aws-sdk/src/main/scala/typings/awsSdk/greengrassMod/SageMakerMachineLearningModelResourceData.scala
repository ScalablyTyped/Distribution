package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SageMakerMachineLearningModelResourceData extends js.Object {
  /**
    * The absolute local path of the resource inside the Lambda environment.
    */
  var DestinationPath: js.UndefOr[string] = js.native
  var OwnerSetting: js.UndefOr[ResourceDownloadOwnerSetting] = js.native
  /**
    * The ARN of the Amazon SageMaker training job that represents the source model.
    */
  var SageMakerJobArn: js.UndefOr[string] = js.native
}

object SageMakerMachineLearningModelResourceData {
  @scala.inline
  def apply(): SageMakerMachineLearningModelResourceData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SageMakerMachineLearningModelResourceData]
  }
  @scala.inline
  implicit class SageMakerMachineLearningModelResourceDataOps[Self <: SageMakerMachineLearningModelResourceData] (val x: Self) extends AnyVal {
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
    def setDestinationPath(value: string): Self = this.set("DestinationPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationPath: Self = this.set("DestinationPath", js.undefined)
    @scala.inline
    def setOwnerSetting(value: ResourceDownloadOwnerSetting): Self = this.set("OwnerSetting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerSetting: Self = this.set("OwnerSetting", js.undefined)
    @scala.inline
    def setSageMakerJobArn(value: string): Self = this.set("SageMakerJobArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSageMakerJobArn: Self = this.set("SageMakerJobArn", js.undefined)
  }
  
}

