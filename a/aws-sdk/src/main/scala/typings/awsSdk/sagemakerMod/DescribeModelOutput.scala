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
  def apply(CreationTime: Timestamp, ExecutionRoleArn: RoleArn, ModelArn: ModelArn, ModelName: ModelName): DescribeModelOutput = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], ExecutionRoleArn = ExecutionRoleArn.asInstanceOf[js.Any], ModelArn = ModelArn.asInstanceOf[js.Any], ModelName = ModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeModelOutput]
  }
  @scala.inline
  implicit class DescribeModelOutputOps[Self <: DescribeModelOutput] (val x: Self) extends AnyVal {
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
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecutionRoleArn(value: RoleArn): Self = this.set("ExecutionRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setModelArn(value: ModelArn): Self = this.set("ModelArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setModelName(value: ModelName): Self = this.set("ModelName", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainersVarargs(value: ContainerDefinition*): Self = this.set("Containers", js.Array(value :_*))
    @scala.inline
    def setContainers(value: ContainerDefinitionList): Self = this.set("Containers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainers: Self = this.set("Containers", js.undefined)
    @scala.inline
    def setEnableNetworkIsolation(value: Boolean): Self = this.set("EnableNetworkIsolation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableNetworkIsolation: Self = this.set("EnableNetworkIsolation", js.undefined)
    @scala.inline
    def setPrimaryContainer(value: ContainerDefinition): Self = this.set("PrimaryContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryContainer: Self = this.set("PrimaryContainer", js.undefined)
    @scala.inline
    def setVpcConfig(value: VpcConfig): Self = this.set("VpcConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcConfig: Self = this.set("VpcConfig", js.undefined)
  }
  
}

