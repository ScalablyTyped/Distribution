package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationBarItem extends StObject {
  
  /**
    * Optional children.
    */
  var childItems: js.UndefOr[Array[NavigationBarItem]] = js.undefined
  
  /**
    * Number of levels deep this item should appear.
    */
  var indent: Double
  
  /**
    * The symbol's kind (such as 'className' or 'parameterName').
    */
  var kind: ScriptElementKind
  
  /**
    * Optional modifiers for the kind (such as 'public').
    */
  var kindModifiers: js.UndefOr[String] = js.undefined
  
  /**
    * The definition locations of the item.
    */
  var spans: Array[TextSpan]
  
  /**
    * The item's display text.
    */
  var text: String
}
object NavigationBarItem {
  
  inline def apply(indent: Double, kind: ScriptElementKind, spans: Array[TextSpan], text: String): NavigationBarItem = {
    val __obj = js.Dynamic.literal(indent = indent.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], spans = spans.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationBarItem]
  }
  
  extension [Self <: NavigationBarItem](x: Self) {
    
    inline def setChildItems(value: Array[NavigationBarItem]): Self = StObject.set(x, "childItems", value.asInstanceOf[js.Any])
    
    inline def setChildItemsUndefined: Self = StObject.set(x, "childItems", js.undefined)
    
    inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    inline def setKind(value: ScriptElementKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindModifiers(value: String): Self = StObject.set(x, "kindModifiers", value.asInstanceOf[js.Any])
    
    inline def setKindModifiersUndefined: Self = StObject.set(x, "kindModifiers", js.undefined)
    
    inline def setSpans(value: Array[TextSpan]): Self = StObject.set(x, "spans", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
