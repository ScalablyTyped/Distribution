package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentVariable extends js.Object {
  /**
    * The name or key of the environment variable.
    */
  var name: NonEmptyString = js.native
  /**
    * The type of environment variable. Valid values include:    PARAMETER_STORE: An environment variable stored in Amazon EC2 Systems Manager Parameter Store. To learn how to specify a parameter store environment variable, see  parameter store reference-key in the buildspec file.    PLAINTEXT: An environment variable in plain text format. This is the default value.    SECRETS_MANAGER: An environment variable stored in AWS Secrets Manager. To learn how to specify a secrets manager environment variable, see  secrets manager reference-key in the buildspec file.  
    */
  var `type`: js.UndefOr[EnvironmentVariableType] = js.native
  /**
    * The value of the environment variable.  We strongly discourage the use of PLAINTEXT environment variables to store sensitive values, especially AWS secret key IDs and secret access keys. PLAINTEXT environment variables can be displayed in plain text using the AWS CodeBuild console and the AWS Command Line Interface (AWS CLI). For sensitive values, we recommend you use an environment variable of type PARAMETER_STORE or SECRETS_MANAGER.  
    */
  var value: String = js.native
}

object EnvironmentVariable {
  @scala.inline
  def apply(name: NonEmptyString, value: String): EnvironmentVariable = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentVariable]
  }
  @scala.inline
  implicit class EnvironmentVariableOps[Self <: EnvironmentVariable] (val x: Self) extends AnyVal {
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
    def setName(value: NonEmptyString): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: EnvironmentVariableType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

