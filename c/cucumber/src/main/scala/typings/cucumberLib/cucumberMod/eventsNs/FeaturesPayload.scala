package typings
package cucumberLib.cucumberMod.eventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeaturesPayload extends EventPayload {
  def getFeatures(): js.Array[_]
}

object FeaturesPayload {
  @scala.inline
  def apply(getFeatures: js.Function0[js.Array[_]]): FeaturesPayload = {
    val __obj = js.Dynamic.literal(getFeatures = getFeatures)
  
    __obj.asInstanceOf[FeaturesPayload]
  }
}

