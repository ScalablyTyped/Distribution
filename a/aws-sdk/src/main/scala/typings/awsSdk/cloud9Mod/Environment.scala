package typings.awsSdk.cloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Environment extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the environment.
    */
  var arn: js.UndefOr[String] = js.native
  /**
    * The description for the environment.
    */
  var description: js.UndefOr[EnvironmentDescription] = js.native
  /**
    * The ID of the environment.
    */
  var id: js.UndefOr[EnvironmentId] = js.native
  /**
    * The state of the environment in its creation or deletion lifecycle.
    */
  var lifecycle: js.UndefOr[EnvironmentLifecycle] = js.native
  /**
    * The name of the environment.
    */
  var name: js.UndefOr[EnvironmentName] = js.native
  /**
    * The Amazon Resource Name (ARN) of the environment owner.
    */
  var ownerArn: js.UndefOr[String] = js.native
  /**
    * The type of environment. Valid values include the following:    ec2: An Amazon Elastic Compute Cloud (Amazon EC2) instance connects to the environment.    ssh: Your own server connects to the environment.  
    */
  var `type`: js.UndefOr[EnvironmentType] = js.native
}

object Environment {
  @scala.inline
  def apply(): Environment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Environment]
  }
  @scala.inline
  implicit class EnvironmentOps[Self <: Environment] (val x: Self) extends AnyVal {
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setDescription(value: EnvironmentDescription): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setId(value: EnvironmentId): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLifecycle(value: EnvironmentLifecycle): Self = this.set("lifecycle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLifecycle: Self = this.set("lifecycle", js.undefined)
    @scala.inline
    def setName(value: EnvironmentName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOwnerArn(value: String): Self = this.set("ownerArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerArn: Self = this.set("ownerArn", js.undefined)
    @scala.inline
    def setType(value: EnvironmentType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

