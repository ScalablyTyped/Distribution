package typings
package chromeLib.chromeNs.inputNs.imeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CandidateWindowParameter extends js.Object {
  /** ID of the engine to set properties on. */
  var engineID: java.lang.String
  var properties: CandidateWindowParameterProperties
}

object CandidateWindowParameter {
  @scala.inline
  def apply(engineID: java.lang.String, properties: CandidateWindowParameterProperties): CandidateWindowParameter = {
    val __obj = js.Dynamic.literal(engineID = engineID, properties = properties)
  
    __obj.asInstanceOf[CandidateWindowParameter]
  }
}

