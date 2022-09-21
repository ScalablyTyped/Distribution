package typings.bson.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBRefLike extends StObject {
  
  @JSName("$db")
  var $db: js.UndefOr[String] = js.undefined
  
  @JSName("$id")
  var $id: ObjectId
  
  @JSName("$ref")
  var $ref: String
}
object DBRefLike {
  
  inline def apply($id: ObjectId, $ref: String): DBRefLike = {
    val __obj = js.Dynamic.literal($id = $id.asInstanceOf[js.Any], $ref = $ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBRefLike]
  }
  
  extension [Self <: DBRefLike](x: Self) {
    
    inline def set$db(value: String): Self = StObject.set(x, "$db", value.asInstanceOf[js.Any])
    
    inline def set$dbUndefined: Self = StObject.set(x, "$db", js.undefined)
    
    inline def set$id(value: ObjectId): Self = StObject.set(x, "$id", value.asInstanceOf[js.Any])
    
    inline def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
  }
}
