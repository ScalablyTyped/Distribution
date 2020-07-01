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
  def apply(repositoryName: RepositoryName = null): UpstreamRepositoryInfo = {
    val __obj = js.Dynamic.literal()
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpstreamRepositoryInfo]
  }
}

