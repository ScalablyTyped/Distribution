package typings.cypress.Cypress

import typings.cypress.JQuery
import typings.cypress.anon.Blackout
import typings.cypress.cypressStrings.fullPage
import typings.cypress.cypressStrings.runner
import typings.cypress.cypressStrings.viewport
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreenshotDefaultsOptions
  extends StObject
     with ScreenshotOptions {
  
  var screenshotOnRunFailure: Boolean
}
object ScreenshotDefaultsOptions {
  
  inline def apply(
    blackout: js.Array[String],
    capture: runner | viewport | fullPage,
    clip: Dimensions,
    disableTimersAndAnimations: Boolean,
    onAfterScreenshot: (JQuery[HTMLElement], Blackout) => Unit,
    onBeforeScreenshot: JQuery[HTMLElement] => Unit,
    overwrite: Boolean,
    padding: Padding,
    scale: Boolean,
    screenshotOnRunFailure: Boolean
  ): ScreenshotDefaultsOptions = {
    val __obj = js.Dynamic.literal(blackout = blackout.asInstanceOf[js.Any], capture = capture.asInstanceOf[js.Any], clip = clip.asInstanceOf[js.Any], disableTimersAndAnimations = disableTimersAndAnimations.asInstanceOf[js.Any], onAfterScreenshot = js.Any.fromFunction2(onAfterScreenshot), onBeforeScreenshot = js.Any.fromFunction1(onBeforeScreenshot), overwrite = overwrite.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], screenshotOnRunFailure = screenshotOnRunFailure.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenshotDefaultsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScreenshotDefaultsOptions] (val x: Self) extends AnyVal {
    
    inline def setScreenshotOnRunFailure(value: Boolean): Self = StObject.set(x, "screenshotOnRunFailure", value.asInstanceOf[js.Any])
  }
}
