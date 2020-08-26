package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListObjectParentPathsResponse extends js.Object {
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.native
  /**
    * Returns the path to the ObjectIdentifiers that are associated with the directory.
    */
  var PathToObjectIdentifiersList: js.UndefOr[typings.awsSdk.clouddirectoryMod.PathToObjectIdentifiersList] = js.native
}

object ListObjectParentPathsResponse {
  @scala.inline
  def apply(): ListObjectParentPathsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListObjectParentPathsResponse]
  }
  @scala.inline
  implicit class ListObjectParentPathsResponseOps[Self <: ListObjectParentPathsResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setPathToObjectIdentifiersListVarargs(value: PathToObjectIdentifiers*): Self = this.set("PathToObjectIdentifiersList", js.Array(value :_*))
    @scala.inline
    def setPathToObjectIdentifiersList(value: PathToObjectIdentifiersList): Self = this.set("PathToObjectIdentifiersList", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathToObjectIdentifiersList: Self = this.set("PathToObjectIdentifiersList", js.undefined)
  }
  
}

