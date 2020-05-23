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
    * The maximum time in minutes that tests are permitted to run.
    */
  var timeoutMinutes: js.UndefOr[ImageTestsTimeoutMinutes] = js.native
}

object ImageTestsConfiguration {
  @scala.inline
  def apply(
    imageTestsEnabled: js.UndefOr[NullableBoolean] = js.undefined,
    timeoutMinutes: js.UndefOr[ImageTestsTimeoutMinutes] = js.undefined
  ): ImageTestsConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(imageTestsEnabled)) __obj.updateDynamic("imageTestsEnabled")(imageTestsEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeoutMinutes)) __obj.updateDynamic("timeoutMinutes")(timeoutMinutes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageTestsConfiguration]
  }
}

