package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Href extends StObject {
  
  var href: String = js.native
  
  var hreflang: String = js.native
  
  var length: String = js.native
  
  var rel: String = js.native
  
  var title: String = js.native
  
  var `type`: String = js.native
}
object Href {
  
  @scala.inline
  def apply(href: String, hreflang: String, length: String, rel: String, title: String, `type`: String): Href = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], hreflang = hreflang.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], rel = rel.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Href]
  }
  
  @scala.inline
  implicit class HrefMutableBuilder[Self <: Href] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHreflang(value: String): Self = StObject.set(x, "hreflang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: String): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
