package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayersListItem extends js.Object {
  /**
    * The newest version of the layer.
    */
  var LatestMatchingVersion: js.UndefOr[LayerVersionsListItem] = js.native
  /**
    * The Amazon Resource Name (ARN) of the function layer.
    */
  var LayerArn: js.UndefOr[typings.awsSdk.lambdaMod.LayerArn] = js.native
  /**
    * The name of the layer.
    */
  var LayerName: js.UndefOr[typings.awsSdk.lambdaMod.LayerName] = js.native
}

object LayersListItem {
  @scala.inline
  def apply(): LayersListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayersListItem]
  }
  @scala.inline
  implicit class LayersListItemOps[Self <: LayersListItem] (val x: Self) extends AnyVal {
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
    def setLatestMatchingVersion(value: LayerVersionsListItem): Self = this.set("LatestMatchingVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatestMatchingVersion: Self = this.set("LatestMatchingVersion", js.undefined)
    @scala.inline
    def setLayerArn(value: LayerArn): Self = this.set("LayerArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerArn: Self = this.set("LayerArn", js.undefined)
    @scala.inline
    def setLayerName(value: LayerName): Self = this.set("LayerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerName: Self = this.set("LayerName", js.undefined)
  }
  
}

