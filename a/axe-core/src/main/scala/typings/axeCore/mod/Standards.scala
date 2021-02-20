package typings.axeCore.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Standards extends StObject {
  
  var ariaAttrs: js.UndefOr[StringDictionary[AriaAttrs]] = js.native
  
  var ariaRoles: js.UndefOr[StringDictionary[AriaRoles]] = js.native
  
  var cssColors: js.UndefOr[StringDictionary[js.Array[Double]]] = js.native
  
  var htmlElms: js.UndefOr[StringDictionary[HtmlElms]] = js.native
}
object Standards {
  
  @scala.inline
  def apply(): Standards = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Standards]
  }
  
  @scala.inline
  implicit class StandardsMutableBuilder[Self <: Standards] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAriaAttrs(value: StringDictionary[AriaAttrs]): Self = StObject.set(x, "ariaAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaAttrsUndefined: Self = StObject.set(x, "ariaAttrs", js.undefined)
    
    @scala.inline
    def setAriaRoles(value: StringDictionary[AriaRoles]): Self = StObject.set(x, "ariaRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaRolesUndefined: Self = StObject.set(x, "ariaRoles", js.undefined)
    
    @scala.inline
    def setCssColors(value: StringDictionary[js.Array[Double]]): Self = StObject.set(x, "cssColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssColorsUndefined: Self = StObject.set(x, "cssColors", js.undefined)
    
    @scala.inline
    def setHtmlElms(value: StringDictionary[HtmlElms]): Self = StObject.set(x, "htmlElms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlElmsUndefined: Self = StObject.set(x, "htmlElms", js.undefined)
  }
}
