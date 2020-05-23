package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionConfigurationEnvironment extends js.Object {
  /**
    * If true, the Lambda function is allowed to access the host's /sys folder. Use this when the Lambda function needs to read device information from /sys. This setting applies only when you run the Lambda function in a Greengrass container.
    */
  var AccessSysfs: js.UndefOr[boolean] = js.native
  /**
    * Configuration related to executing the Lambda function
    */
  var Execution: js.UndefOr[FunctionExecutionConfig] = js.native
  /**
    * A list of the resources, with their permissions, to which the Lambda function will be granted access. A Lambda function can have at most 10 resources. ResourceAccessPolicies apply only when you run the Lambda function in a Greengrass container.
    */
  var ResourceAccessPolicies: js.UndefOr[listOfResourceAccessPolicy] = js.native
  /**
    * Environment variables for the Lambda function's configuration.
    */
  var Variables: js.UndefOr[mapOfString] = js.native
}

object FunctionConfigurationEnvironment {
  @scala.inline
  def apply(
    AccessSysfs: js.UndefOr[boolean] = js.undefined,
    Execution: FunctionExecutionConfig = null,
    ResourceAccessPolicies: listOfResourceAccessPolicy = null,
    Variables: mapOfString = null
  ): FunctionConfigurationEnvironment = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AccessSysfs)) __obj.updateDynamic("AccessSysfs")(AccessSysfs.get.asInstanceOf[js.Any])
    if (Execution != null) __obj.updateDynamic("Execution")(Execution.asInstanceOf[js.Any])
    if (ResourceAccessPolicies != null) __obj.updateDynamic("ResourceAccessPolicies")(ResourceAccessPolicies.asInstanceOf[js.Any])
    if (Variables != null) __obj.updateDynamic("Variables")(Variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionConfigurationEnvironment]
  }
}

