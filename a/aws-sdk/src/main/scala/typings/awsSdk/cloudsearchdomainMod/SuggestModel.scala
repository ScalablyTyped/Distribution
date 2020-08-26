package typings.awsSdk.cloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuggestModel extends js.Object {
  /**
    * The number of documents that were found to match the query string.
    */
  var found: js.UndefOr[Long] = js.native
  /**
    * The query string specified in the suggest request.
    */
  var query: js.UndefOr[String] = js.native
  /**
    * The documents that match the query string.
    */
  var suggestions: js.UndefOr[Suggestions] = js.native
}

object SuggestModel {
  @scala.inline
  def apply(): SuggestModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestModel]
  }
  @scala.inline
  implicit class SuggestModelOps[Self <: SuggestModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFound(value: Long): Self = this.set("found", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFound: Self = this.set("found", js.undefined)
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setSuggestionsVarargs(value: SuggestionMatch*): Self = this.set("suggestions", js.Array(value :_*))
    @scala.inline
    def setSuggestions(value: Suggestions): Self = this.set("suggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestions: Self = this.set("suggestions", js.undefined)
  }
  
}

