package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLayerVersionsRequest extends js.Object {
  /**
    * A runtime identifier. For example, go1.x.
    */
  var CompatibleRuntime: js.UndefOr[Runtime] = js.native
  /**
    * The name or Amazon Resource Name (ARN) of the layer.
    */
  var LayerName: typings.awsSdk.lambdaMod.LayerName = js.native
  /**
    * A pagination token returned by a previous call.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The maximum number of versions to return.
    */
  var MaxItems: js.UndefOr[MaxLayerListItems] = js.native
}

object ListLayerVersionsRequest {
  @scala.inline
  def apply(
    LayerName: LayerName,
    CompatibleRuntime: Runtime = null,
    Marker: String = null,
    MaxItems: Int | Double = null
  ): ListLayerVersionsRequest = {
    val __obj = js.Dynamic.literal(LayerName = LayerName.asInstanceOf[js.Any])
    if (CompatibleRuntime != null) __obj.updateDynamic("CompatibleRuntime")(CompatibleRuntime.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (MaxItems != null) __obj.updateDynamic("MaxItems")(MaxItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLayerVersionsRequest]
  }
}

