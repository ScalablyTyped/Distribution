package typings.betterSqlite3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var fileMustExist: js.UndefOr[Boolean] = js.undefined
  
  var nativeBinding: js.UndefOr[String] = js.undefined
  
  var readonly: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var verbose: js.UndefOr[js.Function2[/* message */ js.UndefOr[Any], /* repeated */ Any, Unit]] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setFileMustExist(value: Boolean): Self = StObject.set(x, "fileMustExist", value.asInstanceOf[js.Any])
    
    inline def setFileMustExistUndefined: Self = StObject.set(x, "fileMustExist", js.undefined)
    
    inline def setNativeBinding(value: String): Self = StObject.set(x, "nativeBinding", value.asInstanceOf[js.Any])
    
    inline def setNativeBindingUndefined: Self = StObject.set(x, "nativeBinding", js.undefined)
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setVerbose(value: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Unit): Self = StObject.set(x, "verbose", js.Any.fromFunction2(value))
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
