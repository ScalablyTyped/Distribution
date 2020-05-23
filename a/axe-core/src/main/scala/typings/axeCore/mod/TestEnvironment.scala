package typings.axeCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestEnvironment extends js.Object {
  var orientationAngle: js.UndefOr[Double] = js.undefined
  var orientationType: js.UndefOr[String] = js.undefined
  var userAgent: String
  var windowHeight: Double
  var windowWidth: Double
}

object TestEnvironment {
  @scala.inline
  def apply(
    userAgent: String,
    windowHeight: Double,
    windowWidth: Double,
    orientationAngle: js.UndefOr[Double] = js.undefined,
    orientationType: String = null
  ): TestEnvironment = {
    val __obj = js.Dynamic.literal(userAgent = userAgent.asInstanceOf[js.Any], windowHeight = windowHeight.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(orientationAngle)) __obj.updateDynamic("orientationAngle")(orientationAngle.get.asInstanceOf[js.Any])
    if (orientationType != null) __obj.updateDynamic("orientationType")(orientationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestEnvironment]
  }
}

