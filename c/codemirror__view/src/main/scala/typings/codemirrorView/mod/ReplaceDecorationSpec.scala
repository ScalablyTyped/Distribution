package typings.codemirrorView.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceDecorationSpec
  extends StObject
     with /**
  Other properties are allowed.
  */
/* other */ StringDictionary[Any] {
  
  /**
    Whether this is a block-level decoration. Defaults to false.
    */
  var block: js.UndefOr[Boolean] = js.undefined
  
  /**
    Whether this range covers the positions on its sides. This
    influences whether new content becomes part of the range and
    whether the cursor can be drawn on its sides. Defaults to false
    for inline replacements, and true for block replacements.
    */
  var inclusive: js.UndefOr[Boolean] = js.undefined
  
  /**
    Set inclusivity at the end.
    */
  var inclusiveEnd: js.UndefOr[Boolean] = js.undefined
  
  /**
    Set inclusivity at the start.
    */
  var inclusiveStart: js.UndefOr[Boolean] = js.undefined
  
  /**
    An optional widget to drawn in the place of the replaced
    content.
    */
  var widget: js.UndefOr[WidgetType] = js.undefined
}
object ReplaceDecorationSpec {
  
  inline def apply(): ReplaceDecorationSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceDecorationSpec]
  }
  
  extension [Self <: ReplaceDecorationSpec](x: Self) {
    
    inline def setBlock(value: Boolean): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
    
    inline def setInclusive(value: Boolean): Self = StObject.set(x, "inclusive", value.asInstanceOf[js.Any])
    
    inline def setInclusiveEnd(value: Boolean): Self = StObject.set(x, "inclusiveEnd", value.asInstanceOf[js.Any])
    
    inline def setInclusiveEndUndefined: Self = StObject.set(x, "inclusiveEnd", js.undefined)
    
    inline def setInclusiveStart(value: Boolean): Self = StObject.set(x, "inclusiveStart", value.asInstanceOf[js.Any])
    
    inline def setInclusiveStartUndefined: Self = StObject.set(x, "inclusiveStart", js.undefined)
    
    inline def setInclusiveUndefined: Self = StObject.set(x, "inclusive", js.undefined)
    
    inline def setWidget(value: WidgetType): Self = StObject.set(x, "widget", value.asInstanceOf[js.Any])
    
    inline def setWidgetUndefined: Self = StObject.set(x, "widget", js.undefined)
  }
}
