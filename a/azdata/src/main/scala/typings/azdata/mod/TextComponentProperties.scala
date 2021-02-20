package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextComponentProperties
  extends ComponentProperties
     with TitledComponentProperties {
  
  var description: js.UndefOr[String] = js.native
  
  var links: js.UndefOr[js.Array[LinkArea]] = js.native
  
  var requiredIndicator: js.UndefOr[Boolean] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object TextComponentProperties {
  
  @scala.inline
  def apply(): TextComponentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextComponentProperties]
  }
  
  @scala.inline
  implicit class TextComponentPropertiesMutableBuilder[Self <: TextComponentProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setLinks(value: js.Array[LinkArea]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    @scala.inline
    def setLinksVarargs(value: LinkArea*): Self = StObject.set(x, "links", js.Array(value :_*))
    
    @scala.inline
    def setRequiredIndicator(value: Boolean): Self = StObject.set(x, "requiredIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredIndicatorUndefined: Self = StObject.set(x, "requiredIndicator", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
