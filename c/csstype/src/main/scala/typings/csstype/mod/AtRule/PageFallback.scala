package typings.csstype.mod.AtRule

import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined csstype.csstype.Fallback<csstype.csstype.AtRule.Page<TLength, TTime>> */
trait PageFallback[TLength, TTime] extends StObject {
  
  var bleed: js.UndefOr[Bleed[TLength] | js.Array[NonNullable[js.UndefOr[Bleed[TLength]]]]] = js.undefined
  
  var marks: js.UndefOr[Marks | js.Array[NonNullable[js.UndefOr[Marks]]]] = js.undefined
  
  var pageOrientation: js.UndefOr[PageOrientation | js.Array[NonNullable[js.UndefOr[PageOrientation]]]] = js.undefined
  
  var size: js.UndefOr[Size[TLength] | js.Array[NonNullable[js.UndefOr[Size[TLength]]]]] = js.undefined
}
object PageFallback {
  
  inline def apply[TLength, TTime](): PageFallback[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageFallback[TLength, TTime]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PageFallback[?, ?], TLength, TTime] (val x: Self & (PageFallback[TLength, TTime])) extends AnyVal {
    
    inline def setBleed(value: Bleed[TLength] | js.Array[NonNullable[js.UndefOr[Bleed[TLength]]]]): Self = StObject.set(x, "bleed", value.asInstanceOf[js.Any])
    
    inline def setBleedUndefined: Self = StObject.set(x, "bleed", js.undefined)
    
    inline def setBleedVarargs(value: NonNullable[js.UndefOr[Bleed[TLength]]]*): Self = StObject.set(x, "bleed", js.Array(value*))
    
    inline def setMarks(value: Marks | js.Array[NonNullable[js.UndefOr[Marks]]]): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
    
    inline def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
    
    inline def setMarksVarargs(value: NonNullable[js.UndefOr[Marks]]*): Self = StObject.set(x, "marks", js.Array(value*))
    
    inline def setPageOrientation(value: PageOrientation | js.Array[NonNullable[js.UndefOr[PageOrientation]]]): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
    
    inline def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
    
    inline def setPageOrientationVarargs(value: NonNullable[js.UndefOr[PageOrientation]]*): Self = StObject.set(x, "pageOrientation", js.Array(value*))
    
    inline def setSize(value: Size[TLength] | js.Array[NonNullable[js.UndefOr[Size[TLength]]]]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSizeVarargs(value: NonNullable[js.UndefOr[Size[TLength]]]*): Self = StObject.set(x, "size", js.Array(value*))
  }
}
