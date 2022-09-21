package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfilerEvent extends StObject {
  
  /**
    * Event class name
    */
  var name: String
  
  /**
    * Event timestamp
    */
  var timestamp: String
  
  /**
    * Event values
    */
  var values: StringDictionary[Any]
}
object ProfilerEvent {
  
  inline def apply(name: String, timestamp: String, values: StringDictionary[Any]): ProfilerEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilerEvent]
  }
  
  extension [Self <: ProfilerEvent](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setValues(value: StringDictionary[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
