package typings.bson

import typings.bson.bsonInts.`1`
import typings.bson.libBsonValueMod.BSONValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMinKeyMod {
  
  @JSImport("bson/lib/min_key", "MinKey")
  @js.native
  open class MinKey () extends BSONValue
  /* static members */
  object MinKey {
    
    @JSImport("bson/lib/min_key", "MinKey")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromExtendedJSON(): MinKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")().asInstanceOf[MinKey]
  }
  
  trait MinKeyExtended extends StObject {
    
    @JSName("$minKey")
    var $minKey: `1`
  }
  object MinKeyExtended {
    
    inline def apply(): MinKeyExtended = {
      val __obj = js.Dynamic.literal($minKey = 1)
      __obj.asInstanceOf[MinKeyExtended]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MinKeyExtended] (val x: Self) extends AnyVal {
      
      inline def set$minKey(value: `1`): Self = StObject.set(x, "$minKey", value.asInstanceOf[js.Any])
    }
  }
}
