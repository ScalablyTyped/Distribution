package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggingOptions extends StObject {
  
  /**
    * The IoT SiteWise logging verbosity level.
    */
  var level: LoggingLevel
}
object LoggingOptions {
  
  inline def apply(level: LoggingLevel): LoggingOptions = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingOptions]
  }
  
  extension [Self <: LoggingOptions](x: Self) {
    
    inline def setLevel(value: LoggingLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
  }
}
