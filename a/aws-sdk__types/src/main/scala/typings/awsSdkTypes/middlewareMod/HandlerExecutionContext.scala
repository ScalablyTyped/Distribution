package typings.awsSdkTypes.middlewareMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkTypes.loggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandlerExecutionContext
  extends /* key */ StringDictionary[js.Any] {
  
  /**
    * A logger that may be invoked by any handler during execution of an
    * operation.
    */
  var logger: js.UndefOr[Logger] = js.native
}
object HandlerExecutionContext {
  
  @scala.inline
  def apply(): HandlerExecutionContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandlerExecutionContext]
  }
  
  @scala.inline
  implicit class HandlerExecutionContextMutableBuilder[Self <: HandlerExecutionContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
  }
}
