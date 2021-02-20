package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverviewMapControlOptions extends StObject {
  
  var anchor: js.UndefOr[ControlAnchor] = js.native
  
  var isOpen: js.UndefOr[Boolean] = js.native
  
  var offset: js.UndefOr[Size] = js.native
  
  var size: js.UndefOr[Size] = js.native
}
object OverviewMapControlOptions {
  
  @scala.inline
  def apply(): OverviewMapControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverviewMapControlOptions]
  }
  
  @scala.inline
  implicit class OverviewMapControlOptionsMutableBuilder[Self <: OverviewMapControlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: ControlAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
    
    @scala.inline
    def setOffset(value: Size): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
