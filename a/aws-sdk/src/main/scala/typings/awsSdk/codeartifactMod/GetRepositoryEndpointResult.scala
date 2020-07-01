package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRepositoryEndpointResult extends js.Object {
  /**
    *  A string that specifies the URL of the returned endpoint. 
    */
  var repositoryEndpoint: js.UndefOr[String] = js.native
}

object GetRepositoryEndpointResult {
  @scala.inline
  def apply(repositoryEndpoint: String = null): GetRepositoryEndpointResult = {
    val __obj = js.Dynamic.literal()
    if (repositoryEndpoint != null) __obj.updateDynamic("repositoryEndpoint")(repositoryEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRepositoryEndpointResult]
  }
}

