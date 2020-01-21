package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildNotDeleted extends js.Object {
  /**
    * The ID of the build that could not be successfully deleted.
    */
  var id: js.UndefOr[NonEmptyString] = js.native
  /**
    * Additional information about the build that could not be successfully deleted.
    */
  var statusCode: js.UndefOr[String] = js.native
}

object BuildNotDeleted {
  @scala.inline
  def apply(id: NonEmptyString = null, statusCode: String = null): BuildNotDeleted = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildNotDeleted]
  }
}

