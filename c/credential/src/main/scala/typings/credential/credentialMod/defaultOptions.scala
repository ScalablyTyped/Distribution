package typings.credential.credentialMod

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
    val __obj = js.Dynamic.literal(hashMethod = hashMethod, keyLength = keyLength, work = work)
  
    __obj.asInstanceOf[defaultOptions]
  }
}

