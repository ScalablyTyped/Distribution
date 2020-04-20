package typings.chrome.chrome.input.ime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CandidateWindowParameter extends js.Object {
  /** ID of the engine to set properties on. */
  var engineID: String
  var properties: CandidateWindowParameterProperties
}

object CandidateWindowParameter {
  @scala.inline
  def apply(engineID: String, properties: CandidateWindowParameterProperties): CandidateWindowParameter = {
    val __obj = js.Dynamic.literal(engineID = engineID.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[CandidateWindowParameter]
  }
}

