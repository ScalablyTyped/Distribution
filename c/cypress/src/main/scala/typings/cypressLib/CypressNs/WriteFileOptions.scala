package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options to change the default behavior of .writeFile */
trait WriteFileOptions extends Loggable {
  var encoding: Encodings
  var flag: java.lang.String
}

object WriteFileOptions {
  @scala.inline
  def apply(encoding: Encodings, flag: java.lang.String, log: scala.Boolean): WriteFileOptions = {
    val __obj = js.Dynamic.literal(encoding = encoding, flag = flag, log = log)
  
    __obj.asInstanceOf[WriteFileOptions]
  }
}

