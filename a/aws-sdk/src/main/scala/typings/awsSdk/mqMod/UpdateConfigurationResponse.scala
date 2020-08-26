package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateConfigurationResponse extends js.Object {
  /**
    * Required. The Amazon Resource Name (ARN) of the configuration.
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * Required. The date and time of the configuration.
    */
  var Created: js.UndefOr[timestampIso8601] = js.native
  /**
    * Required. The unique ID that Amazon MQ generates for the configuration.
    */
  var Id: js.UndefOr[string] = js.native
  /**
    * The latest revision of the configuration.
    */
  var LatestRevision: js.UndefOr[ConfigurationRevision] = js.native
  /**
    * Required. The name of the configuration. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
    */
  var Name: js.UndefOr[string] = js.native
  /**
    * The list of the first 20 warnings about the configuration XML elements or attributes that were sanitized.
    */
  var Warnings: js.UndefOr[listOfSanitizationWarning] = js.native
}

object UpdateConfigurationResponse {
  @scala.inline
  def apply(): UpdateConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateConfigurationResponse]
  }
  @scala.inline
  implicit class UpdateConfigurationResponseOps[Self <: UpdateConfigurationResponse] (val x: Self) extends AnyVal {
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
    def setArn(value: string): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setCreated(value: timestampIso8601): Self = this.set("Created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("Created", js.undefined)
    @scala.inline
    def setId(value: string): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setLatestRevision(value: ConfigurationRevision): Self = this.set("LatestRevision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatestRevision: Self = this.set("LatestRevision", js.undefined)
    @scala.inline
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setWarningsVarargs(value: SanitizationWarning*): Self = this.set("Warnings", js.Array(value :_*))
    @scala.inline
    def setWarnings(value: listOfSanitizationWarning): Self = this.set("Warnings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarnings: Self = this.set("Warnings", js.undefined)
  }
  
}

