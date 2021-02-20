package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait verifyOptions
  extends BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  var success_verifyOptions: js.UndefOr[js.Function1[/* res */ verifyTask, Unit]] = js.native
}
object verifyOptions {
  
  @scala.inline
  def apply(): verifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[verifyOptions]
  }
  
  @scala.inline
  implicit class verifyOptionsMutableBuilder[Self <: verifyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: /* res */ verifyTask => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
