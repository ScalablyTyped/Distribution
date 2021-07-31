package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyrightControlOptions extends StObject {
  
  var anchor: js.UndefOr[ControlAnchor] = js.undefined
  
  var offset: js.UndefOr[Size] = js.undefined
}
object CopyrightControlOptions {
  
  @scala.inline
  def apply(): CopyrightControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyrightControlOptions]
  }
  
  @scala.inline
  implicit class CopyrightControlOptionsMutableBuilder[Self <: CopyrightControlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: ControlAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    @scala.inline
    def setOffset(value: Size): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
