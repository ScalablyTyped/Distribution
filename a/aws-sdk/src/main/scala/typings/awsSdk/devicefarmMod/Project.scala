package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Project extends js.Object {
  /**
    * The project's ARN.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * When the project was created.
    */
  var created: js.UndefOr[DateTime] = js.native
  /**
    * The default number of minutes (at the project level) a test run executes before it times out. The default value is 150 minutes.
    */
  var defaultJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.native
  /**
    * The project's name.
    */
  var name: js.UndefOr[Name] = js.native
}

object Project {
  @scala.inline
  def apply(
    arn: AmazonResourceName = null,
    created: DateTime = null,
    defaultJobTimeoutMinutes: Int | scala.Double = null,
    name: Name = null
  ): Project = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (defaultJobTimeoutMinutes != null) __obj.updateDynamic("defaultJobTimeoutMinutes")(defaultJobTimeoutMinutes.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Project]
  }
}

