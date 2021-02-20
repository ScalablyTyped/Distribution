package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeInfo extends StObject {
  
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
  implicit class NodeInfoMutableBuilder[Self <: NodeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildProvider(value: String): Self = StObject.set(x, "childProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildProviderUndefined: Self = StObject.set(x, "childProvider", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconType(value: String | SqlThemeIcon): Self = StObject.set(x, "iconType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconTypeUndefined: Self = StObject.set(x, "iconType", js.undefined)
    
    @scala.inline
    def setIsLeaf(value: Boolean): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: ObjectMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodePath(value: String): Self = StObject.set(x, "nodePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeStatus(value: String): Self = StObject.set(x, "nodeStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeSubType(value: String): Self = StObject.set(x, "nodeSubType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeType(value: String): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: js.Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}
