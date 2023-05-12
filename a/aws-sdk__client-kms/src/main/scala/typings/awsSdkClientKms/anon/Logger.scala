package typings.awsSdkClientKms.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logger extends StObject {
  
  var logger: js.UndefOr[typings.awsSdkTypes.distTypesLoggerMod.Logger] = js.undefined
}
object Logger {
  
  inline def apply(): Logger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Logger]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
    
    inline def setLogger(value: typings.awsSdkTypes.distTypesLoggerMod.Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
  }
}
