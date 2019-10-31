package typings.bitcoinjsDashLib.typesNetworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bip32 extends js.Object {
  var `private`: Double
  var public: Double
}

object Bip32 {
  @scala.inline
  def apply(`private`: Double, public: Double): Bip32 = {
    val __obj = js.Dynamic.literal(public = public)
    __obj.updateDynamic("private")(`private`)
    __obj.asInstanceOf[Bip32]
  }
}

