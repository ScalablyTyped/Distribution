package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateApplicationInput extends js.Object {
  /**
    * The name of the application. This name must be unique with the applicable IAM user or AWS account.
    */
  var applicationName: ApplicationName = js.native
  /**
    *  The destination platform type for the deployment (Lambda, Server, or ECS).
    */
  var computePlatform: js.UndefOr[ComputePlatform] = js.native
  /**
    *  The metadata that you apply to CodeDeploy applications to help you organize and categorize them. Each tag consists of a key and an optional value, both of which you define. 
    */
  var tags: js.UndefOr[TagList] = js.native
}

object CreateApplicationInput {
  @scala.inline
  def apply(applicationName: ApplicationName): CreateApplicationInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationInput]
  }
  @scala.inline
  implicit class CreateApplicationInputOps[Self <: CreateApplicationInput] (val x: Self) extends AnyVal {
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
    def setApplicationName(value: ApplicationName): Self = this.set("applicationName", value.asInstanceOf[js.Any])
    @scala.inline
    def setComputePlatform(value: ComputePlatform): Self = this.set("computePlatform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComputePlatform: Self = this.set("computePlatform", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

