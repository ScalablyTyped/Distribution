package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEntitiesRequest extends js.Object {
  /**
    * An array of entity IDs. The IDs should be in the following format.  urn:tdm:REGION/ACCOUNT ID/default:device:DEVICENAME 
    */
  var ids: Urns = js.native
  /**
    * The version of the user's namespace. Defaults to the latest version of the user's namespace.
    */
  var namespaceVersion: js.UndefOr[Version] = js.native
}

object GetEntitiesRequest {
  @scala.inline
  def apply(ids: Urns, namespaceVersion: js.UndefOr[Version] = js.undefined): GetEntitiesRequest = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
    if (!js.isUndefined(namespaceVersion)) __obj.updateDynamic("namespaceVersion")(namespaceVersion.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEntitiesRequest]
  }
}

