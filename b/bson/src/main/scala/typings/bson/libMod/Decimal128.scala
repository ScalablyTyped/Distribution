package typings.bson.libMod

import typings.bson.libDecimal128Mod.Decimal128Extended
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bson/lib", "Decimal128")
@js.native
open class Decimal128 protected ()
  extends typings.bson.libBsonMod.Decimal128 {
  def this(bytes: String) = this()
  /**
    * @param bytes - a buffer containing the raw Decimal128 bytes in little endian order,
    *                or a string representation as returned by .toString()
    */
  def this(bytes: js.typedarray.Uint8Array) = this()
}
/* static members */
object Decimal128 {
  
  @JSImport("bson/lib", "Decimal128")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  inline def fromExtendedJSON(doc: Decimal128Extended): typings.bson.libDecimal128Mod.Decimal128 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libDecimal128Mod.Decimal128]
  
  /**
    * Create a Decimal128 instance from a string representation
    *
    * @param representation - a numeric string representation.
    */
  inline def fromString(representation: String): typings.bson.libDecimal128Mod.Decimal128 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(representation.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libDecimal128Mod.Decimal128]
}
