package typings.awsSdk.dlmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventSource extends StObject {
  
  /**
    * Information about the event.
    */
  var Parameters: js.UndefOr[EventParameters] = js.undefined
  
  /**
    * The source of the event. Currently only managed CloudWatch Events rules are supported.
    */
  var Type: EventSourceValues
}
object EventSource {
  
  inline def apply(Type: EventSourceValues): EventSource = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSource]
  }
  
  extension [Self <: EventSource](x: Self) {
    
    inline def setParameters(value: EventParameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setType(value: EventSourceValues): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
