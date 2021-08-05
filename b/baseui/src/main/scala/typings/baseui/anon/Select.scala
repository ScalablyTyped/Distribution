package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Select extends StObject {
  
  var Select: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
}
object Select {
  
  inline def apply(): Select = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Select]
  }
  
  extension [Self <: Select](x: Self) {
    
    inline def setSelect(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = StObject.set(x, "Select", value.asInstanceOf[js.Any])
    
    inline def setSelectUndefined: Self = StObject.set(x, "Select", js.undefined)
  }
}
