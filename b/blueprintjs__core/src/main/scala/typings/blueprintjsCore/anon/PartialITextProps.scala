package typings.blueprintjsCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core/lib/esm/components/text/text.ITextProps> */
trait PartialITextProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var ellipsize: js.UndefOr[Boolean] = js.undefined
  
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
  ] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object PartialITextProps {
  
  inline def apply(): PartialITextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialITextProps]
  }
  
  extension [Self <: PartialITextProps](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setEllipsize(value: Boolean): Self = StObject.set(x, "ellipsize", value.asInstanceOf[js.Any])
    
    inline def setEllipsizeUndefined: Self = StObject.set(x, "ellipsize", js.undefined)
    
    inline def setTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
