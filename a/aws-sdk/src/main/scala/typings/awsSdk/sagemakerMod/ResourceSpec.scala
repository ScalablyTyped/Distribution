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
  var SageMakerImageArn: js.UndefOr[typings.awsSdk.sagemakerMod.SageMakerImageArn] = js.native
}

object ResourceSpec {
  @scala.inline
  def apply(InstanceType: AppInstanceType = null, SageMakerImageArn: SageMakerImageArn = null): ResourceSpec = {
    val __obj = js.Dynamic.literal()
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (SageMakerImageArn != null) __obj.updateDynamic("SageMakerImageArn")(SageMakerImageArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceSpec]
  }
}

