package typings.baiduApp.swan

import typings.baiduApp.anon.BankAccount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region
trait ChooseInvoiceTitleOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  var success_ChooseInvoiceTitleOptions: js.UndefOr[js.Function1[/* res */ BankAccount, Unit]] = js.undefined
}
object ChooseInvoiceTitleOptions {
  
  inline def apply(): ChooseInvoiceTitleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseInvoiceTitleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChooseInvoiceTitleOptions] (val x: Self) extends AnyVal {
    
    inline def setSuccess(value: /* res */ BankAccount => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
