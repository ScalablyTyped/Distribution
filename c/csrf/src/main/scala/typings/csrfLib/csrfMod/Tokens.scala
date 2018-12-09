package typings
package csrfLib.csrfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tokens extends js.Object {
  /**
       * Create a new CSRF token.
       *
       * @param secret The secret for the token.
       */
  def create(secret: java.lang.String): java.lang.String = js.native
  /** Create a new secret key. */
  def secret(): js.Promise[java.lang.String] = js.native
  /** Create a new secret key. */
  def secret(callback: csrfLib.SecretCallback): js.Promise[java.lang.String] = js.native
  /**
       * Create a new secret key synchronously.
       */
  def secretSync(): java.lang.String = js.native
  /**
       * Verify if a given token is valid for a given secret.
       *
       */
  def verify(secret: java.lang.String, token: java.lang.String): scala.Boolean = js.native
}

