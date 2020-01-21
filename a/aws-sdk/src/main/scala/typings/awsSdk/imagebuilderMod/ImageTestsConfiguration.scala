package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageTestsConfiguration extends js.Object {
  /**
    * Defines if tests should be executed when building this image.
    */
  var imageTestsEnabled: js.UndefOr[NullableBoolean] = js.native
  /**
    * The maximum time in minutes that tests are permitted to run for.
    */
  var timeoutMinutes: js.UndefOr[ImageTestsTimeoutMinutes] = js.native
}

object ImageTestsConfiguration {
  @scala.inline
  def apply(imageTestsEnabled: js.UndefOr[Boolean] = js.undefined, timeoutMinutes: Int | Double = null): ImageTestsConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(imageTestsEnabled)) __obj.updateDynamic("imageTestsEnabled")(imageTestsEnabled.asInstanceOf[js.Any])
    if (timeoutMinutes != null) __obj.updateDynamic("timeoutMinutes")(timeoutMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageTestsConfiguration]
  }
}

