package typings.contentstack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LivePreviewQuery extends StObject {
  
  var content_type_uid: String
  
  var live_preview: String
}
object LivePreviewQuery {
  
  inline def apply(content_type_uid: String, live_preview: String): LivePreviewQuery = {
    val __obj = js.Dynamic.literal(content_type_uid = content_type_uid.asInstanceOf[js.Any], live_preview = live_preview.asInstanceOf[js.Any])
    __obj.asInstanceOf[LivePreviewQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LivePreviewQuery] (val x: Self) extends AnyVal {
    
    inline def setContent_type_uid(value: String): Self = StObject.set(x, "content_type_uid", value.asInstanceOf[js.Any])
    
    inline def setLive_preview(value: String): Self = StObject.set(x, "live_preview", value.asInstanceOf[js.Any])
  }
}
