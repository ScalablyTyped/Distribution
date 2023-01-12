package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyntaxParseParams extends StObject {
  
  var ownerUri: String
  
  var query: String
}
object SyntaxParseParams {
  
  inline def apply(ownerUri: String, query: String): SyntaxParseParams = {
    val __obj = js.Dynamic.literal(ownerUri = ownerUri.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntaxParseParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SyntaxParseParams] (val x: Self) extends AnyVal {
    
    inline def setOwnerUri(value: String): Self = StObject.set(x, "ownerUri", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
