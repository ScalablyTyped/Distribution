package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeInfo extends js.Object {
  /**
    * Informs who provides the children to a node, used by data explorer tree view api
    */
  var childProvider: js.UndefOr[String] = js.native
  var errorMessage: String = js.native
  /**
    * Optional iconType for the object in the tree. Currently this only supports
    * an icon name or SqlThemeIcon name, rather than a path to an icon.
    * If not defined, the nodeType + nodeStatus / nodeSubType values
    * will be used instead.
    */
  var iconType: js.UndefOr[String | SqlThemeIcon] = js.native
  var isLeaf: Boolean = js.native
  var label: String = js.native
  var metadata: ObjectMetadata = js.native
  var nodePath: String = js.native
  var nodeStatus: String = js.native
  var nodeSubType: String = js.native
  var nodeType: String = js.native
  /**
    * Holds the connection profile for nodes, used by data explorer tree view api
    */
  var payload: js.UndefOr[js.Any] = js.native
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
    nodeType: String
  ): NodeInfo = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], isLeaf = isLeaf.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], nodePath = nodePath.asInstanceOf[js.Any], nodeStatus = nodeStatus.asInstanceOf[js.Any], nodeSubType = nodeSubType.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeInfo]
  }
  @scala.inline
  implicit class NodeInfoOps[Self <: NodeInfo] (val x: Self) extends AnyVal {
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
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsLeaf(value: Boolean): Self = this.set("isLeaf", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: ObjectMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodePath(value: String): Self = this.set("nodePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeStatus(value: String): Self = this.set("nodeStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeSubType(value: String): Self = this.set("nodeSubType", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeType(value: String): Self = this.set("nodeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildProvider(value: String): Self = this.set("childProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildProvider: Self = this.set("childProvider", js.undefined)
    @scala.inline
    def setIconType(value: String | SqlThemeIcon): Self = this.set("iconType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconType: Self = this.set("iconType", js.undefined)
    @scala.inline
    def setPayload(value: js.Any): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
  }
  
}

