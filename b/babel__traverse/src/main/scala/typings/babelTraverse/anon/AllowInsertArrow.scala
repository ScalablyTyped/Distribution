package typings.babelTraverse.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowInsertArrow extends StObject {
  
  var allowInsertArrow: js.UndefOr[Boolean] = js.undefined
  
  var allowInsertArrowWithRest: js.UndefOr[Boolean] = js.undefined
  
  var noNewArrows: js.UndefOr[Boolean] = js.undefined
  
  var specCompliant: js.UndefOr[Boolean] = js.undefined
}
object AllowInsertArrow {
  
  inline def apply(): AllowInsertArrow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowInsertArrow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowInsertArrow] (val x: Self) extends AnyVal {
    
    inline def setAllowInsertArrow(value: Boolean): Self = StObject.set(x, "allowInsertArrow", value.asInstanceOf[js.Any])
    
    inline def setAllowInsertArrowUndefined: Self = StObject.set(x, "allowInsertArrow", js.undefined)
    
    inline def setAllowInsertArrowWithRest(value: Boolean): Self = StObject.set(x, "allowInsertArrowWithRest", value.asInstanceOf[js.Any])
    
    inline def setAllowInsertArrowWithRestUndefined: Self = StObject.set(x, "allowInsertArrowWithRest", js.undefined)
    
    inline def setNoNewArrows(value: Boolean): Self = StObject.set(x, "noNewArrows", value.asInstanceOf[js.Any])
    
    inline def setNoNewArrowsUndefined: Self = StObject.set(x, "noNewArrows", js.undefined)
    
    inline def setSpecCompliant(value: Boolean): Self = StObject.set(x, "specCompliant", value.asInstanceOf[js.Any])
    
    inline def setSpecCompliantUndefined: Self = StObject.set(x, "specCompliant", js.undefined)
  }
}
