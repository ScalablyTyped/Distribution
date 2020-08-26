package typings.chrome.chrome.input.ime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CandidateWindowParameter extends js.Object {
  /** ID of the engine to set properties on. */
  var engineID: String = js.native
  var properties: CandidateWindowParameterProperties = js.native
}

object CandidateWindowParameter {
  @scala.inline
  def apply(engineID: String, properties: CandidateWindowParameterProperties): CandidateWindowParameter = {
    val __obj = js.Dynamic.literal(engineID = engineID.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[CandidateWindowParameter]
  }
  @scala.inline
  implicit class CandidateWindowParameterOps[Self <: CandidateWindowParameter] (val x: Self) extends AnyVal {
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
    def setEngineID(value: String): Self = this.set("engineID", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: CandidateWindowParameterProperties): Self = this.set("properties", value.asInstanceOf[js.Any])
  }
  
}

