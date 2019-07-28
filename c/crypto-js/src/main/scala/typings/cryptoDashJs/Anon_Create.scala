package typings.cryptoDashJs

import typings.cryptoDashJs.cryptoDashJsMod.LibWordArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Create extends js.Object {
  def create(v: js.Any): LibWordArray
  def random(v: Double): String
}

object Anon_Create {
  @scala.inline
  def apply(create: js.Any => LibWordArray, random: Double => String): Anon_Create = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), random = js.Any.fromFunction1(random))
  
    __obj.asInstanceOf[Anon_Create]
  }
}

