package typings.cucumber.mod.events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeaturesPayload extends EventPayload {
  def getFeatures(): js.Array[_] = js.native
}

object FeaturesPayload {
  @scala.inline
  def apply(getFeatures: () => js.Array[_]): FeaturesPayload = {
    val __obj = js.Dynamic.literal(getFeatures = js.Any.fromFunction0(getFeatures))
    __obj.asInstanceOf[FeaturesPayload]
  }
  @scala.inline
  implicit class FeaturesPayloadOps[Self <: FeaturesPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetFeatures(value: () => js.Array[_]): Self = this.set("getFeatures", js.Any.fromFunction0(value))
  }
  
}

