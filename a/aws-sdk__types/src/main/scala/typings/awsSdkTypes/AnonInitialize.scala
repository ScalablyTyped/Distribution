package typings.awsSdkTypes

import typings.awsSdkTypes.awsSdkTypesStrings.initialize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInitialize extends js.Object {
  var step: js.UndefOr[initialize] = js.undefined
}

object AnonInitialize {
  @scala.inline
  def apply(step: initialize = null): AnonInitialize = {
    val __obj = js.Dynamic.literal()
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInitialize]
  }
}

