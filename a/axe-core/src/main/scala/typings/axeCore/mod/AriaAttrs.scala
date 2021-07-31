package typings.axeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AriaAttrs extends StObject {
  
  var allowEmpty: js.UndefOr[Boolean] = js.undefined
  
  var global: js.UndefOr[Boolean] = js.undefined
  
  var `type`: AriaAttrsType
  
  var unsupported: js.UndefOr[Boolean] = js.undefined
  
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object AriaAttrs {
  
  @scala.inline
  def apply(`type`: AriaAttrsType): AriaAttrs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AriaAttrs]
  }
  
  @scala.inline
  implicit class AriaAttrsMutableBuilder[Self <: AriaAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
    
    @scala.inline
    def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    
    @scala.inline
    def setType(value: AriaAttrsType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsupported(value: Boolean): Self = StObject.set(x, "unsupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsupportedUndefined: Self = StObject.set(x, "unsupported", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
