package typings.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggingConfiguration extends StObject {
  
  /**
    * An array of objects that describes where your execution history events will be logged. Limited to size 1. Required, if your log level is not set to OFF.
    */
  var destinations: js.UndefOr[LogDestinationList] = js.undefined
  
  /**
    * Determines whether execution data is included in your log. When set to false, data is excluded.
    */
  var includeExecutionData: js.UndefOr[IncludeExecutionData] = js.undefined
  
  /**
    * Defines which category of execution history events are logged.
    */
  var level: js.UndefOr[LogLevel] = js.undefined
}
object LoggingConfiguration {
  
  inline def apply(): LoggingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggingConfiguration]
  }
  
  extension [Self <: LoggingConfiguration](x: Self) {
    
    inline def setDestinations(value: LogDestinationList): Self = StObject.set(x, "destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsUndefined: Self = StObject.set(x, "destinations", js.undefined)
    
    inline def setDestinationsVarargs(value: LogDestination*): Self = StObject.set(x, "destinations", js.Array(value*))
    
    inline def setIncludeExecutionData(value: IncludeExecutionData): Self = StObject.set(x, "includeExecutionData", value.asInstanceOf[js.Any])
    
    inline def setIncludeExecutionDataUndefined: Self = StObject.set(x, "includeExecutionData", js.undefined)
    
    inline def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
  }
}
