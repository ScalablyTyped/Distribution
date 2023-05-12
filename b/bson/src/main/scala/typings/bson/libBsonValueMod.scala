package typings.bson

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBsonValueMod {
  
  /* note: abstract class */ @JSImport("bson/lib/bson_value", "BSONValue")
  @js.native
  open class BSONValue () extends StObject {
    
    /** @public */
    def _bsontype: String = js.native
    
    /** @public */
    def inspect(): String = js.native
    
    /** @internal */
    def toExtendedJSON(): Any = js.native
  }
}
