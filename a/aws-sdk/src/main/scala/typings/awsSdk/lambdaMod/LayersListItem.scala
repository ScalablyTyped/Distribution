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
  def apply(
    LatestMatchingVersion: LayerVersionsListItem = null,
    LayerArn: LayerArn = null,
    LayerName: LayerName = null
  ): LayersListItem = {
    val __obj = js.Dynamic.literal()
    if (LatestMatchingVersion != null) __obj.updateDynamic("LatestMatchingVersion")(LatestMatchingVersion.asInstanceOf[js.Any])
    if (LayerArn != null) __obj.updateDynamic("LayerArn")(LayerArn.asInstanceOf[js.Any])
    if (LayerName != null) __obj.updateDynamic("LayerName")(LayerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayersListItem]
  }
}

