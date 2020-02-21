package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Standard extends js.Object {
  /**
    * A description of the standard.
    */
  var Description: js.UndefOr[NonEmptyString] = js.native
  /**
    * The name of the standard.
    */
  var Name: js.UndefOr[NonEmptyString] = js.native
  /**
    * The ARN of a standard.
    */
  var StandardsArn: js.UndefOr[NonEmptyString] = js.native
}

object Standard {
  @scala.inline
  def apply(
    Description: NonEmptyString = null,
    Name: NonEmptyString = null,
    StandardsArn: NonEmptyString = null
  ): Standard = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (StandardsArn != null) __obj.updateDynamic("StandardsArn")(StandardsArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Standard]
  }
}

