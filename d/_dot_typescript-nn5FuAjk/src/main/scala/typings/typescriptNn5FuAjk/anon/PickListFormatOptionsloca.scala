package typings.typescriptNn5FuAjk.anon

import typings.typescriptNn5FuAjk.Intl.ListFormatLocaleMatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined .typescript-nn5FuAjk.Pick<.typescript-nn5FuAjk.Intl.ListFormatOptions, 'localeMatcher'> */
trait PickListFormatOptionsloca extends StObject {
  
  var localeMatcher: js.UndefOr[ListFormatLocaleMatcher] = js.undefined
}
object PickListFormatOptionsloca {
  
  inline def apply(): PickListFormatOptionsloca = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickListFormatOptionsloca]
  }
  
  extension [Self <: PickListFormatOptionsloca](x: Self) {
    
    inline def setLocaleMatcher(value: ListFormatLocaleMatcher): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
    
    inline def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
  }
}
