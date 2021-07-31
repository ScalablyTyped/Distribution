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
  
  @scala.inline
  def apply(): LoggerDefinitionVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggerDefinitionVersion]
  }
  
  @scala.inline
  implicit class LoggerDefinitionVersionMutableBuilder[Self <: LoggerDefinitionVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoggers(value: listOfLogger): Self = StObject.set(x, "Loggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggersUndefined: Self = StObject.set(x, "Loggers", js.undefined)
    
    @scala.inline
    def setLoggersVarargs(value: Logger*): Self = StObject.set(x, "Loggers", js.Array(value :_*))
  }
}
