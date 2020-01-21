package typings.cryptoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hasher extends Base {
  def update(messageUpdate: String): Hasher = js.native
  def update(messageUpdate: WordArray): Hasher = js.native
}

