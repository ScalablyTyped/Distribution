package typings.credential.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait defaultOptions extends js.Object {
  var hashMethod: String
  var keyLength: Double
  var work: Double
}

object defaultOptions {
  @scala.inline
  def apply(hashMethod: String, keyLength: Double, work: Double): defaultOptions = {
    val __obj = js.Dynamic.literal(hashMethod = hashMethod.asInstanceOf[js.Any], keyLength = keyLength.asInstanceOf[js.Any], work = work.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[defaultOptions]
  }
}

