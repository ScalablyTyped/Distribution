package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeInfo extends js.Object {
  /**
    * Informs who provides the children to a node, used by data explorer tree view api
    */
  var childProvider: js.UndefOr[String] = js.undefined
  var errorMessage: String
  /**
    * Optional iconType for the object in the tree. Currently this only supports
    * an icon name or SqlThemeIcon name, rather than a path to an icon.
    * If not defined, the nodeType + nodeStatus / nodeSubType values
    * will be used instead.
    */
  var iconType: js.UndefOr[String | SqlThemeIcon] = js.undefined
  var isLeaf: Boolean
  var label: String
  var metadata: ObjectMetadata
  var nodePath: String
  var nodeStatus: String
  var nodeSubType: String
  var nodeType: String
  /**
    * Holds the connection profile for nodes, used by data explorer tree view api
    */
  var payload: js.UndefOr[js.Any] = js.undefined
}

object NodeInfo {
  @scala.inline
  def apply(
    errorMessage: String,
    isLeaf: Boolean,
    label: String,
    metadata: ObjectMetadata,
    nodePath: String,
    nodeStatus: String,
    nodeSubType: String,
    nodeType: String,
    childProvider: String = null,
    iconType: String | SqlThemeIcon = null,
    payload: js.Any = null
  ): NodeInfo = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], isLeaf = isLeaf.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], nodePath = nodePath.asInstanceOf[js.Any], nodeStatus = nodeStatus.asInstanceOf[js.Any], nodeSubType = nodeSubType.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any])
    if (childProvider != null) __obj.updateDynamic("childProvider")(childProvider.asInstanceOf[js.Any])
    if (iconType != null) __obj.updateDynamic("iconType")(iconType.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeInfo]
  }
}

