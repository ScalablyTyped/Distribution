package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetModelHierarchy extends js.Object {
  /**
    * The ID of the asset model. All assets in this hierarchy must be instances of the childAssetModelId asset model.
    */
  var childAssetModelId: ID = js.native
  /**
    * The ID of the asset model hierarchy. This ID is a hierarchyId.
    */
  var id: js.UndefOr[ID] = js.native
  /**
    * The name of the asset model hierarchy that you specify by using the CreateAssetModel or UpdateAssetModel API.
    */
  var name: Name = js.native
}

object AssetModelHierarchy {
  @scala.inline
  def apply(childAssetModelId: ID, name: Name, id: ID = null): AssetModelHierarchy = {
    val __obj = js.Dynamic.literal(childAssetModelId = childAssetModelId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetModelHierarchy]
  }
}

