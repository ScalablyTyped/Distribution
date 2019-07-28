package typings.azure.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContinuationToken extends js.Object {
  var nextMarker: String
  var targetLocation: String
}

object ContinuationToken {
  @scala.inline
  def apply(nextMarker: String, targetLocation: String): ContinuationToken = {
    val __obj = js.Dynamic.literal(nextMarker = nextMarker, targetLocation = targetLocation)
  
    __obj.asInstanceOf[ContinuationToken]
  }
}

