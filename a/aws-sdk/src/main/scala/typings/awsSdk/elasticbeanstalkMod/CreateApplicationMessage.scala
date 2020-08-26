package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateApplicationMessage extends js.Object {
  /**
    * The name of the application. Must be unique within your account.
    */
  var ApplicationName: typings.awsSdk.elasticbeanstalkMod.ApplicationName = js.native
  /**
    * Your description of the application.
    */
  var Description: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.Description] = js.native
  /**
    * Specifies an application resource lifecycle configuration to prevent your application from accumulating too many versions.
    */
  var ResourceLifecycleConfig: js.UndefOr[ApplicationResourceLifecycleConfig] = js.native
  /**
    * Specifies the tags applied to the application. Elastic Beanstalk applies these tags only to the application. Environments that you create in the application don't inherit the tags.
    */
  var Tags: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.Tags] = js.native
}

object CreateApplicationMessage {
  @scala.inline
  def apply(ApplicationName: ApplicationName): CreateApplicationMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationMessage]
  }
  @scala.inline
  implicit class CreateApplicationMessageOps[Self <: CreateApplicationMessage] (val x: Self) extends AnyVal {
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
    def setApplicationName(value: ApplicationName): Self = this.set("ApplicationName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setResourceLifecycleConfig(value: ApplicationResourceLifecycleConfig): Self = this.set("ResourceLifecycleConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceLifecycleConfig: Self = this.set("ResourceLifecycleConfig", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

