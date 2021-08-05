package typings.carbonComponentsReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Label extends StObject {
  
  var id: String
  
  var label: /* import warning: importer.ImportType#apply Failed type conversion: carbon-components-react.carbon-components-react/lib/components/TreeView/TreeNode.TreeNodeStandaloneProps['label'] */ js.Any
  
  var value: /* import warning: importer.ImportType#apply Failed type conversion: carbon-components-react.carbon-components-react/lib/components/TreeView/TreeNode.TreeNodeStandaloneProps['value'] */ js.Any
}
object Label {
  
  inline def apply(
    id: String,
    label: /* import warning: importer.ImportType#apply Failed type conversion: carbon-components-react.carbon-components-react/lib/components/TreeView/TreeNode.TreeNodeStandaloneProps['label'] */ js.Any,
    value: /* import warning: importer.ImportType#apply Failed type conversion: carbon-components-react.carbon-components-react/lib/components/TreeView/TreeNode.TreeNodeStandaloneProps['value'] */ js.Any
  ): Label = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
  
  extension [Self <: Label](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(
      value: /* import warning: importer.ImportType#apply Failed type conversion: carbon-components-react.carbon-components-react/lib/components/TreeView/TreeNode.TreeNodeStandaloneProps['label'] */ js.Any
    ): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: carbon-components-react.carbon-components-react/lib/components/TreeView/TreeNode.TreeNodeStandaloneProps['value'] */ js.Any
    ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
