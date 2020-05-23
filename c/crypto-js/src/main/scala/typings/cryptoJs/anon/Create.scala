package typings.cryptoJs.anon

import typings.cryptoJs.mod.LibWordArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Create extends js.Object {
  def create(v: js.Any): LibWordArray
  def random(v: Double): typings.cryptoJs.mod.WordArray
}

object Create {
  @scala.inline
  def apply(create: js.Any => LibWordArray, random: Double => typings.cryptoJs.mod.WordArray): Create = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), random = js.Any.fromFunction1(random))
    __obj.asInstanceOf[Create]
  }
}

