package typings.awsSdkTypes.middlewareMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkTypes.loggerMod.Logger
import typings.awsSdkTypes.utilMod.UserAgent
import typings.awsSdkTypes.utilMod.UserAgentPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandlerExecutionContext
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  /**
    * A logger that may be invoked by any handler during execution of an
    * operation.
    */
  var logger: js.UndefOr[Logger] = js.undefined
  
  /**
    * Additional user agent that inferred by middleware. It can be used to save
    * the internal user agent sections without overriding the `customUserAgent`
    * config in clients.
    */
  var userAgent: js.UndefOr[UserAgent] = js.undefined
}
object HandlerExecutionContext {
  
  inline def apply(): HandlerExecutionContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandlerExecutionContext]
  }
  
  extension [Self <: HandlerExecutionContext](x: Self) {
    
    inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    inline def setUserAgent(value: UserAgent): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    
    inline def setUserAgentVarargs(value: UserAgentPair*): Self = StObject.set(x, "userAgent", js.Array(value*))
  }
}
