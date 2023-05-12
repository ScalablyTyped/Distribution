package typings.bson

import typings.bson.bsonInts.`1`
import typings.bson.libBsonValueMod.BSONValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMaxKeyMod {
  
  @JSImport("bson/lib/max_key", "MaxKey")
  @js.native
  open class MaxKey () extends BSONValue
  /* static members */
  object MaxKey {
    
    @JSImport("bson/lib/max_key", "MaxKey")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromExtendedJSON(): MaxKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")().asInstanceOf[MaxKey]
  }
  
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
}
