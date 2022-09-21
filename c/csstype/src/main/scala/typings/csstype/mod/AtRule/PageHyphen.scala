package typings.csstype.mod.AtRule

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageHyphen[TLength, TTime] extends StObject {
  
  var bleed: js.UndefOr[Bleed[TLength]] = js.undefined
  
  var marks: js.UndefOr[Marks] = js.undefined
  
  var size: js.UndefOr[Size[TLength]] = js.undefined
}
object PageHyphen {
  
  inline def apply[TLength, TTime](): PageHyphen[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageHyphen[TLength, TTime]]
  }
  
  extension [Self <: PageHyphen[?, ?], TLength, TTime](x: Self & (PageHyphen[TLength, TTime])) {
    
    inline def setBleed(value: Bleed[TLength]): Self = StObject.set(x, "bleed", value.asInstanceOf[js.Any])
    
    inline def setBleedUndefined: Self = StObject.set(x, "bleed", js.undefined)
    
    inline def setMarks(value: Marks): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
    
    inline def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
    
    inline def setSize(value: Size[TLength]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
