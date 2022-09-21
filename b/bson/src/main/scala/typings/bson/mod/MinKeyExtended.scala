package typings.bson.mod

import typings.bson.bsonNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinKeyExtended extends StObject {
  
  @JSName("$minKey")
  var $minKey: `1`
}
object MinKeyExtended {
  
  inline def apply(): MinKeyExtended = {
    val __obj = js.Dynamic.literal($minKey = 1)
    __obj.asInstanceOf[MinKeyExtended]
  }
  
  extension [Self <: MinKeyExtended](x: Self) {
    
    inline def set$minKey(value: `1`): Self = StObject.set(x, "$minKey", value.asInstanceOf[js.Any])
  }
}
