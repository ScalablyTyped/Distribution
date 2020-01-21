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
  def apply(
    Description: Description = null,
    ProgressStatus: RegistrationStatus = null,
    TypeArn: TypeArn = null,
    TypeVersionArn: TypeArn = null
  ): DescribeTypeRegistrationOutput = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ProgressStatus != null) __obj.updateDynamic("ProgressStatus")(ProgressStatus.asInstanceOf[js.Any])
    if (TypeArn != null) __obj.updateDynamic("TypeArn")(TypeArn.asInstanceOf[js.Any])
    if (TypeVersionArn != null) __obj.updateDynamic("TypeVersionArn")(TypeVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTypeRegistrationOutput]
  }
}

