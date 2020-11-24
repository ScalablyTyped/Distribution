package typings.byteRange.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("byte-range", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Calculates integer ranges for a given number of bytes.
    *
    * @param bytes Number of bytes to return the integer range for. Must be a positive integer.
    */
  def apply(bytes: Double): ByteRange = js.native
  def apply(bytes: Double, options: Options): ByteRange = js.native
}
