package typings.cypressImageSnapshot

import typings.cypressImageSnapshot.anon.Counter
import typings.cypressImageSnapshot.anon.Height
import typings.cypressImageSnapshot.anon.IncludeAA
import typings.cypressImageSnapshot.cypressImageSnapshotStrings.fullPage
import typings.cypressImageSnapshot.cypressImageSnapshotStrings.horizontal
import typings.cypressImageSnapshot.cypressImageSnapshotStrings.percent
import typings.cypressImageSnapshot.cypressImageSnapshotStrings.pixel
import typings.cypressImageSnapshot.cypressImageSnapshotStrings.pixelmatch
import typings.cypressImageSnapshot.cypressImageSnapshotStrings.runner
import typings.cypressImageSnapshot.cypressImageSnapshotStrings.ssim
import typings.cypressImageSnapshot.cypressImageSnapshotStrings.vertical
import typings.cypressImageSnapshot.cypressImageSnapshotStrings.viewport
import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Inlined parent std.Partial<{  blackout :std.Array<string>,   capture :'runner' | 'viewport' | 'fullPage',   clip :{  x :number,   y :number,   width :number,   height :number},   disableTimersAndAnimations :boolean,   padding :number | [number] | [number, number] | [number, number, number] | [number, number, number, number],   scale :boolean, beforeScreenshot (doc : std.Document): void, afterScreenshot (doc : std.Document): void,   allowSizeMismatch :boolean | undefined,   comparisonMethod :'pixelmatch' | 'ssim' | undefined,   customDiffConfig :{ readonly threshold :number | undefined,  readonly includeAA :boolean | undefined} | undefined,   customSnapshotsDir :string | undefined,   customDiffDir :string | undefined,   customSnapshotIdentifier :(parameters : {  testPath :string,   currentTestName :string,   counter :number,   defaultIdentifier :string}): string | string | undefined,   diffDirection :'horizontal' | 'vertical' | undefined,   dumpDiffToConsole :boolean | undefined,   noColors :boolean | undefined,   failureThreshold :number | undefined,   failureThresholdType :'pixel' | 'percent' | undefined,   updatePassedSnapshot :boolean | undefined,   blur :number | undefined,   runInProcess :boolean | undefined}> */
  trait Options extends StObject {
    
    var afterScreenshot: js.UndefOr[js.Function1[/* doc */ Document, Unit]] = js.undefined
    
    var allowSizeMismatch: js.UndefOr[Boolean] = js.undefined
    
    var beforeScreenshot: js.UndefOr[js.Function1[/* doc */ Document, Unit]] = js.undefined
    
    var blackout: js.UndefOr[js.Array[String]] = js.undefined
    
    var blur: js.UndefOr[Double] = js.undefined
    
    var capture: js.UndefOr[runner | viewport | fullPage] = js.undefined
    
    var clip: js.UndefOr[Height] = js.undefined
    
    var comparisonMethod: js.UndefOr[pixelmatch | ssim] = js.undefined
    
    var customDiffConfig: js.UndefOr[IncludeAA] = js.undefined
    
    var customDiffDir: js.UndefOr[String] = js.undefined
    
    var customSnapshotIdentifier: js.UndefOr[(js.Function1[/* parameters */ Counter, String]) | String] = js.undefined
    
    var customSnapshotsDir: js.UndefOr[String] = js.undefined
    
    var diffDirection: js.UndefOr[horizontal | vertical] = js.undefined
    
    var disableTimersAndAnimations: js.UndefOr[Boolean] = js.undefined
    
    var dumpDiffToConsole: js.UndefOr[Boolean] = js.undefined
    
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
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAfterScreenshot(value: /* doc */ Document => Unit): Self = StObject.set(x, "afterScreenshot", js.Any.fromFunction1(value))
      
      inline def setAfterScreenshotUndefined: Self = StObject.set(x, "afterScreenshot", js.undefined)
      
      inline def setAllowSizeMismatch(value: Boolean): Self = StObject.set(x, "allowSizeMismatch", value.asInstanceOf[js.Any])
      
      inline def setAllowSizeMismatchUndefined: Self = StObject.set(x, "allowSizeMismatch", js.undefined)
      
      inline def setBeforeScreenshot(value: /* doc */ Document => Unit): Self = StObject.set(x, "beforeScreenshot", js.Any.fromFunction1(value))
      
      inline def setBeforeScreenshotUndefined: Self = StObject.set(x, "beforeScreenshot", js.undefined)
      
      inline def setBlackout(value: js.Array[String]): Self = StObject.set(x, "blackout", value.asInstanceOf[js.Any])
      
      inline def setBlackoutUndefined: Self = StObject.set(x, "blackout", js.undefined)
      
      inline def setBlackoutVarargs(value: String*): Self = StObject.set(x, "blackout", js.Array(value*))
      
      inline def setBlur(value: Double): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
      
      inline def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
      
      inline def setCapture(value: runner | viewport | fullPage): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setClip(value: Height): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
      
      inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
      
      inline def setComparisonMethod(value: pixelmatch | ssim): Self = StObject.set(x, "comparisonMethod", value.asInstanceOf[js.Any])
      
      inline def setComparisonMethodUndefined: Self = StObject.set(x, "comparisonMethod", js.undefined)
      
      inline def setCustomDiffConfig(value: IncludeAA): Self = StObject.set(x, "customDiffConfig", value.asInstanceOf[js.Any])
      
      inline def setCustomDiffConfigUndefined: Self = StObject.set(x, "customDiffConfig", js.undefined)
      
      inline def setCustomDiffDir(value: String): Self = StObject.set(x, "customDiffDir", value.asInstanceOf[js.Any])
      
      inline def setCustomDiffDirUndefined: Self = StObject.set(x, "customDiffDir", js.undefined)
      
      inline def setCustomSnapshotIdentifier(value: (js.Function1[/* parameters */ Counter, String]) | String): Self = StObject.set(x, "customSnapshotIdentifier", value.asInstanceOf[js.Any])
      
      inline def setCustomSnapshotIdentifierFunction1(value: /* parameters */ Counter => String): Self = StObject.set(x, "customSnapshotIdentifier", js.Any.fromFunction1(value))
      
      inline def setCustomSnapshotIdentifierUndefined: Self = StObject.set(x, "customSnapshotIdentifier", js.undefined)
      
      inline def setCustomSnapshotsDir(value: String): Self = StObject.set(x, "customSnapshotsDir", value.asInstanceOf[js.Any])
      
      inline def setCustomSnapshotsDirUndefined: Self = StObject.set(x, "customSnapshotsDir", js.undefined)
      
      inline def setDiffDirection(value: horizontal | vertical): Self = StObject.set(x, "diffDirection", value.asInstanceOf[js.Any])
      
      inline def setDiffDirectionUndefined: Self = StObject.set(x, "diffDirection", js.undefined)
      
      inline def setDisableTimersAndAnimations(value: Boolean): Self = StObject.set(x, "disableTimersAndAnimations", value.asInstanceOf[js.Any])
      
      inline def setDisableTimersAndAnimationsUndefined: Self = StObject.set(x, "disableTimersAndAnimations", js.undefined)
      
      inline def setDumpDiffToConsole(value: Boolean): Self = StObject.set(x, "dumpDiffToConsole", value.asInstanceOf[js.Any])
      
      inline def setDumpDiffToConsoleUndefined: Self = StObject.set(x, "dumpDiffToConsole", js.undefined)
      
      inline def setFailureThreshold(value: Double): Self = StObject.set(x, "failureThreshold", value.asInstanceOf[js.Any])
      
      inline def setFailureThresholdType(value: pixel | percent): Self = StObject.set(x, "failureThresholdType", value.asInstanceOf[js.Any])
      
      inline def setFailureThresholdTypeUndefined: Self = StObject.set(x, "failureThresholdType", js.undefined)
      
      inline def setFailureThresholdUndefined: Self = StObject.set(x, "failureThreshold", js.undefined)
      
      inline def setNoColors(value: Boolean): Self = StObject.set(x, "noColors", value.asInstanceOf[js.Any])
      
      inline def setNoColorsUndefined: Self = StObject.set(x, "noColors", js.undefined)
      
      inline def setPadding(
        value: Double | js.Array[Double] | (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
      ): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value*))
      
      inline def setRunInProcess(value: Boolean): Self = StObject.set(x, "runInProcess", value.asInstanceOf[js.Any])
      
      inline def setRunInProcessUndefined: Self = StObject.set(x, "runInProcess", js.undefined)
      
      inline def setScale(value: Boolean): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setUpdatePassedSnapshot(value: Boolean): Self = StObject.set(x, "updatePassedSnapshot", value.asInstanceOf[js.Any])
      
      inline def setUpdatePassedSnapshotUndefined: Self = StObject.set(x, "updatePassedSnapshot", js.undefined)
    }
  }
  
  object global {
    
    object Cypress {
      
      @js.native
      trait Chainable extends StObject {
        
        def matchImageSnapshot(): Unit = js.native
        def matchImageSnapshot(nameOrOptions: String): Unit = js.native
        def matchImageSnapshot(nameOrOptions: Options): Unit = js.native
        def matchImageSnapshot(name: String, options: Options): Unit = js.native
      }
    }
  }
}
