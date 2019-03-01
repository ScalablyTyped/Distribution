package typings
package chromeLib.chromeNs.inputNs.imeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CandidateUsage extends js.Object {
  /** The body string of detail description. */
  var body: java.lang.String
  /** The title string of details description. */
  var title: java.lang.String
}

object CandidateUsage {
  @scala.inline
  def apply(body: java.lang.String, title: java.lang.String): CandidateUsage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[CandidateUsage]
  }
}

