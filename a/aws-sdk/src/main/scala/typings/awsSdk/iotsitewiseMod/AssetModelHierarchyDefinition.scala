package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetModelHierarchyDefinition extends js.Object {
  /**
    * The ID of an asset model for this hierarchy.
    */
  var childAssetModelId: ID = js.native
  /**
    * The name of the asset model hierarchy definition (as specified in CreateAssetModel or UpdateAssetModel).
    */
  var name: Name = js.native
}

object AssetModelHierarchyDefinition {
  @scala.inline
  def apply(childAssetModelId: ID, name: Name): AssetModelHierarchyDefinition = {
    val __obj = js.Dynamic.literal(childAssetModelId = childAssetModelId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetModelHierarchyDefinition]
  }
}

