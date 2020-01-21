package typings.awsSdkBuildTypes.customizationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdditionalDocumentation extends js.Object {
  /**
    * A documentation string to append to the general configuration property
    * documentation.
    */
  var additionalDocumentation: js.UndefOr[String] = js.undefined
}

object AdditionalDocumentation {
  @scala.inline
  def apply(additionalDocumentation: String = null): AdditionalDocumentation = {
    val __obj = js.Dynamic.literal()
    if (additionalDocumentation != null) __obj.updateDynamic("additionalDocumentation")(additionalDocumentation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalDocumentation]
  }
}

