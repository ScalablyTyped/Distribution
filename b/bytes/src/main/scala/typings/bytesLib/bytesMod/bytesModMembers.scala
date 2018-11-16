package typings
package bytesLib.bytesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bytes", JSImport.Namespace)
@js.native
object bytesModMembers extends js.Object {
  /**
   * Parse string to an integer in bytes.
   */
  def apply(value: java.lang.String): scala.Double = js.native
  /**
   * Convert the given value in bytes into a string.
   */
  def apply(value: scala.Double): java.lang.String = js.native
  /**
   * Convert the given value in bytes into a string.
   */
  def apply(value: scala.Double, options: BytesOptions): java.lang.String = js.native
  /**
       * Format the given value in bytes into a string.
       *
       * If the value is negative, it is kept as such.
       * If it is a float, it is rounded.
       */
  def format(value: scala.Double): java.lang.String = js.native
  /**
       * Format the given value in bytes into a string.
       *
       * If the value is negative, it is kept as such.
       * If it is a float, it is rounded.
       */
  def format(value: scala.Double, options: BytesOptions): java.lang.String = js.native
  /**
       * Parse the string value into an integer in bytes.
       *
       * If no unit is given, it is assumed the value is in bytes.
       */
  def parse(value: java.lang.String): scala.Double = js.native
  /**
       * Parse the string value into an integer in bytes.
       *
       * If no unit is given, it is assumed the value is in bytes.
       */
  def parse(value: scala.Double): scala.Double = js.native
}

