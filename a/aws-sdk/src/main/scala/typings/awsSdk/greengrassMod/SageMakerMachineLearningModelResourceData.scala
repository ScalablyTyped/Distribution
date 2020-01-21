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
  def apply(
    DestinationPath: string = null,
    OwnerSetting: ResourceDownloadOwnerSetting = null,
    SageMakerJobArn: string = null
  ): SageMakerMachineLearningModelResourceData = {
    val __obj = js.Dynamic.literal()
    if (DestinationPath != null) __obj.updateDynamic("DestinationPath")(DestinationPath.asInstanceOf[js.Any])
    if (OwnerSetting != null) __obj.updateDynamic("OwnerSetting")(OwnerSetting.asInstanceOf[js.Any])
    if (SageMakerJobArn != null) __obj.updateDynamic("SageMakerJobArn")(SageMakerJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SageMakerMachineLearningModelResourceData]
  }
}

