package typings.bson.libMod

import typings.bson.anon.I
import typings.bson.libTimestampMod.TimestampExtended
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bson/lib", "Timestamp")
@js.native
open class Timestamp protected ()
  extends typings.bson.libBsonMod.Timestamp {
  /**
    * @param int - A 64-bit bigint representing the Timestamp.
    */
  def this(int: js.BigInt) = this()
  /**
    * @param long - A 64-bit Long representing the Timestamp.
    */
  def this(long: typings.bson.libLongMod.Long) = this()
  /**
    * @param value - A pair of two values indicating timestamp and increment.
    */
  def this(value: I) = this()
}
/* static members */
object Timestamp {
  
  @JSImport("bson/lib", "Timestamp")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bson/lib", "Timestamp.MAX_VALUE")
  @js.native
  val MAX_VALUE: typings.bson.libLongMod.Long = js.native
  
  /**
    * Returns a Timestamp for the given high and low bits. Each is assumed to use 32 bits.
    *
    * @param lowBits - the low 32-bits.
    * @param highBits - the high 32-bits.
    */
  inline def fromBits(lowBits: scala.Double, highBits: scala.Double): typings.bson.libTimestampMod.Timestamp = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBits")(lowBits.asInstanceOf[js.Any], highBits.asInstanceOf[js.Any])).asInstanceOf[typings.bson.libTimestampMod.Timestamp]
  
  /** @internal */
  inline def fromExtendedJSON(doc: TimestampExtended): typings.bson.libTimestampMod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libTimestampMod.Timestamp]
  
  /** Returns a Timestamp represented by the given (32-bit) integer value. */
  inline def fromInt(value: scala.Double): typings.bson.libTimestampMod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInt")(value.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libTimestampMod.Timestamp]
  
  /** Returns a Timestamp representing the given number value, provided that it is a finite number. Otherwise, zero is returned. */
  inline def fromNumber(value: scala.Double): typings.bson.libTimestampMod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(value.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libTimestampMod.Timestamp]
  
  /**
    * Returns a Timestamp from the given string, optionally using the given radix.
    *
    * @param str - the textual representation of the Timestamp.
    * @param optRadix - the radix in which the text is written.
    */
  inline def fromString(str: String, optRadix: scala.Double): typings.bson.libTimestampMod.Timestamp = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], optRadix.asInstanceOf[js.Any])).asInstanceOf[typings.bson.libTimestampMod.Timestamp]
}
