package typings.awsSyntheticsPuppeteer

import typings.awsSyntheticsPuppeteer.syntheticsReportMod.ScreenshotResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syntheticsScreenshotMod {
  
  inline def apply(): SyntheticsScreenshot = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[SyntheticsScreenshot]
  inline def apply(dir: String): SyntheticsScreenshot = ^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any]).asInstanceOf[SyntheticsScreenshot]
  
  @JSImport("SyntheticsScreenshot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Class to help facilitate taking numbered Puppeteer Screenshots with specified, optional stepNames and suffixes.
    * Defaults to storing the screen shots in the /tmp/ folder.
    */
  @js.native
  trait SyntheticsScreenshot extends StObject {
    
    var _count: Double = js.native
    
    var _dir: String = js.native
    
    var _startingNumber: Double = js.native
    
    var _uploader: Any = js.native
    
    var _zeroFill: Double = js.native
    
    /**
      *  Adds screenshot result to map {StepName: [ScreenshotResults]} and
      *  @returns fileName and page url of screenshot
      */
    def addScreenshotResult(stepName: Any, fileName: Any, pageUrl: Any): ScreenshotResult = js.native
    
    /**
      * Get all screenshots captured during the execution of this step.
      * If two steps have same name, it will get screenshots for both of them.
      * @param stepName
      */
    def getScreenshotResult(stepName: Any): js.Array[ScreenshotResult] = js.native
    
    def reset(): Unit = js.native
    
    def setUploader(uploader: Any): Unit = js.native
    
    def take(page: Any): js.Promise[ScreenshotResult] = js.native
    def take(page: Any, stepName: String): js.Promise[ScreenshotResult] = js.native
    def take(page: Any, stepName: String, suffix: String): js.Promise[ScreenshotResult] = js.native
    def take(page: Any, stepName: Unit, suffix: String): js.Promise[ScreenshotResult] = js.native
    
    def zerofill(num: Any, numlen: Any): String = js.native
  }
}
