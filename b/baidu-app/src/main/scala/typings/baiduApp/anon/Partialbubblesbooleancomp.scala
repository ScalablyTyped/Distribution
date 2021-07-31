package typings.baiduApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  bubbles :boolean,   composed :boolean,   capturePhase :boolean}> */
trait Partialbubblesbooleancomp extends StObject {
  
  var bubbles: js.UndefOr[Boolean] = js.undefined
  
  var capturePhase: js.UndefOr[Boolean] = js.undefined
  
  var composed: js.UndefOr[Boolean] = js.undefined
}
object Partialbubblesbooleancomp {
  
  @scala.inline
  def apply(): Partialbubblesbooleancomp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialbubblesbooleancomp]
  }
  
  @scala.inline
  implicit class PartialbubblesbooleancompMutableBuilder[Self <: Partialbubblesbooleancomp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBubblesUndefined: Self = StObject.set(x, "bubbles", js.undefined)
    
    @scala.inline
    def setCapturePhase(value: Boolean): Self = StObject.set(x, "capturePhase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapturePhaseUndefined: Self = StObject.set(x, "capturePhase", js.undefined)
    
    @scala.inline
    def setComposed(value: Boolean): Self = StObject.set(x, "composed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComposedUndefined: Self = StObject.set(x, "composed", js.undefined)
  }
}
