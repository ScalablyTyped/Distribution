package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HyperlinkComponentProperties
  extends StObject
     with TitledComponentProperties {
  
  var label: String
  
  /**
    * Whether to show the 'external link' icon next to the hyperlink
    */
  var showLinkIcon: js.UndefOr[Boolean] = js.undefined
  
  var url: String
}
object HyperlinkComponentProperties {
  
  inline def apply(label: String, url: String): HyperlinkComponentProperties = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperlinkComponentProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HyperlinkComponentProperties] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setShowLinkIcon(value: Boolean): Self = StObject.set(x, "showLinkIcon", value.asInstanceOf[js.Any])
    
    inline def setShowLinkIconUndefined: Self = StObject.set(x, "showLinkIcon", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
