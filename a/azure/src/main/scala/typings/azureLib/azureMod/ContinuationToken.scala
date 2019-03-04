package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContinuationToken extends js.Object {
  var nextMarker: java.lang.String
  var targetLocation: java.lang.String
}

object ContinuationToken {
  @scala.inline
  def apply(nextMarker: java.lang.String, targetLocation: java.lang.String): ContinuationToken = {
    val __obj = js.Dynamic.literal(nextMarker = nextMarker, targetLocation = targetLocation)
  
    __obj.asInstanceOf[ContinuationToken]
  }
}

