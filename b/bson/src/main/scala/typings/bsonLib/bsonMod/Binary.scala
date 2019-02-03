package typings
package bsonLib.bsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bson", "Binary")
@js.native
class Binary protected () extends js.Object {
  /**
    * @param buffer A buffer object containing the binary data
    * @param subType Binary data subtype
    */
  def this(buffer: nodeLib.Buffer) = this()
  def this(buffer: nodeLib.Buffer, subType: scala.Double) = this()
  /** The underlying Buffer which stores the binary data. */
  val buffer: nodeLib.Buffer = js.native
  /** Binary data subtype */
  val sub_type: js.UndefOr[scala.Double] = js.native
  /** The length of the binary. */
  def length(): scala.Double = js.native
  def put(byte_value: java.lang.String): scala.Unit = js.native
  /** Updates this binary with byte_value */
  def put(byte_value: scala.Double): scala.Unit = js.native
  /** Reads length bytes starting at position. */
  def read(position: scala.Double, length: scala.Double): nodeLib.Buffer = js.native
  /** Returns the value of this binary as a string. */
  def value(): java.lang.String = js.native
  def write(buffer: java.lang.String, offset: scala.Double): scala.Unit = js.native
  /** Writes a buffer or string to the binary */
  def write(buffer: nodeLib.Buffer, offset: scala.Double): scala.Unit = js.native
}

/* static members */
@JSImport("bson", "Binary")
@js.native
object Binary extends js.Object {
  val SUBTYPE_BYTE_ARRAY: scala.Double = js.native
  val SUBTYPE_DEFAULT: scala.Double = js.native
  val SUBTYPE_FUNCTION: scala.Double = js.native
  val SUBTYPE_MD5: scala.Double = js.native
  val SUBTYPE_USER_DEFINED: scala.Double = js.native
  val SUBTYPE_UUID: scala.Double = js.native
  val SUBTYPE_UUID_OLD: scala.Double = js.native
}

