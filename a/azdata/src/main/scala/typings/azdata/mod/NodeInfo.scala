package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeInfo extends StObject {
  
  /**
    * Informs who provides the children to a node, used by data explorer tree view api
    */
  var childProvider: js.UndefOr[String] = js.undefined
  
  var errorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Specify the icon for the node. The value could the path to the icon or and ADS icon defined in {@link SqlThemeIcon}.
    */
  var icon: js.UndefOr[IconPath | SqlThemeIcon] = js.undefined
  
  /**
    * Optional iconType for the object in the tree. Currently this only supports
    * an icon name or SqlThemeIcon name, rather than a path to an icon.
    * If not defined, the nodeType + nodeStatus / nodeSubType values
    * will be used instead.
    */
  var iconType: js.UndefOr[String | SqlThemeIcon] = js.undefined
  
  var isLeaf: Boolean
  
  var label: String
  
  var metadata: js.UndefOr[ObjectMetadata] = js.undefined
  
  var nodePath: String
  
  var nodeStatus: js.UndefOr[String] = js.undefined
  
  var nodeSubType: js.UndefOr[String] = js.undefined
  
  var nodeType: String
  
  /**
    * Holds the connection profile for nodes, used by data explorer tree view api
    */
  var payload: js.UndefOr[Any] = js.undefined
}
object NodeInfo {
  
  inline def apply(isLeaf: Boolean, label: String, nodePath: String, nodeType: String): NodeInfo = {
    val __obj = js.Dynamic.literal(isLeaf = isLeaf.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], nodePath = nodePath.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeInfo] (val x: Self) extends AnyVal {
    
    inline def setChildProvider(value: String): Self = StObject.set(x, "childProvider", value.asInstanceOf[js.Any])
    
    inline def setChildProviderUndefined: Self = StObject.set(x, "childProvider", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setIcon(value: IconPath | SqlThemeIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconType(value: String | SqlThemeIcon): Self = StObject.set(x, "iconType", value.asInstanceOf[js.Any])
    
    inline def setIconTypeUndefined: Self = StObject.set(x, "iconType", js.undefined)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setIsLeaf(value: Boolean): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: ObjectMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setNodePath(value: String): Self = StObject.set(x, "nodePath", value.asInstanceOf[js.Any])
    
    inline def setNodeStatus(value: String): Self = StObject.set(x, "nodeStatus", value.asInstanceOf[js.Any])
    
    inline def setNodeStatusUndefined: Self = StObject.set(x, "nodeStatus", js.undefined)
    
    inline def setNodeSubType(value: String): Self = StObject.set(x, "nodeSubType", value.asInstanceOf[js.Any])
    
    inline def setNodeSubTypeUndefined: Self = StObject.set(x, "nodeSubType", js.undefined)
    
    inline def setNodeType(value: String): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}
