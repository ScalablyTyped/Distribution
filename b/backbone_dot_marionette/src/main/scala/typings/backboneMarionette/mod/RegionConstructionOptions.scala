package typings.backboneMarionette.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionConstructionOptions extends StObject {
  
  /**
    * Prevents error on missing element. (undocumented)
    */
  var allowMissingEl: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies the element for the region to manage. This may be
    * a selector string, a raw DOM node reference or a jQuery wrapped
    * DOM node.
    */
  var el: js.UndefOr[js.Any] = js.native
  
  /**
    * Element to use as context when finding el via jQuery. Defaults to the
    * the document. (undocumented)
    */
  var parentEl: js.UndefOr[String] = js.native
  
  /**
    * Overwrite the parent el of the region with the rendered contents of
    * the inner View.
    */
  var replaceElement: js.UndefOr[String] = js.native
}
object RegionConstructionOptions {
  
  @scala.inline
  def apply(): RegionConstructionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionConstructionOptions]
  }
  
  @scala.inline
  implicit class RegionConstructionOptionsMutableBuilder[Self <: RegionConstructionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowMissingEl(value: Boolean): Self = StObject.set(x, "allowMissingEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowMissingElUndefined: Self = StObject.set(x, "allowMissingEl", js.undefined)
    
    @scala.inline
    def setEl(value: js.Any): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElUndefined: Self = StObject.set(x, "el", js.undefined)
    
    @scala.inline
    def setParentEl(value: String): Self = StObject.set(x, "parentEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentElUndefined: Self = StObject.set(x, "parentEl", js.undefined)
    
    @scala.inline
    def setReplaceElement(value: String): Self = StObject.set(x, "replaceElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceElementUndefined: Self = StObject.set(x, "replaceElement", js.undefined)
  }
}
