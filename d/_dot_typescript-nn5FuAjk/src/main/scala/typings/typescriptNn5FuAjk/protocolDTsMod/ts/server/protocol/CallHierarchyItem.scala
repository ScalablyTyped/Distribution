package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallHierarchyItem extends StObject {
  
  var containerName: js.UndefOr[String] = js.undefined
  
  var file: String
  
  var kind: ScriptElementKind
  
  var kindModifiers: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var selectionSpan: TextSpan
  
  var span: TextSpan
}
object CallHierarchyItem {
  
  inline def apply(file: String, kind: ScriptElementKind, name: String, selectionSpan: TextSpan, span: TextSpan): CallHierarchyItem = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selectionSpan = selectionSpan.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallHierarchyItem]
  }
  
  extension [Self <: CallHierarchyItem](x: Self) {
    
    inline def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    inline def setContainerNameUndefined: Self = StObject.set(x, "containerName", js.undefined)
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setKind(value: ScriptElementKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindModifiers(value: String): Self = StObject.set(x, "kindModifiers", value.asInstanceOf[js.Any])
    
    inline def setKindModifiersUndefined: Self = StObject.set(x, "kindModifiers", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSelectionSpan(value: TextSpan): Self = StObject.set(x, "selectionSpan", value.asInstanceOf[js.Any])
    
    inline def setSpan(value: TextSpan): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
  }
}
