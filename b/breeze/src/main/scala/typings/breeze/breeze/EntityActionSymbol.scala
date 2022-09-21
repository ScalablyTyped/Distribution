package typings.breeze.breeze

import typings.breeze.breeze.core.EnumSymbol
import typings.breeze.breeze.core.IEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityActionSymbol
  extends StObject
     with EnumSymbol {
  
  var isAttach: js.UndefOr[Boolean] = js.undefined
  
  var isDetach: js.UndefOr[Boolean] = js.undefined
  
  var isModification: js.UndefOr[Boolean] = js.undefined
}
object EntityActionSymbol {
  
  inline def apply(getName: () => String, parentEnum: IEnum): EntityActionSymbol = {
    val __obj = js.Dynamic.literal(getName = js.Any.fromFunction0(getName), parentEnum = parentEnum.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityActionSymbol]
  }
  
  extension [Self <: EntityActionSymbol](x: Self) {
    
    inline def setIsAttach(value: Boolean): Self = StObject.set(x, "isAttach", value.asInstanceOf[js.Any])
    
    inline def setIsAttachUndefined: Self = StObject.set(x, "isAttach", js.undefined)
    
    inline def setIsDetach(value: Boolean): Self = StObject.set(x, "isDetach", value.asInstanceOf[js.Any])
    
    inline def setIsDetachUndefined: Self = StObject.set(x, "isDetach", js.undefined)
    
    inline def setIsModification(value: Boolean): Self = StObject.set(x, "isModification", value.asInstanceOf[js.Any])
    
    inline def setIsModificationUndefined: Self = StObject.set(x, "isModification", js.undefined)
  }
}
