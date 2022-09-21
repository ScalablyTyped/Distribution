package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectionRange extends StObject {
  
  var parent: js.UndefOr[SelectionRange] = js.undefined
  
  var textSpan: TextSpan
}
object SelectionRange {
  
  inline def apply(textSpan: TextSpan): SelectionRange = {
    val __obj = js.Dynamic.literal(textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionRange]
  }
  
  extension [Self <: SelectionRange](x: Self) {
    
    inline def setParent(value: SelectionRange): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setTextSpan(value: TextSpan): Self = StObject.set(x, "textSpan", value.asInstanceOf[js.Any])
  }
}
