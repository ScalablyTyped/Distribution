package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.Array
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptElementKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** protocol.NavigationTree is identical to ts.NavigationTree, except using protocol.TextSpan instead of ts.TextSpan */
trait NavigationTree extends StObject {
  
  var childItems: js.UndefOr[Array[NavigationTree]] = js.undefined
  
  var kind: ScriptElementKind
  
  var kindModifiers: String
  
  var nameSpan: js.UndefOr[TextSpan] = js.undefined
  
  var spans: Array[TextSpan]
  
  var text: String
}
object NavigationTree {
  
  inline def apply(kind: ScriptElementKind, kindModifiers: String, spans: Array[TextSpan], text: String): NavigationTree = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], spans = spans.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationTree]
  }
  
  extension [Self <: NavigationTree](x: Self) {
    
    inline def setChildItems(value: Array[NavigationTree]): Self = StObject.set(x, "childItems", value.asInstanceOf[js.Any])
    
    inline def setChildItemsUndefined: Self = StObject.set(x, "childItems", js.undefined)
    
    inline def setKind(value: ScriptElementKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindModifiers(value: String): Self = StObject.set(x, "kindModifiers", value.asInstanceOf[js.Any])
    
    inline def setNameSpan(value: TextSpan): Self = StObject.set(x, "nameSpan", value.asInstanceOf[js.Any])
    
    inline def setNameSpanUndefined: Self = StObject.set(x, "nameSpan", js.undefined)
    
    inline def setSpans(value: Array[TextSpan]): Self = StObject.set(x, "spans", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
