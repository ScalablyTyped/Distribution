package typings
package credentialLib.credentialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hashObject extends js.Object {
  var hash: java.lang.String
  var hashMethod: java.lang.String
  var iterations: scala.Double
  var keyLength: scala.Double
  var salt: java.lang.String
}

object hashObject {
  @scala.inline
  def apply(
    hash: java.lang.String,
    hashMethod: java.lang.String,
    iterations: scala.Double,
    keyLength: scala.Double,
    salt: java.lang.String
  ): hashObject = {
    val __obj = js.Dynamic.literal(hash = hash, hashMethod = hashMethod, iterations = iterations, keyLength = keyLength, salt = salt)
  
    __obj.asInstanceOf[hashObject]
  }
}

