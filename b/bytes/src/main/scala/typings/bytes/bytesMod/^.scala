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
}

