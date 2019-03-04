package typings
package chromeLib.chromeNs.inputNs.imeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CandidatesParameters extends js.Object {
  /** List of candidates to show in the candidate window */
  var candidates: js.Array[CandidateTemplate]
  /** ID of the context that owns the candidate window. */
  var contextID: scala.Double
}

object CandidatesParameters {
  @scala.inline
  def apply(candidates: js.Array[CandidateTemplate], contextID: scala.Double): CandidatesParameters = {
    val __obj = js.Dynamic.literal(candidates = candidates, contextID = contextID)
  
    __obj.asInstanceOf[CandidatesParameters]
  }
}

