package typings.awsSdk.cloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuggestRequest extends js.Object {
  /**
    * Specifies the string for which you want to get suggestions.
    */
  var query: Query = js.native
  /**
    * Specifies the maximum number of suggestions to return. 
    */
  var size: js.UndefOr[SuggestionsSize] = js.native
  /**
    * Specifies the name of the suggester to use to find suggested matches.
    */
  var suggester: Suggester = js.native
}

object SuggestRequest {
  @scala.inline
  def apply(query: Query, suggester: Suggester): SuggestRequest = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], suggester = suggester.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestRequest]
  }
  @scala.inline
  implicit class SuggestRequestOps[Self <: SuggestRequest] (val x: Self) extends AnyVal {
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
    def setQuery(value: Query): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuggester(value: Suggester): Self = this.set("suggester", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: SuggestionsSize): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

