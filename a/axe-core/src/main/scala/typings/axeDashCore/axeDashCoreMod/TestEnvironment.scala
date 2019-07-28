package typings.axeDashCore.axeDashCoreMod

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
    orientationAngle: Int | Double = null,
    orientationType: String = null
  ): TestEnvironment = {
    val __obj = js.Dynamic.literal(userAgent = userAgent, windowHeight = windowHeight, windowWidth = windowWidth)
    if (orientationAngle != null) __obj.updateDynamic("orientationAngle")(orientationAngle.asInstanceOf[js.Any])
    if (orientationType != null) __obj.updateDynamic("orientationType")(orientationType)
    __obj.asInstanceOf[TestEnvironment]
  }
}

