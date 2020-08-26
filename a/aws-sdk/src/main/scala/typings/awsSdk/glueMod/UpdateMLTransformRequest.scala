package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMLTransformRequest extends js.Object {
  /**
    * A description of the transform. The default is an empty string.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  /**
    * This value determines which version of AWS Glue this machine learning transform is compatible with. Glue 1.0 is recommended for most customers. If the value is not set, the Glue compatibility defaults to Glue 0.9. For more information, see AWS Glue Versions in the developer guide.
    */
  var GlueVersion: js.UndefOr[GlueVersionString] = js.native
  /**
    * The number of AWS Glue data processing units (DPUs) that are allocated to task runs for this transform. You can allocate from 2 to 100 DPUs; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the AWS Glue pricing page.  When the WorkerType field is set to a value other than Standard, the MaxCapacity field is set automatically and becomes read-only.
    */
  var MaxCapacity: js.UndefOr[NullableDouble] = js.native
  /**
    * The maximum number of times to retry a task for this transform after a task run fails.
    */
  var MaxRetries: js.UndefOr[NullableInteger] = js.native
  /**
    * The unique name that you gave the transform when you created it.
    */
  var Name: js.UndefOr[NameString] = js.native
  /**
    * The number of workers of a defined workerType that are allocated when this task runs.
    */
  var NumberOfWorkers: js.UndefOr[NullableInteger] = js.native
  /**
    * The configuration parameters that are specific to the transform type (algorithm) used. Conditionally dependent on the transform type.
    */
  var Parameters: js.UndefOr[TransformParameters] = js.native
  /**
    * The name or Amazon Resource Name (ARN) of the IAM role with the required permissions.
    */
  var Role: js.UndefOr[RoleString] = js.native
  /**
    * The timeout for a task run for this transform in minutes. This is the maximum time that a task run for this transform can consume resources before it is terminated and enters TIMEOUT status. The default is 2,880 minutes (48 hours).
    */
  var Timeout: js.UndefOr[typings.awsSdk.glueMod.Timeout] = js.native
  /**
    * A unique identifier that was generated when the transform was created.
    */
  var TransformId: HashString = js.native
  /**
    * The type of predefined worker that is allocated when this task runs. Accepts a value of Standard, G.1X, or G.2X.   For the Standard worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2 executors per worker.   For the G.1X worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk, and 1 executor per worker.   For the G.2X worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk, and 1 executor per worker.  
    */
  var WorkerType: js.UndefOr[typings.awsSdk.glueMod.WorkerType] = js.native
}

object UpdateMLTransformRequest {
  @scala.inline
  def apply(TransformId: HashString): UpdateMLTransformRequest = {
    val __obj = js.Dynamic.literal(TransformId = TransformId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMLTransformRequest]
  }
  @scala.inline
  implicit class UpdateMLTransformRequestOps[Self <: UpdateMLTransformRequest] (val x: Self) extends AnyVal {
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
    def setTransformId(value: HashString): Self = this.set("TransformId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: DescriptionString): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setGlueVersion(value: GlueVersionString): Self = this.set("GlueVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlueVersion: Self = this.set("GlueVersion", js.undefined)
    @scala.inline
    def setMaxCapacity(value: NullableDouble): Self = this.set("MaxCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxCapacity: Self = this.set("MaxCapacity", js.undefined)
    @scala.inline
    def setMaxRetries(value: NullableInteger): Self = this.set("MaxRetries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRetries: Self = this.set("MaxRetries", js.undefined)
    @scala.inline
    def setName(value: NameString): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setNumberOfWorkers(value: NullableInteger): Self = this.set("NumberOfWorkers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfWorkers: Self = this.set("NumberOfWorkers", js.undefined)
    @scala.inline
    def setParameters(value: TransformParameters): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
    @scala.inline
    def setRole(value: RoleString): Self = this.set("Role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("Role", js.undefined)
    @scala.inline
    def setTimeout(value: Timeout): Self = this.set("Timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("Timeout", js.undefined)
    @scala.inline
    def setWorkerType(value: WorkerType): Self = this.set("WorkerType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerType: Self = this.set("WorkerType", js.undefined)
  }
  
}

