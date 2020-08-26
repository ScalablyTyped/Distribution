package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRepositoryResponse extends js.Object {
  /**
    * The repository that was deleted.
    */
  var repository: js.UndefOr[Repository] = js.native
}

object DeleteRepositoryResponse {
  @scala.inline
  def apply(): DeleteRepositoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteRepositoryResponse]
  }
  @scala.inline
  implicit class DeleteRepositoryResponseOps[Self <: DeleteRepositoryResponse] (val x: Self) extends AnyVal {
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
    def setRepository(value: Repository): Self = this.set("repository", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepository: Self = this.set("repository", js.undefined)
  }
  
}

