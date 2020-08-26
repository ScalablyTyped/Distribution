package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateExternalConnectionResult extends js.Object {
  /**
    *  The repository associated with the removed external connection. 
    */
  var repository: js.UndefOr[RepositoryDescription] = js.native
}

object DisassociateExternalConnectionResult {
  @scala.inline
  def apply(): DisassociateExternalConnectionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateExternalConnectionResult]
  }
  @scala.inline
  implicit class DisassociateExternalConnectionResultOps[Self <: DisassociateExternalConnectionResult] (val x: Self) extends AnyVal {
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
    def setRepository(value: RepositoryDescription): Self = this.set("repository", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepository: Self = this.set("repository", js.undefined)
  }
  
}

