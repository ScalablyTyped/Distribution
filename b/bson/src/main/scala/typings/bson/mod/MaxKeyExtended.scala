package typings.bson.mod

import typings.bson.bsonInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxKeyExtended extends StObject {
  
  @JSName("$maxKey")
  var $maxKey: `1`
}
object MaxKeyExtended {
  
  inline def apply(): MaxKeyExtended = {
    val __obj = js.Dynamic.literal($maxKey = 1)
    __obj.asInstanceOf[MaxKeyExtended]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaxKeyExtended] (val x: Self) extends AnyVal {
    
    inline def set$maxKey(value: `1`): Self = StObject.set(x, "$maxKey", value.asInstanceOf[js.Any])
  }
}
