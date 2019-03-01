package typings
package checksumLib.checksumMod.checksumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options object for all functions
  */
trait ChecksumOptions extends js.Object {
  /**
    * Algorithm to use, default 'sha1'
    * Can be 'sha1' or 'md5'  (see module 'crypto').
    */
  var algorithm: js.UndefOr[java.lang.String] = js.undefined
}

object ChecksumOptions {
  @scala.inline
  def apply(algorithm: java.lang.String = null): ChecksumOptions = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm)
    __obj.asInstanceOf[ChecksumOptions]
  }
}

