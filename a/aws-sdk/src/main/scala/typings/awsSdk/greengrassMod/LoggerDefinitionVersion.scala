package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggerDefinitionVersion extends StObject {
  
  /**
    * A list of loggers.
    */
  var Loggers: js.UndefOr[listOfLogger] = js.undefined
}
object LoggerDefinitionVersion {
  
  inline def apply(): LoggerDefinitionVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggerDefinitionVersion]
  }
  
  extension [Self <: LoggerDefinitionVersion](x: Self) {
    
    inline def setLoggers(value: listOfLogger): Self = StObject.set(x, "Loggers", value.asInstanceOf[js.Any])
    
    inline def setLoggersUndefined: Self = StObject.set(x, "Loggers", js.undefined)
    
    inline def setLoggersVarargs(value: Logger*): Self = StObject.set(x, "Loggers", js.Array(value*))
  }
}
