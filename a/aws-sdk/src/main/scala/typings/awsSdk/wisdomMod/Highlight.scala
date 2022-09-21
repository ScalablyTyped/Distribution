package typings.awsSdk.wisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Highlight extends StObject {
  
  /**
    * The offset for the start of the highlight.
    */
  var beginOffsetInclusive: js.UndefOr[HighlightOffset] = js.undefined
  
  /**
    * The offset for the end of the highlight.
    */
  var endOffsetExclusive: js.UndefOr[HighlightOffset] = js.undefined
}
object Highlight {
  
  inline def apply(): Highlight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Highlight]
  }
  
  extension [Self <: Highlight](x: Self) {
    
    inline def setBeginOffsetInclusive(value: HighlightOffset): Self = StObject.set(x, "beginOffsetInclusive", value.asInstanceOf[js.Any])
    
    inline def setBeginOffsetInclusiveUndefined: Self = StObject.set(x, "beginOffsetInclusive", js.undefined)
    
    inline def setEndOffsetExclusive(value: HighlightOffset): Self = StObject.set(x, "endOffsetExclusive", value.asInstanceOf[js.Any])
    
    inline def setEndOffsetExclusiveUndefined: Self = StObject.set(x, "endOffsetExclusive", js.undefined)
  }
}
