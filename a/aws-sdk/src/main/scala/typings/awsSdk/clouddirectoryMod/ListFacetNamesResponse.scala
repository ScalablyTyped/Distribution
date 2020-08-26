package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFacetNamesResponse extends js.Object {
  /**
    * The names of facets that exist within the schema.
    */
  var FacetNames: js.UndefOr[FacetNameList] = js.native
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.native
}

object ListFacetNamesResponse {
  @scala.inline
  def apply(): ListFacetNamesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFacetNamesResponse]
  }
  @scala.inline
  implicit class ListFacetNamesResponseOps[Self <: ListFacetNamesResponse] (val x: Self) extends AnyVal {
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
    def setFacetNamesVarargs(value: FacetName*): Self = this.set("FacetNames", js.Array(value :_*))
    @scala.inline
    def setFacetNames(value: FacetNameList): Self = this.set("FacetNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFacetNames: Self = this.set("FacetNames", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

