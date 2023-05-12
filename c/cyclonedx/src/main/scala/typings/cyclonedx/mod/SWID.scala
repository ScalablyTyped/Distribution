package typings.cyclonedx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SWID extends StObject {
  
  var name: String
  
  var patch: js.UndefOr[Boolean] = js.undefined
  
  var tagId: String
  
  var tagVersion: js.UndefOr[Integer] = js.undefined
  
  var text: js.UndefOr[MimeText] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object SWID {
  
  inline def apply(name: String, tagId: String): SWID = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], tagId = tagId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SWID]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SWID] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Boolean): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    
    inline def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
    
    inline def setTagId(value: String): Self = StObject.set(x, "tagId", value.asInstanceOf[js.Any])
    
    inline def setTagVersion(value: Integer): Self = StObject.set(x, "tagVersion", value.asInstanceOf[js.Any])
    
    inline def setTagVersionUndefined: Self = StObject.set(x, "tagVersion", js.undefined)
    
    inline def setText(value: MimeText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
