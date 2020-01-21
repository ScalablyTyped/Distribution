package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegistrationConfig extends js.Object {
  /**
    * The ARN of the role.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
  /**
    * The template body.
    */
  var templateBody: js.UndefOr[TemplateBody] = js.native
}

object RegistrationConfig {
  @scala.inline
  def apply(roleArn: RoleArn = null, templateBody: TemplateBody = null): RegistrationConfig = {
    val __obj = js.Dynamic.literal()
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    if (templateBody != null) __obj.updateDynamic("templateBody")(templateBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegistrationConfig]
  }
}

