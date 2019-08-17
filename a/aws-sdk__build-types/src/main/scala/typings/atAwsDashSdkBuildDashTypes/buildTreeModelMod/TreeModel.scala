package typings.atAwsDashSdkBuildDashTypes.buildTreeModelMod

import typings.atAwsDashSdkTypes.buildProtocolMod.ServiceMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeModel
  extends Documented
     with Named {
  var metadata: ServiceMetadata
  var operations: TreeModelOperationMap
  var shapes: TreeModelShapeMap
}

object TreeModel {
  @scala.inline
  def apply(
    documentation: String,
    metadata: ServiceMetadata,
    name: String,
    operations: TreeModelOperationMap,
    shapes: TreeModelShapeMap
  ): TreeModel = {
    val __obj = js.Dynamic.literal(documentation = documentation, metadata = metadata, name = name, operations = operations, shapes = shapes)
  
    __obj.asInstanceOf[TreeModel]
  }
}

