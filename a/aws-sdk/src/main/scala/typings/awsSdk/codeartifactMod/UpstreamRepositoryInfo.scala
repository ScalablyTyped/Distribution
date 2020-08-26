package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpstreamRepositoryInfo extends js.Object {
  /**
    *  The name of an upstream repository. 
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
}

object UpstreamRepositoryInfo {
  @scala.inline
  def apply(): UpstreamRepositoryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpstreamRepositoryInfo]
  }
  @scala.inline
  implicit class UpstreamRepositoryInfoOps[Self <: UpstreamRepositoryInfo] (val x: Self) extends AnyVal {
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
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepositoryName: Self = this.set("repositoryName", js.undefined)
  }
  
}

