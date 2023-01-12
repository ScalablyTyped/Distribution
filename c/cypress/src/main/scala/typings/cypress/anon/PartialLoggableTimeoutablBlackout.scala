package typings.cypress.anon

import typings.cypress.Cypress.Dimensions
import typings.cypress.Cypress.Padding
import typings.cypress.JQuery
import typings.cypress.cypressStrings.fullPage
import typings.cypress.cypressStrings.runner
import typings.cypress.cypressStrings.viewport
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<cypress.Cypress.Loggable & cypress.Cypress.Timeoutable & cypress.Cypress.ScreenshotOptions> */
trait PartialLoggableTimeoutablBlackout extends StObject {
  
  var blackout: js.UndefOr[js.Array[String]] = js.undefined
  
  var capture: js.UndefOr[runner | viewport | fullPage] = js.undefined
  
  var clip: js.UndefOr[Dimensions] = js.undefined
  
  var disableTimersAndAnimations: js.UndefOr[Boolean] = js.undefined
  
  var log: js.UndefOr[Boolean] = js.undefined
  
  var onAfterScreenshot: js.UndefOr[js.Function2[/* $el */ JQuery[HTMLElement], /* props */ Blackout, Unit]] = js.undefined
  
  var onBeforeScreenshot: js.UndefOr[js.Function1[/* $el */ JQuery[HTMLElement], Unit]] = js.undefined
  
  var overwrite: js.UndefOr[Boolean] = js.undefined
  
  var padding: js.UndefOr[Padding] = js.undefined
  
  var scale: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object PartialLoggableTimeoutablBlackout {
  
  inline def apply(): PartialLoggableTimeoutablBlackout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLoggableTimeoutablBlackout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialLoggableTimeoutablBlackout] (val x: Self) extends AnyVal {
    
    inline def setBlackout(value: js.Array[String]): Self = StObject.set(x, "blackout", value.asInstanceOf[js.Any])
    
    inline def setBlackoutUndefined: Self = StObject.set(x, "blackout", js.undefined)
    
    inline def setBlackoutVarargs(value: String*): Self = StObject.set(x, "blackout", js.Array(value*))
    
    inline def setCapture(value: runner | viewport | fullPage): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    
    inline def setClip(value: Dimensions): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
    
    inline def setDisableTimersAndAnimations(value: Boolean): Self = StObject.set(x, "disableTimersAndAnimations", value.asInstanceOf[js.Any])
    
    inline def setDisableTimersAndAnimationsUndefined: Self = StObject.set(x, "disableTimersAndAnimations", js.undefined)
    
    inline def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    inline def setOnAfterScreenshot(value: (/* $el */ JQuery[HTMLElement], /* props */ Blackout) => Unit): Self = StObject.set(x, "onAfterScreenshot", js.Any.fromFunction2(value))
    
    inline def setOnAfterScreenshotUndefined: Self = StObject.set(x, "onAfterScreenshot", js.undefined)
    
    inline def setOnBeforeScreenshot(value: /* $el */ JQuery[HTMLElement] => Unit): Self = StObject.set(x, "onBeforeScreenshot", js.Any.fromFunction1(value))
    
    inline def setOnBeforeScreenshotUndefined: Self = StObject.set(x, "onBeforeScreenshot", js.undefined)
    
    inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
    
    inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value*))
    
    inline def setScale(value: Boolean): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
