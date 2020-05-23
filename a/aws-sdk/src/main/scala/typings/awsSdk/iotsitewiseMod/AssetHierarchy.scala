package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetHierarchy extends js.Object {
  /**
    * The ID of the hierarchy. This ID is a hierarchyId.
    */
  var id: js.UndefOr[ID] = js.native
  /**
    * The hierarchy name provided in the CreateAssetModel or UpdateAssetModel API.
    */
  var name: Name = js.native
}

object AssetHierarchy {
  @scala.inline
  def apply(name: Name, id: ID = null): AssetHierarchy = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetHierarchy]
  }
}

