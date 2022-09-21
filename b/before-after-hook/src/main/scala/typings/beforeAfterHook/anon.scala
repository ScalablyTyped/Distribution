package typings.beforeAfterHook

import typings.beforeAfterHook.mod.TypeStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Error extends StObject {
    
    var Error: Any
    
    var Options: Any
    
    var Result: Any
  }
  object Error {
    
    inline def apply(Error: Any, Options: Any, Result: Any): Error = {
      val __obj = js.Dynamic.literal(Error = Error.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: Any): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Any): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
      
      inline def setResult(value: Any): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ key in before-after-hook.before-after-hook.TypeStoreKeyLong ]:? any} & {[ key in before-after-hook.before-after-hook.TypeStoreKeyShort ]:? never} */
  trait keyinTypeStoreKeyLonganyk
    extends StObject
       with TypeStore {
    
    var Error: js.UndefOr[Any] = js.undefined
    
    var Options: js.UndefOr[Any] = js.undefined
    
    var Result: js.UndefOr[Any] = js.undefined
  }
  object keyinTypeStoreKeyLonganyk {
    
    inline def apply(): keyinTypeStoreKeyLonganyk = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[keyinTypeStoreKeyLonganyk]
    }
    
    extension [Self <: keyinTypeStoreKeyLonganyk](x: Self) {
      
      inline def setError(value: Any): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
      
      inline def setOptions(value: Any): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
      
      inline def setResult(value: Any): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "Result", js.undefined)
    }
  }
  
  /* Inlined {[ key in before-after-hook.before-after-hook.TypeStoreKeyLong ]:? never} & {[ key in before-after-hook.before-after-hook.TypeStoreKeyShort ]:? any} */
  trait keyinTypeStoreKeyLongneve
    extends StObject
       with TypeStore {
    
    var E: js.UndefOr[Any] = js.undefined
    
    var O: js.UndefOr[Any] = js.undefined
    
    var R: js.UndefOr[Any] = js.undefined
  }
  object keyinTypeStoreKeyLongneve {
    
    inline def apply(): keyinTypeStoreKeyLongneve = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[keyinTypeStoreKeyLongneve]
    }
    
    extension [Self <: keyinTypeStoreKeyLongneve](x: Self) {
      
      inline def setE(value: Any): Self = StObject.set(x, "E", value.asInstanceOf[js.Any])
      
      inline def setEUndefined: Self = StObject.set(x, "E", js.undefined)
      
      inline def setO(value: Any): Self = StObject.set(x, "O", value.asInstanceOf[js.Any])
      
      inline def setOUndefined: Self = StObject.set(x, "O", js.undefined)
      
      inline def setR(value: Any): Self = StObject.set(x, "R", value.asInstanceOf[js.Any])
      
      inline def setRUndefined: Self = StObject.set(x, "R", js.undefined)
    }
  }
}
