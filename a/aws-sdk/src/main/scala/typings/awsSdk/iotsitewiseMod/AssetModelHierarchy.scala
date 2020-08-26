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
  def apply(childAssetModelId: ID, name: Name): AssetModelHierarchy = {
    val __obj = js.Dynamic.literal(childAssetModelId = childAssetModelId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetModelHierarchy]
  }
  @scala.inline
  implicit class AssetModelHierarchyOps[Self <: AssetModelHierarchy] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setId(value: ID): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

