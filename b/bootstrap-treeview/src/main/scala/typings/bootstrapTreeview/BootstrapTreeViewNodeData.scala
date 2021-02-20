package typings.bootstrapTreeview

import typings.bootstrapTreeview.anon.Checked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapTreeViewNodeData extends StObject {
  
  var backColor: js.UndefOr[String] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var href: js.UndefOr[String] = js.native
  
  var icon: js.UndefOr[String] = js.native
  
  var nodeId: js.UndefOr[Double] = js.native
  
  var nodes: js.UndefOr[js.Array[BootstrapTreeViewNodeData]] = js.native
  
  var selectable: js.UndefOr[Boolean] = js.native
  
  var selectedIcon: js.UndefOr[String] = js.native
  
  var state: js.UndefOr[Checked] = js.native
  
  var tags: js.UndefOr[js.Array[String]] = js.native
  
  var text: js.UndefOr[String] = js.native
}
object BootstrapTreeViewNodeData {
  
  @scala.inline
  def apply(): BootstrapTreeViewNodeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BootstrapTreeViewNodeData]
  }
  
  @scala.inline
  implicit class BootstrapTreeViewNodeDataMutableBuilder[Self <: BootstrapTreeViewNodeData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackColor(value: String): Self = StObject.set(x, "backColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackColorUndefined: Self = StObject.set(x, "backColor", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setNodeId(value: Double): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
    
    @scala.inline
    def setNodes(value: js.Array[BootstrapTreeViewNodeData]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    @scala.inline
    def setNodesVarargs(value: BootstrapTreeViewNodeData*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    @scala.inline
    def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    @scala.inline
    def setSelectedIcon(value: String): Self = StObject.set(x, "selectedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedIconUndefined: Self = StObject.set(x, "selectedIcon", js.undefined)
    
    @scala.inline
    def setState(value: Checked): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
