package typings.bson.mod

import typings.buffer.mod.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bson", "Binary")
@js.native
/**
  * Create a new Binary instance.
  *
  * This constructor can accept a string as its first argument. In this case,
  * this string will be encoded using ISO-8859-1, **not** using UTF-8.
  * This is almost certainly not what you want. Use `new Binary(Buffer.from(string))`
  * instead to convert the string to a Buffer using UTF-8 first.
  *
  * @param buffer - a buffer object containing the binary data.
  * @param subType - the option binary type.
  */
open class Binary () extends StObject {
  def this(buffer: String) = this()
  def this(buffer: BinarySequence) = this()
  def this(buffer: String, subType: scala.Double) = this()
  def this(buffer: Unit, subType: scala.Double) = this()
  def this(buffer: BinarySequence, subType: scala.Double) = this()
  
  var _bsontype: typings.bson.bsonStrings.Binary = js.native
  
  var buffer: Buffer = js.native
  
  /* Excluded from this release type: fromExtendedJSON */
  def inspect(): String = js.native
  
  /** the length of the binary sequence */
  def length(): scala.Double = js.native
  
  var position: scala.Double = js.native
  
  /**
    * Updates this binary with byte_value.
    *
    * @param byteValue - a single byte we wish to write.
    */
  def put(byteValue: String): Unit = js.native
  def put(byteValue: js.Array[scala.Double]): Unit = js.native
  def put(byteValue: js.typedarray.Uint8Array): Unit = js.native
  def put(byteValue: scala.Double): Unit = js.native
  def put(byteValue: Buffer): Unit = js.native
  
  /**
    * Reads **length** bytes starting at **position**.
    *
    * @param position - read from the given position in the Binary.
    * @param length - the number of bytes to read.
    */
  def read(position: scala.Double, length: scala.Double): BinarySequence = js.native
  
  var sub_type: scala.Double = js.native
  
  def toJSON(): String = js.native
  
  def toString(format: String): String = js.native
  
  /* Excluded from this release type: toExtendedJSON */
  def toUUID(): UUID = js.native
  
  /**
    * Returns the value of this binary as a string.
    * @param asRaw - Will skip converting to a string
    * @remarks
    * This is handy when calling this function conditionally for some key value pairs and not others
    */
  def value(): String | BinarySequence = js.native
  def value(asRaw: Boolean): String | BinarySequence = js.native
  
  /**
    * Writes a buffer or string to the binary.
    *
    * @param sequence - a string or buffer to be written to the Binary BSON object.
    * @param offset - specify the binary of where to write the content.
    */
  def write(sequence: String, offset: scala.Double): Unit = js.native
  def write(sequence: BinarySequence, offset: scala.Double): Unit = js.native
}
/* static members */
object Binary {
  
  /* Excluded from this release type: BSON_BINARY_SUBTYPE_DEFAULT */
  /** Initial buffer default size */
  @JSImport("bson", "Binary.BUFFER_SIZE")
  @js.native
  val BUFFER_SIZE: /* 256 */ scala.Double = js.native
  
  /** Byte Array BSON type */
  @JSImport("bson", "Binary.SUBTYPE_BYTE_ARRAY")
  @js.native
  val SUBTYPE_BYTE_ARRAY: /* 2 */ scala.Double = js.native
  
  /** Column BSON type */
  @JSImport("bson", "Binary.SUBTYPE_COLUMN")
  @js.native
  val SUBTYPE_COLUMN: /* 7 */ scala.Double = js.native
  
  /** Default BSON type */
  @JSImport("bson", "Binary.SUBTYPE_DEFAULT")
  @js.native
  val SUBTYPE_DEFAULT: /* 0 */ scala.Double = js.native
  
  /** Encrypted BSON type */
  @JSImport("bson", "Binary.SUBTYPE_ENCRYPTED")
  @js.native
  val SUBTYPE_ENCRYPTED: /* 6 */ scala.Double = js.native
  
  /** Function BSON type */
  @JSImport("bson", "Binary.SUBTYPE_FUNCTION")
  @js.native
  val SUBTYPE_FUNCTION: /* 1 */ scala.Double = js.native
  
  /** MD5 BSON type */
  @JSImport("bson", "Binary.SUBTYPE_MD5")
  @js.native
  val SUBTYPE_MD5: /* 5 */ scala.Double = js.native
  
  /** User BSON type */
  @JSImport("bson", "Binary.SUBTYPE_USER_DEFINED")
  @js.native
  val SUBTYPE_USER_DEFINED: /* 128 */ scala.Double = js.native
  
  /** UUID BSON type */
  @JSImport("bson", "Binary.SUBTYPE_UUID")
  @js.native
  val SUBTYPE_UUID: /* 4 */ scala.Double = js.native
  
  /** Deprecated UUID BSON type @deprecated Please use SUBTYPE_UUID */
  @JSImport("bson", "Binary.SUBTYPE_UUID_OLD")
  @js.native
  val SUBTYPE_UUID_OLD: /* 3 */ scala.Double = js.native
}
