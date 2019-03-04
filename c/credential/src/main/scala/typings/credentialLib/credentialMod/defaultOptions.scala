package typings
package credentialLib.credentialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait defaultOptions extends js.Object {
  var hashMethod: java.lang.String
  var keyLength: scala.Double
  var work: scala.Double
}

object defaultOptions {
  @scala.inline
  def apply(hashMethod: java.lang.String, keyLength: scala.Double, work: scala.Double): defaultOptions = {
    val __obj = js.Dynamic.literal(hashMethod = hashMethod, keyLength = keyLength, work = work)
  
    __obj.asInstanceOf[defaultOptions]
  }
}

