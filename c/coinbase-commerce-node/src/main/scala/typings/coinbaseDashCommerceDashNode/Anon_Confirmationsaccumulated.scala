package typings.coinbaseDashCommerceDashNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Confirmationsaccumulated extends js.Object {
  var confirmations_accumulated: Double
  var confirmations_required: Double
  var hash: String
  var height: Double
}

object Anon_Confirmationsaccumulated {
  @scala.inline
  def apply(confirmations_accumulated: Double, confirmations_required: Double, hash: String, height: Double): Anon_Confirmationsaccumulated = {
    val __obj = js.Dynamic.literal(confirmations_accumulated = confirmations_accumulated, confirmations_required = confirmations_required, hash = hash, height = height)
  
    __obj.asInstanceOf[Anon_Confirmationsaccumulated]
  }
}

