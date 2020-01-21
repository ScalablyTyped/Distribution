package typings.checksum.mod

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
  var algorithm: js.UndefOr[String] = js.undefined
}

object ChecksumOptions {
  @scala.inline
  def apply(algorithm: String = null): ChecksumOptions = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksumOptions]
  }
}

