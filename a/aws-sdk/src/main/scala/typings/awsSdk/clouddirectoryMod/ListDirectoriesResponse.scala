package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDirectoriesResponse extends js.Object {
  /**
    * Lists all directories that are associated with your account in pagination fashion.
    */
  var Directories: DirectoryList = js.native
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.native
}

object ListDirectoriesResponse {
  @scala.inline
  def apply(Directories: DirectoryList): ListDirectoriesResponse = {
    val __obj = js.Dynamic.literal(Directories = Directories.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDirectoriesResponse]
  }
  @scala.inline
  implicit class ListDirectoriesResponseOps[Self <: ListDirectoriesResponse] (val x: Self) extends AnyVal {
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
    def setDirectoriesVarargs(value: Directory*): Self = this.set("Directories", js.Array(value :_*))
    @scala.inline
    def setDirectories(value: DirectoryList): Self = this.set("Directories", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

