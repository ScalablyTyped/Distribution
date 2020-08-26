package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTypeRegistrationOutput extends js.Object {
  /**
    * The description of the type registration request.
    */
  var Description: js.UndefOr[typings.awsSdk.cloudformationMod.Description] = js.native
  /**
    * The current status of the type registration request.
    */
  var ProgressStatus: js.UndefOr[RegistrationStatus] = js.native
  /**
    * The Amazon Resource Name (ARN) of the type being registered. For registration requests with a ProgressStatus of other than COMPLETE, this will be null.
    */
  var TypeArn: js.UndefOr[typings.awsSdk.cloudformationMod.TypeArn] = js.native
  /**
    * The Amazon Resource Name (ARN) of this specific version of the type being registered. For registration requests with a ProgressStatus of other than COMPLETE, this will be null.
    */
  var TypeVersionArn: js.UndefOr[TypeArn] = js.native
}

object DescribeTypeRegistrationOutput {
  @scala.inline
  def apply(): DescribeTypeRegistrationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTypeRegistrationOutput]
  }
  @scala.inline
  implicit class DescribeTypeRegistrationOutputOps[Self <: DescribeTypeRegistrationOutput] (val x: Self) extends AnyVal {
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
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setProgressStatus(value: RegistrationStatus): Self = this.set("ProgressStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressStatus: Self = this.set("ProgressStatus", js.undefined)
    @scala.inline
    def setTypeArn(value: TypeArn): Self = this.set("TypeArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeArn: Self = this.set("TypeArn", js.undefined)
    @scala.inline
    def setTypeVersionArn(value: TypeArn): Self = this.set("TypeVersionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeVersionArn: Self = this.set("TypeVersionArn", js.undefined)
  }
  
}

