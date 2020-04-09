package typings.cryptoJs

import typings.cryptoJs.mod.LibWordArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCreate extends js.Object {
  def create(v: js.Any): LibWordArray
  def random(v: Double): LibWordArray
}

object AnonCreate {
  @scala.inline
  def apply(create: js.Any => LibWordArray, random: Double => LibWordArray): AnonCreate = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), random = js.Any.fromFunction1(random))
  
    __obj.asInstanceOf[AnonCreate]
  }
}

