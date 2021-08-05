package typings.bootstrapTreeview

import typings.bootstrapTreeview.anon.Checked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapTreeViewNodeData extends StObject {
  
  var backColor: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var href: js.UndefOr[String] = js.undefined
  
  var icon: js.UndefOr[String] = js.undefined
  
  var nodeId: js.UndefOr[Double] = js.undefined
  
  var nodes: js.UndefOr[js.Array[BootstrapTreeViewNodeData]] = js.undefined
  
  var selectable: js.UndefOr[Boolean] = js.undefined
  
  var selectedIcon: js.UndefOr[String] = js.undefined
  
  var state: js.UndefOr[Checked] = js.undefined
  
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object BootstrapTreeViewNodeData {
  
  inline def apply(): BootstrapTreeViewNodeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BootstrapTreeViewNodeData]
  }
  
  extension [Self <: BootstrapTreeViewNodeData](x: Self) {
    
    inline def setBackColor(value: String): Self = StObject.set(x, "backColor", value.asInstanceOf[js.Any])
    
    inline def setBackColorUndefined: Self = StObject.set(x, "backColor", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setNodeId(value: Double): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
    
    inline def setNodes(value: js.Array[BootstrapTreeViewNodeData]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setNodesVarargs(value: BootstrapTreeViewNodeData*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    inline def setSelectedIcon(value: String): Self = StObject.set(x, "selectedIcon", value.asInstanceOf[js.Any])
    
    inline def setSelectedIconUndefined: Self = StObject.set(x, "selectedIcon", js.undefined)
    
    inline def setState(value: Checked): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
