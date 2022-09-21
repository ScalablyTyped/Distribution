package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventTriggerDefinition extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for any local Amazon S3 resource that is an Lambda function's event trigger associated with this job.
    */
  var EventResourceARN: js.UndefOr[ResourceARN] = js.undefined
}
object EventTriggerDefinition {
  
  inline def apply(): EventTriggerDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventTriggerDefinition]
  }
  
  extension [Self <: EventTriggerDefinition](x: Self) {
    
    inline def setEventResourceARN(value: ResourceARN): Self = StObject.set(x, "EventResourceARN", value.asInstanceOf[js.Any])
    
    inline def setEventResourceARNUndefined: Self = StObject.set(x, "EventResourceARN", js.undefined)
  }
}
