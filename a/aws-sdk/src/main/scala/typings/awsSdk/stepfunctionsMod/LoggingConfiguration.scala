package typings.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoggingConfiguration extends StObject {
  
  /**
    * An array of objects that describes where your execution history events will be logged. Limited to size 1. Required, if your log level is not set to OFF.
    */
  var destinations: js.UndefOr[LogDestinationList] = js.native
  
  /**
    * Determines whether execution data is included in your log. When set to false, data is excluded.
    */
  var includeExecutionData: js.UndefOr[IncludeExecutionData] = js.native
  
  /**
    * Defines which category of execution history events are logged.
    */
  var level: js.UndefOr[LogLevel] = js.native
}
object LoggingConfiguration {
  
  @scala.inline
  def apply(): LoggingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggingConfiguration]
  }
  
  @scala.inline
  implicit class LoggingConfigurationMutableBuilder[Self <: LoggingConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinations(value: LogDestinationList): Self = StObject.set(x, "destinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationsUndefined: Self = StObject.set(x, "destinations", js.undefined)
    
    @scala.inline
    def setDestinationsVarargs(value: LogDestination*): Self = StObject.set(x, "destinations", js.Array(value :_*))
    
    @scala.inline
    def setIncludeExecutionData(value: IncludeExecutionData): Self = StObject.set(x, "includeExecutionData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeExecutionDataUndefined: Self = StObject.set(x, "includeExecutionData", js.undefined)
    
    @scala.inline
    def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
  }
}
