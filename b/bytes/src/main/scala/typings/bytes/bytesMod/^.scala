package typings.bytes.bytesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bytes", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Parse string to an integer in bytes.
    */
  def apply(value: String): Double = js.native
  /**
    * Convert the given value in bytes into a string.
    */
  def apply(value: Double): String = js.native
  def apply(value: Double, options: BytesOptions): String = js.native
  /**
    * Format the given value in bytes into a string.
    *
    * If the value is negative, it is kept as such.
    * If it is a float, it is rounded.
    */
  def format(value: Double): String = js.native
  def format(value: Double, options: BytesOptions): String = js.native
  /**
    * Parse the string value into an integer in bytes.
    *
    * If no unit is given, it is assumed the value is in bytes.
    */
  def parse(value: String): Double = js.native
  def parse(value: Double): Double = js.native
}

