package typings.bson.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bson", "Decimal128")
@js.native
open class Decimal128 protected () extends BSONValue {
  def this(bytes: String) = this()
  /**
    * @param bytes - a buffer containing the raw Decimal128 bytes in little endian order,
    *                or a string representation as returned by .toString()
    */
  def this(bytes: js.typedarray.Uint8Array) = this()
  
  val bytes: js.typedarray.Uint8Array = js.native
  
  def toJSON(): Decimal128Extended = js.native
}
/* static members */
object Decimal128 {
  
  @JSImport("bson", "Decimal128")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a Decimal128 instance from a string representation
    *
    * @param representation - a numeric string representation.
    */
  inline def fromString(representation: String): Decimal128 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(representation.asInstanceOf[js.Any]).asInstanceOf[Decimal128]
}
