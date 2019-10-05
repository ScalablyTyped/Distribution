package typings.cypress.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options to change the default behavior of .writeFile */
trait WriteFileOptions extends Loggable {
  var encoding: Encodings
  var flag: String
}

object WriteFileOptions {
  @scala.inline
  def apply(encoding: Encodings, flag: String, log: Boolean): WriteFileOptions = {
    val __obj = js.Dynamic.literal(encoding = encoding, flag = flag, log = log)
  
    __obj.asInstanceOf[WriteFileOptions]
  }
}

