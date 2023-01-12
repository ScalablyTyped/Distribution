package typings.clearbladejsNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryOptionsWithCollection
  extends StObject
     with QueryOptions {
  
  var collection: String
}
object QueryOptionsWithCollection {
  
  inline def apply(collection: String): QueryOptionsWithCollection = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptionsWithCollection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryOptionsWithCollection] (val x: Self) extends AnyVal {
    
    inline def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
  }
}
