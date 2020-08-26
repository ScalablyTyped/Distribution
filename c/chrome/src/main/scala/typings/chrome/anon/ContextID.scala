package typings.chrome.anon

import typings.chrome.chrome.input.ime.AssistiveWindowProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextID extends js.Object {
  var contextID: Double = js.native
  var properties: AssistiveWindowProperties = js.native
}

object ContextID {
  @scala.inline
  def apply(contextID: Double, properties: AssistiveWindowProperties): ContextID = {
    val __obj = js.Dynamic.literal(contextID = contextID.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextID]
  }
  @scala.inline
  implicit class ContextIDOps[Self <: ContextID] (val x: Self) extends AnyVal {
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
    def setContextID(value: Double): Self = this.set("contextID", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: AssistiveWindowProperties): Self = this.set("properties", value.asInstanceOf[js.Any])
  }
  
}

