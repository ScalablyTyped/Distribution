package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HyperlinkComponentProperties
  extends StObject
     with ComponentProperties
     with TitledComponentProperties {
  
  var label: String
  
  var url: String
}
object HyperlinkComponentProperties {
  
  inline def apply(label: String, url: String): HyperlinkComponentProperties = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperlinkComponentProperties]
  }
  
  extension [Self <: HyperlinkComponentProperties](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
