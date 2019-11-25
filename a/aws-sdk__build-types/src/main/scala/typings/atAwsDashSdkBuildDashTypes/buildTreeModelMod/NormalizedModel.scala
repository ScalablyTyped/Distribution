package typings.atAwsDashSdkBuildDashTypes.buildTreeModelMod

import typings.atAwsDashSdkBuildDashTypes.buildApiModelMod.ApiModel
import typings.atAwsDashSdkBuildDashTypes.buildApiModelMod.ShapeMap
import typings.atAwsDashSdkTypes.buildProtocolMod.ServiceMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizedModel extends ApiModel {
  @JSName("operations")
  var operations_NormalizedModel: NormalizedOperationMap
}

object NormalizedModel {
  @scala.inline
  def apply(
    metadata: ServiceMetadata,
    operations: NormalizedOperationMap,
    shapes: ShapeMap,
    documentation: String = null
  ): NormalizedModel = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], shapes = shapes.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizedModel]
  }
}

