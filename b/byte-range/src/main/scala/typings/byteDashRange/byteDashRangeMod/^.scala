package typings.byteDashRange.byteDashRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("byte-range", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Precomputed byte range for an signed 16 bit integer.
    */
  val int16: ByteRange = js.native
  /**
    * Precomputed byte range for an signed 32 bit integer.
    */
  val int32: ByteRange = js.native
  /**
    * Precomputed byte range for an signed 8 bit integer.
    */
  val int8: ByteRange = js.native
  /**
    * Precomputed byte range for an unsigned 16 bit integer.
    */
  val uint16: ByteRange = js.native
  /**
    * Precomputed byte range for an unsigned 32 bit integer.
    */
  val uint32: ByteRange = js.native
  /**
    * Precomputed byte range for an unsigned 8 bit integer.
    */
  val uint8: ByteRange = js.native
  /**
    * Calculates integer ranges for a given number of bytes.
    *
    * @param bytes Number of bytes to return the integer range for. Must be a positive integer.
    */
  def apply(bytes: Double): ByteRange = js.native
  def apply(bytes: Double, options: Options): ByteRange = js.native
}

