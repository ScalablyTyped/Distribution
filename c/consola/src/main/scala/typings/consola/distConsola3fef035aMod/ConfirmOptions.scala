package typings.consola.distConsola3fef035aMod

import typings.consola.consolaStrings.confirm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfirmOptions
  extends StObject
     with PromptOptions {
  
  var initial: js.UndefOr[Boolean] = js.undefined
  
  var `type`: confirm
}
object ConfirmOptions {
  
  inline def apply(): ConfirmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("confirm")
    __obj.asInstanceOf[ConfirmOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfirmOptions] (val x: Self) extends AnyVal {
    
    inline def setInitial(value: Boolean): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
    
    inline def setType(value: confirm): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
