package typings.cypressImageSnapshot.mod

import typings.cypressImageSnapshot.anon.Counter
import typings.cypressImageSnapshot.anon.Height
import typings.cypressImageSnapshot.anon.IncludeAA
import typings.cypressImageSnapshot.cypressImageSnapshotStrings.fullPage
import typings.cypressImageSnapshot.cypressImageSnapshotStrings.horizontal
import typings.cypressImageSnapshot.cypressImageSnapshotStrings.percent
import typings.cypressImageSnapshot.cypressImageSnapshotStrings.pixel
import typings.cypressImageSnapshot.cypressImageSnapshotStrings.runner
import typings.cypressImageSnapshot.cypressImageSnapshotStrings.vertical
import typings.cypressImageSnapshot.cypressImageSnapshotStrings.viewport
import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<{  blackout  :std.Array<string>,   capture  :'runner' | 'viewport' | 'fullPage',   clip  :{  x  :number,   y  :number,   width  :number,   height  :number},   disableTimersAndAnimations  :boolean,   padding  :number | [number] | [number, number] | [number, number, number] | [number, number, number, number],   scale  :boolean, beforeScreenshot (doc : std.Document): void, afterScreenshot (doc : std.Document): void,   customDiffConfig ? :{ readonly threshold ? :number,  readonly includeAA ? :boolean},   customSnapshotsDir ? :string,   customDiffDir ? :string,   customSnapshotIdentifier ? :(parameters : {  testPath  :string,   currentTestName  :string,   counter  :number,   defaultIdentifier  :string}): string | string,   diffDirection ? :'horizontal' | 'vertical',   noColors ? :boolean,   failureThreshold ? :number,   failureThresholdType ? :'pixel' | 'percent',   updatePassedSnapshot ? :boolean,   blur ? :number,   runInProcess ? :boolean}> */
trait Options extends js.Object {
  var afterScreenshot: js.UndefOr[js.Function1[/* doc */ Document, Unit]] = js.undefined
  var beforeScreenshot: js.UndefOr[js.Function1[/* doc */ Document, Unit]] = js.undefined
  var blackout: js.UndefOr[js.Array[String]] = js.undefined
  var blur: js.UndefOr[Double] = js.undefined
  var capture: js.UndefOr[runner | viewport | fullPage] = js.undefined
  var clip: js.UndefOr[Height] = js.undefined
  var customDiffConfig: js.UndefOr[IncludeAA] = js.undefined
  var customDiffDir: js.UndefOr[String] = js.undefined
  var customSnapshotIdentifier: js.UndefOr[(js.Function1[/* parameters */ Counter, String]) | String] = js.undefined
  var customSnapshotsDir: js.UndefOr[String] = js.undefined
  var diffDirection: js.UndefOr[horizontal | vertical] = js.undefined
  var disableTimersAndAnimations: js.UndefOr[Boolean] = js.undefined
  var failureThreshold: js.UndefOr[Double] = js.undefined
  var failureThresholdType: js.UndefOr[pixel | percent] = js.undefined
  var noColors: js.UndefOr[Boolean] = js.undefined
  var padding: js.UndefOr[
    Double | js.Array[Double] | (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
  ] = js.undefined
  var runInProcess: js.UndefOr[Boolean] = js.undefined
  var scale: js.UndefOr[Boolean] = js.undefined
  var updatePassedSnapshot: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    afterScreenshot: /* doc */ Document => Unit = null,
    beforeScreenshot: /* doc */ Document => Unit = null,
    blackout: js.Array[String] = null,
    blur: js.UndefOr[Double] = js.undefined,
    capture: runner | viewport | fullPage = null,
    clip: Height = null,
    customDiffConfig: IncludeAA = null,
    customDiffDir: String = null,
    customSnapshotIdentifier: (js.Function1[/* parameters */ Counter, String]) | String = null,
    customSnapshotsDir: String = null,
    diffDirection: horizontal | vertical = null,
    disableTimersAndAnimations: js.UndefOr[Boolean] = js.undefined,
    failureThreshold: js.UndefOr[Double] = js.undefined,
    failureThresholdType: pixel | percent = null,
    noColors: js.UndefOr[Boolean] = js.undefined,
    padding: Double | js.Array[Double] | (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double]) = null,
    runInProcess: js.UndefOr[Boolean] = js.undefined,
    scale: js.UndefOr[Boolean] = js.undefined,
    updatePassedSnapshot: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (afterScreenshot != null) __obj.updateDynamic("afterScreenshot")(js.Any.fromFunction1(afterScreenshot))
    if (beforeScreenshot != null) __obj.updateDynamic("beforeScreenshot")(js.Any.fromFunction1(beforeScreenshot))
    if (blackout != null) __obj.updateDynamic("blackout")(blackout.asInstanceOf[js.Any])
    if (!js.isUndefined(blur)) __obj.updateDynamic("blur")(blur.get.asInstanceOf[js.Any])
    if (capture != null) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (customDiffConfig != null) __obj.updateDynamic("customDiffConfig")(customDiffConfig.asInstanceOf[js.Any])
    if (customDiffDir != null) __obj.updateDynamic("customDiffDir")(customDiffDir.asInstanceOf[js.Any])
    if (customSnapshotIdentifier != null) __obj.updateDynamic("customSnapshotIdentifier")(customSnapshotIdentifier.asInstanceOf[js.Any])
    if (customSnapshotsDir != null) __obj.updateDynamic("customSnapshotsDir")(customSnapshotsDir.asInstanceOf[js.Any])
    if (diffDirection != null) __obj.updateDynamic("diffDirection")(diffDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(disableTimersAndAnimations)) __obj.updateDynamic("disableTimersAndAnimations")(disableTimersAndAnimations.get.asInstanceOf[js.Any])
    if (!js.isUndefined(failureThreshold)) __obj.updateDynamic("failureThreshold")(failureThreshold.get.asInstanceOf[js.Any])
    if (failureThresholdType != null) __obj.updateDynamic("failureThresholdType")(failureThresholdType.asInstanceOf[js.Any])
    if (!js.isUndefined(noColors)) __obj.updateDynamic("noColors")(noColors.get.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(runInProcess)) __obj.updateDynamic("runInProcess")(runInProcess.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updatePassedSnapshot)) __obj.updateDynamic("updatePassedSnapshot")(updatePassedSnapshot.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

