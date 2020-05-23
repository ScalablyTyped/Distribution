package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeModelOutput extends js.Object {
  /**
    * The containers in the inference pipeline.
    */
  var Containers: js.UndefOr[ContainerDefinitionList] = js.native
  /**
    * A timestamp that shows when the model was created.
    */
  var CreationTime: Timestamp = js.native
  /**
    * If True, no inbound or outbound network calls can be made to or from the model container.
    */
  var EnableNetworkIsolation: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role that you specified for the model.
    */
  var ExecutionRoleArn: RoleArn = js.native
  /**
    * The Amazon Resource Name (ARN) of the model.
    */
  var ModelArn: typings.awsSdk.sagemakerMod.ModelArn = js.native
  /**
    * Name of the Amazon SageMaker model.
    */
  var ModelName: typings.awsSdk.sagemakerMod.ModelName = js.native
  /**
    * The location of the primary inference code, associated artifacts, and custom environment map that the inference code uses when it is deployed in production. 
    */
  var PrimaryContainer: js.UndefOr[ContainerDefinition] = js.native
  /**
    * A VpcConfig object that specifies the VPC that this model has access to. For more information, see Protect Endpoints by Using an Amazon Virtual Private Cloud 
    */
  var VpcConfig: js.UndefOr[typings.awsSdk.sagemakerMod.VpcConfig] = js.native
}

object DescribeModelOutput {
  @scala.inline
  def apply(
    CreationTime: Timestamp,
    ExecutionRoleArn: RoleArn,
    ModelArn: ModelArn,
    ModelName: ModelName,
    Containers: ContainerDefinitionList = null,
    EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined,
    PrimaryContainer: ContainerDefinition = null,
    VpcConfig: VpcConfig = null
  ): DescribeModelOutput = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], ExecutionRoleArn = ExecutionRoleArn.asInstanceOf[js.Any], ModelArn = ModelArn.asInstanceOf[js.Any], ModelName = ModelName.asInstanceOf[js.Any])
    if (Containers != null) __obj.updateDynamic("Containers")(Containers.asInstanceOf[js.Any])
    if (!js.isUndefined(EnableNetworkIsolation)) __obj.updateDynamic("EnableNetworkIsolation")(EnableNetworkIsolation.get.asInstanceOf[js.Any])
    if (PrimaryContainer != null) __obj.updateDynamic("PrimaryContainer")(PrimaryContainer.asInstanceOf[js.Any])
    if (VpcConfig != null) __obj.updateDynamic("VpcConfig")(VpcConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeModelOutput]
  }
}

