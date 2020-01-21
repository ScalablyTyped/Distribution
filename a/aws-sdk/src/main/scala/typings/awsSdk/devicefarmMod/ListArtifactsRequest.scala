package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListArtifactsRequest extends js.Object {
  /**
    * The run, job, suite, or test ARN.
    */
  var arn: AmazonResourceName = js.native
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The artifacts' type. Allowed values include:   FILE   LOG   SCREENSHOT  
    */
  var `type`: ArtifactCategory = js.native
}

object ListArtifactsRequest {
  @scala.inline
  def apply(arn: AmazonResourceName, `type`: ArtifactCategory, nextToken: PaginationToken = null): ListArtifactsRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListArtifactsRequest]
  }
}

