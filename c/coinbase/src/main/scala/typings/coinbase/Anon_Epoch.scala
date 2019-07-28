package typings.coinbase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Epoch extends js.Object {
  var epoch: Double
  var iso: String
}

object Anon_Epoch {
  @scala.inline
  def apply(epoch: Double, iso: String): Anon_Epoch = {
    val __obj = js.Dynamic.literal(epoch = epoch, iso = iso)
  
    __obj.asInstanceOf[Anon_Epoch]
  }
}

