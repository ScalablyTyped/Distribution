package typings.c3.mod

import typings.c3.anon.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineOptions extends StObject {
  
  /**
    * Set if null data point will be connected or not.
    * If `true` set, the region of null data will be connected without any data point.
    * If `false` set, the region of null data will not be connected and get empty.
    */
  var connectNull: js.UndefOr[Boolean] = js.undefined
  
  var step: js.UndefOr[`3`] = js.undefined
}
object LineOptions {
  
  @scala.inline
  def apply(): LineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineOptions]
  }
  
  @scala.inline
  implicit class LineOptionsMutableBuilder[Self <: LineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectNull(value: Boolean): Self = StObject.set(x, "connectNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectNullUndefined: Self = StObject.set(x, "connectNull", js.undefined)
    
    @scala.inline
    def setStep(value: `3`): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
