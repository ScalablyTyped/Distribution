package typings
package coinbaseDashCommerceDashNodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Confirmationsaccumulated extends js.Object {
  var confirmations_accumulated: scala.Double
  var confirmations_required: scala.Double
  var hash: java.lang.String
  var height: scala.Double
}

object Anon_Confirmationsaccumulated {
  @scala.inline
  def apply(
    confirmations_accumulated: scala.Double,
    confirmations_required: scala.Double,
    hash: java.lang.String,
    height: scala.Double
  ): Anon_Confirmationsaccumulated = {
    val __obj = js.Dynamic.literal(confirmations_accumulated = confirmations_accumulated, confirmations_required = confirmations_required, hash = hash, height = height)
  
    __obj.asInstanceOf[Anon_Confirmationsaccumulated]
  }
}

