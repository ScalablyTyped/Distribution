package typings.chromeApps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matches extends js.Object {
  /** URLs to match and handle */
  var matches: js.Array[String] = js.native
  /**
    * The title field is reserved for future use in all relevant UI elements.
    * It should describe the action that the app performs when launched with this type of URL handler.
    */
  var title: js.UndefOr[String] = js.native
}

object Matches {
  @scala.inline
  def apply(matches: js.Array[String]): Matches = {
    val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any])
    __obj.asInstanceOf[Matches]
  }
  @scala.inline
  implicit class MatchesOps[Self <: Matches] (val x: Self) extends AnyVal {
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
    def setMatchesVarargs(value: String*): Self = this.set("matches", js.Array(value :_*))
    @scala.inline
    def setMatches(value: js.Array[String]): Self = this.set("matches", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

