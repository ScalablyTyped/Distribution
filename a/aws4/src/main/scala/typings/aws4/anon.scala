package typings.aws4

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Path extends StObject {
    
    var path: String
    
    var query: Record[String, String | js.Array[String]]
  }
  object Path {
    
    inline def apply(path: String, query: Record[String, String | js.Array[String]]): Path = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    extension [Self <: Path](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: Record[String, String | js.Array[String]]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
}
