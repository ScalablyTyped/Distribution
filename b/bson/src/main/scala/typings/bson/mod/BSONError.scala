package typings.bson.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bson", "BSONError")
@js.native
open class BSONError protected ()
  extends StObject
     with Error {
  def this(message: String) = this()
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
  /* Excluded from this release type: bsonError */
  @JSName("name")
  def name_MBSONError: String = js.native
}
/* static members */
object BSONError {
  
  @JSImport("bson", "BSONError")
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
  inline def isBSONError(value: Any): /* is bson.bson.BSONError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBSONError")(value.asInstanceOf[js.Any]).asInstanceOf[/* is bson.bson.BSONError */ Boolean]
}
