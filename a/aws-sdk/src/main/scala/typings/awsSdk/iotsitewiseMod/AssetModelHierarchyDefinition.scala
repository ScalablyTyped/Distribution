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
  @scala.inline
  implicit class AssetModelHierarchyDefinitionOps[Self <: AssetModelHierarchyDefinition] (val x: Self) extends AnyVal {
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
    def setChildAssetModelId(value: ID): Self = this.set("childAssetModelId", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

