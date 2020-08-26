package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListQualificationTypesRequest extends js.Object {
  /**
    *  The maximum number of results to return in a single call. 
    */
  var MaxResults: js.UndefOr[ResultSize] = js.native
  /**
    *  Specifies that only Qualification types that the Requester created are returned. If false, the operation returns all Qualification types. 
    */
  var MustBeOwnedByCaller: js.UndefOr[Boolean] = js.native
  /**
    * Specifies that only Qualification types that a user can request through the Amazon Mechanical Turk web site, such as by taking a Qualification test, are returned as results of the search. Some Qualification types, such as those assigned automatically by the system, cannot be requested directly by users. If false, all Qualification types, including those managed by the system, are considered. Valid values are True | False. 
    */
  var MustBeRequestable: Boolean = js.native
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    *  A text query against all of the searchable attributes of Qualification types. 
    */
  var Query: js.UndefOr[String] = js.native
}

object ListQualificationTypesRequest {
  @scala.inline
  def apply(MustBeRequestable: Boolean): ListQualificationTypesRequest = {
    val __obj = js.Dynamic.literal(MustBeRequestable = MustBeRequestable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListQualificationTypesRequest]
  }
  @scala.inline
  implicit class ListQualificationTypesRequestOps[Self <: ListQualificationTypesRequest] (val x: Self) extends AnyVal {
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
    def setMustBeRequestable(value: Boolean): Self = this.set("MustBeRequestable", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: ResultSize): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setMustBeOwnedByCaller(value: Boolean): Self = this.set("MustBeOwnedByCaller", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMustBeOwnedByCaller: Self = this.set("MustBeOwnedByCaller", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setQuery(value: String): Self = this.set("Query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("Query", js.undefined)
  }
  
}

