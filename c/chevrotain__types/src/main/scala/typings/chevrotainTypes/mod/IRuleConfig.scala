package typings.chevrotainTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRuleConfig[T] extends StObject {
  
  /**
    * The function which will be invoked to produce the returned value for a production that have not been
    * successfully executed and the parser recovered from.
    */
  var recoveryValueFunc: js.UndefOr[js.Function1[/* e */ IRecognitionException, T]] = js.undefined
  
  /**
    * Enable/Disable re-sync error recovery for this specific production.
    */
  var resyncEnabled: js.UndefOr[Boolean] = js.undefined
}
object IRuleConfig {
  
  inline def apply[T](): IRuleConfig[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRuleConfig[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRuleConfig[?], T] (val x: Self & IRuleConfig[T]) extends AnyVal {
    
    inline def setRecoveryValueFunc(value: /* e */ IRecognitionException => T): Self = StObject.set(x, "recoveryValueFunc", js.Any.fromFunction1(value))
    
    inline def setRecoveryValueFuncUndefined: Self = StObject.set(x, "recoveryValueFunc", js.undefined)
    
    inline def setResyncEnabled(value: Boolean): Self = StObject.set(x, "resyncEnabled", value.asInstanceOf[js.Any])
    
    inline def setResyncEnabledUndefined: Self = StObject.set(x, "resyncEnabled", js.undefined)
  }
}
