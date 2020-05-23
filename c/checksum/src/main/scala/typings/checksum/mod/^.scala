package typings.checksum.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("checksum", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Generates a checksum for the given value
    * @param value    Any value
    * @param options    Allows to set the algorithm
    * @returns    Checksum
    */
  def apply(value: js.Any): String = js.native
  def apply(value: js.Any, options: ChecksumOptions): String = js.native
}

