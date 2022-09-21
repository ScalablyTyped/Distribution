package typings.bson.mod

import typings.buffer.mod.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bson", "Decimal128")
@js.native
open class Decimal128 protected () extends StObject {
  def this(bytes: String) = this()
  /**
    * @param bytes - a buffer containing the raw Decimal128 bytes in little endian order,
    *                or a string representation as returned by .toString()
    */
  def this(bytes: Buffer) = this()
  
  var _bsontype: typings.bson.bsonStrings.Decimal128 = js.native
  
  val bytes: Buffer = js.native
  
  /* Excluded from this release type: toExtendedJSON */
  /* Excluded from this release type: fromExtendedJSON */
  def inspect(): String = js.native
  
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
