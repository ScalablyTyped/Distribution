package typings.concurrently5oeeHgIv.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logger extends StObject {
  
  var logger: typings.concurrently5oeeHgIv.loggerDTsMod.Logger
}
object Logger {
  
  inline def apply(logger: typings.concurrently5oeeHgIv.loggerDTsMod.Logger): Logger = {
    val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Logger]
  }
  
  extension [Self <: Logger](x: Self) {
    
    inline def setLogger(value: typings.concurrently5oeeHgIv.loggerDTsMod.Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
  }
}
