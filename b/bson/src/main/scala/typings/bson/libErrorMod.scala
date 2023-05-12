package typings.bson

import typings.bson.bsonBooleans.`true`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libErrorMod {
  
  @JSImport("bson/lib/error", "BSONError")
  @js.native
  open class BSONError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /**
      * @internal
      * The underlying algorithm for isBSONError may change to improve how strict it is
      * about determining if an input is a BSONError. But it must remain backwards compatible
      * with previous minors & patches of the current major version.
      */
    /* protected */ def bsonError: `true` = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    @JSName("name")
    def name_MBSONError: String = js.native
  }
  /* static members */
  object BSONError {
    
    @JSImport("bson/lib/error", "BSONError")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @public
      *
      * All errors thrown from the BSON library inherit from `BSONError`.
      * This method can assist with determining if an error originates from the BSON library
      * even if it does not pass an `instanceof` check against this class' constructor.
      *
      * @param value - any javascript value that needs type checking
      */
    inline def isBSONError(value: Any): /* is bson.bson/lib/error.BSONError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBSONError")(value.asInstanceOf[js.Any]).asInstanceOf[/* is bson.bson/lib/error.BSONError */ Boolean]
  }
  
  @JSImport("bson/lib/error", "BSONRuntimeError")
  @js.native
  open class BSONRuntimeError protected () extends BSONError {
    def this(message: String) = this()
    
    @JSName("name")
    def name_MBSONRuntimeError: typings.bson.bsonStrings.BSONRuntimeError = js.native
  }
  
  @JSImport("bson/lib/error", "BSONVersionError")
  @js.native
  open class BSONVersionError () extends BSONError {
    
    @JSName("name")
    def name_MBSONVersionError: typings.bson.bsonStrings.BSONVersionError = js.native
  }
}
