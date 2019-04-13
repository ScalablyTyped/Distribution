package typings
package cryptoDashJsLib.cryptoDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hasher extends Base {
  def update(messageUpdate: WordArray): Hasher = js.native
  def update(messageUpdate: java.lang.String): Hasher = js.native
}

