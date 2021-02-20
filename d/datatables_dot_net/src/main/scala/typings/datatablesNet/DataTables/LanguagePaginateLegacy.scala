package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LanguagePaginateLegacy extends StObject {
  
  var sFirst: js.UndefOr[String] = js.native
  
  var sLast: js.UndefOr[String] = js.native
  
  var sNext: js.UndefOr[String] = js.native
  
  var sPrevious: js.UndefOr[String] = js.native
}
object LanguagePaginateLegacy {
  
  @scala.inline
  def apply(): LanguagePaginateLegacy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguagePaginateLegacy]
  }
  
  @scala.inline
  implicit class LanguagePaginateLegacyMutableBuilder[Self <: LanguagePaginateLegacy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSFirst(value: String): Self = StObject.set(x, "sFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSFirstUndefined: Self = StObject.set(x, "sFirst", js.undefined)
    
    @scala.inline
    def setSLast(value: String): Self = StObject.set(x, "sLast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSLastUndefined: Self = StObject.set(x, "sLast", js.undefined)
    
    @scala.inline
    def setSNext(value: String): Self = StObject.set(x, "sNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSNextUndefined: Self = StObject.set(x, "sNext", js.undefined)
    
    @scala.inline
    def setSPrevious(value: String): Self = StObject.set(x, "sPrevious", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSPreviousUndefined: Self = StObject.set(x, "sPrevious", js.undefined)
  }
}
