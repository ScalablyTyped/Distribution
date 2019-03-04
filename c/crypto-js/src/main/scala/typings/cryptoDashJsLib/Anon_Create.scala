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
    create: js.Function1[js.Any, cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.LibWordArray],
    random: js.Function1[scala.Double, java.lang.String]
  ): Anon_Create = {
    val __obj = js.Dynamic.literal(create = create, random = random)
  
    __obj.asInstanceOf[Anon_Create]
  }
}

