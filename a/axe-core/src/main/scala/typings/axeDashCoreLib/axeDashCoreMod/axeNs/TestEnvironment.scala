package typings
package axeDashCoreLib.axeDashCoreMod.axeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestEnvironment extends js.Object {
  var orientationAngle: js.UndefOr[scala.Double] = js.undefined
  var orientationType: js.UndefOr[java.lang.String] = js.undefined
  var userAgent: java.lang.String
  var windowHeight: scala.Double
  var windowWidth: scala.Double
}

object TestEnvironment {
  @scala.inline
  def apply(
    userAgent: java.lang.String,
    windowHeight: scala.Double,
    windowWidth: scala.Double,
    orientationAngle: scala.Int | scala.Double = null,
    orientationType: java.lang.String = null
  ): TestEnvironment = {
    val __obj = js.Dynamic.literal(userAgent = userAgent, windowHeight = windowHeight, windowWidth = windowWidth)
    if (orientationAngle != null) __obj.updateDynamic("orientationAngle")(orientationAngle.asInstanceOf[js.Any])
    if (orientationType != null) __obj.updateDynamic("orientationType")(orientationType)
    __obj.asInstanceOf[TestEnvironment]
  }
}

