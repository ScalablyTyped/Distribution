package typings.bson.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bson/lib", "BSONError")
@js.native
open class BSONError protected ()
  extends typings.bson.libBsonMod.BSONError {
  def this(message: String) = this()
}
/* static members */
object BSONError {
  
  @JSImport("bson/lib", "BSONError")
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
