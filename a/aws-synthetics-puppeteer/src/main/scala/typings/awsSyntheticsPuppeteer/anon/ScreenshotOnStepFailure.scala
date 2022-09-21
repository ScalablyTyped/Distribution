package typings.awsSyntheticsPuppeteer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreenshotOnStepFailure extends StObject {
  
  var screenshotOnStepFailure: Boolean
  
  var screenshotOnStepStart: Boolean
  
  var screenshotOnStepSuccess: Boolean
}
object ScreenshotOnStepFailure {
  
  inline def apply(screenshotOnStepFailure: Boolean, screenshotOnStepStart: Boolean, screenshotOnStepSuccess: Boolean): ScreenshotOnStepFailure = {
    val __obj = js.Dynamic.literal(screenshotOnStepFailure = screenshotOnStepFailure.asInstanceOf[js.Any], screenshotOnStepStart = screenshotOnStepStart.asInstanceOf[js.Any], screenshotOnStepSuccess = screenshotOnStepSuccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenshotOnStepFailure]
  }
  
  extension [Self <: ScreenshotOnStepFailure](x: Self) {
    
    inline def setScreenshotOnStepFailure(value: Boolean): Self = StObject.set(x, "screenshotOnStepFailure", value.asInstanceOf[js.Any])
    
    inline def setScreenshotOnStepStart(value: Boolean): Self = StObject.set(x, "screenshotOnStepStart", value.asInstanceOf[js.Any])
    
    inline def setScreenshotOnStepSuccess(value: Boolean): Self = StObject.set(x, "screenshotOnStepSuccess", value.asInstanceOf[js.Any])
  }
}
