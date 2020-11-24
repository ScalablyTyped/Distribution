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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<{  blackout :std.Array<string>,   capture :'runner' | 'viewport' | 'fullPage',   clip :{  x :number,   y :number,   width :number,   height :number},   disableTimersAndAnimations :boolean,   padding :number | [number] | [number, number] | [number, number, number] | [number, number, number, number],   scale :boolean, beforeScreenshot (doc : std.Document): void, afterScreenshot (doc : std.Document): void,   customDiffConfig :{ readonly threshold :number | undefined,  readonly includeAA :boolean | undefined} | undefined,   customSnapshotsDir :string | undefined,   customDiffDir :string | undefined,   customSnapshotIdentifier :(parameters : {  testPath :string,   currentTestName :string,   counter :number,   defaultIdentifier :string}): string | string | undefined,   diffDirection :'horizontal' | 'vertical' | undefined,   noColors :boolean | undefined,   failureThreshold :number | undefined,   failureThresholdType :'pixel' | 'percent' | undefined,   updatePassedSnapshot :boolean | undefined,   blur :number | undefined,   runInProcess :boolean | undefined}> */
@js.native
trait Options extends js.Object {
  
  var afterScreenshot: js.UndefOr[js.Function1[/* doc */ Document, Unit]] = js.native
  
  var beforeScreenshot: js.UndefOr[js.Function1[/* doc */ Document, Unit]] = js.native
  
  var blackout: js.UndefOr[js.Array[String]] = js.native
  
  var blur: js.UndefOr[Double] = js.native
  
  var capture: js.UndefOr[runner | viewport | fullPage] = js.native
  
  var clip: js.UndefOr[Height] = js.native
  
  var customDiffConfig: js.UndefOr[IncludeAA] = js.native
  
  var customDiffDir: js.UndefOr[String] = js.native
  
  var customSnapshotIdentifier: js.UndefOr[(js.Function1[/* parameters */ Counter, String]) | String] = js.native
  
  var customSnapshotsDir: js.UndefOr[String] = js.native
  
  var diffDirection: js.UndefOr[horizontal | vertical] = js.native
  
  var disableTimersAndAnimations: js.UndefOr[Boolean] = js.native
  
  var failureThreshold: js.UndefOr[Double] = js.native
  
  var failureThresholdType: js.UndefOr[pixel | percent] = js.native
  
  var noColors: js.UndefOr[Boolean] = js.native
  
  var padding: js.UndefOr[
    Double | js.Array[Double] | (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
  ] = js.native
  
  var runInProcess: js.UndefOr[Boolean] = js.native
  
  var scale: js.UndefOr[Boolean] = js.native
  
  var updatePassedSnapshot: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAfterScreenshot(value: /* doc */ Document => Unit): Self = this.set("afterScreenshot", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterScreenshot: Self = this.set("afterScreenshot", js.undefined)
    
    @scala.inline
    def setBeforeScreenshot(value: /* doc */ Document => Unit): Self = this.set("beforeScreenshot", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeScreenshot: Self = this.set("beforeScreenshot", js.undefined)
    
    @scala.inline
    def setBlackoutVarargs(value: String*): Self = this.set("blackout", js.Array(value :_*))
    
    @scala.inline
    def setBlackout(value: js.Array[String]): Self = this.set("blackout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlackout: Self = this.set("blackout", js.undefined)
    
    @scala.inline
    def setBlur(value: Double): Self = this.set("blur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlur: Self = this.set("blur", js.undefined)
    
    @scala.inline
    def setCapture(value: runner | viewport | fullPage): Self = this.set("capture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapture: Self = this.set("capture", js.undefined)
    
    @scala.inline
    def setClip(value: Height): Self = this.set("clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClip: Self = this.set("clip", js.undefined)
    
    @scala.inline
    def setCustomDiffConfig(value: IncludeAA): Self = this.set("customDiffConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomDiffConfig: Self = this.set("customDiffConfig", js.undefined)
    
    @scala.inline
    def setCustomDiffDir(value: String): Self = this.set("customDiffDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomDiffDir: Self = this.set("customDiffDir", js.undefined)
    
    @scala.inline
    def setCustomSnapshotIdentifierFunction1(value: /* parameters */ Counter => String): Self = this.set("customSnapshotIdentifier", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCustomSnapshotIdentifier(value: (js.Function1[/* parameters */ Counter, String]) | String): Self = this.set("customSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomSnapshotIdentifier: Self = this.set("customSnapshotIdentifier", js.undefined)
    
    @scala.inline
    def setCustomSnapshotsDir(value: String): Self = this.set("customSnapshotsDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomSnapshotsDir: Self = this.set("customSnapshotsDir", js.undefined)
    
    @scala.inline
    def setDiffDirection(value: horizontal | vertical): Self = this.set("diffDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiffDirection: Self = this.set("diffDirection", js.undefined)
    
    @scala.inline
    def setDisableTimersAndAnimations(value: Boolean): Self = this.set("disableTimersAndAnimations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableTimersAndAnimations: Self = this.set("disableTimersAndAnimations", js.undefined)
    
    @scala.inline
    def setFailureThreshold(value: Double): Self = this.set("failureThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureThreshold: Self = this.set("failureThreshold", js.undefined)
    
    @scala.inline
    def setFailureThresholdType(value: pixel | percent): Self = this.set("failureThresholdType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureThresholdType: Self = this.set("failureThresholdType", js.undefined)
    
    @scala.inline
    def setNoColors(value: Boolean): Self = this.set("noColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoColors: Self = this.set("noColors", js.undefined)
    
    @scala.inline
    def setPaddingVarargs(value: Double*): Self = this.set("padding", js.Array(value :_*))
    
    @scala.inline
    def setPadding(
      value: Double | js.Array[Double] | (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
    ): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setRunInProcess(value: Boolean): Self = this.set("runInProcess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunInProcess: Self = this.set("runInProcess", js.undefined)
    
    @scala.inline
    def setScale(value: Boolean): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setUpdatePassedSnapshot(value: Boolean): Self = this.set("updatePassedSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatePassedSnapshot: Self = this.set("updatePassedSnapshot", js.undefined)
  }
}
