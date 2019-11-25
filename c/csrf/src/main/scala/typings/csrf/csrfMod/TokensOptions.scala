package typings.csrf.csrfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokensOptions extends js.Object {
  /**
    * The string length of the salt (default: 8)
    */
  var saltLength: Double
  /**
    * The byte length of the secret key (default: 18)
    */
  var secretLength: Double
}

object TokensOptions {
  @scala.inline
  def apply(saltLength: Double, secretLength: Double): TokensOptions = {
    val __obj = js.Dynamic.literal(saltLength = saltLength.asInstanceOf[js.Any], secretLength = secretLength.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TokensOptions]
  }
}

