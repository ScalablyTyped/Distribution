package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateModelInput extends js.Object {
  /**
    * Specifies the containers in the inference pipeline.
    */
  var Containers: js.UndefOr[ContainerDefinitionList] = js.native
  /**
    * Isolates the model container. No inbound or outbound network calls can be made to or from the model container.
    */
  var EnableNetworkIsolation: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can assume to access model artifacts and docker image for deployment on ML compute instances or for batch transform jobs. Deploying on ML compute instances is part of model hosting. For more information, see Amazon SageMaker Roles.   To be able to pass this role to Amazon SageMaker, the caller of this API must have the iam:PassRole permission. 
    */
  var ExecutionRoleArn: RoleArn = js.native
  /**
    * The name of the new model.
    */
  var ModelName: typings.awsSdk.sagemakerMod.ModelName = js.native
  /**
    * The location of the primary docker image containing inference code, associated artifacts, and custom environment map that the inference code uses when the model is deployed for predictions. 
    */
  var PrimaryContainer: js.UndefOr[ContainerDefinition] = js.native
  /**
    * An array of key-value pairs. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide. 
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * A VpcConfig object that specifies the VPC that you want your model to connect to. Control access to and from your model container by configuring the VPC. VpcConfig is used in hosting services and in batch transform. For more information, see Protect Endpoints by Using an Amazon Virtual Private Cloud and Protect Data in Batch Transform Jobs by Using an Amazon Virtual Private Cloud.
    */
  var VpcConfig: js.UndefOr[typings.awsSdk.sagemakerMod.VpcConfig] = js.native
}

object CreateModelInput {
  @scala.inline
  def apply(
    ExecutionRoleArn: RoleArn,
    ModelName: ModelName,
    Containers: ContainerDefinitionList = null,
    EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined,
    PrimaryContainer: ContainerDefinition = null,
    Tags: TagList = null,
    VpcConfig: VpcConfig = null
  ): CreateModelInput = {
    val __obj = js.Dynamic.literal(ExecutionRoleArn = ExecutionRoleArn.asInstanceOf[js.Any], ModelName = ModelName.asInstanceOf[js.Any])
    if (Containers != null) __obj.updateDynamic("Containers")(Containers.asInstanceOf[js.Any])
    if (!js.isUndefined(EnableNetworkIsolation)) __obj.updateDynamic("EnableNetworkIsolation")(EnableNetworkIsolation.get.asInstanceOf[js.Any])
    if (PrimaryContainer != null) __obj.updateDynamic("PrimaryContainer")(PrimaryContainer.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (VpcConfig != null) __obj.updateDynamic("VpcConfig")(VpcConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModelInput]
  }
}

