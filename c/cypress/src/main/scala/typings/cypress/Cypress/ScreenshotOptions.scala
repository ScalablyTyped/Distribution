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

trait ScreenshotOptions extends StObject {
  
  var blackout: js.Array[String]
  
  var capture: runner | viewport | fullPage
  
  var clip: Dimensions
  
  var disableTimersAndAnimations: Boolean
  
  def onAfterScreenshot($el: JQuery[HTMLElement], props: Blackout): Unit
  
  def onBeforeScreenshot($el: JQuery[HTMLElement]): Unit
  
  var overwrite: Boolean
  
  var padding: Padding
  
  var scale: Boolean
}
object ScreenshotOptions {
  
  inline def apply(
    blackout: js.Array[String],
    capture: runner | viewport | fullPage,
    clip: Dimensions,
    disableTimersAndAnimations: Boolean,
    onAfterScreenshot: (JQuery[HTMLElement], Blackout) => Unit,
    onBeforeScreenshot: JQuery[HTMLElement] => Unit,
    overwrite: Boolean,
    padding: Padding,
    scale: Boolean
  ): ScreenshotOptions = {
    val __obj = js.Dynamic.literal(blackout = blackout.asInstanceOf[js.Any], capture = capture.asInstanceOf[js.Any], clip = clip.asInstanceOf[js.Any], disableTimersAndAnimations = disableTimersAndAnimations.asInstanceOf[js.Any], onAfterScreenshot = js.Any.fromFunction2(onAfterScreenshot), onBeforeScreenshot = js.Any.fromFunction1(onBeforeScreenshot), overwrite = overwrite.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenshotOptions]
  }
  
  extension [Self <: ScreenshotOptions](x: Self) {
    
    inline def setBlackout(value: js.Array[String]): Self = StObject.set(x, "blackout", value.asInstanceOf[js.Any])
    
    inline def setBlackoutVarargs(value: String*): Self = StObject.set(x, "blackout", js.Array(value*))
    
    inline def setCapture(value: runner | viewport | fullPage): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    inline def setClip(value: Dimensions): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    inline def setDisableTimersAndAnimations(value: Boolean): Self = StObject.set(x, "disableTimersAndAnimations", value.asInstanceOf[js.Any])
    
    inline def setOnAfterScreenshot(value: (JQuery[HTMLElement], Blackout) => Unit): Self = StObject.set(x, "onAfterScreenshot", js.Any.fromFunction2(value))
    
    inline def setOnBeforeScreenshot(value: JQuery[HTMLElement] => Unit): Self = StObject.set(x, "onBeforeScreenshot", js.Any.fromFunction1(value))
    
    inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value*))
    
    inline def setScale(value: Boolean): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
