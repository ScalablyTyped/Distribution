package typings.chrome.chromeNs.inputNs.imeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CandidateUsage extends js.Object {
  /** The body string of detail description. */
  var body: String
  /** The title string of details description. */
  var title: String
}

object CandidateUsage {
  @scala.inline
  def apply(body: String, title: String): CandidateUsage = {
    val __obj = js.Dynamic.literal(body = body, title = title)
  
    __obj.asInstanceOf[CandidateUsage]
  }
}

