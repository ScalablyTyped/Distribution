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
  def apply(): FunctionConfigurationEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionConfigurationEnvironment]
  }
  @scala.inline
  implicit class FunctionConfigurationEnvironmentOps[Self <: FunctionConfigurationEnvironment] (val x: Self) extends AnyVal {
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
    def setAccessSysfs(value: boolean): Self = this.set("AccessSysfs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessSysfs: Self = this.set("AccessSysfs", js.undefined)
    @scala.inline
    def setExecution(value: FunctionExecutionConfig): Self = this.set("Execution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecution: Self = this.set("Execution", js.undefined)
    @scala.inline
    def setResourceAccessPoliciesVarargs(value: ResourceAccessPolicy*): Self = this.set("ResourceAccessPolicies", js.Array(value :_*))
    @scala.inline
    def setResourceAccessPolicies(value: listOfResourceAccessPolicy): Self = this.set("ResourceAccessPolicies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceAccessPolicies: Self = this.set("ResourceAccessPolicies", js.undefined)
    @scala.inline
    def setVariables(value: mapOfString): Self = this.set("Variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("Variables", js.undefined)
  }
  
}

