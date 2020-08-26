package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestGridProject extends js.Object {
  /**
    * The ARN for the project.
    */
  var arn: js.UndefOr[DeviceFarmArn] = js.native
  /**
    * When the project was created.
    */
  var created: js.UndefOr[DateTime] = js.native
  /**
    * A human-readable description for the project.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * A human-readable name for the project.
    */
  var name: js.UndefOr[String] = js.native
}

object TestGridProject {
  @scala.inline
  def apply(): TestGridProject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestGridProject]
  }
  @scala.inline
  implicit class TestGridProjectOps[Self <: TestGridProject] (val x: Self) extends AnyVal {
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
    def setArn(value: DeviceFarmArn): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setCreated(value: DateTime): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

