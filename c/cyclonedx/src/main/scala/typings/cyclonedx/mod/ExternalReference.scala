package typings.cyclonedx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalReference extends StObject {
  
  var comment: js.UndefOr[String] = js.undefined
  
  var hashes: js.UndefOr[js.Array[Hash]] = js.undefined
  
  var `type`: ExternalReferenceType
  
  var url: URL
}
object ExternalReference {
  
  inline def apply(`type`: ExternalReferenceType, url: URL): ExternalReference = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExternalReference] (val x: Self) extends AnyVal {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setHashes(value: js.Array[Hash]): Self = StObject.set(x, "hashes", value.asInstanceOf[js.Any])
    
    inline def setHashesUndefined: Self = StObject.set(x, "hashes", js.undefined)
    
    inline def setHashesVarargs(value: Hash*): Self = StObject.set(x, "hashes", js.Array(value*))
    
    inline def setType(value: ExternalReferenceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
