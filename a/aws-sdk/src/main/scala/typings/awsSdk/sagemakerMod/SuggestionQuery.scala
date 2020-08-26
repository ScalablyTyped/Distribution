package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuggestionQuery extends js.Object {
  /**
    * Defines a property name hint. Only property names that begin with the specified hint are included in the response.
    */
  var PropertyNameQuery: js.UndefOr[typings.awsSdk.sagemakerMod.PropertyNameQuery] = js.native
}

object SuggestionQuery {
  @scala.inline
  def apply(): SuggestionQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestionQuery]
  }
  @scala.inline
  implicit class SuggestionQueryOps[Self <: SuggestionQuery] (val x: Self) extends AnyVal {
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
    def setPropertyNameQuery(value: PropertyNameQuery): Self = this.set("PropertyNameQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropertyNameQuery: Self = this.set("PropertyNameQuery", js.undefined)
  }
  
}

