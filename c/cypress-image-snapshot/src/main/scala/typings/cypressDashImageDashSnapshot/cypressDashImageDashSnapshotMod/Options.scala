package typings.cypressDashImageDashSnapshot.cypressDashImageDashSnapshotMod

import typings.cypressDashImageDashSnapshot.Anon_Threshold
import typings.cypressDashImageDashSnapshot.cypressDashImageDashSnapshotStrings.number
import typings.cypressDashImageDashSnapshot.cypressDashImageDashSnapshotStrings.percent
import typings.cypressDashImageDashSnapshot.cypressDashImageDashSnapshotStrings.viewport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var capture: js.UndefOr[viewport] = js.undefined
  var customDiffConfig: js.UndefOr[Anon_Threshold] = js.undefined
  var customDiffDir: js.UndefOr[String] = js.undefined
  var customSnapshotsDir: js.UndefOr[String] = js.undefined
  var failureThreshold: js.UndefOr[Double] = js.undefined
  var failureThresholdType: js.UndefOr[percent | number] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    capture: viewport = null,
    customDiffConfig: Anon_Threshold = null,
    customDiffDir: String = null,
    customSnapshotsDir: String = null,
    failureThreshold: Int | Double = null,
    failureThresholdType: percent | number = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (capture != null) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (customDiffConfig != null) __obj.updateDynamic("customDiffConfig")(customDiffConfig.asInstanceOf[js.Any])
    if (customDiffDir != null) __obj.updateDynamic("customDiffDir")(customDiffDir.asInstanceOf[js.Any])
    if (customSnapshotsDir != null) __obj.updateDynamic("customSnapshotsDir")(customSnapshotsDir.asInstanceOf[js.Any])
    if (failureThreshold != null) __obj.updateDynamic("failureThreshold")(failureThreshold.asInstanceOf[js.Any])
    if (failureThresholdType != null) __obj.updateDynamic("failureThresholdType")(failureThresholdType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

