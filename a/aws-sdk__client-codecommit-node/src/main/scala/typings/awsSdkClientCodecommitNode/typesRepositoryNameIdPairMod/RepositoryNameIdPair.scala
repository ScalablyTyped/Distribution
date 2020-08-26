package typings.awsSdkClientCodecommitNode.typesRepositoryNameIdPairMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryNameIdPair extends js.Object {
  /**
    * <p>The ID associated with the repository.</p>
    */
  var repositoryId: js.UndefOr[String] = js.native
  /**
    * <p>The name associated with the repository.</p>
    */
  var repositoryName: js.UndefOr[String] = js.native
}

object RepositoryNameIdPair {
  @scala.inline
  def apply(): RepositoryNameIdPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepositoryNameIdPair]
  }
  @scala.inline
  implicit class RepositoryNameIdPairOps[Self <: RepositoryNameIdPair] (val x: Self) extends AnyVal {
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
    def setRepositoryId(value: String): Self = this.set("repositoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepositoryId: Self = this.set("repositoryId", js.undefined)
    @scala.inline
    def setRepositoryName(value: String): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepositoryName: Self = this.set("repositoryName", js.undefined)
  }
  
}

