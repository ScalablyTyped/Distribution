package typings.expoGlr2XJCr

import org.scalablytyped.runtime.StringDictionary
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var errorRecovery: js.UndefOr[Any] = js.undefined
    
    var manifestString: js.UndefOr[String] = js.undefined
    
    var notification: js.UndefOr[Any] = js.undefined
  }
  object Dictkey {
    
    inline def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    extension [Self <: Dictkey](x: Self) {
      
      inline def setErrorRecovery(value: Any): Self = StObject.set(x, "errorRecovery", value.asInstanceOf[js.Any])
      
      inline def setErrorRecoveryUndefined: Self = StObject.set(x, "errorRecovery", js.undefined)
      
      inline def setManifestString(value: String): Self = StObject.set(x, "manifestString", value.asInstanceOf[js.Any])
      
      inline def setManifestStringUndefined: Self = StObject.set(x, "manifestString", js.undefined)
      
      inline def setNotification(value: Any): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
      
      inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    }
  }
  
  trait Error extends StObject {
    
    var error: js.Error
    
    var response: js.UndefOr[Response] = js.undefined
  }
  object Error {
    
    inline def apply(error: js.Error): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    }
  }
}
