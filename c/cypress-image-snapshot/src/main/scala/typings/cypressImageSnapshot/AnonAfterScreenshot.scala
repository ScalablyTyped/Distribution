package typings.cypressImageSnapshot

import typings.cypressImageSnapshot.cypressImageSnapshotStrings.fullPage
import typings.cypressImageSnapshot.cypressImageSnapshotStrings.horizontal
import typings.cypressImageSnapshot.cypressImageSnapshotStrings.percent
import typings.cypressImageSnapshot.cypressImageSnapshotStrings.pixel
import typings.cypressImageSnapshot.cypressImageSnapshotStrings.runner
import typings.cypressImageSnapshot.cypressImageSnapshotStrings.vertical
import typings.cypressImageSnapshot.cypressImageSnapshotStrings.viewport
import typings.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAfterScreenshot extends js.Object {
  var blackout: js.Array[String]
  var blur: js.UndefOr[Double] = js.undefined
  var capture: runner | viewport | fullPage
  var clip: AnonHeight
  var customDiffConfig: js.UndefOr[AnonIncludeAA] = js.undefined
  var customDiffDir: js.UndefOr[String] = js.undefined
  var customSnapshotIdentifier: js.UndefOr[(js.Function1[/* parameters */ AnonCounter, String]) | String] = js.undefined
  var customSnapshotsDir: js.UndefOr[String] = js.undefined
  var diffDirection: js.UndefOr[horizontal | vertical] = js.undefined
  var disableTimersAndAnimations: Boolean
  var failureThreshold: js.UndefOr[Double] = js.undefined
  var failureThresholdType: js.UndefOr[pixel | percent] = js.undefined
  var noColors: js.UndefOr[Boolean] = js.undefined
  var padding: Double | js.Array[Double] | (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
  var runInProcess: js.UndefOr[Boolean] = js.undefined
  var scale: Boolean
  var updatePassedSnapshot: js.UndefOr[Boolean] = js.undefined
  def afterScreenshot(doc: Document_): Unit
  def beforeScreenshot(doc: Document_): Unit
}

object AnonAfterScreenshot {
  @scala.inline
  def apply(
    afterScreenshot: Document_ => Unit,
    beforeScreenshot: Document_ => Unit,
    blackout: js.Array[String],
    capture: runner | viewport | fullPage,
    clip: AnonHeight,
    disableTimersAndAnimations: Boolean,
    padding: Double | js.Array[Double] | (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double]),
    scale: Boolean,
    blur: Int | Double = null,
    customDiffConfig: AnonIncludeAA = null,
    customDiffDir: String = null,
    customSnapshotIdentifier: (js.Function1[/* parameters */ AnonCounter, String]) | String = null,
    customSnapshotsDir: String = null,
    diffDirection: horizontal | vertical = null,
    failureThreshold: Int | Double = null,
    failureThresholdType: pixel | percent = null,
    noColors: js.UndefOr[Boolean] = js.undefined,
    runInProcess: js.UndefOr[Boolean] = js.undefined,
    updatePassedSnapshot: js.UndefOr[Boolean] = js.undefined
  ): AnonAfterScreenshot = {
    val __obj = js.Dynamic.literal(afterScreenshot = js.Any.fromFunction1(afterScreenshot), beforeScreenshot = js.Any.fromFunction1(beforeScreenshot), blackout = blackout.asInstanceOf[js.Any], capture = capture.asInstanceOf[js.Any], clip = clip.asInstanceOf[js.Any], disableTimersAndAnimations = disableTimersAndAnimations.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    if (blur != null) __obj.updateDynamic("blur")(blur.asInstanceOf[js.Any])
    if (customDiffConfig != null) __obj.updateDynamic("customDiffConfig")(customDiffConfig.asInstanceOf[js.Any])
    if (customDiffDir != null) __obj.updateDynamic("customDiffDir")(customDiffDir.asInstanceOf[js.Any])
    if (customSnapshotIdentifier != null) __obj.updateDynamic("customSnapshotIdentifier")(customSnapshotIdentifier.asInstanceOf[js.Any])
    if (customSnapshotsDir != null) __obj.updateDynamic("customSnapshotsDir")(customSnapshotsDir.asInstanceOf[js.Any])
    if (diffDirection != null) __obj.updateDynamic("diffDirection")(diffDirection.asInstanceOf[js.Any])
    if (failureThreshold != null) __obj.updateDynamic("failureThreshold")(failureThreshold.asInstanceOf[js.Any])
    if (failureThresholdType != null) __obj.updateDynamic("failureThresholdType")(failureThresholdType.asInstanceOf[js.Any])
    if (!js.isUndefined(noColors)) __obj.updateDynamic("noColors")(noColors.asInstanceOf[js.Any])
    if (!js.isUndefined(runInProcess)) __obj.updateDynamic("runInProcess")(runInProcess.asInstanceOf[js.Any])
    if (!js.isUndefined(updatePassedSnapshot)) __obj.updateDynamic("updatePassedSnapshot")(updatePassedSnapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAfterScreenshot]
  }
}

