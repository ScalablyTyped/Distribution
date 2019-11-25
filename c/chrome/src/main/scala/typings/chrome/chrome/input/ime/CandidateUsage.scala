package typings.chrome.chrome.input.ime

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
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CandidateUsage]
  }
}

