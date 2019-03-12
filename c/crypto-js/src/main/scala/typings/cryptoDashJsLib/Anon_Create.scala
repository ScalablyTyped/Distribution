package typings
package cryptoDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Create extends js.Object {
  def create(v: js.Any): cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray
  def random(v: scala.Double): java.lang.String
}

object Anon_Create {
  @scala.inline
  def apply(
    create: js.Any => cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray,
    random: scala.Double => java.lang.String
  ): Anon_Create = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), random = js.Any.fromFunction1(random))
  
    __obj.asInstanceOf[Anon_Create]
  }
}

