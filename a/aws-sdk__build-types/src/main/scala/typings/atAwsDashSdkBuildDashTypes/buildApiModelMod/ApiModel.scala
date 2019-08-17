package typings.atAwsDashSdkBuildDashTypes.buildApiModelMod

import typings.atAwsDashSdkTypes.buildProtocolMod.ServiceMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiModel extends js.Object {
  var documentation: js.UndefOr[java.lang.String] = js.undefined
  var metadata: ServiceMetadata
  var operations: OperationMap
  var shapes: ShapeMap
}

object ApiModel {
  @scala.inline
  def apply(
    metadata: ServiceMetadata,
    operations: OperationMap,
    shapes: ShapeMap,
    documentation: java.lang.String = null
  ): ApiModel = {
    val __obj = js.Dynamic.literal(metadata = metadata, operations = operations, shapes = shapes)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    __obj.asInstanceOf[ApiModel]
  }
}

